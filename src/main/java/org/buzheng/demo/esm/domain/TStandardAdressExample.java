package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TStandardAdressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStandardAdressExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andFiveLevelAdressIsNull() {
            addCriterion("FIVE_LEVEL_ADRESS is null");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressIsNotNull() {
            addCriterion("FIVE_LEVEL_ADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressEqualTo(String value) {
            addCriterion("FIVE_LEVEL_ADRESS =", value, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressNotEqualTo(String value) {
            addCriterion("FIVE_LEVEL_ADRESS <>", value, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressGreaterThan(String value) {
            addCriterion("FIVE_LEVEL_ADRESS >", value, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressGreaterThanOrEqualTo(String value) {
            addCriterion("FIVE_LEVEL_ADRESS >=", value, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressLessThan(String value) {
            addCriterion("FIVE_LEVEL_ADRESS <", value, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressLessThanOrEqualTo(String value) {
            addCriterion("FIVE_LEVEL_ADRESS <=", value, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressLike(String value) {
            addCriterion("FIVE_LEVEL_ADRESS like", value, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressNotLike(String value) {
            addCriterion("FIVE_LEVEL_ADRESS not like", value, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressIn(List<String> values) {
            addCriterion("FIVE_LEVEL_ADRESS in", values, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressNotIn(List<String> values) {
            addCriterion("FIVE_LEVEL_ADRESS not in", values, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressBetween(String value1, String value2) {
            addCriterion("FIVE_LEVEL_ADRESS between", value1, value2, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andFiveLevelAdressNotBetween(String value1, String value2) {
            addCriterion("FIVE_LEVEL_ADRESS not between", value1, value2, "fiveLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressIsNull() {
            addCriterion("SEVEN_LEVEL_ADRESS is null");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressIsNotNull() {
            addCriterion("SEVEN_LEVEL_ADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressEqualTo(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS =", value, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressNotEqualTo(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS <>", value, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressGreaterThan(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS >", value, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressGreaterThanOrEqualTo(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS >=", value, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressLessThan(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS <", value, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressLessThanOrEqualTo(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS <=", value, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressLike(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS like", value, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressNotLike(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS not like", value, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressIn(List<String> values) {
            addCriterion("SEVEN_LEVEL_ADRESS in", values, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressNotIn(List<String> values) {
            addCriterion("SEVEN_LEVEL_ADRESS not in", values, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressBetween(String value1, String value2) {
            addCriterion("SEVEN_LEVEL_ADRESS between", value1, value2, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressNotBetween(String value1, String value2) {
            addCriterion("SEVEN_LEVEL_ADRESS not between", value1, value2, "sevenLevelAdress");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameIsNull() {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME is null");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameIsNotNull() {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameEqualTo(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME =", value, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameNotEqualTo(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME <>", value, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameGreaterThan(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME >", value, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME >=", value, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameLessThan(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME <", value, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameLessThanOrEqualTo(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME <=", value, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameLike(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME like", value, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameNotLike(String value) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME not like", value, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameIn(List<String> values) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME in", values, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameNotIn(List<String> values) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME not in", values, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameBetween(String value1, String value2) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME between", value1, value2, "sevenLevelAdressFullname");
            return (Criteria) this;
        }

        public Criteria andSevenLevelAdressFullnameNotBetween(String value1, String value2) {
            addCriterion("SEVEN_LEVEL_ADRESS_FULLNAME not between", value1, value2, "sevenLevelAdressFullname");
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