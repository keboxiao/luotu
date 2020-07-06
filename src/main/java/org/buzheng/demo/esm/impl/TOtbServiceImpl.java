package org.buzheng.demo.esm.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.buzheng.demo.esm.dao.FiveLevelAddressMapper;
import org.buzheng.demo.esm.dao.GetAddressTaskMapper;
import org.buzheng.demo.esm.dao.ServiceAreaMapper;
import org.buzheng.demo.esm.dao.SevenLevelAddressMapper;
import org.buzheng.demo.esm.dao.TOtbMapper;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.FiveLevelAddress;
import org.buzheng.demo.esm.domain.FiveLevelAddressExample;
import org.buzheng.demo.esm.domain.GetAddressTask;
import org.buzheng.demo.esm.domain.ServiceArea;
import org.buzheng.demo.esm.domain.SevenLevelAddress;
import org.buzheng.demo.esm.domain.SevenLevelAddressExample;
import org.buzheng.demo.esm.domain.TOtb;
import org.buzheng.demo.esm.domain.TOtbExample;
import org.buzheng.demo.esm.service.SevenLevelAddressService;
import org.buzheng.demo.esm.service.TOtbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service
public class TOtbServiceImpl implements TOtbService {
	@Autowired
	private FiveLevelAddressMapper fiveLevelAddressMapper;

	@Autowired
	private TOtbMapper tOtbMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private GetAddressTaskMapper getAddressTaskMapper;
	
	@Autowired
	private SevenLevelAddressService sevenLevelAddressService;
	
	@Autowired
	private SevenLevelAddressMapper sevenLevelAddressMapper;
	
	@Autowired
	private ServiceAreaMapper serviceAreaMapper;

	@Override
	public int matchAddress() {
		GetAddressTask getAddressTask = new GetAddressTask();
		getAddressTask.setBeginTime(new Date());
		getAddressTask.setState(1);
		getAddressTask.setTaskType("OTB地址匹配");
		// getAddressTaskMapper.insertSelective(getAddressTask);
		TOtbExample example = new TOtbExample();
		TOtbExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1L);
		Long count = tOtbMapper.countByExample(example);
		Long pageCount = count % 15 == 0 ? (count / 15) : (count / 15 + 1);// 总页数
		int page = pageCount.intValue();
		int c = 0;
		getAddressTask.setTotal(count.intValue());
		for (int p = 1; p <= page; p++) {
			List<TOtb> list = getOtb(p);
			// getAddressTask.setTotal(list.size());
			// int c = 0;
			for (TOtb tmp : list) {
				FiveLevelAddressExample fexample = new FiveLevelAddressExample();
				FiveLevelAddressExample.Criteria fcriteria = fexample.createCriteria();
				fcriteria.andFullNameEqualTo(tmp.getAddr5Fullname());
				List<FiveLevelAddress> flist = fiveLevelAddressMapper.selectByExampleWithBLOBs(fexample);
				if (flist.size() > 0) {
					FiveLevelAddress fiveAddr = flist.get(0);
					if (fiveAddr.isInsidePolygon(tmp.getLon().doubleValue(), tmp.getLat().doubleValue())) {
						tmp.setState(5L);
					} else {
						tmp.setState(3L);
					}
				} else {
					tmp.setState(2L);
				}
				tOtbMapper.updateByPrimaryKeySelective(tmp);
				c++;
			}
		}
		getAddressTask.setAchieve(c);
		getAddressTask.setEndTime(new Date());
		getAddressTask.setState(2);
		// getAddressTaskMapper.updateByPrimaryKey(getAddressTask);
		getAddressTaskMapper.insertSelective(getAddressTask);
		return c;
	}

	public List<TOtb> getOtb(int page) {
		TOtbExample example = new TOtbExample();
		TOtbExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1L);
		PageHelper.startPage(page, 15);
		return tOtbMapper.selectByExample(example);
	}
	
	public int generateServiceArea() {
		SevenLevelAddressExample example = new SevenLevelAddressExample();
		SevenLevelAddressExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(3);
		Long count = sevenLevelAddressMapper.countByExample(example);
		Long pageCount = count % 15 == 0 ? (count / 15) : (count / 15 + 1);// 总页数
		int page = pageCount.intValue();
		for (int p = 1; p <= page; p++) {
			DataGrid datagrid = sevenLevelAddressService.searchSevenLevelAddress(null, page, 15);
			List<SevenLevelAddress> list = datagrid.getRows();
			for (SevenLevelAddress tmp : list) {
				String sql = "select otb_code,otb_name,polygon_lonlat,GETDISTANCE('" + tmp.getLat() + "','"
						+ tmp.getLon()
						+ "', lat, lon) distance from t_otb a inner join five_level_address b on a.addr5_id=b.addr_id where a.addr_level2='"
						+ tmp.getAddrLevel2()+"' and a.addr_level3='"+tmp.getAddrLevel3() + "' order by distance";
				sql = "SELECT tmp_page.*, rownum AS row_id FROM (" + sql + ") tmp_page WHERE rownum <= 5";
				List<Map<String, Object>> tmpList = jdbcTemplate.queryForList(sql);
				//List<TOtb> otbList = tOtbMapper.selectByExample(oexample);
				for (Map<String, Object> mso : tmpList) {
					TOtb otmp = new TOtb();
					otmp.setOtbCode(mso.get("otb_code").toString());
					otmp.setPolygonLonlat(mso.get("polygon_lonlat").toString());
					if(otmp.isInsidePolygon(tmp.getLon().doubleValue(), tmp.getLat().doubleValue())){
						ServiceArea serviceArea = new ServiceArea();
						serviceArea.setAddrFullname(tmp.getFullName());
						serviceArea.setAddrId(tmp.getAddrId());
						serviceArea.setOtbCode(otmp.getOtbCode());
						serviceAreaMapper.insert(serviceArea);
						tmp.setState(5);
						SevenLevelAddressExample sexample = new SevenLevelAddressExample();
						SevenLevelAddressExample.Criteria scriteria = sexample.createCriteria();
						scriteria.andAddrIdEqualTo(tmp.getAddrId());
						sevenLevelAddressMapper.updateByExampleSelective(tmp, sexample);
					}
				}
			}
		}
		return 0;
	}
}
