package org.buzheng.demo.esm.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.buzheng.demo.esm.App;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.Json;
import org.buzheng.demo.esm.domain.SysUser;
import org.buzheng.demo.esm.service.CqtRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CqtRecordController {

	@Autowired
	private CqtRecordService cqtRecordService;

	@RequestMapping("/translateLonLat")
	@ResponseBody
	public Json translateLonLat(HttpServletRequest request, HttpSession session) {
		SysUser user = (SysUser) session.getAttribute(App.USER_SESSION_KEY);
		Json j = new Json();
		if (user != null) {
			new Thread() {
				public void run() {
					cqtRecordService.translateLonLat();
				}
			}.start();
			j.setMsg("转换成功");
			j.setSuccess(true);
		} else {
			j.setMsg("please login!!!");
			j.setSuccess(false);
		}
		return j;
	}

	@RequestMapping("/cqtmatchaddr")
	@ResponseBody
	public Json cqtMatchAddr(HttpServletRequest request, HttpSession session) {
		SysUser user = (SysUser) session.getAttribute(App.USER_SESSION_KEY);
		Json j = new Json();
		if (user != null) {
			new Thread() {
				public void run() {
					cqtRecordService.matchAddr();
				}
			}.start();
			j.setMsg("创建任务成功");
			j.setSuccess(true);
		} else {
			j.setMsg("please login!!!");
			j.setSuccess(false);
		}
		return j;
	}

	@RequestMapping("/searchVillageCoverage")
	@ResponseBody
	public DataGrid searchVillageCoverage(String village, int page) {
		return cqtRecordService.searchVillageCoverage(village, page);
	}
}
