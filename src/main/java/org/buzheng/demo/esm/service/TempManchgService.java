package org.buzheng.demo.esm.service;

import java.util.Map;

import org.buzheng.demo.esm.domain.DataGrid;

public interface TempManchgService {

	public DataGrid findPage(Map<String, Object> params, int page, int rows);

}
