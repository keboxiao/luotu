package org.buzheng.demo.esm.domain;

import org.buzheng.demo.esm.util.GisUtil;

public class TwoLevelAddress {
    private String addrId;

    private String addrLevel1;

    private String addrLevel2;

    private String fullName;

    private String polygonLonlat;

    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId == null ? null : addrId.trim();
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
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