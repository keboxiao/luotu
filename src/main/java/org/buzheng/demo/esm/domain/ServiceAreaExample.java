package org.buzheng.demo.esm.domain;

import java.util.ArrayList;
import java.util.List;

public class ServiceAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceAreaExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("AREA_ID like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("AREA_ID not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
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

        public Criteria andAddrFullnameIsNull() {
            addCriterion("ADDR_FULLNAME is null");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameIsNotNull() {
            addCriterion("ADDR_FULLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameEqualTo(String value) {
            addCriterion("ADDR_FULLNAME =", value, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameNotEqualTo(String value) {
            addCriterion("ADDR_FULLNAME <>", value, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameGreaterThan(String value) {
            addCriterion("ADDR_FULLNAME >", value, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_FULLNAME >=", value, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameLessThan(String value) {
            addCriterion("ADDR_FULLNAME <", value, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameLessThanOrEqualTo(String value) {
            addCriterion("ADDR_FULLNAME <=", value, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameLike(String value) {
            addCriterion("ADDR_FULLNAME like", value, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameNotLike(String value) {
            addCriterion("ADDR_FULLNAME not like", value, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameIn(List<String> values) {
            addCriterion("ADDR_FULLNAME in", values, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameNotIn(List<String> values) {
            addCriterion("ADDR_FULLNAME not in", values, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameBetween(String value1, String value2) {
            addCriterion("ADDR_FULLNAME between", value1, value2, "addrFullname");
            return (Criteria) this;
        }

        public Criteria andAddrFullnameNotBetween(String value1, String value2) {
            addCriterion("ADDR_FULLNAME not between", value1, value2, "addrFullname");
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