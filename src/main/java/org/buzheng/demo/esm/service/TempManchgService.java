package org.buzheng.demo.esm.service;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.buzheng.demo.esm.domain.DataGrid;

public interface TempManchgService {

	public DataGrid findPage(Map<String, Object> params, int page, int rows);

	public void searchAndDownload(Map<String, Object> params, HttpServletResponse response);

	public boolean luotu(String address, String ids);

}
