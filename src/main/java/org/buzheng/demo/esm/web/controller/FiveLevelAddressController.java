package org.buzheng.demo.esm.web.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.buzheng.demo.esm.dao.FiveLevelAddressMapper;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.FiveLevelAddressExample;
import org.buzheng.demo.esm.domain.GetAddressTask;
import org.buzheng.demo.esm.domain.Json;
import org.buzheng.demo.esm.service.FiveLevelAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
public class FiveLevelAddressController {

	@Autowired
	private FiveLevelAddressMapper fiveLevelAddressMapper;

	@Autowired
	private FiveLevelAddressService fiveLevelAddressService;
	
	@RequestMapping("searchFiveLevelAddress")
	@ResponseBody
	public DataGrid searchFiveLevelAddress(String addr, int page, int rows) {
		FiveLevelAddressExample example = new FiveLevelAddressExample();
		FiveLevelAddressExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(addr)) {
			criteria.andFullNameLike("%" + addr + "%");
		}
		PageHelper.startPage(page, rows);
		List list = fiveLevelAddressMapper.selectByExample(example);
		Page<GetAddressTask> pageInfo = (Page<GetAddressTask>) list;
		DataGrid datagrid = new DataGrid();
		datagrid.setRows(list);
		datagrid.setTotal(pageInfo.getTotal());
		return datagrid;
	}
	
	@RequestMapping("matchFiveLevelAddr")
	@ResponseBody
	public Json matchFiveLevelAddr() {
		new Thread() {
            public void run() {
                // 写自己的业务逻辑
            	fiveLevelAddressService.matchAddress();
            }
        }.start();

		Json j = new Json();
		String msg = "成功添加一个任务";
		j.setSuccess(true);
		j.setMsg(msg);
		return j;
	}
}
