package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CqtRecord {
    private String recordId;

    private Date finishTime;

    private String username;

    private String buildingName;

    private String area;

    private String grid;

    private String branch;

    private String marketingCenter;

    private String taskId;

    private String imei;

    private String imsi;

    private String mdn;

    private String terminalType;

    private String networkWl;

    private String telecomOperator;

    private BigDecimal bmapLon;

    private BigDecimal bmapLat;

    private BigDecimal lon;

    private BigDecimal lat;

    private String addrId;

    private String province;

    private String city;

    private String adminArea;

    private String street;

    private String doorNum;

    private String addrLevel5;

    private String lteBaseNum;

    private String lteBaseName;

    private String lteSection;

    private String frequency;

    private String mcc;

    private String mnc;

    private String ci;

    private String pci;

    private String tac;

    private BigDecimal rsrp;

    private BigDecimal rsrq;

    private BigDecimal rssi;

    private BigDecimal rssnr;

    private BigDecimal cqi;

    private String bsc;

    private String cdmaBaseNum;

    private String cdmaBaseName;

    private String cdmaSection;

    private String sidc;

    private String nid;

    private String cid;

    private BigDecimal threeGrx;

    private BigDecimal threeGecio;

    private BigDecimal threeGsnr;

    private BigDecimal twoGrx;

    private BigDecimal twoGecio;

    private String gsmcellid;

    private String gsmlac;

    private String gsmrx;

    private Integer state;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getGrid() {
        return grid;
    }

    public void setGrid(String grid) {
        this.grid = grid == null ? null : grid.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getMarketingCenter() {
        return marketingCenter;
    }

    public void setMarketingCenter(String marketingCenter) {
        this.marketingCenter = marketingCenter == null ? null : marketingCenter.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    public String getMdn() {
        return mdn;
    }

    public void setMdn(String mdn) {
        this.mdn = mdn == null ? null : mdn.trim();
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
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

    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId == null ? null : addrId.trim();
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

    public String getAdminArea() {
        return adminArea;
    }

    public void setAdminArea(String adminArea) {
        this.adminArea = adminArea == null ? null : adminArea.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(String doorNum) {
        this.doorNum = doorNum == null ? null : doorNum.trim();
    }

    public String getAddrLevel5() {
        return addrLevel5;
    }

    public void setAddrLevel5(String addrLevel5) {
        this.addrLevel5 = addrLevel5 == null ? null : addrLevel5.trim();
    }

    public String getLteBaseNum() {
        return lteBaseNum;
    }

    public void setLteBaseNum(String lteBaseNum) {
        this.lteBaseNum = lteBaseNum == null ? null : lteBaseNum.trim();
    }

    public String getLteBaseName() {
        return lteBaseName;
    }

    public void setLteBaseName(String lteBaseName) {
        this.lteBaseName = lteBaseName == null ? null : lteBaseName.trim();
    }

    public String getLteSection() {
        return lteSection;
    }

    public void setLteSection(String lteSection) {
        this.lteSection = lteSection == null ? null : lteSection.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc == null ? null : mcc.trim();
    }

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc == null ? null : mnc.trim();
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci == null ? null : ci.trim();
    }

    public String getPci() {
        return pci;
    }

    public void setPci(String pci) {
        this.pci = pci == null ? null : pci.trim();
    }

    public String getTac() {
        return tac;
    }

    public void setTac(String tac) {
        this.tac = tac == null ? null : tac.trim();
    }

    public BigDecimal getRsrp() {
        return rsrp;
    }

    public void setRsrp(BigDecimal rsrp) {
        this.rsrp = rsrp;
    }

    public BigDecimal getRsrq() {
        return rsrq;
    }

    public void setRsrq(BigDecimal rsrq) {
        this.rsrq = rsrq;
    }

    public BigDecimal getRssi() {
        return rssi;
    }

    public void setRssi(BigDecimal rssi) {
        this.rssi = rssi;
    }

    public BigDecimal getRssnr() {
        return rssnr;
    }

    public void setRssnr(BigDecimal rssnr) {
        this.rssnr = rssnr;
    }

    public BigDecimal getCqi() {
        return cqi;
    }

    public void setCqi(BigDecimal cqi) {
        this.cqi = cqi;
    }

    public String getBsc() {
        return bsc;
    }

    public void setBsc(String bsc) {
        this.bsc = bsc == null ? null : bsc.trim();
    }

    public String getCdmaBaseNum() {
        return cdmaBaseNum;
    }

    public void setCdmaBaseNum(String cdmaBaseNum) {
        this.cdmaBaseNum = cdmaBaseNum == null ? null : cdmaBaseNum.trim();
    }

    public String getCdmaBaseName() {
        return cdmaBaseName;
    }

    public void setCdmaBaseName(String cdmaBaseName) {
        this.cdmaBaseName = cdmaBaseName == null ? null : cdmaBaseName.trim();
    }

    public String getCdmaSection() {
        return cdmaSection;
    }

    public void setCdmaSection(String cdmaSection) {
        this.cdmaSection = cdmaSection == null ? null : cdmaSection.trim();
    }

    public String getSidc() {
        return sidc;
    }

    public void setSidc(String sidc) {
        this.sidc = sidc == null ? null : sidc.trim();
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid == null ? null : nid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public BigDecimal getThreeGrx() {
        return threeGrx;
    }

    public void setThreeGrx(BigDecimal threeGrx) {
        this.threeGrx = threeGrx;
    }

    public BigDecimal getThreeGecio() {
        return threeGecio;
    }

    public void setThreeGecio(BigDecimal threeGecio) {
        this.threeGecio = threeGecio;
    }

    public BigDecimal getThreeGsnr() {
        return threeGsnr;
    }

    public void setThreeGsnr(BigDecimal threeGsnr) {
        this.threeGsnr = threeGsnr;
    }

    public BigDecimal getTwoGrx() {
        return twoGrx;
    }

    public void setTwoGrx(BigDecimal twoGrx) {
        this.twoGrx = twoGrx;
    }

    public BigDecimal getTwoGecio() {
        return twoGecio;
    }

    public void setTwoGecio(BigDecimal twoGecio) {
        this.twoGecio = twoGecio;
    }

    public String getGsmcellid() {
        return gsmcellid;
    }

    public void setGsmcellid(String gsmcellid) {
        this.gsmcellid = gsmcellid == null ? null : gsmcellid.trim();
    }

    public String getGsmlac() {
        return gsmlac;
    }

    public void setGsmlac(String gsmlac) {
        this.gsmlac = gsmlac == null ? null : gsmlac.trim();
    }

    public String getGsmrx() {
        return gsmrx;
    }

    public void setGsmrx(String gsmrx) {
        this.gsmrx = gsmrx == null ? null : gsmrx.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}