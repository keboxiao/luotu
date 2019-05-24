package org.buzheng.demo.esm.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.service.TempManchgService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TempManchgController {
	@Resource
	private TempManchgService tempManchgService;

	@RequestMapping("/listservice")
	@ResponseBody
	public DataGrid find(HttpServletRequest request, HttpSession session) {
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		String obdCode = request.getParameter("obdCode");
		String begintime = request.getParameter("begintime");
		String endtime = request.getParameter("endtime");
		String state = request.getParameter("state");
		Map<String, Object> params = new HashMap<String, Object>();
		if (StringUtils.isNotBlank(obdCode)) {
			params.put("obdCode", request.getParameter("obdCode"));
		}
		if (StringUtils.isNotBlank(begintime)) {
			params.put("begintime", request.getParameter("begintime"));
		}
		if (StringUtils.isNotBlank(endtime)) {
			params.put("endtime", request.getParameter("endtime"));
		}
		params.put("state", state);
		return tempManchgService.findPage(params, page, rows);
	}
}
