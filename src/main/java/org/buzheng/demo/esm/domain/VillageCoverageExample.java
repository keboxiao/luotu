package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VillageCoverageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VillageCoverageExample() {
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

        public Criteria andPeriodIsNull() {
            addCriterion("PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("PERIOD =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("PERIOD <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("PERIOD >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERIOD >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("PERIOD <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("PERIOD <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("PERIOD in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("PERIOD not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("PERIOD between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("PERIOD not between", value1, value2, "period");
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

        public Criteria andAvgrsrpIsNull() {
            addCriterion("AVGRSRP is null");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpIsNotNull() {
            addCriterion("AVGRSRP is not null");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpEqualTo(BigDecimal value) {
            addCriterion("AVGRSRP =", value, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpNotEqualTo(BigDecimal value) {
            addCriterion("AVGRSRP <>", value, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpGreaterThan(BigDecimal value) {
            addCriterion("AVGRSRP >", value, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVGRSRP >=", value, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpLessThan(BigDecimal value) {
            addCriterion("AVGRSRP <", value, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVGRSRP <=", value, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpIn(List<BigDecimal> values) {
            addCriterion("AVGRSRP in", values, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpNotIn(List<BigDecimal> values) {
            addCriterion("AVGRSRP not in", values, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVGRSRP between", value1, value2, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andAvgrsrpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVGRSRP not between", value1, value2, "avgrsrp");
            return (Criteria) this;
        }

        public Criteria andCoverageIsNull() {
            addCriterion("COVERAGE is null");
            return (Criteria) this;
        }

        public Criteria andCoverageIsNotNull() {
            addCriterion("COVERAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCoverageEqualTo(String value) {
            addCriterion("COVERAGE =", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotEqualTo(String value) {
            addCriterion("COVERAGE <>", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageGreaterThan(String value) {
            addCriterion("COVERAGE >", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageGreaterThanOrEqualTo(String value) {
            addCriterion("COVERAGE >=", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageLessThan(String value) {
            addCriterion("COVERAGE <", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageLessThanOrEqualTo(String value) {
            addCriterion("COVERAGE <=", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageLike(String value) {
            addCriterion("COVERAGE like", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotLike(String value) {
            addCriterion("COVERAGE not like", value, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageIn(List<String> values) {
            addCriterion("COVERAGE in", values, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotIn(List<String> values) {
            addCriterion("COVERAGE not in", values, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageBetween(String value1, String value2) {
            addCriterion("COVERAGE between", value1, value2, "coverage");
            return (Criteria) this;
        }

        public Criteria andCoverageNotBetween(String value1, String value2) {
            addCriterion("COVERAGE not between", value1, value2, "coverage");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
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