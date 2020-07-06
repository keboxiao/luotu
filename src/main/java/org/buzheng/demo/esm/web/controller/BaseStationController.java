package org.buzheng.demo.esm.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.buzheng.demo.esm.App;
import org.buzheng.demo.esm.dao.BaseStationMapper;
import org.buzheng.demo.esm.domain.BaseStationExample;
import org.buzheng.demo.esm.domain.Json;
import org.buzheng.demo.esm.domain.SysUser;
import org.buzheng.demo.esm.service.UpFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
public class BaseStationController {

	@Autowired
	private BaseStationMapper baseStationMapper;
	
	@Autowired
	private UpFileService upFileService;
	
	@RequestMapping("/getAllBaseStation")
	@ResponseBody
	public List getAllBaseStation(HttpServletRequest request, HttpSession session) {
		BaseStationExample example = new BaseStationExample();
		BaseStationExample.Criteria criteria = example.createCriteria();
		return baseStationMapper.selectByExample(example);
	}
	
	@RequestMapping("uploadBaseStation")
	@ResponseBody
	public Json uploadBaseStation(HttpServletRequest request, HttpSession session)
			throws IllegalStateException, IOException {
		SysUser user = (SysUser) session.getAttribute(App.USER_SESSION_KEY);
		Json j = new Json();
		long startTime = System.currentTimeMillis();
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					String path = "d:/upload_file/" + file.getOriginalFilename();
					File ofile = new File(path);
					//file.transferTo(ofile);
					FileUtils.copyInputStreamToFile(file.getInputStream(), ofile); 
					int c = upFileService.importBaseStation(ofile, user.getUserId());
					String msg = "成功导入"+c+"条记录，并清除旧数据。";
					j.setSuccess(true);
					j.setMsg(msg);
				}else{
					j.setSuccess(false);
					j.setMsg("上传失败！");
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		return j;
	}
}
