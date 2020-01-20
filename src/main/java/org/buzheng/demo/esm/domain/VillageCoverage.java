package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;

public class VillageCoverage {
    private String recordId;

    private Integer period;

    private String taskType;

    private String addrLevel1;

    private String addrLevel2;

    private String addrLevel3;

    private String addrLevel4;

    private String addrLevel5;

    private String fullName;

    private BigDecimal avgrsrp;

    private String coverage;

    private Integer amount;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public BigDecimal getAvgrsrp() {
        return avgrsrp;
    }

    public void setAvgrsrp(BigDecimal avgrsrp) {
        this.avgrsrp = avgrsrp;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage == null ? null : coverage.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}