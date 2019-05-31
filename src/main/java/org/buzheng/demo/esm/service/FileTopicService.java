package org.buzheng.demo.esm.service;

import java.util.Map;

import org.buzheng.demo.esm.domain.DataGrid;

public interface FileTopicService {

	public DataGrid findPage(Map<String, Object> params, int page, int rows);
	
	public boolean deleteById(String topicId);

}
