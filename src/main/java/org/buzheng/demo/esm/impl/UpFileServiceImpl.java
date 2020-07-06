package org.buzheng.demo.esm.impl;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

import org.buzheng.demo.esm.dao.BaseStationMapper;
import org.buzheng.demo.esm.dao.UpfileMapper;
import org.buzheng.demo.esm.domain.BaseStation;
import org.buzheng.demo.esm.domain.Upfile;
import org.buzheng.demo.esm.service.UpFileService;
import org.buzheng.demo.esm.util.GPSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

@Service
public class UpFileServiceImpl implements UpFileService {

	@Autowired
	private UpfileMapper upfileMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BaseStationMapper baseStationMapper;
	
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

	public synchronized int importBaseStation(File f, String userId) {
		int rowsum = 0;
		try {
			// FileInputStream is = new FileInputStream(f);
			String sql = "delete from base_station";
			jdbcTemplate.update(sql);
			jxl.Workbook rwb = Workbook.getWorkbook(f);
			Sheet sheet = rwb.getSheet(0);
			int columns = sheet.getColumns();
			int c = sheet.getRows();
			int row = 0;
			for (row = 0; row <= c; row++) {
				LinkedList<String> list = new LinkedList<String>();
				for (int i = 0; i < columns; i++) {
					Cell cel = sheet.getCell(i, row + 1);
					String strc = cel.getContents().toString();
					list.add(strc);
				}
				double lon,lat;
				BaseStation baseStation = new BaseStation();
				baseStation.setBaseId(list.get(0));
				baseStation.setBaseName(list.get(1));
				lon=Double.parseDouble(list.get(2));
				lat=Double.parseDouble(list.get(3));
				baseStation.setLon(new BigDecimal(lon));
				baseStation.setLat(new BigDecimal(lat));
				double[] latlon = GPSUtil.gps84_To_Gcj02(lat, lon);
				baseStation.setAmapLon(new BigDecimal(latlon[1]));
				baseStation.setAmapLat(new BigDecimal(latlon[0]));
				baseStation.setUserId(userId);
				baseStation.setShareSituation(list.get(4));
				baseStation.setArea(list.get(5));
				baseStationMapper.insertSelective(baseStation);
				list.clear();
				rowsum++;
			}
			return rowsum;
		} catch (Exception e) {
			e.getStackTrace();
			return rowsum;
		} finally {
			f.delete();
		}
	}
}
