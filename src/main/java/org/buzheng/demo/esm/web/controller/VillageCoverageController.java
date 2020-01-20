package org.buzheng.demo.esm.web.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.buzheng.demo.esm.dao.VillageCoverageMapper;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.VillageCoverage;
import org.buzheng.demo.esm.domain.VillageCoverageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
public class VillageCoverageController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private VillageCoverageMapper villageCoverageMapper;

	@RequestMapping("getBarDataSet")
	@ResponseBody
	public JSONObject getBarDataSet(String period) throws IllegalStateException, IOException {
		String[] strarr = period.split("-");
		String per = strarr[0] + strarr[1];
		String[] dimensions = new String[] { "area", "优", "良", "中", "差" };
		JSONObject dataset = new JSONObject();
		dataset.put("dimensions", JSONArray.toJSON(dimensions));
		JSONObject mn = new JSONObject();
		JSONObject db = new JSONObject();
		JSONObject gz = new JSONObject();
		JSONObject xy = new JSONObject();
		JSONObject hz = new JSONObject();
		mn.put("area", "茂南区");
		db.put("area", "电白区");
		gz.put("area", "高州市");
		xy.put("area", "信宜市");
		hz.put("area", "化州市");
		String sql = "select addr_level2, coverage, count(*) c" + " from village_coverage where period=" + per
				+ " group by addr_level2, coverage";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> tmp : list) {
			if (tmp.get("ADDR_LEVEL2").toString().equals("茂南区")) {
				mn.put(tmp.get("COVERAGE").toString(), tmp.get("C"));
			} else if (tmp.get("ADDR_LEVEL2").toString().equals("电白区")) {
				db.put(tmp.get("COVERAGE").toString(), tmp.get("C"));
			} else if (tmp.get("ADDR_LEVEL2").toString().equals("高州市")) {
				gz.put(tmp.get("COVERAGE").toString(), tmp.get("C"));
			} else if (tmp.get("ADDR_LEVEL2").toString().equals("信宜市")) {
				xy.put(tmp.get("COVERAGE").toString(), tmp.get("C"));
			} else if (tmp.get("ADDR_LEVEL2").toString().equals("化州市")) {
				hz.put(tmp.get("COVERAGE").toString(), tmp.get("C"));
			}
		}
		JSONArray source = new JSONArray();
		source.add(mn);
		source.add(db);
		source.add(gz);
		source.add(xy);
		source.add(hz);
		dataset.put("source", source);
		return dataset;
	}
	
	@RequestMapping("/searchPeriodVillageCoverage")
	@ResponseBody
	public DataGrid searchVillageCoverage(String village,String period, int page,int rows) {
		PageHelper.startPage(page, rows);
		VillageCoverageExample example = new VillageCoverageExample();
		VillageCoverageExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(village)){
			criteria.andFullNameLike("%"+village+"%");
		}
		if (StringUtils.isNotBlank(period)){
			String[] strarr = period.split("-");
			String per = strarr[0] + strarr[1];
			criteria.andPeriodEqualTo(Integer.parseInt(per));
		}
		List<VillageCoverage> list = villageCoverageMapper.selectByExample(example);
		// 取分页信息
		Page<VillageCoverage> pageInfo = (Page<VillageCoverage>) list;
		DataGrid datagrid = new DataGrid();
		datagrid.setRows(list);
		datagrid.setTotal(pageInfo.getTotal());
		return datagrid;
	}
}
