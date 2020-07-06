package org.buzheng.demo.esm.service;

import java.io.File;

public interface UpFileService {

	public void deleteFile(String id);

	public int importBaseStation(File f, String userId);
}
