package org.buzheng.demo.esm.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.buzheng.demo.esm.dao.GetAddressTaskMapper;
import org.buzheng.demo.esm.dao.SevenLevelAddressMapper;
import org.buzheng.demo.esm.domain.GetAddressTask;
import org.buzheng.demo.esm.domain.SevenLevelAddress;
import org.buzheng.demo.esm.domain.SevenLevelAddressExample;
import org.buzheng.demo.esm.service.SevenLevelAddressService;
import org.buzheng.demo.esm.util.GPSUtil;
import org.buzheng.demo.esm.util.GaoDeMapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Service
public class SevenLevelAddressServiceImpl implements SevenLevelAddressService {

	private static Logger logger = Logger.getLogger(SevenLevelAddressServiceImpl.class);

	@Autowired
	private SevenLevelAddressMapper sevenLevelAddressMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private GetAddressTaskMapper getAddressTaskMapper;

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public int getAddressDataFromAMap() {
		GetAddressTask getAddressTask = new GetAddressTask();
		getAddressTask.setBeginTime(new Date());
		getAddressTask.setState(1);
		SevenLevelAddressExample example = new SevenLevelAddressExample();
		SevenLevelAddressExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1);
		List<SevenLevelAddress> list = sevenLevelAddressMapper.selectByExample(example);
		getAddressTask.setTotal(list.size());
		/*
		 * SqlSession session = sqlSessionFactory.openSession(); try {
		 * session.insert(
		 * "org.buzheng.demo.esm.dao.GetAddressTaskMapper.insertSelective",
		 * getAddressTask); session.commit(); } finally { session.close(); }
		 */
		getAddressTaskMapper.insertSelective(getAddressTask);
		int c = 0;
		for (SevenLevelAddress addr : list) {
			double[] latlon = GPSUtil.gps84_To_Gcj02(addr.getLat().doubleValue(), addr.getLon().doubleValue());
			String res = GaoDeMapUtil.getAddressJsonByLngAndLat(latlon[1], latlon[0]);
			addr.setRetJson(res);
			addr.setAmapLat(new BigDecimal(latlon[0]));
			addr.setAmapLon(new BigDecimal(latlon[1]));
			if (res != null) {
				// 将获取结果转为json 数据
				JSONObject obj = JSON.parseObject(res);
				if (obj.get("status").toString().equals("1")) {
					// 如果没有返回-1
					JSONObject regeocode = obj.getJSONObject("regeocode");
					if (regeocode.size() > 0) {
						// 在regeocode中拿到 formatted_address 具体位置
						String formatted = regeocode.get("formatted_address").toString();
						addr.setFormattedAddress(formatted);
						JSONObject addressComponent = regeocode.getJSONObject("addressComponent");
						addr.setAddrLevel1(addressComponent.getString("city"));
						addr.setAddrLevel2(addressComponent.getString("district"));
						addr.setAddrLevel3(addressComponent.getString("township"));
						int idx = formatted.indexOf(addr.getAddrLevel3());
						addr.setAddrLevel5(
								formatted.substring(idx + addr.getAddrLevel3().length(), formatted.length()));
						addr.setState(2);
						addr.setUpdateTime(new Date());
						SevenLevelAddressExample addrExample = new SevenLevelAddressExample();
						SevenLevelAddressExample.Criteria addrCriteria = addrExample.createCriteria();
						addrCriteria.andAddrIdEqualTo(addr.getAddrId());
						sevenLevelAddressMapper.updateByExampleSelective(addr, addrExample);
						c++;
					} else {
						logger.info("未找到相匹配的地址！");
					}
				} else {
					logger.info("请求错误！");
				}
			}
		}
		// getAddressTask.setTotal(list.size());
		getAddressTask.setAchieve(c);
		getAddressTask.setEndTime(new Date());
		getAddressTask.setState(2);
		getAddressTaskMapper.updateByPrimaryKey(getAddressTask);
		return c;
	}

	public int getAddressDataBatchFromAMap() {
		GetAddressTask getAddressTask = new GetAddressTask();
		getAddressTask.setBeginTime(new Date());
		getAddressTask.setState(1);
		SevenLevelAddressExample example = new SevenLevelAddressExample();
		SevenLevelAddressExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1);
		List<SevenLevelAddress> list = sevenLevelAddressMapper.selectByExample(example);
		getAddressTask.setTotal(list.size());
		getAddressTaskMapper.insertSelective(getAddressTask);
		// getAddressTask.setTaskId(taskId);
		int c = 0;
		for (int i = 0; i < list.size();) {
			int j;
			String lonlatList = "";
			for (j = 0; j < 20 && i + j < list.size(); j++) {
				Double lon = list.get(i + j).getLon().doubleValue();
				Double lat = list.get(i + j).getLat().doubleValue();
				double[] latlon = GPSUtil.gps84_To_Gcj02(lat, lon);
				String tmp = "" + latlon[1] + "," + latlon[0];
				lonlatList += tmp;
				lonlatList += "|";
			}
			lonlatList = lonlatList.substring(0, lonlatList.length() - 1);
			String res = GaoDeMapUtil.getAddressJsonByLngAndLatBatch(lonlatList);
			if (res != null) {
				// 将获取结果转为json 数据
				JSONObject obj = JSON.parseObject(res);
				if (obj.get("status").toString().equals("1")) {
					// 如果没有返回-1
					JSONArray regeocodes = obj.getJSONArray("regeocodes");
					for (j = 0; j < regeocodes.size(); j++) {
						// 在regeocode中拿到 formatted_address 具体位置
						SevenLevelAddress addr = list.get(i + j);
						JSONObject regeocode = regeocodes.getJSONObject(j);
						String formatted = regeocode.get("formatted_address").toString();
						addr.setFormattedAddress(formatted);
						JSONObject addressComponent = regeocode.getJSONObject("addressComponent");
						addr.setAddrLevel1(addressComponent.getString("city"));
						addr.setAddrLevel2(addressComponent.getString("district"));
						addr.setAddrLevel3(addressComponent.getString("township"));
						int idx = formatted.indexOf(addr.getAddrLevel3());
						addr.setAddrLevel5(
								formatted.substring(idx + addr.getAddrLevel3().length(), formatted.length()));
						addr.setState(2);
						addr.setUpdateTime(new Date());
						addr.setRetJson(regeocode.toJSONString());
						SevenLevelAddressExample addrExample = new SevenLevelAddressExample();
						SevenLevelAddressExample.Criteria addrCriteria = addrExample.createCriteria();
						addrCriteria.andAddrIdEqualTo(addr.getAddrId());
						sevenLevelAddressMapper.updateByExampleSelective(addr, addrExample);
						c++;
					}
				} else {
					logger.info("request error!requestJson=" + lonlatList);
				}
			}
			i += j;
		}
		// getAddressTask.setTotal(list.size());
		getAddressTask.setAchieve(c);
		getAddressTask.setEndTime(new Date());
		getAddressTask.setState(2);
		getAddressTaskMapper.updateByPrimaryKeySelective(getAddressTask);
		return c;
	}

	@Override
	public int generateAddrLevelSeven() {
		String sql = "select distinct addr_level5_full_name from seven_level_address where state=3";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> tmp : list) {
			SevenLevelAddressExample example = new SevenLevelAddressExample();
			SevenLevelAddressExample.Criteria criteria = example.createCriteria();
			criteria.andStateEqualTo(3);
			criteria.andAddrLevel5FullNameEqualTo(tmp.get("addr_level5_full_name").toString());
			List<SevenLevelAddress> addrList = sevenLevelAddressMapper.selectByExample(example);
			for (int i = 0; i < addrList.size(); i++) {
				SevenLevelAddress sevenLevelAddr = addrList.get(i);
				sevenLevelAddr.setDefNum(i + 1);
				sevenLevelAddr.setAddrLevel7("自编" + sevenLevelAddr.getDefNum() + "号");
				sevenLevelAddr.setState(4);
				sevenLevelAddr.setUpdateTime(new Date());
				sevenLevelAddr.setFullName(sevenLevelAddr.getAddrLevel1() + sevenLevelAddr.getAddrLevel2()
						+ sevenLevelAddr.getAddrLevel3() + sevenLevelAddr.getAddrLevel4()
						+ sevenLevelAddr.getAddrLevel5Std() + sevenLevelAddr.getAddrLevel7());
				SevenLevelAddressExample examplet = new SevenLevelAddressExample();
				SevenLevelAddressExample.Criteria criteriat = examplet.createCriteria();
				criteriat.andAddrIdEqualTo(sevenLevelAddr.getAddrId());
				sevenLevelAddressMapper.updateByExampleSelective(sevenLevelAddr, examplet);
			}
		}
		return 0;
	}

}
