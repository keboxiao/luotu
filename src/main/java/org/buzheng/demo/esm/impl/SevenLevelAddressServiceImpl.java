package org.buzheng.demo.esm.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.buzheng.demo.esm.dao.SevenLevelAddressMapper;
import org.buzheng.demo.esm.domain.SevenLevelAddress;
import org.buzheng.demo.esm.domain.SevenLevelAddressExample;
import org.buzheng.demo.esm.service.SevenLevelAddressService;
import org.buzheng.demo.esm.util.GPSUtil;
import org.buzheng.demo.esm.util.GaoDeMapUtil;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class SevenLevelAddressServiceImpl implements SevenLevelAddressService {

	private static Logger logger = Logger.getLogger(SevenLevelAddressServiceImpl.class);

	@Autowired
	private SevenLevelAddressMapper sevenLevelAddressMapper;

	@Override
	public int getAddressDataFromAMap() {
		SevenLevelAddressExample example = new SevenLevelAddressExample();
		SevenLevelAddressExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1);
		List<SevenLevelAddress> list = sevenLevelAddressMapper.selectByExample(example);
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
						addr.setAddrLevel5(formatted.substring(idx + 1, formatted.length()));
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
		return c;
	}

	@Override
	public int generateAddrLevelSeven() {
		// TODO Auto-generated method stub
		return 0;
	}

}
