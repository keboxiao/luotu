package org.buzheng.demo.esm.web.controller;

import java.util.List;

import org.buzheng.demo.esm.dao.GetAddressTaskMapper;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.GetAddressTask;
import org.buzheng.demo.esm.domain.GetAddressTaskExample;
import org.buzheng.demo.esm.domain.Json;
import org.buzheng.demo.esm.service.SevenLevelAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
public class SevenLevelAddressController {

	@Autowired
	private SevenLevelAddressService sevenLevelAddressService;
	
	@Autowired
	private GetAddressTaskMapper getAddressTaskMapper;

	@RequestMapping("getAddressDataFromAMap")
	@ResponseBody
	public Json getAddressDataFromAMap() {
		new Thread() {
            public void run() {
                // 写自己的业务逻辑
            	sevenLevelAddressService.getAddressDataFromAMap();
            }
        }.start();

		Json j = new Json();
		String msg = "成功添加一个任务";
		j.setSuccess(true);
		j.setMsg(msg);
		return j;
	}
	
	@RequestMapping("listAddressTask")
	@ResponseBody
	public DataGrid listAddressTask(int page , int rows) {
		GetAddressTaskExample example = new GetAddressTaskExample();
		GetAddressTaskExample.Criteria criteria = example.createCriteria();
		PageHelper.startPage(page, rows);
		List list = getAddressTaskMapper.selectByExample(example);
		Page<GetAddressTask> pageInfo = (Page<GetAddressTask>) list;
		DataGrid datagrid = new DataGrid();
		datagrid.setRows(list);
		datagrid.setTotal(pageInfo.getTotal());
		return datagrid;
	}

}
