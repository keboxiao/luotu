package org.buzheng.demo.esm.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.buzheng.demo.esm.dao.CqtRecordMapper;
import org.buzheng.demo.esm.dao.GetAddressTaskMapper;
import org.buzheng.demo.esm.dao.TwoLevelAddressMapper;
import org.buzheng.demo.esm.domain.CqtRecord;
import org.buzheng.demo.esm.domain.CqtRecordExample;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.FiveLevelAddress;
import org.buzheng.demo.esm.domain.GetAddressTask;
import org.buzheng.demo.esm.domain.TwoLevelAddress;
import org.buzheng.demo.esm.domain.TwoLevelAddressExample;
import org.buzheng.demo.esm.service.CqtRecordService;
import org.buzheng.demo.esm.util.GPSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service
public class CqtRecordServiceImpl implements CqtRecordService {

	@Autowired
	private CqtRecordMapper cqtRecordMapper;

	@Autowired
	private TwoLevelAddressMapper twoLevelAddressMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private GetAddressTaskMapper getAddressTaskMapper;

	public int matchAddr() {
		GetAddressTask getAddressTask = new GetAddressTask();
		getAddressTask.setBeginTime(new Date());
		getAddressTask.setState(2);
		getAddressTask.setTaskType("CQT地址匹配");
		CqtRecordExample example = new CqtRecordExample();
		CqtRecordExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1);
		Long count = cqtRecordMapper.countByExample(example);
		Long pageCount = count % 15 == 0 ? (count / 15) : (count / 15 + 1);// 总页数
		int page = pageCount.intValue();
		getAddressTask.setTotal(count.intValue());
		int c = 0;
		TwoLevelAddressExample texample = new TwoLevelAddressExample();
		TwoLevelAddressExample.Criteria tcriteria = texample.createCriteria();
		List<TwoLevelAddress> addrTwoList = twoLevelAddressMapper.selectByExampleWithBLOBs(texample);
		for (int p = 1; p <= page; p++) {
			List<CqtRecord> list = getCqtRecord(p);
			for (CqtRecord tmp : list) {
				String addrLevelTwo = pointInsideTwoLevelAddr(tmp.getLon().doubleValue(), tmp.getLat().doubleValue(),
						addrTwoList);
				if (addrLevelTwo != null) {
					String sql = "select addr_id,full_name,polygon_lonlat,GETDISTANCE('" + tmp.getLat() + "','"
							+ tmp.getLon()
							+ "', lat, lon) distance from five_level_address a where a.state=3 and a.addr_level2='"
							+ addrLevelTwo + "' order by distance";
					sql = "SELECT tmp_page.*, rownum AS row_id FROM (" + sql + ") tmp_page WHERE rownum <= 5";
					List<Map<String, Object>> tmpList = jdbcTemplate.queryForList(sql);
					int j;
					for (j = 0; j < tmpList.size(); j++) {
						Map<String, Object> mso = tmpList.get(j);
						FiveLevelAddress fla = new FiveLevelAddress();
						fla.setPolygonLonlat((String) mso.get("polygon_lonlat"));
						if (fla.isInsidePolygon(tmp.getLon().doubleValue(), tmp.getLat().doubleValue())) {
							tmp.setAddrId((String) mso.get("addr_id"));
							tmp.setAddrLevel5((String) mso.get("full_name"));
							tmp.setState(3);
							cqtRecordMapper.updateByPrimaryKeySelective(tmp);
							c++;
							break;
						}
					}
				}
			}
		}
		getAddressTask.setAchieve(c);
		getAddressTask.setEndTime(new Date());
		getAddressTaskMapper.insertSelective(getAddressTask);
		return c;
	}

	public List getCqtRecord(int page) {
		PageHelper.startPage(page, 15);
		CqtRecordExample example = new CqtRecordExample();
		CqtRecordExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1);
		List<CqtRecord> list = cqtRecordMapper.selectByExample(example);
		// PageHelper.startPage(page, 15);
		return list;
	}

	public String pointInsideTwoLevelAddr(double lon, double lat, List<TwoLevelAddress> list) {
		for (TwoLevelAddress tmp : list) {
			if (tmp.isInsidePolygon(lon, lat)) {
				return tmp.getAddrLevel2();
			}
		}
		return null;
	}

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

	public DataGrid searchVillageCoverage(String village, int page) {
		String sql = "select b.addr_level1,b.addr_level2,b.addr_level3,b.addr_level4,b.full_name,avg(a.rsrp) avgrsrp,count(*) testpnt,"
				+ " CASE WHEN avg(a.rsrp) >= -85 THEN '优'" + " WHEN avg(a.rsrp) < -85 AND avg(a.rsrp) >= -95 THEN '良'"
				+ " WHEN avg(a.rsrp) < -95 AND avg(a.rsrp) >= -110 THEN '中'" + " ELSE '差' END coverage"
				+ " from cqt_record a inner join five_level_address b on a.addr_id = b.addr_id"
				+ " where a.state = 3 and a.rsrp < -40 and b.state = 3";
		if (StringUtils.isNotBlank(village)) {
			sql += " and b.full_name like '%" + village + "%'";
		}
		sql += " group by b.addr_level1, b.addr_level2, b.addr_level3,b.addr_level4, b.full_name";
		String countsql = "select count(*) from (" + sql + ")";
		sql = "SELECT * FROM (SELECT tmp_page.*, rownum AS row_id FROM (" + sql + ") tmp_page WHERE rownum <= "
				+ (15 * page) + ") WHERE row_id > " + (15 * (page - 1));
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		Long total = jdbcTemplate.queryForLong(countsql);
		DataGrid datagrid = new DataGrid();
		datagrid.setRows(list);
		datagrid.setTotal(total);
		// PageHelper.startPage(page, 15);
		return datagrid;
	}
}
