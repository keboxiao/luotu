package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.Date;

public class TempManchg {
    private String id;

    private String accessCode;

    private String address;

    private String manAccount;

    private String address7;

    private Long ifCqt;

    private String spType;

    private String spCode;

    private Date actDate;

    private Long state;

    private String branch;

    private String region;

    private String centre;

    private BigDecimal addressId;

    private Long chinaMobile;

    private Long chinaUnion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode == null ? null : accessCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getManAccount() {
        return manAccount;
    }

    public void setManAccount(String manAccount) {
        this.manAccount = manAccount == null ? null : manAccount.trim();
    }

    public String getAddress7() {
        return address7;
    }

    public void setAddress7(String address7) {
        this.address7 = address7 == null ? null : address7.trim();
    }

    public Long getIfCqt() {
        return ifCqt;
    }

    public void setIfCqt(Long ifCqt) {
        this.ifCqt = ifCqt;
    }

    public String getSpType() {
        return spType;
    }

    public void setSpType(String spType) {
        this.spType = spType == null ? null : spType.trim();
    }

    public String getSpCode() {
        return spCode;
    }

    public void setSpCode(String spCode) {
        this.spCode = spCode == null ? null : spCode.trim();
    }

    public Date getActDate() {
        return actDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre == null ? null : centre.trim();
    }

    public BigDecimal getAddressId() {
        return addressId;
    }

    public void setAddressId(BigDecimal addressId) {
        this.addressId = addressId;
    }

    public Long getChinaMobile() {
        return chinaMobile;
    }

    public void setChinaMobile(Long chinaMobile) {
        this.chinaMobile = chinaMobile;
    }

    public Long getChinaUnion() {
        return chinaUnion;
    }

    public void setChinaUnion(Long chinaUnion) {
        this.chinaUnion = chinaUnion;
    }
}