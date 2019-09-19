package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CqtRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CqtRecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("RECORD_ID =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("RECORD_ID <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("RECORD_ID >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_ID >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("RECORD_ID <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("RECORD_ID <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("RECORD_ID like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("RECORD_ID not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("RECORD_ID in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("RECORD_ID not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("RECORD_ID between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("RECORD_ID not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andNetworkWlIsNull() {
            addCriterion("NETWORK_WL is null");
            return (Criteria) this;
        }

        public Criteria andNetworkWlIsNotNull() {
            addCriterion("NETWORK_WL is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkWlEqualTo(String value) {
            addCriterion("NETWORK_WL =", value, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlNotEqualTo(String value) {
            addCriterion("NETWORK_WL <>", value, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlGreaterThan(String value) {
            addCriterion("NETWORK_WL >", value, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_WL >=", value, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlLessThan(String value) {
            addCriterion("NETWORK_WL <", value, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_WL <=", value, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlLike(String value) {
            addCriterion("NETWORK_WL like", value, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlNotLike(String value) {
            addCriterion("NETWORK_WL not like", value, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlIn(List<String> values) {
            addCriterion("NETWORK_WL in", values, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlNotIn(List<String> values) {
            addCriterion("NETWORK_WL not in", values, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlBetween(String value1, String value2) {
            addCriterion("NETWORK_WL between", value1, value2, "networkWl");
            return (Criteria) this;
        }

        public Criteria andNetworkWlNotBetween(String value1, String value2) {
            addCriterion("NETWORK_WL not between", value1, value2, "networkWl");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIsNull() {
            addCriterion("TELECOM_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIsNotNull() {
            addCriterion("TELECOM_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorEqualTo(String value) {
            addCriterion("TELECOM_OPERATOR =", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorNotEqualTo(String value) {
            addCriterion("TELECOM_OPERATOR <>", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorGreaterThan(String value) {
            addCriterion("TELECOM_OPERATOR >", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("TELECOM_OPERATOR >=", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorLessThan(String value) {
            addCriterion("TELECOM_OPERATOR <", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorLessThanOrEqualTo(String value) {
            addCriterion("TELECOM_OPERATOR <=", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorLike(String value) {
            addCriterion("TELECOM_OPERATOR like", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorNotLike(String value) {
            addCriterion("TELECOM_OPERATOR not like", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIn(List<String> values) {
            addCriterion("TELECOM_OPERATOR in", values, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorNotIn(List<String> values) {
            addCriterion("TELECOM_OPERATOR not in", values, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorBetween(String value1, String value2) {
            addCriterion("TELECOM_OPERATOR between", value1, value2, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorNotBetween(String value1, String value2) {
            addCriterion("TELECOM_OPERATOR not between", value1, value2, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("TASK_TYPE =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("TASK_TYPE <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("TASK_TYPE >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("TASK_TYPE <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("TASK_TYPE like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("TASK_TYPE not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("TASK_TYPE in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("TASK_TYPE not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("TASK_TYPE between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("TASK_TYPE not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
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

        public Criteria andFloorNumIsNull() {
            addCriterion("FLOOR_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFloorNumIsNotNull() {
            addCriterion("FLOOR_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNumEqualTo(String value) {
            addCriterion("FLOOR_NUM =", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotEqualTo(String value) {
            addCriterion("FLOOR_NUM <>", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThan(String value) {
            addCriterion("FLOOR_NUM >", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThanOrEqualTo(String value) {
            addCriterion("FLOOR_NUM >=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThan(String value) {
            addCriterion("FLOOR_NUM <", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThanOrEqualTo(String value) {
            addCriterion("FLOOR_NUM <=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLike(String value) {
            addCriterion("FLOOR_NUM like", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotLike(String value) {
            addCriterion("FLOOR_NUM not like", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumIn(List<String> values) {
            addCriterion("FLOOR_NUM in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotIn(List<String> values) {
            addCriterion("FLOOR_NUM not in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumBetween(String value1, String value2) {
            addCriterion("FLOOR_NUM between", value1, value2, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotBetween(String value1, String value2) {
            addCriterion("FLOOR_NUM not between", value1, value2, "floorNum");
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

        public Criteria andBmapLonIsNull() {
            addCriterion("BMAP_LON is null");
            return (Criteria) this;
        }

        public Criteria andBmapLonIsNotNull() {
            addCriterion("BMAP_LON is not null");
            return (Criteria) this;
        }

        public Criteria andBmapLonEqualTo(BigDecimal value) {
            addCriterion("BMAP_LON =", value, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLonNotEqualTo(BigDecimal value) {
            addCriterion("BMAP_LON <>", value, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLonGreaterThan(BigDecimal value) {
            addCriterion("BMAP_LON >", value, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BMAP_LON >=", value, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLonLessThan(BigDecimal value) {
            addCriterion("BMAP_LON <", value, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BMAP_LON <=", value, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLonIn(List<BigDecimal> values) {
            addCriterion("BMAP_LON in", values, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLonNotIn(List<BigDecimal> values) {
            addCriterion("BMAP_LON not in", values, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMAP_LON between", value1, value2, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMAP_LON not between", value1, value2, "bmapLon");
            return (Criteria) this;
        }

        public Criteria andBmapLatIsNull() {
            addCriterion("BMAP_LAT is null");
            return (Criteria) this;
        }

        public Criteria andBmapLatIsNotNull() {
            addCriterion("BMAP_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andBmapLatEqualTo(BigDecimal value) {
            addCriterion("BMAP_LAT =", value, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andBmapLatNotEqualTo(BigDecimal value) {
            addCriterion("BMAP_LAT <>", value, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andBmapLatGreaterThan(BigDecimal value) {
            addCriterion("BMAP_LAT >", value, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andBmapLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BMAP_LAT >=", value, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andBmapLatLessThan(BigDecimal value) {
            addCriterion("BMAP_LAT <", value, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andBmapLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BMAP_LAT <=", value, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andBmapLatIn(List<BigDecimal> values) {
            addCriterion("BMAP_LAT in", values, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andBmapLatNotIn(List<BigDecimal> values) {
            addCriterion("BMAP_LAT not in", values, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andBmapLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMAP_LAT between", value1, value2, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andBmapLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMAP_LAT not between", value1, value2, "bmapLat");
            return (Criteria) this;
        }

        public Criteria andImsiIsNull() {
            addCriterion("IMSI is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("IMSI is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("IMSI =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("IMSI <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("IMSI >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("IMSI >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("IMSI <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("IMSI <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("IMSI like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("IMSI not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("IMSI in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("IMSI not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("IMSI between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("IMSI not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateIsNull() {
            addCriterion("PEAK_DOWN_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateIsNotNull() {
            addCriterion("PEAK_DOWN_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateEqualTo(BigDecimal value) {
            addCriterion("PEAK_DOWN_RATE =", value, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateNotEqualTo(BigDecimal value) {
            addCriterion("PEAK_DOWN_RATE <>", value, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateGreaterThan(BigDecimal value) {
            addCriterion("PEAK_DOWN_RATE >", value, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_DOWN_RATE >=", value, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateLessThan(BigDecimal value) {
            addCriterion("PEAK_DOWN_RATE <", value, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_DOWN_RATE <=", value, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateIn(List<BigDecimal> values) {
            addCriterion("PEAK_DOWN_RATE in", values, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateNotIn(List<BigDecimal> values) {
            addCriterion("PEAK_DOWN_RATE not in", values, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_DOWN_RATE between", value1, value2, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andPeakDownRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_DOWN_RATE not between", value1, value2, "peakDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateIsNull() {
            addCriterion("AVER_DOWN_RATE is null");
            return (Criteria) this;
        }

        public Criteria andAverDownRateIsNotNull() {
            addCriterion("AVER_DOWN_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andAverDownRateEqualTo(BigDecimal value) {
            addCriterion("AVER_DOWN_RATE =", value, "averDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateNotEqualTo(BigDecimal value) {
            addCriterion("AVER_DOWN_RATE <>", value, "averDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateGreaterThan(BigDecimal value) {
            addCriterion("AVER_DOWN_RATE >", value, "averDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVER_DOWN_RATE >=", value, "averDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateLessThan(BigDecimal value) {
            addCriterion("AVER_DOWN_RATE <", value, "averDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVER_DOWN_RATE <=", value, "averDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateIn(List<BigDecimal> values) {
            addCriterion("AVER_DOWN_RATE in", values, "averDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateNotIn(List<BigDecimal> values) {
            addCriterion("AVER_DOWN_RATE not in", values, "averDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVER_DOWN_RATE between", value1, value2, "averDownRate");
            return (Criteria) this;
        }

        public Criteria andAverDownRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVER_DOWN_RATE not between", value1, value2, "averDownRate");
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("FINISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("FINISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("FINISH_TIME =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("FINISH_TIME <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("FINISH_TIME >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINISH_TIME >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("FINISH_TIME <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINISH_TIME <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("FINISH_TIME in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("FINISH_TIME not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("FINISH_TIME between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINISH_TIME not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andIfInsideIsNull() {
            addCriterion("IF_INSIDE is null");
            return (Criteria) this;
        }

        public Criteria andIfInsideIsNotNull() {
            addCriterion("IF_INSIDE is not null");
            return (Criteria) this;
        }

        public Criteria andIfInsideEqualTo(String value) {
            addCriterion("IF_INSIDE =", value, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideNotEqualTo(String value) {
            addCriterion("IF_INSIDE <>", value, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideGreaterThan(String value) {
            addCriterion("IF_INSIDE >", value, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideGreaterThanOrEqualTo(String value) {
            addCriterion("IF_INSIDE >=", value, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideLessThan(String value) {
            addCriterion("IF_INSIDE <", value, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideLessThanOrEqualTo(String value) {
            addCriterion("IF_INSIDE <=", value, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideLike(String value) {
            addCriterion("IF_INSIDE like", value, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideNotLike(String value) {
            addCriterion("IF_INSIDE not like", value, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideIn(List<String> values) {
            addCriterion("IF_INSIDE in", values, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideNotIn(List<String> values) {
            addCriterion("IF_INSIDE not in", values, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideBetween(String value1, String value2) {
            addCriterion("IF_INSIDE between", value1, value2, "ifInside");
            return (Criteria) this;
        }

        public Criteria andIfInsideNotBetween(String value1, String value2) {
            addCriterion("IF_INSIDE not between", value1, value2, "ifInside");
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