package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.Date;

public class SevenLevelAddress {
    private String addrId;

    private BigDecimal lon;

    private BigDecimal lat;

    private BigDecimal amapLon;

    private BigDecimal amapLat;

    private String addrLevel1;

    private String addrLevel2;

    private String addrLevel3;

    private String addrLevel4;

    private String addrLevel5;

    private String addrLevel6;

    private String addrLevel7;

    private String fullName;

    private String formattedAddress;

    private String retJson;

    private Integer state;

    private Date updateTime;

    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId == null ? null : addrId.trim();
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

    public BigDecimal getAmapLon() {
        return amapLon;
    }

    public void setAmapLon(BigDecimal amapLon) {
        this.amapLon = amapLon;
    }

    public BigDecimal getAmapLat() {
        return amapLat;
    }

    public void setAmapLat(BigDecimal amapLat) {
        this.amapLat = amapLat;
    }

    public String getAddrLevel1() {
        return addrLevel1;
    }

    public void setAddrLevel1(String addrLevel1) {
        this.addrLevel1 = addrLevel1 == null ? null : addrLevel1.trim();
    }

    public String getAddrLevel2() {
        return addrLevel2;
    }

    public void setAddrLevel2(String addrLevel2) {
        this.addrLevel2 = addrLevel2 == null ? null : addrLevel2.trim();
    }

    public String getAddrLevel3() {
        return addrLevel3;
    }

    public void setAddrLevel3(String addrLevel3) {
        this.addrLevel3 = addrLevel3 == null ? null : addrLevel3.trim();
    }

    public String getAddrLevel4() {
        return addrLevel4;
    }

    public void setAddrLevel4(String addrLevel4) {
        this.addrLevel4 = addrLevel4 == null ? null : addrLevel4.trim();
    }

    public String getAddrLevel5() {
        return addrLevel5;
    }

    public void setAddrLevel5(String addrLevel5) {
        this.addrLevel5 = addrLevel5 == null ? null : addrLevel5.trim();
    }

    public String getAddrLevel6() {
        return addrLevel6;
    }

    public void setAddrLevel6(String addrLevel6) {
        this.addrLevel6 = addrLevel6 == null ? null : addrLevel6.trim();
    }

    public String getAddrLevel7() {
        return addrLevel7;
    }

    public void setAddrLevel7(String addrLevel7) {
        this.addrLevel7 = addrLevel7 == null ? null : addrLevel7.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress == null ? null : formattedAddress.trim();
    }

    public String getRetJson() {
        return retJson;
    }

    public void setRetJson(String retJson) {
        this.retJson = retJson == null ? null : retJson.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}