package org.buzheng.demo.esm.service;

import org.buzheng.demo.esm.domain.DataGrid;

public interface CqtRecordService {

	public int translateLonLat();
	
	public int matchAddr();

	public DataGrid searchVillageCoverage(String village, int page);
}
