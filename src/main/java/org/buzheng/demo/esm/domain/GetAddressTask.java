package org.buzheng.demo.esm.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class GetAddressTask {
	private String taskId;

	private Integer total;

	private Integer achieve;

	private Date beginTime;

	private Date endTime;

	private Integer state;

	private String taskType;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId == null ? null : taskId.trim();
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getAchieve() {
		return achieve;
	}

	public void setAchieve(Integer achieve) {
		this.achieve = achieve;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType == null ? null : taskType.trim();
	}

	public String getFormatBeginTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(beginTime);
	}

	public String getFormatEndTime() {
		if (endTime != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.format(endTime);
		} else {
			return "";
		}
	}
}