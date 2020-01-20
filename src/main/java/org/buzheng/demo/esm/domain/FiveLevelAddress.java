package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.buzheng.demo.esm.util.GisUtil;

public class FiveLevelAddress {
    private String addrId;

    private BigDecimal lon;

    private BigDecimal lat;

    private BigDecimal xmapLon;

    private BigDecimal xmapLat;

    private String addrLevel1;

    private String addrLevel2;

    private String addrLevel3;

    private String addrLevel4;

    private String addrLevel5;

    private String addrLevel4Std;

    private String addrLevel5Std;

    private String fullName;

    private String fullNameStd;

    private Integer state;

    private Integer chinaMobile;

    private Integer chinaUnion;

    private String manAccount;

    private Date updateTime;

    private BigDecimal id5;

    private String polygonLonlat;

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

    public BigDecimal getXmapLon() {
        return xmapLon;
    }

    public void setXmapLon(BigDecimal xmapLon) {
        this.xmapLon = xmapLon;
    }

    public BigDecimal getXmapLat() {
        return xmapLat;
    }

    public void setXmapLat(BigDecimal xmapLat) {
        this.xmapLat = xmapLat;
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

    public String getAddrLevel4Std() {
        return addrLevel4Std;
    }

    public void setAddrLevel4Std(String addrLevel4Std) {
        this.addrLevel4Std = addrLevel4Std == null ? null : addrLevel4Std.trim();
    }

    public String getAddrLevel5Std() {
        return addrLevel5Std;
    }

    public void setAddrLevel5Std(String addrLevel5Std) {
        this.addrLevel5Std = addrLevel5Std == null ? null : addrLevel5Std.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getFullNameStd() {
        return fullNameStd;
    }

    public void setFullNameStd(String fullNameStd) {
        this.fullNameStd = fullNameStd == null ? null : fullNameStd.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getChinaMobile() {
        return chinaMobile;
    }

    public void setChinaMobile(Integer chinaMobile) {
        this.chinaMobile = chinaMobile;
    }

    public Integer getChinaUnion() {
        return chinaUnion;
    }

    public void setChinaUnion(Integer chinaUnion) {
        this.chinaUnion = chinaUnion;
    }

    public String getManAccount() {
        return manAccount;
    }

    public void setManAccount(String manAccount) {
        this.manAccount = manAccount == null ? null : manAccount.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getId5() {
        return id5;
    }

    public void setId5(BigDecimal id5) {
        this.id5 = id5;
    }

    public String getPolygonLonlat() {
        return polygonLonlat;
    }

    public void setPolygonLonlat(String polygonLonlat) {
        this.polygonLonlat = polygonLonlat == null ? null : polygonLonlat.trim();
    }
    
	public boolean isInsidePolygon(double pointLon, double pointLat) {
		String[] Lonlat = polygonLonlat.split(",");
		double[] lon = new double[Lonlat.length / 2];
		double[] lat = new double[Lonlat.length / 2];
		boolean flag = true;
		int lonidx = 0;
		int latidx = 0;
		for (int i = 0; i < Lonlat.length; i++) {
			if (flag) {
				lon[lonidx] = Double.parseDouble(Lonlat[i]);
				lonidx++;
				flag = false;
			} else {
				lat[latidx] = Double.parseDouble(Lonlat[i]);
				latidx++;
				flag = true;
			}
		}
		return GisUtil.isInPolygon(pointLon, pointLat, lon, lat);
	}
}