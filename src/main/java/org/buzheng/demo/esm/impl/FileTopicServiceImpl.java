package org.buzheng.demo.esm.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.buzheng.demo.esm.dao.FileTopicMapper;
import org.buzheng.demo.esm.dao.UpfileMapper;
import org.buzheng.demo.esm.domain.DataGrid;
import org.buzheng.demo.esm.domain.FileTopic;
import org.buzheng.demo.esm.domain.FileTopicExample;
import org.buzheng.demo.esm.domain.Upfile;
import org.buzheng.demo.esm.domain.UpfileExample;
import org.buzheng.demo.esm.service.FileTopicService;
import org.buzheng.demo.esm.service.UpFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class FileTopicServiceImpl implements FileTopicService {

	@Autowired
	private FileTopicMapper fileTopicMapper;

	@Autowired
	private UpfileMapper upfileMapper;

	@Autowired
	private UpFileService upFileService;

	@Override
	public DataGrid findPage(Map<String, Object> params, int page, int rows) {
		PageHelper.startPage(page, rows);
		FileTopicExample example = new FileTopicExample();
		FileTopicExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank((String) params.get("title"))) {
			criteria.andTitleLike("%" + params.get("title") + "%");
		}
		List list = fileTopicMapper.selectByExampleInnerjoinUser(example);
		// 取分页信息
		Page<FileTopic> pageInfo = (Page<FileTopic>) list;
		DataGrid datagrid = new DataGrid();
		datagrid.setRows(list);
		datagrid.setTotal(pageInfo.getTotal());
		return datagrid;
	}

	public boolean deleteById(String topicId) {
		UpfileExample example = new UpfileExample();
		UpfileExample.Criteria criteria = example.createCriteria();
		criteria.andTopicIdEqualTo(topicId);
		List<Upfile> list = upfileMapper.selectByExample(example);
		for (Upfile uf : list) {
			upFileService.deleteFile(uf.getFileId());
		}
		fileTopicMapper.deleteByPrimaryKey(topicId);
		return true;
	}
}
