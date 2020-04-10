package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TOtbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOtbExample() {
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

        public Criteria andOtbCodeIsNull() {
            addCriterion("OTB_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOtbCodeIsNotNull() {
            addCriterion("OTB_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOtbCodeEqualTo(String value) {
            addCriterion("OTB_CODE =", value, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeNotEqualTo(String value) {
            addCriterion("OTB_CODE <>", value, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeGreaterThan(String value) {
            addCriterion("OTB_CODE >", value, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OTB_CODE >=", value, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeLessThan(String value) {
            addCriterion("OTB_CODE <", value, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeLessThanOrEqualTo(String value) {
            addCriterion("OTB_CODE <=", value, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeLike(String value) {
            addCriterion("OTB_CODE like", value, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeNotLike(String value) {
            addCriterion("OTB_CODE not like", value, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeIn(List<String> values) {
            addCriterion("OTB_CODE in", values, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeNotIn(List<String> values) {
            addCriterion("OTB_CODE not in", values, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeBetween(String value1, String value2) {
            addCriterion("OTB_CODE between", value1, value2, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbCodeNotBetween(String value1, String value2) {
            addCriterion("OTB_CODE not between", value1, value2, "otbCode");
            return (Criteria) this;
        }

        public Criteria andOtbNameIsNull() {
            addCriterion("OTB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOtbNameIsNotNull() {
            addCriterion("OTB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOtbNameEqualTo(String value) {
            addCriterion("OTB_NAME =", value, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameNotEqualTo(String value) {
            addCriterion("OTB_NAME <>", value, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameGreaterThan(String value) {
            addCriterion("OTB_NAME >", value, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameGreaterThanOrEqualTo(String value) {
            addCriterion("OTB_NAME >=", value, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameLessThan(String value) {
            addCriterion("OTB_NAME <", value, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameLessThanOrEqualTo(String value) {
            addCriterion("OTB_NAME <=", value, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameLike(String value) {
            addCriterion("OTB_NAME like", value, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameNotLike(String value) {
            addCriterion("OTB_NAME not like", value, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameIn(List<String> values) {
            addCriterion("OTB_NAME in", values, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameNotIn(List<String> values) {
            addCriterion("OTB_NAME not in", values, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameBetween(String value1, String value2) {
            addCriterion("OTB_NAME between", value1, value2, "otbName");
            return (Criteria) this;
        }

        public Criteria andOtbNameNotBetween(String value1, String value2) {
            addCriterion("OTB_NAME not between", value1, value2, "otbName");
            return (Criteria) this;
        }

        public Criteria andBuildAddressIsNull() {
            addCriterion("BUILD_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBuildAddressIsNotNull() {
            addCriterion("BUILD_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBuildAddressEqualTo(String value) {
            addCriterion("BUILD_ADDRESS =", value, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressNotEqualTo(String value) {
            addCriterion("BUILD_ADDRESS <>", value, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressGreaterThan(String value) {
            addCriterion("BUILD_ADDRESS >", value, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BUILD_ADDRESS >=", value, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressLessThan(String value) {
            addCriterion("BUILD_ADDRESS <", value, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressLessThanOrEqualTo(String value) {
            addCriterion("BUILD_ADDRESS <=", value, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressLike(String value) {
            addCriterion("BUILD_ADDRESS like", value, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressNotLike(String value) {
            addCriterion("BUILD_ADDRESS not like", value, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressIn(List<String> values) {
            addCriterion("BUILD_ADDRESS in", values, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressNotIn(List<String> values) {
            addCriterion("BUILD_ADDRESS not in", values, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressBetween(String value1, String value2) {
            addCriterion("BUILD_ADDRESS between", value1, value2, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andBuildAddressNotBetween(String value1, String value2) {
            addCriterion("BUILD_ADDRESS not between", value1, value2, "buildAddress");
            return (Criteria) this;
        }

        public Criteria andAddr5IdIsNull() {
            addCriterion("ADDR5_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddr5IdIsNotNull() {
            addCriterion("ADDR5_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddr5IdEqualTo(String value) {
            addCriterion("ADDR5_ID =", value, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdNotEqualTo(String value) {
            addCriterion("ADDR5_ID <>", value, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdGreaterThan(String value) {
            addCriterion("ADDR5_ID >", value, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR5_ID >=", value, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdLessThan(String value) {
            addCriterion("ADDR5_ID <", value, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdLessThanOrEqualTo(String value) {
            addCriterion("ADDR5_ID <=", value, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdLike(String value) {
            addCriterion("ADDR5_ID like", value, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdNotLike(String value) {
            addCriterion("ADDR5_ID not like", value, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdIn(List<String> values) {
            addCriterion("ADDR5_ID in", values, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdNotIn(List<String> values) {
            addCriterion("ADDR5_ID not in", values, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdBetween(String value1, String value2) {
            addCriterion("ADDR5_ID between", value1, value2, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5IdNotBetween(String value1, String value2) {
            addCriterion("ADDR5_ID not between", value1, value2, "addr5Id");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameIsNull() {
            addCriterion("ADDR5_FULLNAME is null");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameIsNotNull() {
            addCriterion("ADDR5_FULLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameEqualTo(String value) {
            addCriterion("ADDR5_FULLNAME =", value, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameNotEqualTo(String value) {
            addCriterion("ADDR5_FULLNAME <>", value, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameGreaterThan(String value) {
            addCriterion("ADDR5_FULLNAME >", value, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR5_FULLNAME >=", value, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameLessThan(String value) {
            addCriterion("ADDR5_FULLNAME <", value, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameLessThanOrEqualTo(String value) {
            addCriterion("ADDR5_FULLNAME <=", value, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameLike(String value) {
            addCriterion("ADDR5_FULLNAME like", value, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameNotLike(String value) {
            addCriterion("ADDR5_FULLNAME not like", value, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameIn(List<String> values) {
            addCriterion("ADDR5_FULLNAME in", values, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameNotIn(List<String> values) {
            addCriterion("ADDR5_FULLNAME not in", values, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameBetween(String value1, String value2) {
            addCriterion("ADDR5_FULLNAME between", value1, value2, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andAddr5FullnameNotBetween(String value1, String value2) {
            addCriterion("ADDR5_FULLNAME not between", value1, value2, "addr5Fullname");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatIsNull() {
            addCriterion("POLYGON_LONLAT is null");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatIsNotNull() {
            addCriterion("POLYGON_LONLAT is not null");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatEqualTo(String value) {
            addCriterion("POLYGON_LONLAT =", value, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatNotEqualTo(String value) {
            addCriterion("POLYGON_LONLAT <>", value, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatGreaterThan(String value) {
            addCriterion("POLYGON_LONLAT >", value, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatGreaterThanOrEqualTo(String value) {
            addCriterion("POLYGON_LONLAT >=", value, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatLessThan(String value) {
            addCriterion("POLYGON_LONLAT <", value, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatLessThanOrEqualTo(String value) {
            addCriterion("POLYGON_LONLAT <=", value, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatLike(String value) {
            addCriterion("POLYGON_LONLAT like", value, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatNotLike(String value) {
            addCriterion("POLYGON_LONLAT not like", value, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatIn(List<String> values) {
            addCriterion("POLYGON_LONLAT in", values, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatNotIn(List<String> values) {
            addCriterion("POLYGON_LONLAT not in", values, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatBetween(String value1, String value2) {
            addCriterion("POLYGON_LONLAT between", value1, value2, "polygonLonlat");
            return (Criteria) this;
        }

        public Criteria andPolygonLonlatNotBetween(String value1, String value2) {
            addCriterion("POLYGON_LONLAT not between", value1, value2, "polygonLonlat");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andStateEqualTo(Long value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Long value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Long value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Long value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Long value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Long value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Long> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Long> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Long value1, Long value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Long value1, Long value2) {
            addCriterion("STATE not between", value1, value2, "state");
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