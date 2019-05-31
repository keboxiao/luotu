package org.buzheng.demo.esm.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.buzheng.demo.esm.App;
import org.buzheng.demo.esm.dao.FileTopicMapper;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.FileTopic;
import org.buzheng.demo.esm.domain.Json;
import org.buzheng.demo.esm.domain.SysUser;
import org.buzheng.demo.esm.service.FileTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileBatchController {

	@Autowired
	private FileTopicMapper fileTopicMapper;

	@Autowired
	private FileTopicService fileTopicService;

	@RequestMapping("/listFileBatch")
	@ResponseBody
	public DataGrid listFileBatch(String title, int page, int rows) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", title);
		return fileTopicService.findPage(map, page, rows);
	}

	@RequestMapping("/addFileBatch")
	@ResponseBody
	public Json addFileBatch(String title, String remark, HttpSession session) {
		FileTopic fileBatch = new FileTopic();
		fileBatch.setTitle(title);
		fileBatch.setRemark(remark);
		SysUser sysUser = (SysUser) session.getAttribute(App.USER_SESSION_KEY);
		// fileBatch.setUser(sysUser);
		fileBatch.setUserId(sysUser.getUserId());
		fileTopicMapper.insertSelective(fileBatch);
		Json j = new Json();
		String msg = "添加成功";
		j.setObj(fileBatch);
		j.setSuccess(true);
		j.setMsg(msg);
		return j;
	}

	@RequestMapping("/updateFileBatch")
	@ResponseBody
	public Json updateFileBatch(String id, String title, String remark, HttpSession session) {
		FileTopic fileBatch = new FileTopic();
		fileBatch.setTitle(title);
		fileBatch.setRemark(remark);
		fileBatch.setTopicId(id);
		SysUser sysUser = (SysUser) session.getAttribute(App.USER_SESSION_KEY);
		fileBatch.setUserId(sysUser.getUserId());
		fileBatch.setUser(sysUser);
		fileTopicMapper.updateByPrimaryKey(fileBatch);
		return new Json();
	}

	@RequestMapping("/deleteById")
	@ResponseBody
	public Json deleteById(String id) {
		Json j = new Json();
		if (fileTopicService.deleteById(id)) {
			j.setMsg("删除成功");
			j.setSuccess(true);
		} else {
			j.setMsg("删除失败");
			j.setSuccess(false);
		}
		return j;
	}

}
