package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SevenLevelAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SevenLevelAddressExample() {
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

        public Criteria andAddrIdIsNull() {
            addCriterion("ADDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddrIdIsNotNull() {
            addCriterion("ADDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddrIdEqualTo(String value) {
            addCriterion("ADDR_ID =", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotEqualTo(String value) {
            addCriterion("ADDR_ID <>", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThan(String value) {
            addCriterion("ADDR_ID >", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_ID >=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThan(String value) {
            addCriterion("ADDR_ID <", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThanOrEqualTo(String value) {
            addCriterion("ADDR_ID <=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLike(String value) {
            addCriterion("ADDR_ID like", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotLike(String value) {
            addCriterion("ADDR_ID not like", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdIn(List<String> values) {
            addCriterion("ADDR_ID in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotIn(List<String> values) {
            addCriterion("ADDR_ID not in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdBetween(String value1, String value2) {
            addCriterion("ADDR_ID between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotBetween(String value1, String value2) {
            addCriterion("ADDR_ID not between", value1, value2, "addrId");
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

        public Criteria andAddrLevel1IsNull() {
            addCriterion("ADDR_LEVEL1 is null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1IsNotNull() {
            addCriterion("ADDR_LEVEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1EqualTo(String value) {
            addCriterion("ADDR_LEVEL1 =", value, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1NotEqualTo(String value) {
            addCriterion("ADDR_LEVEL1 <>", value, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1GreaterThan(String value) {
            addCriterion("ADDR_LEVEL1 >", value, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL1 >=", value, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1LessThan(String value) {
            addCriterion("ADDR_LEVEL1 <", value, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1LessThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL1 <=", value, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1Like(String value) {
            addCriterion("ADDR_LEVEL1 like", value, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1NotLike(String value) {
            addCriterion("ADDR_LEVEL1 not like", value, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1In(List<String> values) {
            addCriterion("ADDR_LEVEL1 in", values, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1NotIn(List<String> values) {
            addCriterion("ADDR_LEVEL1 not in", values, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1Between(String value1, String value2) {
            addCriterion("ADDR_LEVEL1 between", value1, value2, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel1NotBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL1 not between", value1, value2, "addrLevel1");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2IsNull() {
            addCriterion("ADDR_LEVEL2 is null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2IsNotNull() {
            addCriterion("ADDR_LEVEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2EqualTo(String value) {
            addCriterion("ADDR_LEVEL2 =", value, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2NotEqualTo(String value) {
            addCriterion("ADDR_LEVEL2 <>", value, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2GreaterThan(String value) {
            addCriterion("ADDR_LEVEL2 >", value, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL2 >=", value, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2LessThan(String value) {
            addCriterion("ADDR_LEVEL2 <", value, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2LessThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL2 <=", value, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2Like(String value) {
            addCriterion("ADDR_LEVEL2 like", value, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2NotLike(String value) {
            addCriterion("ADDR_LEVEL2 not like", value, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2In(List<String> values) {
            addCriterion("ADDR_LEVEL2 in", values, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2NotIn(List<String> values) {
            addCriterion("ADDR_LEVEL2 not in", values, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2Between(String value1, String value2) {
            addCriterion("ADDR_LEVEL2 between", value1, value2, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel2NotBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL2 not between", value1, value2, "addrLevel2");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3IsNull() {
            addCriterion("ADDR_LEVEL3 is null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3IsNotNull() {
            addCriterion("ADDR_LEVEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3EqualTo(String value) {
            addCriterion("ADDR_LEVEL3 =", value, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3NotEqualTo(String value) {
            addCriterion("ADDR_LEVEL3 <>", value, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3GreaterThan(String value) {
            addCriterion("ADDR_LEVEL3 >", value, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL3 >=", value, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3LessThan(String value) {
            addCriterion("ADDR_LEVEL3 <", value, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3LessThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL3 <=", value, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3Like(String value) {
            addCriterion("ADDR_LEVEL3 like", value, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3NotLike(String value) {
            addCriterion("ADDR_LEVEL3 not like", value, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3In(List<String> values) {
            addCriterion("ADDR_LEVEL3 in", values, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3NotIn(List<String> values) {
            addCriterion("ADDR_LEVEL3 not in", values, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3Between(String value1, String value2) {
            addCriterion("ADDR_LEVEL3 between", value1, value2, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel3NotBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL3 not between", value1, value2, "addrLevel3");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4IsNull() {
            addCriterion("ADDR_LEVEL4 is null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4IsNotNull() {
            addCriterion("ADDR_LEVEL4 is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4EqualTo(String value) {
            addCriterion("ADDR_LEVEL4 =", value, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4NotEqualTo(String value) {
            addCriterion("ADDR_LEVEL4 <>", value, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4GreaterThan(String value) {
            addCriterion("ADDR_LEVEL4 >", value, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL4 >=", value, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4LessThan(String value) {
            addCriterion("ADDR_LEVEL4 <", value, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4LessThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL4 <=", value, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4Like(String value) {
            addCriterion("ADDR_LEVEL4 like", value, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4NotLike(String value) {
            addCriterion("ADDR_LEVEL4 not like", value, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4In(List<String> values) {
            addCriterion("ADDR_LEVEL4 in", values, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4NotIn(List<String> values) {
            addCriterion("ADDR_LEVEL4 not in", values, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4Between(String value1, String value2) {
            addCriterion("ADDR_LEVEL4 between", value1, value2, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4NotBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL4 not between", value1, value2, "addrLevel4");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5IsNull() {
            addCriterion("ADDR_LEVEL5 is null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5IsNotNull() {
            addCriterion("ADDR_LEVEL5 is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5EqualTo(String value) {
            addCriterion("ADDR_LEVEL5 =", value, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5NotEqualTo(String value) {
            addCriterion("ADDR_LEVEL5 <>", value, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5GreaterThan(String value) {
            addCriterion("ADDR_LEVEL5 >", value, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL5 >=", value, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5LessThan(String value) {
            addCriterion("ADDR_LEVEL5 <", value, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5LessThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL5 <=", value, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5Like(String value) {
            addCriterion("ADDR_LEVEL5 like", value, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5NotLike(String value) {
            addCriterion("ADDR_LEVEL5 not like", value, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5In(List<String> values) {
            addCriterion("ADDR_LEVEL5 in", values, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5NotIn(List<String> values) {
            addCriterion("ADDR_LEVEL5 not in", values, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5Between(String value1, String value2) {
            addCriterion("ADDR_LEVEL5 between", value1, value2, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5NotBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL5 not between", value1, value2, "addrLevel5");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6IsNull() {
            addCriterion("ADDR_LEVEL6 is null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6IsNotNull() {
            addCriterion("ADDR_LEVEL6 is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6EqualTo(String value) {
            addCriterion("ADDR_LEVEL6 =", value, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6NotEqualTo(String value) {
            addCriterion("ADDR_LEVEL6 <>", value, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6GreaterThan(String value) {
            addCriterion("ADDR_LEVEL6 >", value, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL6 >=", value, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6LessThan(String value) {
            addCriterion("ADDR_LEVEL6 <", value, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6LessThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL6 <=", value, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6Like(String value) {
            addCriterion("ADDR_LEVEL6 like", value, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6NotLike(String value) {
            addCriterion("ADDR_LEVEL6 not like", value, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6In(List<String> values) {
            addCriterion("ADDR_LEVEL6 in", values, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6NotIn(List<String> values) {
            addCriterion("ADDR_LEVEL6 not in", values, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6Between(String value1, String value2) {
            addCriterion("ADDR_LEVEL6 between", value1, value2, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel6NotBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL6 not between", value1, value2, "addrLevel6");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7IsNull() {
            addCriterion("ADDR_LEVEL7 is null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7IsNotNull() {
            addCriterion("ADDR_LEVEL7 is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7EqualTo(String value) {
            addCriterion("ADDR_LEVEL7 =", value, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7NotEqualTo(String value) {
            addCriterion("ADDR_LEVEL7 <>", value, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7GreaterThan(String value) {
            addCriterion("ADDR_LEVEL7 >", value, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL7 >=", value, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7LessThan(String value) {
            addCriterion("ADDR_LEVEL7 <", value, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7LessThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL7 <=", value, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7Like(String value) {
            addCriterion("ADDR_LEVEL7 like", value, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7NotLike(String value) {
            addCriterion("ADDR_LEVEL7 not like", value, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7In(List<String> values) {
            addCriterion("ADDR_LEVEL7 in", values, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7NotIn(List<String> values) {
            addCriterion("ADDR_LEVEL7 not in", values, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7Between(String value1, String value2) {
            addCriterion("ADDR_LEVEL7 between", value1, value2, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andAddrLevel7NotBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL7 not between", value1, value2, "addrLevel7");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("FULL_NAME =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("FULL_NAME <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("FULL_NAME >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_NAME >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("FULL_NAME <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("FULL_NAME <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("FULL_NAME like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("FULL_NAME not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("FULL_NAME in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("FULL_NAME not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("FULL_NAME between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("FULL_NAME not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressIsNull() {
            addCriterion("FORMATTED_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressIsNotNull() {
            addCriterion("FORMATTED_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressEqualTo(String value) {
            addCriterion("FORMATTED_ADDRESS =", value, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressNotEqualTo(String value) {
            addCriterion("FORMATTED_ADDRESS <>", value, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressGreaterThan(String value) {
            addCriterion("FORMATTED_ADDRESS >", value, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("FORMATTED_ADDRESS >=", value, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressLessThan(String value) {
            addCriterion("FORMATTED_ADDRESS <", value, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressLessThanOrEqualTo(String value) {
            addCriterion("FORMATTED_ADDRESS <=", value, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressLike(String value) {
            addCriterion("FORMATTED_ADDRESS like", value, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressNotLike(String value) {
            addCriterion("FORMATTED_ADDRESS not like", value, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressIn(List<String> values) {
            addCriterion("FORMATTED_ADDRESS in", values, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressNotIn(List<String> values) {
            addCriterion("FORMATTED_ADDRESS not in", values, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressBetween(String value1, String value2) {
            addCriterion("FORMATTED_ADDRESS between", value1, value2, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andFormattedAddressNotBetween(String value1, String value2) {
            addCriterion("FORMATTED_ADDRESS not between", value1, value2, "formattedAddress");
            return (Criteria) this;
        }

        public Criteria andRetJsonIsNull() {
            addCriterion("RET_JSON is null");
            return (Criteria) this;
        }

        public Criteria andRetJsonIsNotNull() {
            addCriterion("RET_JSON is not null");
            return (Criteria) this;
        }

        public Criteria andRetJsonEqualTo(String value) {
            addCriterion("RET_JSON =", value, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonNotEqualTo(String value) {
            addCriterion("RET_JSON <>", value, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonGreaterThan(String value) {
            addCriterion("RET_JSON >", value, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonGreaterThanOrEqualTo(String value) {
            addCriterion("RET_JSON >=", value, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonLessThan(String value) {
            addCriterion("RET_JSON <", value, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonLessThanOrEqualTo(String value) {
            addCriterion("RET_JSON <=", value, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonLike(String value) {
            addCriterion("RET_JSON like", value, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonNotLike(String value) {
            addCriterion("RET_JSON not like", value, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonIn(List<String> values) {
            addCriterion("RET_JSON in", values, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonNotIn(List<String> values) {
            addCriterion("RET_JSON not in", values, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonBetween(String value1, String value2) {
            addCriterion("RET_JSON between", value1, value2, "retJson");
            return (Criteria) this;
        }

        public Criteria andRetJsonNotBetween(String value1, String value2) {
            addCriterion("RET_JSON not between", value1, value2, "retJson");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
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