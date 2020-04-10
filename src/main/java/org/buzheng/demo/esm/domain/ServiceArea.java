package org.buzheng.demo.esm.domain;

public class ServiceArea {
    private String areaId;

    private String otbCode;

    private String addrId;

    private String addrFullname;

    private String remark;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getOtbCode() {
        return otbCode;
    }

    public void setOtbCode(String otbCode) {
        this.otbCode = otbCode == null ? null : otbCode.trim();
    }

    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId == null ? null : addrId.trim();
    }

    public String getAddrFullname() {
        return addrFullname;
    }

    public void setAddrFullname(String addrFullname) {
        this.addrFullname = addrFullname == null ? null : addrFullname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}