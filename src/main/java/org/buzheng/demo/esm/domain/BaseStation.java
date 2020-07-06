package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseStation {
    private String baseId;

    private String baseName;

    private BigDecimal lon;

    private BigDecimal lat;

    private String shareSituation;

    private String area;

    private BigDecimal amapLon;

    private BigDecimal amapLat;

    private Date updateTime;

    private Integer radius;

    private String color;

    private String userId;

    public String getBaseId() {
        return baseId;
    }

    public void setBaseId(String baseId) {
        this.baseId = baseId == null ? null : baseId.trim();
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName == null ? null : baseName.trim();
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

    public String getShareSituation() {
        return shareSituation;
    }

    public void setShareSituation(String shareSituation) {
        this.shareSituation = shareSituation == null ? null : shareSituation.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
    
	public String getFormatUpdateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(updateTime);
	}

	public Double[] getCoordinates() {
		Double[] cdt = new Double[2];
		cdt[0] = lon.doubleValue();
		cdt[1] = lat.doubleValue();
		return cdt;
	}
}