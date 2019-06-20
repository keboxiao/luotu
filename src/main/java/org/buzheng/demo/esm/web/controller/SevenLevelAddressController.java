package org.buzheng.demo.esm.web.controller;

import org.buzheng.demo.esm.domain.Json;
import org.buzheng.demo.esm.service.SevenLevelAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SevenLevelAddressController {

	@Autowired
	private SevenLevelAddressService sevenLevelAddressService;

	@RequestMapping("getAddressDataFromAMap")
	@ResponseBody
	public Json getAddressDataFromAMap() {
		int res = sevenLevelAddressService.getAddressDataFromAMap();
		Json j = new Json();
		String msg = "成功获取" + res + "条数据";
		j.setSuccess(true);
		j.setMsg(msg);
		return j;
	}

}
