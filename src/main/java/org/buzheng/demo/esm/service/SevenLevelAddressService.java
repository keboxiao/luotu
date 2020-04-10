package org.buzheng.demo.esm.service;

import org.buzheng.demo.esm.domain.DataGrid;

public interface SevenLevelAddressService {

	public int getAddressDataFromAMap();
	
	public int generateAddrLevelSeven();
	
	public int getAddressDataBatchFromAMap();
	
	public DataGrid searchSevenLevelAddress(String addr, int page, int rows);
	
}
