package org.buzheng.demo.esm.domain;

import java.util.ArrayList;
import java.util.List;

public class TwoLevelAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TwoLevelAddressExample() {
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