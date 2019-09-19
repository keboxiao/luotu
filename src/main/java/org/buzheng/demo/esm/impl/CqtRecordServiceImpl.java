package org.buzheng.demo.esm.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.buzheng.demo.esm.dao.CqtRecordMapper;
import org.buzheng.demo.esm.dao.GetAddressTaskMapper;
import org.buzheng.demo.esm.domain.CqtRecord;
import org.buzheng.demo.esm.domain.CqtRecordExample;
import org.buzheng.demo.esm.domain.GetAddressTask;
import org.buzheng.demo.esm.service.CqtRecordService;
import org.buzheng.demo.esm.util.GPSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CqtRecordServiceImpl implements CqtRecordService {

	@Autowired
	private CqtRecordMapper cqtRecordMapper;

	@Autowired
	private GetAddressTaskMapper getAddressTaskMapper;

	@Override
	public int translateLonLat() {
		GetAddressTask getAddressTask = new GetAddressTask();
		getAddressTask.setBeginTime(new Date());
		getAddressTask.setState(2);
		getAddressTask.setTaskType("CQT经纬度转换");
		CqtRecordExample example = new CqtRecordExample();
		CqtRecordExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1);
		List<CqtRecord> list = cqtRecordMapper.selectByExample(example);
		getAddressTask.setTotal(list.size());
		int c = 0;
		for (CqtRecord tmp : list) {
			double[] latlon = GPSUtil.bd09_To_gps84(tmp.getBmapLat().doubleValue(), tmp.getBmapLon().doubleValue());
			tmp.setLat(new BigDecimal(latlon[0]));
			tmp.setLon(new BigDecimal(latlon[1]));
			tmp.setState(2);
			cqtRecordMapper.updateByPrimaryKeySelective(tmp);
			c++;
		}
		getAddressTask.setAchieve(c);
		getAddressTask.setEndTime(new Date());
		getAddressTaskMapper.insertSelective(getAddressTask);
		return list.size();
	}

}
