package org.buzheng.demo.esm.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.buzheng.demo.esm.dao.FiveLevelAddressMapper;
import org.buzheng.demo.esm.dao.GetAddressTaskMapper;
import org.buzheng.demo.esm.domain.FiveLevelAddress;
import org.buzheng.demo.esm.domain.FiveLevelAddressExample;
import org.buzheng.demo.esm.domain.GetAddressTask;
import org.buzheng.demo.esm.service.FiveLevelAddressService;
import org.buzheng.demo.esm.util.GisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class FiveLevelAddressServiceImpl implements FiveLevelAddressService {

	@Autowired
	private FiveLevelAddressMapper fiveLevelAddressMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private GetAddressTaskMapper getAddressTaskMapper;

	@Override
	public int matchAddress() {
		GetAddressTask getAddressTask = new GetAddressTask();
		getAddressTask.setBeginTime(new Date());
		getAddressTask.setState(1);
		getAddressTask.setTaskType("五级地址匹配");
		//getAddressTaskMapper.insertSelective(getAddressTask);
		FiveLevelAddressExample example = new FiveLevelAddressExample();
		FiveLevelAddressExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1);
		List<FiveLevelAddress> list = fiveLevelAddressMapper.selectByExample(example);
		getAddressTask.setTotal(list.size());
		getAddressTask.setTotal(list.size());
		int c = 0;
		for (FiveLevelAddress tmp : list) {
			String sql = "select a.lon,a.lat,a.addr_level3,a.addr_level4,a.addr_level5,a.full_name,GETDISTANCE('"
					+ tmp.getLat() + "','" + tmp.getLon()
					+ "', a.lat, a.lon) distance from five_level_address_tmp a where a.addr_level2='"
					+ tmp.getAddrLevel2() + "' order by distance";
			sql = "SELECT tmp_page.*, rownum AS row_id FROM (" + sql + ") tmp_page WHERE rownum <= 5";
			List<Map<String, Object>> tmpList = jdbcTemplate.queryForList(sql);
			int j;
			for (j = 0; j < tmpList.size(); j++) {
				Map<String, Object> mso = tmpList.get(j);
				BigDecimal tmplon = (BigDecimal) mso.get("lon");
				BigDecimal tmplat = (BigDecimal) mso.get("lat");
				if (isInsidePolygon(tmplon.doubleValue(), tmplat.doubleValue(), tmp.getPolygonLonlat())) {
					tmp.setAddrLevel3((String) mso.get("addr_level3"));
					tmp.setAddrLevel4((String) mso.get("addr_level4"));
					tmp.setAddrLevel5((String) mso.get("addr_level5"));
					tmp.setFullName((String) mso.get("full_name"));
					tmp.setState(3);
					fiveLevelAddressMapper.updateByPrimaryKeySelective(tmp);
					c++;
					break;
				}
			}
			if (j == tmpList.size()) {
				tmp.setState(2);
				fiveLevelAddressMapper.updateByPrimaryKeySelective(tmp);
			}
		}
		getAddressTask.setAchieve(c);
		getAddressTask.setEndTime(new Date());
		getAddressTask.setState(2);
		//getAddressTaskMapper.updateByPrimaryKey(getAddressTask);
		getAddressTaskMapper.insertSelective(getAddressTask);
		return c;
	}

	public boolean isInsidePolygon(double pointLon, double pointLat, String polygonLonlat) {
		String[] Lonlat = polygonLonlat.split(",");
		double[] lon = new double[Lonlat.length / 2];
		double[] lat = new double[Lonlat.length / 2];
		boolean flag = true;
		int lonidx = 0;
		int latidx = 0;
		for (int i = 0; i < Lonlat.length; i++) {
			if (flag) {
				lon[lonidx] = Double.parseDouble(Lonlat[i]);
				lonidx++;
				flag = false;
			} else {
				lat[latidx] = Double.parseDouble(Lonlat[i]);
				latidx++;
				flag = true;
			}
		}
		return GisUtil.isInPolygon(pointLon, pointLat, lon, lat);
	}

}
