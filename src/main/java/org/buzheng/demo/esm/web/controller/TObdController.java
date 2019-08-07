package org.buzheng.demo.esm.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.buzheng.demo.esm.App;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.Json;
import org.buzheng.demo.esm.domain.SysUser;
import org.buzheng.demo.esm.service.TObdService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TObdController {
	@Resource
	private TObdService tObdService;

	@RequestMapping("/listobd")
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
		if (StringUtils.isNotBlank(state)) {
			params.put("state", state);
		}
		SysUser user = (SysUser) session.getAttribute(App.USER_SESSION_KEY);
		if (!user.getRoleId().equals("root")) {
			params.put("manAcc", user.getUsername());
		}
		return tObdService.findPage(params, page, rows);
	}

	@RequestMapping("/handleTask")
	@ResponseBody
	public Json handleTask(HttpServletRequest request, HttpSession session) {
		SysUser user = (SysUser) session.getAttribute(App.USER_SESSION_KEY);
		String obdCodes = request.getParameter("obdCodes");
		tObdService.handleTask(obdCodes, user.getUsername());
		Json j = new Json();

		j.setMsg("操作成功");
		j.setSuccess(true);
		return j;
	}
}
