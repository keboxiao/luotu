package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;

import org.buzheng.demo.esm.util.GisUtil;

public class TOtb {
    private String otbCode;

    private String otbName;

    private String buildAddress;

    private String addr5Id;

    private String addr5Fullname;

    private String polygonLonlat;

    private BigDecimal lon;

    private BigDecimal lat;

    private String remark;

    private Long state;

    public String getOtbCode() {
        return otbCode;
    }

    public void setOtbCode(String otbCode) {
        this.otbCode = otbCode == null ? null : otbCode.trim();
    }

    public String getOtbName() {
        return otbName;
    }

    public void setOtbName(String otbName) {
        this.otbName = otbName == null ? null : otbName.trim();
    }

    public String getBuildAddress() {
        return buildAddress;
    }

    public void setBuildAddress(String buildAddress) {
        this.buildAddress = buildAddress == null ? null : buildAddress.trim();
    }

    public String getAddr5Id() {
        return addr5Id;
    }

    public void setAddr5Id(String addr5Id) {
        this.addr5Id = addr5Id == null ? null : addr5Id.trim();
    }

    public String getAddr5Fullname() {
        return addr5Fullname;
    }

    public void setAddr5Fullname(String addr5Fullname) {
        this.addr5Fullname = addr5Fullname == null ? null : addr5Fullname.trim();
    }

    public String getPolygonLonlat() {
        return polygonLonlat;
    }

    public void setPolygonLonlat(String polygonLonlat) {
        this.polygonLonlat = polygonLonlat == null ? null : polygonLonlat.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
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