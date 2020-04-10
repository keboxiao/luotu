package org.buzheng.demo.esm.web.controller;

import org.buzheng.demo.esm.domain.Json;
import org.buzheng.demo.esm.service.TOtbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TOtbController {

	@Autowired
	private TOtbService tOtbService;
	
	@RequestMapping("matchOtbAddr")
	@ResponseBody
	public Json matchOtbAddr() {
		new Thread() {
            public void run() {
                // 写自己的业务逻辑
            	tOtbService.matchAddress();
            }
        }.start();

		Json j = new Json();
		String msg = "成功添加一个任务";
		j.setSuccess(true);
		j.setMsg(msg);
		return j;
	}
}
