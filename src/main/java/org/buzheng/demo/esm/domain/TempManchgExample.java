package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TempManchgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempManchgExample() {
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

        public Criteria andAccessCodeIsNull() {
            addCriterion("ACCESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeIsNotNull() {
            addCriterion("ACCESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCodeEqualTo(String value) {
            addCriterion("ACCESS_CODE =", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotEqualTo(String value) {
            addCriterion("ACCESS_CODE <>", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeGreaterThan(String value) {
            addCriterion("ACCESS_CODE >", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE >=", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeLessThan(String value) {
            addCriterion("ACCESS_CODE <", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_CODE <=", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeLike(String value) {
            addCriterion("ACCESS_CODE like", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotLike(String value) {
            addCriterion("ACCESS_CODE not like", value, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeIn(List<String> values) {
            addCriterion("ACCESS_CODE in", values, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotIn(List<String> values) {
            addCriterion("ACCESS_CODE not in", values, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE between", value1, value2, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAccessCodeNotBetween(String value1, String value2) {
            addCriterion("ACCESS_CODE not between", value1, value2, "accessCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
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

        public Criteria andAddress7IsNull() {
            addCriterion("ADDRESS_7 is null");
            return (Criteria) this;
        }

        public Criteria andAddress7IsNotNull() {
            addCriterion("ADDRESS_7 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress7EqualTo(String value) {
            addCriterion("ADDRESS_7 =", value, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7NotEqualTo(String value) {
            addCriterion("ADDRESS_7 <>", value, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7GreaterThan(String value) {
            addCriterion("ADDRESS_7 >", value, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7GreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_7 >=", value, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7LessThan(String value) {
            addCriterion("ADDRESS_7 <", value, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7LessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_7 <=", value, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7Like(String value) {
            addCriterion("ADDRESS_7 like", value, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7NotLike(String value) {
            addCriterion("ADDRESS_7 not like", value, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7In(List<String> values) {
            addCriterion("ADDRESS_7 in", values, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7NotIn(List<String> values) {
            addCriterion("ADDRESS_7 not in", values, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7Between(String value1, String value2) {
            addCriterion("ADDRESS_7 between", value1, value2, "address7");
            return (Criteria) this;
        }

        public Criteria andAddress7NotBetween(String value1, String value2) {
            addCriterion("ADDRESS_7 not between", value1, value2, "address7");
            return (Criteria) this;
        }

        public Criteria andIfCqtIsNull() {
            addCriterion("IF_CQT is null");
            return (Criteria) this;
        }

        public Criteria andIfCqtIsNotNull() {
            addCriterion("IF_CQT is not null");
            return (Criteria) this;
        }

        public Criteria andIfCqtEqualTo(Long value) {
            addCriterion("IF_CQT =", value, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andIfCqtNotEqualTo(Long value) {
            addCriterion("IF_CQT <>", value, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andIfCqtGreaterThan(Long value) {
            addCriterion("IF_CQT >", value, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andIfCqtGreaterThanOrEqualTo(Long value) {
            addCriterion("IF_CQT >=", value, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andIfCqtLessThan(Long value) {
            addCriterion("IF_CQT <", value, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andIfCqtLessThanOrEqualTo(Long value) {
            addCriterion("IF_CQT <=", value, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andIfCqtIn(List<Long> values) {
            addCriterion("IF_CQT in", values, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andIfCqtNotIn(List<Long> values) {
            addCriterion("IF_CQT not in", values, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andIfCqtBetween(Long value1, Long value2) {
            addCriterion("IF_CQT between", value1, value2, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andIfCqtNotBetween(Long value1, Long value2) {
            addCriterion("IF_CQT not between", value1, value2, "ifCqt");
            return (Criteria) this;
        }

        public Criteria andSpTypeIsNull() {
            addCriterion("SP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSpTypeIsNotNull() {
            addCriterion("SP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSpTypeEqualTo(String value) {
            addCriterion("SP_TYPE =", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotEqualTo(String value) {
            addCriterion("SP_TYPE <>", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeGreaterThan(String value) {
            addCriterion("SP_TYPE >", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SP_TYPE >=", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeLessThan(String value) {
            addCriterion("SP_TYPE <", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeLessThanOrEqualTo(String value) {
            addCriterion("SP_TYPE <=", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeLike(String value) {
            addCriterion("SP_TYPE like", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotLike(String value) {
            addCriterion("SP_TYPE not like", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeIn(List<String> values) {
            addCriterion("SP_TYPE in", values, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotIn(List<String> values) {
            addCriterion("SP_TYPE not in", values, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeBetween(String value1, String value2) {
            addCriterion("SP_TYPE between", value1, value2, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotBetween(String value1, String value2) {
            addCriterion("SP_TYPE not between", value1, value2, "spType");
            return (Criteria) this;
        }

        public Criteria andSpCodeIsNull() {
            addCriterion("SP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSpCodeIsNotNull() {
            addCriterion("SP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSpCodeEqualTo(String value) {
            addCriterion("SP_CODE =", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotEqualTo(String value) {
            addCriterion("SP_CODE <>", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeGreaterThan(String value) {
            addCriterion("SP_CODE >", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SP_CODE >=", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLessThan(String value) {
            addCriterion("SP_CODE <", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLessThanOrEqualTo(String value) {
            addCriterion("SP_CODE <=", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLike(String value) {
            addCriterion("SP_CODE like", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotLike(String value) {
            addCriterion("SP_CODE not like", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeIn(List<String> values) {
            addCriterion("SP_CODE in", values, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotIn(List<String> values) {
            addCriterion("SP_CODE not in", values, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeBetween(String value1, String value2) {
            addCriterion("SP_CODE between", value1, value2, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotBetween(String value1, String value2) {
            addCriterion("SP_CODE not between", value1, value2, "spCode");
            return (Criteria) this;
        }

        public Criteria andActDateIsNull() {
            addCriterion("ACT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActDateIsNotNull() {
            addCriterion("ACT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActDateEqualTo(Date value) {
            addCriterion("ACT_DATE =", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotEqualTo(Date value) {
            addCriterion("ACT_DATE <>", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateGreaterThan(Date value) {
            addCriterion("ACT_DATE >", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACT_DATE >=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateLessThan(Date value) {
            addCriterion("ACT_DATE <", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateLessThanOrEqualTo(Date value) {
            addCriterion("ACT_DATE <=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateIn(List<Date> values) {
            addCriterion("ACT_DATE in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotIn(List<Date> values) {
            addCriterion("ACT_DATE not in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateBetween(Date value1, Date value2) {
            addCriterion("ACT_DATE between", value1, value2, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotBetween(Date value1, Date value2) {
            addCriterion("ACT_DATE not between", value1, value2, "actDate");
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

        public Criteria andBranchIsNull() {
            addCriterion("BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("BRANCH =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("BRANCH <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("BRANCH >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("BRANCH <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("BRANCH <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("BRANCH like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("BRANCH not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("BRANCH in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("BRANCH not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("BRANCH between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("BRANCH not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("REGION like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("REGION not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andCentreIsNull() {
            addCriterion("CENTRE is null");
            return (Criteria) this;
        }

        public Criteria andCentreIsNotNull() {
            addCriterion("CENTRE is not null");
            return (Criteria) this;
        }

        public Criteria andCentreEqualTo(String value) {
            addCriterion("CENTRE =", value, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreNotEqualTo(String value) {
            addCriterion("CENTRE <>", value, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreGreaterThan(String value) {
            addCriterion("CENTRE >", value, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreGreaterThanOrEqualTo(String value) {
            addCriterion("CENTRE >=", value, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreLessThan(String value) {
            addCriterion("CENTRE <", value, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreLessThanOrEqualTo(String value) {
            addCriterion("CENTRE <=", value, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreLike(String value) {
            addCriterion("CENTRE like", value, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreNotLike(String value) {
            addCriterion("CENTRE not like", value, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreIn(List<String> values) {
            addCriterion("CENTRE in", values, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreNotIn(List<String> values) {
            addCriterion("CENTRE not in", values, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreBetween(String value1, String value2) {
            addCriterion("CENTRE between", value1, value2, "centre");
            return (Criteria) this;
        }

        public Criteria andCentreNotBetween(String value1, String value2) {
            addCriterion("CENTRE not between", value1, value2, "centre");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("ADDRESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("ADDRESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(BigDecimal value) {
            addCriterion("ADDRESS_ID =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(BigDecimal value) {
            addCriterion("ADDRESS_ID <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(BigDecimal value) {
            addCriterion("ADDRESS_ID >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADDRESS_ID >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(BigDecimal value) {
            addCriterion("ADDRESS_ID <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADDRESS_ID <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<BigDecimal> values) {
            addCriterion("ADDRESS_ID in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<BigDecimal> values) {
            addCriterion("ADDRESS_ID not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADDRESS_ID between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADDRESS_ID not between", value1, value2, "addressId");
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

        public Criteria andChinaMobileEqualTo(Long value) {
            addCriterion("CHINA_MOBILE =", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileNotEqualTo(Long value) {
            addCriterion("CHINA_MOBILE <>", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileGreaterThan(Long value) {
            addCriterion("CHINA_MOBILE >", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileGreaterThanOrEqualTo(Long value) {
            addCriterion("CHINA_MOBILE >=", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileLessThan(Long value) {
            addCriterion("CHINA_MOBILE <", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileLessThanOrEqualTo(Long value) {
            addCriterion("CHINA_MOBILE <=", value, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileIn(List<Long> values) {
            addCriterion("CHINA_MOBILE in", values, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileNotIn(List<Long> values) {
            addCriterion("CHINA_MOBILE not in", values, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileBetween(Long value1, Long value2) {
            addCriterion("CHINA_MOBILE between", value1, value2, "chinaMobile");
            return (Criteria) this;
        }

        public Criteria andChinaMobileNotBetween(Long value1, Long value2) {
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

        public Criteria andChinaUnionEqualTo(Long value) {
            addCriterion("CHINA_UNION =", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionNotEqualTo(Long value) {
            addCriterion("CHINA_UNION <>", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionGreaterThan(Long value) {
            addCriterion("CHINA_UNION >", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionGreaterThanOrEqualTo(Long value) {
            addCriterion("CHINA_UNION >=", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionLessThan(Long value) {
            addCriterion("CHINA_UNION <", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionLessThanOrEqualTo(Long value) {
            addCriterion("CHINA_UNION <=", value, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionIn(List<Long> values) {
            addCriterion("CHINA_UNION in", values, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionNotIn(List<Long> values) {
            addCriterion("CHINA_UNION not in", values, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionBetween(Long value1, Long value2) {
            addCriterion("CHINA_UNION between", value1, value2, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andChinaUnionNotBetween(Long value1, Long value2) {
            addCriterion("CHINA_UNION not between", value1, value2, "chinaUnion");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
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

        public Criteria andStAddrIsNull() {
            addCriterion("ST_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andStAddrIsNotNull() {
            addCriterion("ST_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andStAddrEqualTo(String value) {
            addCriterion("ST_ADDR =", value, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrNotEqualTo(String value) {
            addCriterion("ST_ADDR <>", value, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrGreaterThan(String value) {
            addCriterion("ST_ADDR >", value, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ST_ADDR >=", value, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrLessThan(String value) {
            addCriterion("ST_ADDR <", value, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrLessThanOrEqualTo(String value) {
            addCriterion("ST_ADDR <=", value, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrLike(String value) {
            addCriterion("ST_ADDR like", value, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrNotLike(String value) {
            addCriterion("ST_ADDR not like", value, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrIn(List<String> values) {
            addCriterion("ST_ADDR in", values, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrNotIn(List<String> values) {
            addCriterion("ST_ADDR not in", values, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrBetween(String value1, String value2) {
            addCriterion("ST_ADDR between", value1, value2, "stAddr");
            return (Criteria) this;
        }

        public Criteria andStAddrNotBetween(String value1, String value2) {
            addCriterion("ST_ADDR not between", value1, value2, "stAddr");
            return (Criteria) this;
        }

        public Criteria andIfPhoneIsNull() {
            addCriterion("IF_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andIfPhoneIsNotNull() {
            addCriterion("IF_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andIfPhoneEqualTo(Long value) {
            addCriterion("IF_PHONE =", value, "ifPhone");
            return (Criteria) this;
        }

        public Criteria andIfPhoneNotEqualTo(Long value) {
            addCriterion("IF_PHONE <>", value, "ifPhone");
            return (Criteria) this;
        }

        public Criteria andIfPhoneGreaterThan(Long value) {
            addCriterion("IF_PHONE >", value, "ifPhone");
            return (Criteria) this;
        }

        public Criteria andIfPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("IF_PHONE >=", value, "ifPhone");
            return (Criteria) this;
        }

        public Criteria andIfPhoneLessThan(Long value) {
            addCriterion("IF_PHONE <", value, "ifPhone");
            return (Criteria) this;
        }

        public Criteria andIfPhoneLessThanOrEqualTo(Long value) {
            addCriterion("IF_PHONE <=", value, "ifPhone");
            return (Criteria) this;
        }

        public Criteria andIfPhoneIn(List<Long> values) {
            addCriterion("IF_PHONE in", values, "ifPhone");
            return (Criteria) this;
        }

        public Criteria andIfPhoneNotIn(List<Long> values) {
            addCriterion("IF_PHONE not in", values, "ifPhone");
            return (Criteria) this;
        }

        public Criteria andIfPhoneBetween(Long value1, Long value2) {
            addCriterion("IF_PHONE between", value1, value2, "ifPhone");
            return (Criteria) this;
        }

        public Criteria andIfPhoneNotBetween(Long value1, Long value2) {
            addCriterion("IF_PHONE not between", value1, value2, "ifPhone");
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