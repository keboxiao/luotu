package org.buzheng.demo.esm.service;

import java.util.Map;

import org.buzheng.demo.esm.domain.DataGrid;

public interface TObdService {

	public DataGrid findPage(Map<String, Object> params, int page, int rows);

	public int handleTask(String obdCodes, String manAcc);

}
