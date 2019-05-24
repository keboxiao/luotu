package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.Date;

public class TObd {
    private String obdCode;

    private String indistinctObdCode;

    private String branch;

    private String gridUnit;

    private String obdName;

    private String belongsOtb;

    private String buildAddress;

    private String updateManId;

    private Date finishTime;

    private String projectCode;

    private String projectName;

    private String remark;

    private BigDecimal lon;

    private BigDecimal lat;

    private Long state;

    private String marketingServiceCenter;

    private String belongsOtbName;

    private String belongsArea;

    private String theSite;

    public String getObdCode() {
        return obdCode;
    }

    public void setObdCode(String obdCode) {
        this.obdCode = obdCode == null ? null : obdCode.trim();
    }

    public String getIndistinctObdCode() {
        return indistinctObdCode;
    }

    public void setIndistinctObdCode(String indistinctObdCode) {
        this.indistinctObdCode = indistinctObdCode == null ? null : indistinctObdCode.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getGridUnit() {
        return gridUnit;
    }

    public void setGridUnit(String gridUnit) {
        this.gridUnit = gridUnit == null ? null : gridUnit.trim();
    }

    public String getObdName() {
        return obdName;
    }

    public void setObdName(String obdName) {
        this.obdName = obdName == null ? null : obdName.trim();
    }

    public String getBelongsOtb() {
        return belongsOtb;
    }

    public void setBelongsOtb(String belongsOtb) {
        this.belongsOtb = belongsOtb == null ? null : belongsOtb.trim();
    }

    public String getBuildAddress() {
        return buildAddress;
    }

    public void setBuildAddress(String buildAddress) {
        this.buildAddress = buildAddress == null ? null : buildAddress.trim();
    }

    public String getUpdateManId() {
        return updateManId;
    }

    public void setUpdateManId(String updateManId) {
        this.updateManId = updateManId == null ? null : updateManId.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getMarketingServiceCenter() {
        return marketingServiceCenter;
    }

    public void setMarketingServiceCenter(String marketingServiceCenter) {
        this.marketingServiceCenter = marketingServiceCenter == null ? null : marketingServiceCenter.trim();
    }

    public String getBelongsOtbName() {
        return belongsOtbName;
    }

    public void setBelongsOtbName(String belongsOtbName) {
        this.belongsOtbName = belongsOtbName == null ? null : belongsOtbName.trim();
    }

    public String getBelongsArea() {
        return belongsArea;
    }

    public void setBelongsArea(String belongsArea) {
        this.belongsArea = belongsArea == null ? null : belongsArea.trim();
    }

    public String getTheSite() {
        return theSite;
    }

    public void setTheSite(String theSite) {
        this.theSite = theSite == null ? null : theSite.trim();
    }
}