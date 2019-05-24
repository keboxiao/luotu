package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;

public class TStandardAdress {
    private String id;

    private BigDecimal lon;

    private BigDecimal lat;

    private String fiveLevelAdress;

    private String sevenLevelAdress;

    private String sevenLevelAdressFullname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getFiveLevelAdress() {
        return fiveLevelAdress;
    }

    public void setFiveLevelAdress(String fiveLevelAdress) {
        this.fiveLevelAdress = fiveLevelAdress == null ? null : fiveLevelAdress.trim();
    }

    public String getSevenLevelAdress() {
        return sevenLevelAdress;
    }

    public void setSevenLevelAdress(String sevenLevelAdress) {
        this.sevenLevelAdress = sevenLevelAdress == null ? null : sevenLevelAdress.trim();
    }

    public String getSevenLevelAdressFullname() {
        return sevenLevelAdressFullname;
    }

    public void setSevenLevelAdressFullname(String sevenLevelAdressFullname) {
        this.sevenLevelAdressFullname = sevenLevelAdressFullname == null ? null : sevenLevelAdressFullname.trim();
    }
}