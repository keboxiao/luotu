package org.buzheng.demo.esm.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.buzheng.demo.esm.dao.TObdMapper;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.TObd;
import org.buzheng.demo.esm.domain.TObdExample;
import org.buzheng.demo.esm.service.TObdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class TObdServiceImpl implements TObdService {

	@Autowired
	private TObdMapper tObdMapper;

	@Override
	public DataGrid findPage(Map<String, Object> params, int page, int rows) {
		// this.sysUserDao.findPageByParams(params);
		PageHelper.startPage(page, rows);
		String manAcc = (String) params.get("manAcc");
		if (manAcc == null) {
			TObdExample example = new TObdExample();
			TObdExample.Criteria criteria = example.createCriteria();
			if (params.containsKey("obdCode")) {
				criteria.andObdCodeEqualTo((String) params.get("obdCode"));
			}
			if (params.containsKey("begintime")) {
				String begintime = (String) params.get("begintime") + " 00:00:00";
				criteria.andFinishTimeGreaterThanOrEqualTo(new Date(begintime));
			}
			if (params.containsKey("endtime")) {
				String endtime = (String) params.get("endtime") + " 00:00:00";
				criteria.andFinishTimeLessThanOrEqualTo(new Date(endtime));
			}
			if (params.containsKey("state")) {
				criteria.andStateEqualTo(Long.parseLong((String) params.get("state")));
			}
			List<TObd> list = tObdMapper.selectByExample(example);
			// 取分页信息
			Page<TObd> pageInfo = (Page<TObd>) list;
			DataGrid datagrid = new DataGrid();
			datagrid.setRows(list);
			datagrid.setTotal(pageInfo.getTotal());
			return datagrid;
		} else {
			List<TObd> list = tObdMapper.innerJoinManagerChg(params);
			// 取分页信息
			Page<TObd> pageInfo = (Page<TObd>) list;
			DataGrid datagrid = new DataGrid();
			datagrid.setRows(list);
			datagrid.setTotal(pageInfo.getTotal());
			return datagrid;
		}
	}

	public int handleTask(String obdCodes, String manAcc) {
		TObdExample example = new TObdExample();
		TObdExample.Criteria criteria = example.createCriteria();
		String[] idArr = obdCodes.split(",");
		List<String> idList = new ArrayList<>();
		for (int i = 0; i < idArr.length; i++) {
			idList.add(idArr[i]);
		}
		criteria.andObdCodeIn(idList);
		TObd obd = new TObd();
		obd.setFinishTime(new Date());
		obd.setState((long) 2);
		obd.setUpdateManId(manAcc);
		tObdMapper.updateByExampleSelective(obd, example);
		return 1;
	}
}
