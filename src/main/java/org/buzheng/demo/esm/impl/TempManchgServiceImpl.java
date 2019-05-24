package org.buzheng.demo.esm.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.buzheng.demo.esm.dao.TempManchgMapper;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.TempManchg;
import org.buzheng.demo.esm.domain.TempManchgExample;
import org.buzheng.demo.esm.service.TempManchgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class TempManchgServiceImpl implements TempManchgService {

	@Autowired
	private TempManchgMapper tempManchgMapper;

	@Override
	public DataGrid findPage(Map<String, Object> params, int page, int rows) {
		// this.sysUserDao.findPageByParams(params);
		PageHelper.startPage(page, rows);
		TempManchgExample example = new TempManchgExample();
		TempManchgExample.Criteria criteria = example.createCriteria();
		/*if (params.containsKey("obdCode")) {
			criteria.andObdCodeEqualTo((String) params.get("obdCode"));
		}
		if (params.containsKey("begintime")) {
			String begintime = (String) params.get("begintime") + " 00:00:00";
			criteria.andFinishTimeGreaterThanOrEqualTo(new Date(begintime));
		}
		if (params.containsKey("endtime")) {
			String endtime = (String) params.get("endtime") + " 00:00:00";
			criteria.andFinishTimeLessThanOrEqualTo(new Date(endtime));
		}*/
		if (StringUtils.isNotBlank((String)params.get("state"))) {
			criteria.andStateEqualTo(Long.parseLong((String)params.get("state")));
		}
		List<TempManchg> list = tempManchgMapper.selectByExample(example);
		// 取分页信息
		Page<TempManchg> pageInfo = (Page<TempManchg>) list;
		DataGrid datagrid = new DataGrid();
		datagrid.setRows(list);
		datagrid.setTotal(pageInfo.getTotal());
		return datagrid;
	}

}
