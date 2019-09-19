package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FiveLevelAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FiveLevelAddressExample() {
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

        public Criteria andXmapLonIsNull() {
            addCriterion("XMAP_LON is null");
            return (Criteria) this;
        }

        public Criteria andXmapLonIsNotNull() {
            addCriterion("XMAP_LON is not null");
            return (Criteria) this;
        }

        public Criteria andXmapLonEqualTo(BigDecimal value) {
            addCriterion("XMAP_LON =", value, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLonNotEqualTo(BigDecimal value) {
            addCriterion("XMAP_LON <>", value, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLonGreaterThan(BigDecimal value) {
            addCriterion("XMAP_LON >", value, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XMAP_LON >=", value, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLonLessThan(BigDecimal value) {
            addCriterion("XMAP_LON <", value, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XMAP_LON <=", value, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLonIn(List<BigDecimal> values) {
            addCriterion("XMAP_LON in", values, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLonNotIn(List<BigDecimal> values) {
            addCriterion("XMAP_LON not in", values, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMAP_LON between", value1, value2, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMAP_LON not between", value1, value2, "xmapLon");
            return (Criteria) this;
        }

        public Criteria andXmapLatIsNull() {
            addCriterion("XMAP_LAT is null");
            return (Criteria) this;
        }

        public Criteria andXmapLatIsNotNull() {
            addCriterion("XMAP_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andXmapLatEqualTo(BigDecimal value) {
            addCriterion("XMAP_LAT =", value, "xmapLat");
            return (Criteria) this;
        }

        public Criteria andXmapLatNotEqualTo(BigDecimal value) {
            addCriterion("XMAP_LAT <>", value, "xmapLat");
            return (Criteria) this;
        }

        public Criteria andXmapLatGreaterThan(BigDecimal value) {
            addCriterion("XMAP_LAT >", value, "xmapLat");
            return (Criteria) this;
        }

        public Criteria andXmapLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XMAP_LAT >=", value, "xmapLat");
            return (Criteria) this;
        }

        public Criteria andXmapLatLessThan(BigDecimal value) {
            addCriterion("XMAP_LAT <", value, "xmapLat");
            return (Criteria) this;
        }

        public Criteria andXmapLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XMAP_LAT <=", value, "xmapLat");
            return (Criteria) this;
        }

        public Criteria andXmapLatIn(List<BigDecimal> values) {
            addCriterion("XMAP_LAT in", values, "xmapLat");
            return (Criteria) this;
        }

        public Criteria andXmapLatNotIn(List<BigDecimal> values) {
            addCriterion("XMAP_LAT not in", values, "xmapLat");
            return (Criteria) this;
        }

        public Criteria andXmapLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMAP_LAT between", value1, value2, "xmapLat");
            return (Criteria) this;
        }

        public Criteria andXmapLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMAP_LAT not between", value1, value2, "xmapLat");
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

        public Criteria andAddrLevel4StdIsNull() {
            addCriterion("ADDR_LEVEL4_STD is null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdIsNotNull() {
            addCriterion("ADDR_LEVEL4_STD is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdEqualTo(String value) {
            addCriterion("ADDR_LEVEL4_STD =", value, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdNotEqualTo(String value) {
            addCriterion("ADDR_LEVEL4_STD <>", value, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdGreaterThan(String value) {
            addCriterion("ADDR_LEVEL4_STD >", value, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL4_STD >=", value, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdLessThan(String value) {
            addCriterion("ADDR_LEVEL4_STD <", value, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdLessThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL4_STD <=", value, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdLike(String value) {
            addCriterion("ADDR_LEVEL4_STD like", value, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdNotLike(String value) {
            addCriterion("ADDR_LEVEL4_STD not like", value, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdIn(List<String> values) {
            addCriterion("ADDR_LEVEL4_STD in", values, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdNotIn(List<String> values) {
            addCriterion("ADDR_LEVEL4_STD not in", values, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL4_STD between", value1, value2, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel4StdNotBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL4_STD not between", value1, value2, "addrLevel4Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdIsNull() {
            addCriterion("ADDR_LEVEL5_STD is null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdIsNotNull() {
            addCriterion("ADDR_LEVEL5_STD is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdEqualTo(String value) {
            addCriterion("ADDR_LEVEL5_STD =", value, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdNotEqualTo(String value) {
            addCriterion("ADDR_LEVEL5_STD <>", value, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdGreaterThan(String value) {
            addCriterion("ADDR_LEVEL5_STD >", value, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL5_STD >=", value, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdLessThan(String value) {
            addCriterion("ADDR_LEVEL5_STD <", value, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdLessThanOrEqualTo(String value) {
            addCriterion("ADDR_LEVEL5_STD <=", value, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdLike(String value) {
            addCriterion("ADDR_LEVEL5_STD like", value, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdNotLike(String value) {
            addCriterion("ADDR_LEVEL5_STD not like", value, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdIn(List<String> values) {
            addCriterion("ADDR_LEVEL5_STD in", values, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdNotIn(List<String> values) {
            addCriterion("ADDR_LEVEL5_STD not in", values, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL5_STD between", value1, value2, "addrLevel5Std");
            return (Criteria) this;
        }

        public Criteria andAddrLevel5StdNotBetween(String value1, String value2) {
            addCriterion("ADDR_LEVEL5_STD not between", value1, value2, "addrLevel5Std");
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

        public Criteria andFullNameStdIsNull() {
            addCriterion("FULL_NAME_STD is null");
            return (Criteria) this;
        }

        public Criteria andFullNameStdIsNotNull() {
            addCriterion("FULL_NAME_STD is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameStdEqualTo(String value) {
            addCriterion("FULL_NAME_STD =", value, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdNotEqualTo(String value) {
            addCriterion("FULL_NAME_STD <>", value, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdGreaterThan(String value) {
            addCriterion("FULL_NAME_STD >", value, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_NAME_STD >=", value, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdLessThan(String value) {
            addCriterion("FULL_NAME_STD <", value, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdLessThanOrEqualTo(String value) {
            addCriterion("FULL_NAME_STD <=", value, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdLike(String value) {
            addCriterion("FULL_NAME_STD like", value, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdNotLike(String value) {
            addCriterion("FULL_NAME_STD not like", value, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdIn(List<String> values) {
            addCriterion("FULL_NAME_STD in", values, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdNotIn(List<String> values) {
            addCriterion("FULL_NAME_STD not in", values, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdBetween(String value1, String value2) {
            addCriterion("FULL_NAME_STD between", value1, value2, "fullNameStd");
            return (Criteria) this;
        }

        public Criteria andFullNameStdNotBetween(String value1, String value2) {
            addCriterion("FULL_NAME_STD not between", value1, value2, "fullNameStd");
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

        public Criteria andChinaMobileIsNull() {
            addCriterion("CHINA_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andChinaMobileIsNotNull() {
            addCriterion("CHINA_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andChinaMobileEqualTo(Integer value) {
            addCriterion("CHINA_MOBILE =", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileNotEqualTo(Integer value) {
            addCriterion("CHINA_MOBILE <>", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileGreaterThan(Integer value) {
            addCriterion("CHINA_MOBILE >", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHINA_MOBILE >=", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileLessThan(Integer value) {
            addCriterion("CHINA_MOBILE <", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileLessThanOrEqualTo(Integer value) {
            addCriterion("CHINA_MOBILE <=", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileIn(List<Integer> values) {
            addCriterion("CHINA_MOBILE in", values, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileNotIn(List<Integer> values) {
            addCriterion("CHINA_MOBILE not in", values, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileBetween(Integer value1, Integer value2) {
            addCriterion("CHINA_MOBILE between", value1, value2, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileNotBetween(Integer value1, Integer value2) {
            addCriterion("CHINA_MOBILE not between", value1, value2, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaUnionIsNull() {
            addCriterion("CHINA_UNION is null");
            return (Criteria) this;
        }

        public Criteria andChinaUnionIsNotNull() {
            addCriterion("CHINA_UNION is not null");
            return (Criteria) this;
        }

        public Criteria andChinaUnionEqualTo(Integer value) {
            addCriterion("CHINA_UNION =", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionNotEqualTo(Integer value) {
            addCriterion("CHINA_UNION <>", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionGreaterThan(Integer value) {
            addCriterion("CHINA_UNION >", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHINA_UNION >=", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionLessThan(Integer value) {
            addCriterion("CHINA_UNION <", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionLessThanOrEqualTo(Integer value) {
            addCriterion("CHINA_UNION <=", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionIn(List<Integer> values) {
            addCriterion("CHINA_UNION in", values, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionNotIn(List<Integer> values) {
            addCriterion("CHINA_UNION not in", values, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionBetween(Integer value1, Integer value2) {
            addCriterion("CHINA_UNION between", value1, value2, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionNotBetween(Integer value1, Integer value2) {
            addCriterion("CHINA_UNION not between", value1, value2, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andManAccountIsNull() {
            addCriterion("MAN_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andManAccountIsNotNull() {
            addCriterion("MAN_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andManAccountEqualTo(String value) {
            addCriterion("MAN_ACCOUNT =", value, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountNotEqualTo(String value) {
            addCriterion("MAN_ACCOUNT <>", value, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountGreaterThan(String value) {
            addCriterion("MAN_ACCOUNT >", value, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountGreaterThanOrEqualTo(String value) {
            addCriterion("MAN_ACCOUNT >=", value, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountLessThan(String value) {
            addCriterion("MAN_ACCOUNT <", value, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountLessThanOrEqualTo(String value) {
            addCriterion("MAN_ACCOUNT <=", value, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountLike(String value) {
            addCriterion("MAN_ACCOUNT like", value, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountNotLike(String value) {
            addCriterion("MAN_ACCOUNT not like", value, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountIn(List<String> values) {
            addCriterion("MAN_ACCOUNT in", values, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountNotIn(List<String> values) {
            addCriterion("MAN_ACCOUNT not in", values, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountBetween(String value1, String value2) {
            addCriterion("MAN_ACCOUNT between", value1, value2, "manAccount");
            return (Criteria) this;
        }

        public Criteria andManAccountNotBetween(String value1, String value2) {
            addCriterion("MAN_ACCOUNT not between", value1, value2, "manAccount");
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

        public Criteria andId5IsNull() {
            addCriterion("ID5 is null");
            return (Criteria) this;
        }

        public Criteria andId5IsNotNull() {
            addCriterion("ID5 is not null");
            return (Criteria) this;
        }

        public Criteria andId5EqualTo(BigDecimal value) {
            addCriterion("ID5 =", value, "id5");
            return (Criteria) this;
        }

        public Criteria andId5NotEqualTo(BigDecimal value) {
            addCriterion("ID5 <>", value, "id5");
            return (Criteria) this;
        }

        public Criteria andId5GreaterThan(BigDecimal value) {
            addCriterion("ID5 >", value, "id5");
            return (Criteria) this;
        }

        public Criteria andId5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID5 >=", value, "id5");
            return (Criteria) this;
        }

        public Criteria andId5LessThan(BigDecimal value) {
            addCriterion("ID5 <", value, "id5");
            return (Criteria) this;
        }

        public Criteria andId5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID5 <=", value, "id5");
            return (Criteria) this;
        }

        public Criteria andId5In(List<BigDecimal> values) {
            addCriterion("ID5 in", values, "id5");
            return (Criteria) this;
        }

        public Criteria andId5NotIn(List<BigDecimal> values) {
            addCriterion("ID5 not in", values, "id5");
            return (Criteria) this;
        }

        public Criteria andId5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID5 between", value1, value2, "id5");
            return (Criteria) this;
        }

        public Criteria andId5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID5 not between", value1, value2, "id5");
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