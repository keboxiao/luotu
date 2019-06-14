package org.buzheng.demo.esm.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.buzheng.demo.esm.dao.TempManchgMapper;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.TempManchg;
import org.buzheng.demo.esm.domain.TempManchgExample;
import org.buzheng.demo.esm.service.TempManchgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

@Service
public class TempManchgServiceImpl implements TempManchgService {

	private static Logger logger = Logger.getLogger(TempManchgServiceImpl.class);

	@Autowired
	private TempManchgMapper tempManchgMapper;

	@Override
	public DataGrid findPage(Map<String, Object> params, int page, int rows) {
		// this.sysUserDao.findPageByParams(params);
		PageHelper.startPage(page, rows);
		TempManchgExample example = new TempManchgExample();
		TempManchgExample.Criteria criteria = example.createCriteria();
		/*
		 * if (params.containsKey("obdCode")) {
		 * criteria.andObdCodeEqualTo((String) params.get("obdCode")); } if
		 * (params.containsKey("begintime")) { String begintime = (String)
		 * params.get("begintime") + " 00:00:00";
		 * criteria.andFinishTimeGreaterThanOrEqualTo(new Date(begintime)); } if
		 * (params.containsKey("endtime")) { String endtime = (String)
		 * params.get("endtime") + " 00:00:00";
		 * criteria.andFinishTimeLessThanOrEqualTo(new Date(endtime)); }
		 */
		String accessCode = (String) params.get("accessCode");
		if (StringUtils.isNotBlank(accessCode)) {
			criteria.andAccessCodeEqualTo(accessCode);
		}
		if (StringUtils.isNotBlank((String) params.get("state"))) {
			criteria.andStateEqualTo(Long.parseLong((String) params.get("state")));
		}
		if (StringUtils.isNotBlank((String) params.get("manAccount"))) {
			criteria.andManAccountEqualTo((String) params.get("manAccount"));
		}
		example.setOrderByClause(" address_id,id");
		List<TempManchg> list = tempManchgMapper.selectByExample(example);
		// 取分页信息
		Page<TempManchg> pageInfo = (Page<TempManchg>) list;
		DataGrid datagrid = new DataGrid();
		datagrid.setRows(list);
		datagrid.setTotal(pageInfo.getTotal());
		return datagrid;
	}

	public void searchAndDownload(Map<String, Object> params, HttpServletResponse response) {
		TempManchgExample example = new TempManchgExample();
		TempManchgExample.Criteria criteria = example.createCriteria();
		/*
		 * if (params.containsKey("obdCode")) {
		 * criteria.andObdCodeEqualTo((String) params.get("obdCode")); } if
		 * (params.containsKey("begintime")) { String begintime = (String)
		 * params.get("begintime") + " 00:00:00";
		 * criteria.andFinishTimeGreaterThanOrEqualTo(new Date(begintime)); } if
		 * (params.containsKey("endtime")) { String endtime = (String)
		 * params.get("endtime") + " 00:00:00";
		 * criteria.andFinishTimeLessThanOrEqualTo(new Date(endtime)); }
		 */
		String accessCode = (String) params.get("accessCode");
		if (StringUtils.isNotBlank(accessCode)) {
			criteria.andAccessCodeEqualTo(accessCode);
		}
		if (StringUtils.isNotBlank((String) params.get("state"))) {
			criteria.andStateEqualTo(Long.parseLong((String) params.get("state")));
		}
		List<TempManchg> list = tempManchgMapper.selectByExample(example);
		downloadExcel(response, list);
	}

	public void downloadExcel(HttpServletResponse response, List<TempManchg> list) {

		// 创建工作表
		WritableWorkbook book = null;
		response.reset();

		response.setCharacterEncoding("UTF-8");// 设置字符集

		// 创建工作流
		OutputStream os = null;
		try {

			// 设置弹出对话框
			response.setContentType("application/DOWLOAD");
			response.setCharacterEncoding("UTF-8");

			// 设置工作表的标题
			response.setHeader("Content-Disposition", "attachment; filename=maoming_luotu.xls");// 设置生成的文件名字
			os = response.getOutputStream();

			// 初始化工作表
			book = Workbook.createWorkbook(os);

		} catch (IOException e1) {
			logger.error("导出excel出现IO异常", e1);
			e1.printStackTrace();
		}
		try {

			// 以下为excel表格内容
			// int nCount = list.size();
			WritableSheet sheet = book.createSheet("落图结果导出", 0);

			// 生成名工作表，参数0表示这是第一页
			// int nI = 1;

			// 表字段名
			sheet.addCell(new jxl.write.Label(0, 0, "序号"));
			sheet.addCell(new jxl.write.Label(1, 0, "接入号"));
			sheet.addCell(new jxl.write.Label(2, 0, "资源地址ID"));
			sheet.addCell(new jxl.write.Label(3, 0, "资源地址名称"));
			sheet.addCell(new jxl.write.Label(4, 0, "落图新地址"));
			// sheet.addCell(new jxl.write.Label(5, 0, "申请日期"));

			// 将数据追加
			for (int i = 1; i < list.size() + 1; i++) {

				sheet.addCell(new jxl.write.Label(0, i, String.valueOf(i)));// 序号从1开始
				sheet.addCell(new jxl.write.Label(1, i, list.get(i - 1).getAccessCode()));
				sheet.addCell(new jxl.write.Label(2, i, list.get(i - 1).getAddressId().toString()));
				sheet.addCell(new jxl.write.Label(3, i, list.get(i - 1).getAddress()));
				sheet.addCell(new jxl.write.Label(4, i, list.get(i - 1).getAddress7()));

				// 设置日期格式
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				// Date appDate = list.get(i - 1).getAppDate();
				// String appDateStr = sf.format(appDate);
				// sheet.addCell(new jxl.write.Label(5, i, appDateStr));// 申请日期
			}
			book.write();
			book.close();
		} catch (Exception e) {
			logger.error("导出excel出现异常", e);
			e.printStackTrace();
		} finally {
			if (null != os) {
				try {
					os.close();
				} catch (IOException e) {
					logger.error("关流出现异常", e);
					e.printStackTrace();
				}
			}
		}
	}

	public boolean luotu(String address, String ids) {
		TempManchgExample example = new TempManchgExample();
		TempManchgExample.Criteria criteria = example.createCriteria();
		String[] idArr = ids.split(",");
		List<String> idList = new ArrayList<>();
		for (int i = 0; i < idArr.length; i++) {
			idList.add(idArr[i]);
		}
		criteria.andIdIn(idList);
		TempManchg tempManchg = new TempManchg();
		tempManchg.setAddress7(address);
		tempManchg.setActDate(new Date());
		tempManchg.setState((long) 2);
		tempManchgMapper.updateByExampleSelective(tempManchg, example);
		return true;
	}
}
