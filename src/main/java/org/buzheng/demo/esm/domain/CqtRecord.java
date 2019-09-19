package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CqtRecord {
    private String recordId;

    private String networkWl;

    private String telecomOperator;

    private String taskType;

    private String province;

    private String city;

    private String addrLevel5;

    private String floorNum;

    private BigDecimal lon;

    private BigDecimal lat;

    private BigDecimal bmapLon;

    private BigDecimal bmapLat;

    private String imsi;

    private String phone;

    private BigDecimal peakDownRate;

    private BigDecimal averDownRate;

    private Integer state;

    private String username;

    private Date finishTime;

    private String ifInside;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getNetworkWl() {
        return networkWl;
    }

    public void setNetworkWl(String networkWl) {
        this.networkWl = networkWl == null ? null : networkWl.trim();
    }

    public String getTelecomOperator() {
        return telecomOperator;
    }

    public void setTelecomOperator(String telecomOperator) {
        this.telecomOperator = telecomOperator == null ? null : telecomOperator.trim();
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddrLevel5() {
        return addrLevel5;
    }

    public void setAddrLevel5(String addrLevel5) {
        this.addrLevel5 = addrLevel5 == null ? null : addrLevel5.trim();
    }

    public String getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum == null ? null : floorNum.trim();
    }

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getBmapLon() {
        return bmapLon;
    }

    public void setBmapLon(BigDecimal bmapLon) {
        this.bmapLon = bmapLon;
    }

    public BigDecimal getBmapLat() {
        return bmapLat;
    }

    public void setBmapLat(BigDecimal bmapLat) {
        this.bmapLat = bmapLat;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public BigDecimal getPeakDownRate() {
        return peakDownRate;
    }

    public void setPeakDownRate(BigDecimal peakDownRate) {
        this.peakDownRate = peakDownRate;
    }

    public BigDecimal getAverDownRate() {
        return averDownRate;
    }

    public void setAverDownRate(BigDecimal averDownRate) {
        this.averDownRate = averDownRate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getIfInside() {
        return ifInside;
    }

    public void setIfInside(String ifInside) {
        this.ifInside = ifInside == null ? null : ifInside.trim();
    }
}