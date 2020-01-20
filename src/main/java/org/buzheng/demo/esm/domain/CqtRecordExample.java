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

        public Criteria andBuildingNameIsNull() {
            addCriterion("BUILDING_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNotNull() {
            addCriterion("BUILDING_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameEqualTo(String value) {
            addCriterion("BUILDING_NAME =", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotEqualTo(String value) {
            addCriterion("BUILDING_NAME <>", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThan(String value) {
            addCriterion("BUILDING_NAME >", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUILDING_NAME >=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThan(String value) {
            addCriterion("BUILDING_NAME <", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThanOrEqualTo(String value) {
            addCriterion("BUILDING_NAME <=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLike(String value) {
            addCriterion("BUILDING_NAME like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotLike(String value) {
            addCriterion("BUILDING_NAME not like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIn(List<String> values) {
            addCriterion("BUILDING_NAME in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotIn(List<String> values) {
            addCriterion("BUILDING_NAME not in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameBetween(String value1, String value2) {
            addCriterion("BUILDING_NAME between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotBetween(String value1, String value2) {
            addCriterion("BUILDING_NAME not between", value1, value2, "buildingName");
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

        public Criteria andGridIsNull() {
            addCriterion("GRID is null");
            return (Criteria) this;
        }

        public Criteria andGridIsNotNull() {
            addCriterion("GRID is not null");
            return (Criteria) this;
        }

        public Criteria andGridEqualTo(String value) {
            addCriterion("GRID =", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridNotEqualTo(String value) {
            addCriterion("GRID <>", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridGreaterThan(String value) {
            addCriterion("GRID >", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridGreaterThanOrEqualTo(String value) {
            addCriterion("GRID >=", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridLessThan(String value) {
            addCriterion("GRID <", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridLessThanOrEqualTo(String value) {
            addCriterion("GRID <=", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridLike(String value) {
            addCriterion("GRID like", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridNotLike(String value) {
            addCriterion("GRID not like", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridIn(List<String> values) {
            addCriterion("GRID in", values, "grid");
            return (Criteria) this;
        }

        public Criteria andGridNotIn(List<String> values) {
            addCriterion("GRID not in", values, "grid");
            return (Criteria) this;
        }

        public Criteria andGridBetween(String value1, String value2) {
            addCriterion("GRID between", value1, value2, "grid");
            return (Criteria) this;
        }

        public Criteria andGridNotBetween(String value1, String value2) {
            addCriterion("GRID not between", value1, value2, "grid");
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

        public Criteria andMarketingCenterIsNull() {
            addCriterion("MARKETING_CENTER is null");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterIsNotNull() {
            addCriterion("MARKETING_CENTER is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterEqualTo(String value) {
            addCriterion("MARKETING_CENTER =", value, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterNotEqualTo(String value) {
            addCriterion("MARKETING_CENTER <>", value, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterGreaterThan(String value) {
            addCriterion("MARKETING_CENTER >", value, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterGreaterThanOrEqualTo(String value) {
            addCriterion("MARKETING_CENTER >=", value, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterLessThan(String value) {
            addCriterion("MARKETING_CENTER <", value, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterLessThanOrEqualTo(String value) {
            addCriterion("MARKETING_CENTER <=", value, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterLike(String value) {
            addCriterion("MARKETING_CENTER like", value, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterNotLike(String value) {
            addCriterion("MARKETING_CENTER not like", value, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterIn(List<String> values) {
            addCriterion("MARKETING_CENTER in", values, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterNotIn(List<String> values) {
            addCriterion("MARKETING_CENTER not in", values, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterBetween(String value1, String value2) {
            addCriterion("MARKETING_CENTER between", value1, value2, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingCenterNotBetween(String value1, String value2) {
            addCriterion("MARKETING_CENTER not between", value1, value2, "marketingCenter");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("IMEI is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("IMEI is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("IMEI =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("IMEI <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("IMEI >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("IMEI >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("IMEI <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("IMEI <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("IMEI like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("IMEI not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("IMEI in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("IMEI not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("IMEI between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("IMEI not between", value1, value2, "imei");
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

        public Criteria andMdnIsNull() {
            addCriterion("MDN is null");
            return (Criteria) this;
        }

        public Criteria andMdnIsNotNull() {
            addCriterion("MDN is not null");
            return (Criteria) this;
        }

        public Criteria andMdnEqualTo(String value) {
            addCriterion("MDN =", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnNotEqualTo(String value) {
            addCriterion("MDN <>", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnGreaterThan(String value) {
            addCriterion("MDN >", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnGreaterThanOrEqualTo(String value) {
            addCriterion("MDN >=", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnLessThan(String value) {
            addCriterion("MDN <", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnLessThanOrEqualTo(String value) {
            addCriterion("MDN <=", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnLike(String value) {
            addCriterion("MDN like", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnNotLike(String value) {
            addCriterion("MDN not like", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnIn(List<String> values) {
            addCriterion("MDN in", values, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnNotIn(List<String> values) {
            addCriterion("MDN not in", values, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnBetween(String value1, String value2) {
            addCriterion("MDN between", value1, value2, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnNotBetween(String value1, String value2) {
            addCriterion("MDN not between", value1, value2, "mdn");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("TERMINAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("TERMINAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(String value) {
            addCriterion("TERMINAL_TYPE =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(String value) {
            addCriterion("TERMINAL_TYPE <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(String value) {
            addCriterion("TERMINAL_TYPE >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_TYPE >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(String value) {
            addCriterion("TERMINAL_TYPE <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_TYPE <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLike(String value) {
            addCriterion("TERMINAL_TYPE like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotLike(String value) {
            addCriterion("TERMINAL_TYPE not like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<String> values) {
            addCriterion("TERMINAL_TYPE in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<String> values) {
            addCriterion("TERMINAL_TYPE not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(String value1, String value2) {
            addCriterion("TERMINAL_TYPE between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_TYPE not between", value1, value2, "terminalType");
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

        public Criteria andAdminAreaIsNull() {
            addCriterion("ADMIN_AREA is null");
            return (Criteria) this;
        }

        public Criteria andAdminAreaIsNotNull() {
            addCriterion("ADMIN_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAreaEqualTo(String value) {
            addCriterion("ADMIN_AREA =", value, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaNotEqualTo(String value) {
            addCriterion("ADMIN_AREA <>", value, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaGreaterThan(String value) {
            addCriterion("ADMIN_AREA >", value, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_AREA >=", value, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaLessThan(String value) {
            addCriterion("ADMIN_AREA <", value, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_AREA <=", value, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaLike(String value) {
            addCriterion("ADMIN_AREA like", value, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaNotLike(String value) {
            addCriterion("ADMIN_AREA not like", value, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaIn(List<String> values) {
            addCriterion("ADMIN_AREA in", values, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaNotIn(List<String> values) {
            addCriterion("ADMIN_AREA not in", values, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaBetween(String value1, String value2) {
            addCriterion("ADMIN_AREA between", value1, value2, "adminArea");
            return (Criteria) this;
        }

        public Criteria andAdminAreaNotBetween(String value1, String value2) {
            addCriterion("ADMIN_AREA not between", value1, value2, "adminArea");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("STREET is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("STREET is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("STREET =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("STREET <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("STREET >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("STREET >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("STREET <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("STREET <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("STREET like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("STREET not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("STREET in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("STREET not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("STREET between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("STREET not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andDoorNumIsNull() {
            addCriterion("DOOR_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDoorNumIsNotNull() {
            addCriterion("DOOR_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDoorNumEqualTo(String value) {
            addCriterion("DOOR_NUM =", value, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumNotEqualTo(String value) {
            addCriterion("DOOR_NUM <>", value, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumGreaterThan(String value) {
            addCriterion("DOOR_NUM >", value, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumGreaterThanOrEqualTo(String value) {
            addCriterion("DOOR_NUM >=", value, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumLessThan(String value) {
            addCriterion("DOOR_NUM <", value, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumLessThanOrEqualTo(String value) {
            addCriterion("DOOR_NUM <=", value, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumLike(String value) {
            addCriterion("DOOR_NUM like", value, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumNotLike(String value) {
            addCriterion("DOOR_NUM not like", value, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumIn(List<String> values) {
            addCriterion("DOOR_NUM in", values, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumNotIn(List<String> values) {
            addCriterion("DOOR_NUM not in", values, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumBetween(String value1, String value2) {
            addCriterion("DOOR_NUM between", value1, value2, "doorNum");
            return (Criteria) this;
        }

        public Criteria andDoorNumNotBetween(String value1, String value2) {
            addCriterion("DOOR_NUM not between", value1, value2, "doorNum");
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

        public Criteria andLteBaseNumIsNull() {
            addCriterion("LTE_BASE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumIsNotNull() {
            addCriterion("LTE_BASE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumEqualTo(String value) {
            addCriterion("LTE_BASE_NUM =", value, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumNotEqualTo(String value) {
            addCriterion("LTE_BASE_NUM <>", value, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumGreaterThan(String value) {
            addCriterion("LTE_BASE_NUM >", value, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumGreaterThanOrEqualTo(String value) {
            addCriterion("LTE_BASE_NUM >=", value, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumLessThan(String value) {
            addCriterion("LTE_BASE_NUM <", value, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumLessThanOrEqualTo(String value) {
            addCriterion("LTE_BASE_NUM <=", value, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumLike(String value) {
            addCriterion("LTE_BASE_NUM like", value, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumNotLike(String value) {
            addCriterion("LTE_BASE_NUM not like", value, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumIn(List<String> values) {
            addCriterion("LTE_BASE_NUM in", values, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumNotIn(List<String> values) {
            addCriterion("LTE_BASE_NUM not in", values, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumBetween(String value1, String value2) {
            addCriterion("LTE_BASE_NUM between", value1, value2, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNumNotBetween(String value1, String value2) {
            addCriterion("LTE_BASE_NUM not between", value1, value2, "lteBaseNum");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameIsNull() {
            addCriterion("LTE_BASE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameIsNotNull() {
            addCriterion("LTE_BASE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameEqualTo(String value) {
            addCriterion("LTE_BASE_NAME =", value, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameNotEqualTo(String value) {
            addCriterion("LTE_BASE_NAME <>", value, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameGreaterThan(String value) {
            addCriterion("LTE_BASE_NAME >", value, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("LTE_BASE_NAME >=", value, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameLessThan(String value) {
            addCriterion("LTE_BASE_NAME <", value, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameLessThanOrEqualTo(String value) {
            addCriterion("LTE_BASE_NAME <=", value, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameLike(String value) {
            addCriterion("LTE_BASE_NAME like", value, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameNotLike(String value) {
            addCriterion("LTE_BASE_NAME not like", value, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameIn(List<String> values) {
            addCriterion("LTE_BASE_NAME in", values, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameNotIn(List<String> values) {
            addCriterion("LTE_BASE_NAME not in", values, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameBetween(String value1, String value2) {
            addCriterion("LTE_BASE_NAME between", value1, value2, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteBaseNameNotBetween(String value1, String value2) {
            addCriterion("LTE_BASE_NAME not between", value1, value2, "lteBaseName");
            return (Criteria) this;
        }

        public Criteria andLteSectionIsNull() {
            addCriterion("LTE_SECTION is null");
            return (Criteria) this;
        }

        public Criteria andLteSectionIsNotNull() {
            addCriterion("LTE_SECTION is not null");
            return (Criteria) this;
        }

        public Criteria andLteSectionEqualTo(String value) {
            addCriterion("LTE_SECTION =", value, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionNotEqualTo(String value) {
            addCriterion("LTE_SECTION <>", value, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionGreaterThan(String value) {
            addCriterion("LTE_SECTION >", value, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionGreaterThanOrEqualTo(String value) {
            addCriterion("LTE_SECTION >=", value, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionLessThan(String value) {
            addCriterion("LTE_SECTION <", value, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionLessThanOrEqualTo(String value) {
            addCriterion("LTE_SECTION <=", value, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionLike(String value) {
            addCriterion("LTE_SECTION like", value, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionNotLike(String value) {
            addCriterion("LTE_SECTION not like", value, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionIn(List<String> values) {
            addCriterion("LTE_SECTION in", values, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionNotIn(List<String> values) {
            addCriterion("LTE_SECTION not in", values, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionBetween(String value1, String value2) {
            addCriterion("LTE_SECTION between", value1, value2, "lteSection");
            return (Criteria) this;
        }

        public Criteria andLteSectionNotBetween(String value1, String value2) {
            addCriterion("LTE_SECTION not between", value1, value2, "lteSection");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("FREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("FREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("FREQUENCY =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("FREQUENCY <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("FREQUENCY >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("FREQUENCY >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("FREQUENCY <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("FREQUENCY <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("FREQUENCY like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("FREQUENCY not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("FREQUENCY in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("FREQUENCY not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("FREQUENCY between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("FREQUENCY not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andMccIsNull() {
            addCriterion("MCC is null");
            return (Criteria) this;
        }

        public Criteria andMccIsNotNull() {
            addCriterion("MCC is not null");
            return (Criteria) this;
        }

        public Criteria andMccEqualTo(String value) {
            addCriterion("MCC =", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotEqualTo(String value) {
            addCriterion("MCC <>", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThan(String value) {
            addCriterion("MCC >", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThanOrEqualTo(String value) {
            addCriterion("MCC >=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThan(String value) {
            addCriterion("MCC <", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThanOrEqualTo(String value) {
            addCriterion("MCC <=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLike(String value) {
            addCriterion("MCC like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotLike(String value) {
            addCriterion("MCC not like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccIn(List<String> values) {
            addCriterion("MCC in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotIn(List<String> values) {
            addCriterion("MCC not in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccBetween(String value1, String value2) {
            addCriterion("MCC between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotBetween(String value1, String value2) {
            addCriterion("MCC not between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andMncIsNull() {
            addCriterion("MNC is null");
            return (Criteria) this;
        }

        public Criteria andMncIsNotNull() {
            addCriterion("MNC is not null");
            return (Criteria) this;
        }

        public Criteria andMncEqualTo(String value) {
            addCriterion("MNC =", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotEqualTo(String value) {
            addCriterion("MNC <>", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncGreaterThan(String value) {
            addCriterion("MNC >", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncGreaterThanOrEqualTo(String value) {
            addCriterion("MNC >=", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLessThan(String value) {
            addCriterion("MNC <", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLessThanOrEqualTo(String value) {
            addCriterion("MNC <=", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLike(String value) {
            addCriterion("MNC like", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotLike(String value) {
            addCriterion("MNC not like", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncIn(List<String> values) {
            addCriterion("MNC in", values, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotIn(List<String> values) {
            addCriterion("MNC not in", values, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncBetween(String value1, String value2) {
            addCriterion("MNC between", value1, value2, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotBetween(String value1, String value2) {
            addCriterion("MNC not between", value1, value2, "mnc");
            return (Criteria) this;
        }

        public Criteria andCiIsNull() {
            addCriterion("CI is null");
            return (Criteria) this;
        }

        public Criteria andCiIsNotNull() {
            addCriterion("CI is not null");
            return (Criteria) this;
        }

        public Criteria andCiEqualTo(String value) {
            addCriterion("CI =", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotEqualTo(String value) {
            addCriterion("CI <>", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThan(String value) {
            addCriterion("CI >", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThanOrEqualTo(String value) {
            addCriterion("CI >=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThan(String value) {
            addCriterion("CI <", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThanOrEqualTo(String value) {
            addCriterion("CI <=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLike(String value) {
            addCriterion("CI like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotLike(String value) {
            addCriterion("CI not like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiIn(List<String> values) {
            addCriterion("CI in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotIn(List<String> values) {
            addCriterion("CI not in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiBetween(String value1, String value2) {
            addCriterion("CI between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotBetween(String value1, String value2) {
            addCriterion("CI not between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andPciIsNull() {
            addCriterion("PCI is null");
            return (Criteria) this;
        }

        public Criteria andPciIsNotNull() {
            addCriterion("PCI is not null");
            return (Criteria) this;
        }

        public Criteria andPciEqualTo(String value) {
            addCriterion("PCI =", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotEqualTo(String value) {
            addCriterion("PCI <>", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciGreaterThan(String value) {
            addCriterion("PCI >", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciGreaterThanOrEqualTo(String value) {
            addCriterion("PCI >=", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLessThan(String value) {
            addCriterion("PCI <", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLessThanOrEqualTo(String value) {
            addCriterion("PCI <=", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLike(String value) {
            addCriterion("PCI like", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotLike(String value) {
            addCriterion("PCI not like", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciIn(List<String> values) {
            addCriterion("PCI in", values, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotIn(List<String> values) {
            addCriterion("PCI not in", values, "pci");
            return (Criteria) this;
        }

        public Criteria andPciBetween(String value1, String value2) {
            addCriterion("PCI between", value1, value2, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotBetween(String value1, String value2) {
            addCriterion("PCI not between", value1, value2, "pci");
            return (Criteria) this;
        }

        public Criteria andTacIsNull() {
            addCriterion("TAC is null");
            return (Criteria) this;
        }

        public Criteria andTacIsNotNull() {
            addCriterion("TAC is not null");
            return (Criteria) this;
        }

        public Criteria andTacEqualTo(String value) {
            addCriterion("TAC =", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotEqualTo(String value) {
            addCriterion("TAC <>", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacGreaterThan(String value) {
            addCriterion("TAC >", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacGreaterThanOrEqualTo(String value) {
            addCriterion("TAC >=", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacLessThan(String value) {
            addCriterion("TAC <", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacLessThanOrEqualTo(String value) {
            addCriterion("TAC <=", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacLike(String value) {
            addCriterion("TAC like", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotLike(String value) {
            addCriterion("TAC not like", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacIn(List<String> values) {
            addCriterion("TAC in", values, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotIn(List<String> values) {
            addCriterion("TAC not in", values, "tac");
            return (Criteria) this;
        }

        public Criteria andTacBetween(String value1, String value2) {
            addCriterion("TAC between", value1, value2, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotBetween(String value1, String value2) {
            addCriterion("TAC not between", value1, value2, "tac");
            return (Criteria) this;
        }

        public Criteria andRsrpIsNull() {
            addCriterion("RSRP is null");
            return (Criteria) this;
        }

        public Criteria andRsrpIsNotNull() {
            addCriterion("RSRP is not null");
            return (Criteria) this;
        }

        public Criteria andRsrpEqualTo(BigDecimal value) {
            addCriterion("RSRP =", value, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrpNotEqualTo(BigDecimal value) {
            addCriterion("RSRP <>", value, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrpGreaterThan(BigDecimal value) {
            addCriterion("RSRP >", value, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RSRP >=", value, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrpLessThan(BigDecimal value) {
            addCriterion("RSRP <", value, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RSRP <=", value, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrpIn(List<BigDecimal> values) {
            addCriterion("RSRP in", values, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrpNotIn(List<BigDecimal> values) {
            addCriterion("RSRP not in", values, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSRP between", value1, value2, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSRP not between", value1, value2, "rsrp");
            return (Criteria) this;
        }

        public Criteria andRsrqIsNull() {
            addCriterion("RSRQ is null");
            return (Criteria) this;
        }

        public Criteria andRsrqIsNotNull() {
            addCriterion("RSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andRsrqEqualTo(BigDecimal value) {
            addCriterion("RSRQ =", value, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRsrqNotEqualTo(BigDecimal value) {
            addCriterion("RSRQ <>", value, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRsrqGreaterThan(BigDecimal value) {
            addCriterion("RSRQ >", value, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRsrqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RSRQ >=", value, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRsrqLessThan(BigDecimal value) {
            addCriterion("RSRQ <", value, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRsrqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RSRQ <=", value, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRsrqIn(List<BigDecimal> values) {
            addCriterion("RSRQ in", values, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRsrqNotIn(List<BigDecimal> values) {
            addCriterion("RSRQ not in", values, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRsrqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSRQ between", value1, value2, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRsrqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSRQ not between", value1, value2, "rsrq");
            return (Criteria) this;
        }

        public Criteria andRssiIsNull() {
            addCriterion("RSSI is null");
            return (Criteria) this;
        }

        public Criteria andRssiIsNotNull() {
            addCriterion("RSSI is not null");
            return (Criteria) this;
        }

        public Criteria andRssiEqualTo(BigDecimal value) {
            addCriterion("RSSI =", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotEqualTo(BigDecimal value) {
            addCriterion("RSSI <>", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiGreaterThan(BigDecimal value) {
            addCriterion("RSSI >", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RSSI >=", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiLessThan(BigDecimal value) {
            addCriterion("RSSI <", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RSSI <=", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiIn(List<BigDecimal> values) {
            addCriterion("RSSI in", values, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotIn(List<BigDecimal> values) {
            addCriterion("RSSI not in", values, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSSI between", value1, value2, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSSI not between", value1, value2, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssnrIsNull() {
            addCriterion("RSSNR is null");
            return (Criteria) this;
        }

        public Criteria andRssnrIsNotNull() {
            addCriterion("RSSNR is not null");
            return (Criteria) this;
        }

        public Criteria andRssnrEqualTo(BigDecimal value) {
            addCriterion("RSSNR =", value, "rssnr");
            return (Criteria) this;
        }

        public Criteria andRssnrNotEqualTo(BigDecimal value) {
            addCriterion("RSSNR <>", value, "rssnr");
            return (Criteria) this;
        }

        public Criteria andRssnrGreaterThan(BigDecimal value) {
            addCriterion("RSSNR >", value, "rssnr");
            return (Criteria) this;
        }

        public Criteria andRssnrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RSSNR >=", value, "rssnr");
            return (Criteria) this;
        }

        public Criteria andRssnrLessThan(BigDecimal value) {
            addCriterion("RSSNR <", value, "rssnr");
            return (Criteria) this;
        }

        public Criteria andRssnrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RSSNR <=", value, "rssnr");
            return (Criteria) this;
        }

        public Criteria andRssnrIn(List<BigDecimal> values) {
            addCriterion("RSSNR in", values, "rssnr");
            return (Criteria) this;
        }

        public Criteria andRssnrNotIn(List<BigDecimal> values) {
            addCriterion("RSSNR not in", values, "rssnr");
            return (Criteria) this;
        }

        public Criteria andRssnrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSSNR between", value1, value2, "rssnr");
            return (Criteria) this;
        }

        public Criteria andRssnrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSSNR not between", value1, value2, "rssnr");
            return (Criteria) this;
        }

        public Criteria andCqiIsNull() {
            addCriterion("CQI is null");
            return (Criteria) this;
        }

        public Criteria andCqiIsNotNull() {
            addCriterion("CQI is not null");
            return (Criteria) this;
        }

        public Criteria andCqiEqualTo(BigDecimal value) {
            addCriterion("CQI =", value, "cqi");
            return (Criteria) this;
        }

        public Criteria andCqiNotEqualTo(BigDecimal value) {
            addCriterion("CQI <>", value, "cqi");
            return (Criteria) this;
        }

        public Criteria andCqiGreaterThan(BigDecimal value) {
            addCriterion("CQI >", value, "cqi");
            return (Criteria) this;
        }

        public Criteria andCqiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CQI >=", value, "cqi");
            return (Criteria) this;
        }

        public Criteria andCqiLessThan(BigDecimal value) {
            addCriterion("CQI <", value, "cqi");
            return (Criteria) this;
        }

        public Criteria andCqiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CQI <=", value, "cqi");
            return (Criteria) this;
        }

        public Criteria andCqiIn(List<BigDecimal> values) {
            addCriterion("CQI in", values, "cqi");
            return (Criteria) this;
        }

        public Criteria andCqiNotIn(List<BigDecimal> values) {
            addCriterion("CQI not in", values, "cqi");
            return (Criteria) this;
        }

        public Criteria andCqiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CQI between", value1, value2, "cqi");
            return (Criteria) this;
        }

        public Criteria andCqiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CQI not between", value1, value2, "cqi");
            return (Criteria) this;
        }

        public Criteria andBscIsNull() {
            addCriterion("BSC is null");
            return (Criteria) this;
        }

        public Criteria andBscIsNotNull() {
            addCriterion("BSC is not null");
            return (Criteria) this;
        }

        public Criteria andBscEqualTo(String value) {
            addCriterion("BSC =", value, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscNotEqualTo(String value) {
            addCriterion("BSC <>", value, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscGreaterThan(String value) {
            addCriterion("BSC >", value, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscGreaterThanOrEqualTo(String value) {
            addCriterion("BSC >=", value, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscLessThan(String value) {
            addCriterion("BSC <", value, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscLessThanOrEqualTo(String value) {
            addCriterion("BSC <=", value, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscLike(String value) {
            addCriterion("BSC like", value, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscNotLike(String value) {
            addCriterion("BSC not like", value, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscIn(List<String> values) {
            addCriterion("BSC in", values, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscNotIn(List<String> values) {
            addCriterion("BSC not in", values, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscBetween(String value1, String value2) {
            addCriterion("BSC between", value1, value2, "bsc");
            return (Criteria) this;
        }

        public Criteria andBscNotBetween(String value1, String value2) {
            addCriterion("BSC not between", value1, value2, "bsc");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumIsNull() {
            addCriterion("CDMA_BASE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumIsNotNull() {
            addCriterion("CDMA_BASE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumEqualTo(String value) {
            addCriterion("CDMA_BASE_NUM =", value, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumNotEqualTo(String value) {
            addCriterion("CDMA_BASE_NUM <>", value, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumGreaterThan(String value) {
            addCriterion("CDMA_BASE_NUM >", value, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumGreaterThanOrEqualTo(String value) {
            addCriterion("CDMA_BASE_NUM >=", value, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumLessThan(String value) {
            addCriterion("CDMA_BASE_NUM <", value, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumLessThanOrEqualTo(String value) {
            addCriterion("CDMA_BASE_NUM <=", value, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumLike(String value) {
            addCriterion("CDMA_BASE_NUM like", value, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumNotLike(String value) {
            addCriterion("CDMA_BASE_NUM not like", value, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumIn(List<String> values) {
            addCriterion("CDMA_BASE_NUM in", values, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumNotIn(List<String> values) {
            addCriterion("CDMA_BASE_NUM not in", values, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumBetween(String value1, String value2) {
            addCriterion("CDMA_BASE_NUM between", value1, value2, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNumNotBetween(String value1, String value2) {
            addCriterion("CDMA_BASE_NUM not between", value1, value2, "cdmaBaseNum");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameIsNull() {
            addCriterion("CDMA_BASE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameIsNotNull() {
            addCriterion("CDMA_BASE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameEqualTo(String value) {
            addCriterion("CDMA_BASE_NAME =", value, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameNotEqualTo(String value) {
            addCriterion("CDMA_BASE_NAME <>", value, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameGreaterThan(String value) {
            addCriterion("CDMA_BASE_NAME >", value, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("CDMA_BASE_NAME >=", value, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameLessThan(String value) {
            addCriterion("CDMA_BASE_NAME <", value, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameLessThanOrEqualTo(String value) {
            addCriterion("CDMA_BASE_NAME <=", value, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameLike(String value) {
            addCriterion("CDMA_BASE_NAME like", value, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameNotLike(String value) {
            addCriterion("CDMA_BASE_NAME not like", value, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameIn(List<String> values) {
            addCriterion("CDMA_BASE_NAME in", values, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameNotIn(List<String> values) {
            addCriterion("CDMA_BASE_NAME not in", values, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameBetween(String value1, String value2) {
            addCriterion("CDMA_BASE_NAME between", value1, value2, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaBaseNameNotBetween(String value1, String value2) {
            addCriterion("CDMA_BASE_NAME not between", value1, value2, "cdmaBaseName");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionIsNull() {
            addCriterion("CDMA_SECTION is null");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionIsNotNull() {
            addCriterion("CDMA_SECTION is not null");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionEqualTo(String value) {
            addCriterion("CDMA_SECTION =", value, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionNotEqualTo(String value) {
            addCriterion("CDMA_SECTION <>", value, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionGreaterThan(String value) {
            addCriterion("CDMA_SECTION >", value, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionGreaterThanOrEqualTo(String value) {
            addCriterion("CDMA_SECTION >=", value, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionLessThan(String value) {
            addCriterion("CDMA_SECTION <", value, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionLessThanOrEqualTo(String value) {
            addCriterion("CDMA_SECTION <=", value, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionLike(String value) {
            addCriterion("CDMA_SECTION like", value, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionNotLike(String value) {
            addCriterion("CDMA_SECTION not like", value, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionIn(List<String> values) {
            addCriterion("CDMA_SECTION in", values, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionNotIn(List<String> values) {
            addCriterion("CDMA_SECTION not in", values, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionBetween(String value1, String value2) {
            addCriterion("CDMA_SECTION between", value1, value2, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andCdmaSectionNotBetween(String value1, String value2) {
            addCriterion("CDMA_SECTION not between", value1, value2, "cdmaSection");
            return (Criteria) this;
        }

        public Criteria andSidcIsNull() {
            addCriterion("SIDC is null");
            return (Criteria) this;
        }

        public Criteria andSidcIsNotNull() {
            addCriterion("SIDC is not null");
            return (Criteria) this;
        }

        public Criteria andSidcEqualTo(String value) {
            addCriterion("SIDC =", value, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcNotEqualTo(String value) {
            addCriterion("SIDC <>", value, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcGreaterThan(String value) {
            addCriterion("SIDC >", value, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcGreaterThanOrEqualTo(String value) {
            addCriterion("SIDC >=", value, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcLessThan(String value) {
            addCriterion("SIDC <", value, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcLessThanOrEqualTo(String value) {
            addCriterion("SIDC <=", value, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcLike(String value) {
            addCriterion("SIDC like", value, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcNotLike(String value) {
            addCriterion("SIDC not like", value, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcIn(List<String> values) {
            addCriterion("SIDC in", values, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcNotIn(List<String> values) {
            addCriterion("SIDC not in", values, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcBetween(String value1, String value2) {
            addCriterion("SIDC between", value1, value2, "sidc");
            return (Criteria) this;
        }

        public Criteria andSidcNotBetween(String value1, String value2) {
            addCriterion("SIDC not between", value1, value2, "sidc");
            return (Criteria) this;
        }

        public Criteria andNidIsNull() {
            addCriterion("NID is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("NID is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(String value) {
            addCriterion("NID =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(String value) {
            addCriterion("NID <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(String value) {
            addCriterion("NID >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(String value) {
            addCriterion("NID >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(String value) {
            addCriterion("NID <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(String value) {
            addCriterion("NID <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLike(String value) {
            addCriterion("NID like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotLike(String value) {
            addCriterion("NID not like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<String> values) {
            addCriterion("NID in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<String> values) {
            addCriterion("NID not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(String value1, String value2) {
            addCriterion("NID between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(String value1, String value2) {
            addCriterion("NID not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("CID like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("CID not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andThreeGrxIsNull() {
            addCriterion("THREE_GRX is null");
            return (Criteria) this;
        }

        public Criteria andThreeGrxIsNotNull() {
            addCriterion("THREE_GRX is not null");
            return (Criteria) this;
        }

        public Criteria andThreeGrxEqualTo(BigDecimal value) {
            addCriterion("THREE_GRX =", value, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGrxNotEqualTo(BigDecimal value) {
            addCriterion("THREE_GRX <>", value, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGrxGreaterThan(BigDecimal value) {
            addCriterion("THREE_GRX >", value, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGrxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THREE_GRX >=", value, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGrxLessThan(BigDecimal value) {
            addCriterion("THREE_GRX <", value, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGrxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THREE_GRX <=", value, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGrxIn(List<BigDecimal> values) {
            addCriterion("THREE_GRX in", values, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGrxNotIn(List<BigDecimal> values) {
            addCriterion("THREE_GRX not in", values, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGrxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THREE_GRX between", value1, value2, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGrxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THREE_GRX not between", value1, value2, "threeGrx");
            return (Criteria) this;
        }

        public Criteria andThreeGecioIsNull() {
            addCriterion("THREE_GECIO is null");
            return (Criteria) this;
        }

        public Criteria andThreeGecioIsNotNull() {
            addCriterion("THREE_GECIO is not null");
            return (Criteria) this;
        }

        public Criteria andThreeGecioEqualTo(BigDecimal value) {
            addCriterion("THREE_GECIO =", value, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGecioNotEqualTo(BigDecimal value) {
            addCriterion("THREE_GECIO <>", value, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGecioGreaterThan(BigDecimal value) {
            addCriterion("THREE_GECIO >", value, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGecioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THREE_GECIO >=", value, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGecioLessThan(BigDecimal value) {
            addCriterion("THREE_GECIO <", value, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGecioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THREE_GECIO <=", value, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGecioIn(List<BigDecimal> values) {
            addCriterion("THREE_GECIO in", values, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGecioNotIn(List<BigDecimal> values) {
            addCriterion("THREE_GECIO not in", values, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGecioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THREE_GECIO between", value1, value2, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGecioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THREE_GECIO not between", value1, value2, "threeGecio");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrIsNull() {
            addCriterion("THREE_GSNR is null");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrIsNotNull() {
            addCriterion("THREE_GSNR is not null");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrEqualTo(BigDecimal value) {
            addCriterion("THREE_GSNR =", value, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrNotEqualTo(BigDecimal value) {
            addCriterion("THREE_GSNR <>", value, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrGreaterThan(BigDecimal value) {
            addCriterion("THREE_GSNR >", value, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THREE_GSNR >=", value, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrLessThan(BigDecimal value) {
            addCriterion("THREE_GSNR <", value, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THREE_GSNR <=", value, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrIn(List<BigDecimal> values) {
            addCriterion("THREE_GSNR in", values, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrNotIn(List<BigDecimal> values) {
            addCriterion("THREE_GSNR not in", values, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THREE_GSNR between", value1, value2, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andThreeGsnrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THREE_GSNR not between", value1, value2, "threeGsnr");
            return (Criteria) this;
        }

        public Criteria andTwoGrxIsNull() {
            addCriterion("TWO_GRX is null");
            return (Criteria) this;
        }

        public Criteria andTwoGrxIsNotNull() {
            addCriterion("TWO_GRX is not null");
            return (Criteria) this;
        }

        public Criteria andTwoGrxEqualTo(BigDecimal value) {
            addCriterion("TWO_GRX =", value, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGrxNotEqualTo(BigDecimal value) {
            addCriterion("TWO_GRX <>", value, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGrxGreaterThan(BigDecimal value) {
            addCriterion("TWO_GRX >", value, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGrxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TWO_GRX >=", value, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGrxLessThan(BigDecimal value) {
            addCriterion("TWO_GRX <", value, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGrxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TWO_GRX <=", value, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGrxIn(List<BigDecimal> values) {
            addCriterion("TWO_GRX in", values, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGrxNotIn(List<BigDecimal> values) {
            addCriterion("TWO_GRX not in", values, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGrxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TWO_GRX between", value1, value2, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGrxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TWO_GRX not between", value1, value2, "twoGrx");
            return (Criteria) this;
        }

        public Criteria andTwoGecioIsNull() {
            addCriterion("TWO_GECIO is null");
            return (Criteria) this;
        }

        public Criteria andTwoGecioIsNotNull() {
            addCriterion("TWO_GECIO is not null");
            return (Criteria) this;
        }

        public Criteria andTwoGecioEqualTo(BigDecimal value) {
            addCriterion("TWO_GECIO =", value, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andTwoGecioNotEqualTo(BigDecimal value) {
            addCriterion("TWO_GECIO <>", value, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andTwoGecioGreaterThan(BigDecimal value) {
            addCriterion("TWO_GECIO >", value, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andTwoGecioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TWO_GECIO >=", value, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andTwoGecioLessThan(BigDecimal value) {
            addCriterion("TWO_GECIO <", value, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andTwoGecioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TWO_GECIO <=", value, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andTwoGecioIn(List<BigDecimal> values) {
            addCriterion("TWO_GECIO in", values, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andTwoGecioNotIn(List<BigDecimal> values) {
            addCriterion("TWO_GECIO not in", values, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andTwoGecioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TWO_GECIO between", value1, value2, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andTwoGecioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TWO_GECIO not between", value1, value2, "twoGecio");
            return (Criteria) this;
        }

        public Criteria andGsmcellidIsNull() {
            addCriterion("GSMCELLID is null");
            return (Criteria) this;
        }

        public Criteria andGsmcellidIsNotNull() {
            addCriterion("GSMCELLID is not null");
            return (Criteria) this;
        }

        public Criteria andGsmcellidEqualTo(String value) {
            addCriterion("GSMCELLID =", value, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidNotEqualTo(String value) {
            addCriterion("GSMCELLID <>", value, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidGreaterThan(String value) {
            addCriterion("GSMCELLID >", value, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidGreaterThanOrEqualTo(String value) {
            addCriterion("GSMCELLID >=", value, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidLessThan(String value) {
            addCriterion("GSMCELLID <", value, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidLessThanOrEqualTo(String value) {
            addCriterion("GSMCELLID <=", value, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidLike(String value) {
            addCriterion("GSMCELLID like", value, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidNotLike(String value) {
            addCriterion("GSMCELLID not like", value, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidIn(List<String> values) {
            addCriterion("GSMCELLID in", values, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidNotIn(List<String> values) {
            addCriterion("GSMCELLID not in", values, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidBetween(String value1, String value2) {
            addCriterion("GSMCELLID between", value1, value2, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmcellidNotBetween(String value1, String value2) {
            addCriterion("GSMCELLID not between", value1, value2, "gsmcellid");
            return (Criteria) this;
        }

        public Criteria andGsmlacIsNull() {
            addCriterion("GSMLAC is null");
            return (Criteria) this;
        }

        public Criteria andGsmlacIsNotNull() {
            addCriterion("GSMLAC is not null");
            return (Criteria) this;
        }

        public Criteria andGsmlacEqualTo(String value) {
            addCriterion("GSMLAC =", value, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacNotEqualTo(String value) {
            addCriterion("GSMLAC <>", value, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacGreaterThan(String value) {
            addCriterion("GSMLAC >", value, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacGreaterThanOrEqualTo(String value) {
            addCriterion("GSMLAC >=", value, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacLessThan(String value) {
            addCriterion("GSMLAC <", value, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacLessThanOrEqualTo(String value) {
            addCriterion("GSMLAC <=", value, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacLike(String value) {
            addCriterion("GSMLAC like", value, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacNotLike(String value) {
            addCriterion("GSMLAC not like", value, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacIn(List<String> values) {
            addCriterion("GSMLAC in", values, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacNotIn(List<String> values) {
            addCriterion("GSMLAC not in", values, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacBetween(String value1, String value2) {
            addCriterion("GSMLAC between", value1, value2, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmlacNotBetween(String value1, String value2) {
            addCriterion("GSMLAC not between", value1, value2, "gsmlac");
            return (Criteria) this;
        }

        public Criteria andGsmrxIsNull() {
            addCriterion("GSMRX is null");
            return (Criteria) this;
        }

        public Criteria andGsmrxIsNotNull() {
            addCriterion("GSMRX is not null");
            return (Criteria) this;
        }

        public Criteria andGsmrxEqualTo(String value) {
            addCriterion("GSMRX =", value, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxNotEqualTo(String value) {
            addCriterion("GSMRX <>", value, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxGreaterThan(String value) {
            addCriterion("GSMRX >", value, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxGreaterThanOrEqualTo(String value) {
            addCriterion("GSMRX >=", value, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxLessThan(String value) {
            addCriterion("GSMRX <", value, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxLessThanOrEqualTo(String value) {
            addCriterion("GSMRX <=", value, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxLike(String value) {
            addCriterion("GSMRX like", value, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxNotLike(String value) {
            addCriterion("GSMRX not like", value, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxIn(List<String> values) {
            addCriterion("GSMRX in", values, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxNotIn(List<String> values) {
            addCriterion("GSMRX not in", values, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxBetween(String value1, String value2) {
            addCriterion("GSMRX between", value1, value2, "gsmrx");
            return (Criteria) this;
        }

        public Criteria andGsmrxNotBetween(String value1, String value2) {
            addCriterion("GSMRX not between", value1, value2, "gsmrx");
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