package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseStationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseStationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBaseIdIsNull() {
            addCriterion("BASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBaseIdIsNotNull() {
            addCriterion("BASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBaseIdEqualTo(String value) {
            addCriterion("BASE_ID =", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotEqualTo(String value) {
            addCriterion("BASE_ID <>", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThan(String value) {
            addCriterion("BASE_ID >", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("BASE_ID >=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThan(String value) {
            addCriterion("BASE_ID <", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThanOrEqualTo(String value) {
            addCriterion("BASE_ID <=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLike(String value) {
            addCriterion("BASE_ID like", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotLike(String value) {
            addCriterion("BASE_ID not like", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdIn(List<String> values) {
            addCriterion("BASE_ID in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotIn(List<String> values) {
            addCriterion("BASE_ID not in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdBetween(String value1, String value2) {
            addCriterion("BASE_ID between", value1, value2, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotBetween(String value1, String value2) {
            addCriterion("BASE_ID not between", value1, value2, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseNameIsNull() {
            addCriterion("BASE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBaseNameIsNotNull() {
            addCriterion("BASE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBaseNameEqualTo(String value) {
            addCriterion("BASE_NAME =", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotEqualTo(String value) {
            addCriterion("BASE_NAME <>", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameGreaterThan(String value) {
            addCriterion("BASE_NAME >", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("BASE_NAME >=", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameLessThan(String value) {
            addCriterion("BASE_NAME <", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameLessThanOrEqualTo(String value) {
            addCriterion("BASE_NAME <=", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameLike(String value) {
            addCriterion("BASE_NAME like", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotLike(String value) {
            addCriterion("BASE_NAME not like", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameIn(List<String> values) {
            addCriterion("BASE_NAME in", values, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotIn(List<String> values) {
            addCriterion("BASE_NAME not in", values, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameBetween(String value1, String value2) {
            addCriterion("BASE_NAME between", value1, value2, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotBetween(String value1, String value2) {
            addCriterion("BASE_NAME not between", value1, value2, "baseName");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("LON is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("LON is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(BigDecimal value) {
            addCriterion("LON =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(BigDecimal value) {
            addCriterion("LON <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(BigDecimal value) {
            addCriterion("LON >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LON >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(BigDecimal value) {
            addCriterion("LON <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LON <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<BigDecimal> values) {
            addCriterion("LON in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<BigDecimal> values) {
            addCriterion("LON not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LON between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LON not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("LAT is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andShareSituationIsNull() {
            addCriterion("SHARE_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andShareSituationIsNotNull() {
            addCriterion("SHARE_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andShareSituationEqualTo(String value) {
            addCriterion("SHARE_SITUATION =", value, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationNotEqualTo(String value) {
            addCriterion("SHARE_SITUATION <>", value, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationGreaterThan(String value) {
            addCriterion("SHARE_SITUATION >", value, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationGreaterThanOrEqualTo(String value) {
            addCriterion("SHARE_SITUATION >=", value, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationLessThan(String value) {
            addCriterion("SHARE_SITUATION <", value, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationLessThanOrEqualTo(String value) {
            addCriterion("SHARE_SITUATION <=", value, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationLike(String value) {
            addCriterion("SHARE_SITUATION like", value, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationNotLike(String value) {
            addCriterion("SHARE_SITUATION not like", value, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationIn(List<String> values) {
            addCriterion("SHARE_SITUATION in", values, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationNotIn(List<String> values) {
            addCriterion("SHARE_SITUATION not in", values, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationBetween(String value1, String value2) {
            addCriterion("SHARE_SITUATION between", value1, value2, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andShareSituationNotBetween(String value1, String value2) {
            addCriterion("SHARE_SITUATION not between", value1, value2, "shareSituation");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAmapLonIsNull() {
            addCriterion("AMAP_LON is null");
            return (Criteria) this;
        }

        public Criteria andAmapLonIsNotNull() {
            addCriterion("AMAP_LON is not null");
            return (Criteria) this;
        }

        public Criteria andAmapLonEqualTo(BigDecimal value) {
            addCriterion("AMAP_LON =", value, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLonNotEqualTo(BigDecimal value) {
            addCriterion("AMAP_LON <>", value, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLonGreaterThan(BigDecimal value) {
            addCriterion("AMAP_LON >", value, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAP_LON >=", value, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLonLessThan(BigDecimal value) {
            addCriterion("AMAP_LON <", value, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAP_LON <=", value, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLonIn(List<BigDecimal> values) {
            addCriterion("AMAP_LON in", values, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLonNotIn(List<BigDecimal> values) {
            addCriterion("AMAP_LON not in", values, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAP_LON between", value1, value2, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAP_LON not between", value1, value2, "amapLon");
            return (Criteria) this;
        }

        public Criteria andAmapLatIsNull() {
            addCriterion("AMAP_LAT is null");
            return (Criteria) this;
        }

        public Criteria andAmapLatIsNotNull() {
            addCriterion("AMAP_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andAmapLatEqualTo(BigDecimal value) {
            addCriterion("AMAP_LAT =", value, "amapLat");
            return (Criteria) this;
        }

        public Criteria andAmapLatNotEqualTo(BigDecimal value) {
            addCriterion("AMAP_LAT <>", value, "amapLat");
            return (Criteria) this;
        }

        public Criteria andAmapLatGreaterThan(BigDecimal value) {
            addCriterion("AMAP_LAT >", value, "amapLat");
            return (Criteria) this;
        }

        public Criteria andAmapLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAP_LAT >=", value, "amapLat");
            return (Criteria) this;
        }

        public Criteria andAmapLatLessThan(BigDecimal value) {
            addCriterion("AMAP_LAT <", value, "amapLat");
            return (Criteria) this;
        }

        public Criteria andAmapLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAP_LAT <=", value, "amapLat");
            return (Criteria) this;
        }

        public Criteria andAmapLatIn(List<BigDecimal> values) {
            addCriterion("AMAP_LAT in", values, "amapLat");
            return (Criteria) this;
        }

        public Criteria andAmapLatNotIn(List<BigDecimal> values) {
            addCriterion("AMAP_LAT not in", values, "amapLat");
            return (Criteria) this;
        }

        public Criteria andAmapLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAP_LAT between", value1, value2, "amapLat");
            return (Criteria) this;
        }

        public Criteria andAmapLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAP_LAT not between", value1, value2, "amapLat");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("RADIUS is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("RADIUS is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(Integer value) {
            addCriterion("RADIUS =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(Integer value) {
            addCriterion("RADIUS <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(Integer value) {
            addCriterion("RADIUS >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RADIUS >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(Integer value) {
            addCriterion("RADIUS <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(Integer value) {
            addCriterion("RADIUS <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<Integer> values) {
            addCriterion("RADIUS in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<Integer> values) {
            addCriterion("RADIUS not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(Integer value1, Integer value2) {
            addCriterion("RADIUS between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(Integer value1, Integer value2) {
            addCriterion("RADIUS not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("COLOR is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("COLOR =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("COLOR <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("COLOR >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("COLOR <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("COLOR <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("COLOR like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("COLOR not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("COLOR in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("COLOR not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("COLOR between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("COLOR not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}