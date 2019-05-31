package org.buzheng.demo.esm.impl;

import java.io.File;

import org.buzheng.demo.esm.dao.UpfileMapper;
import org.buzheng.demo.esm.domain.Upfile;
import org.buzheng.demo.esm.service.UpFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpFileServiceImpl implements UpFileService {

	@Autowired
	private UpfileMapper upfileMapper;

	@Override
	public void deleteFile(String id) {
		// TODO Auto-generated method stub
		Upfile upFile = upfileMapper.selectByPrimaryKey(id);
		File file = new File("d:/upload_file/" + upFile.getFilename());
		// 路径为文件且不为空则进行删除
		if (file.isFile() && file.exists()) {
			file.delete();
		}
		upfileMapper.deleteByPrimaryKey(id);
	}

}
