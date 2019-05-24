package org.buzheng.demo.esm.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TObdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TObdExample() {
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

        public Criteria andObdCodeIsNull() {
            addCriterion("OBD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andObdCodeIsNotNull() {
            addCriterion("OBD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andObdCodeEqualTo(String value) {
            addCriterion("OBD_CODE =", value, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeNotEqualTo(String value) {
            addCriterion("OBD_CODE <>", value, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeGreaterThan(String value) {
            addCriterion("OBD_CODE >", value, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OBD_CODE >=", value, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeLessThan(String value) {
            addCriterion("OBD_CODE <", value, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeLessThanOrEqualTo(String value) {
            addCriterion("OBD_CODE <=", value, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeLike(String value) {
            addCriterion("OBD_CODE like", value, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeNotLike(String value) {
            addCriterion("OBD_CODE not like", value, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeIn(List<String> values) {
            addCriterion("OBD_CODE in", values, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeNotIn(List<String> values) {
            addCriterion("OBD_CODE not in", values, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeBetween(String value1, String value2) {
            addCriterion("OBD_CODE between", value1, value2, "obdCode");
            return (Criteria) this;
        }

        public Criteria andObdCodeNotBetween(String value1, String value2) {
            addCriterion("OBD_CODE not between", value1, value2, "obdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeIsNull() {
            addCriterion("INDISTINCT_OBD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeIsNotNull() {
            addCriterion("INDISTINCT_OBD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeEqualTo(String value) {
            addCriterion("INDISTINCT_OBD_CODE =", value, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeNotEqualTo(String value) {
            addCriterion("INDISTINCT_OBD_CODE <>", value, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeGreaterThan(String value) {
            addCriterion("INDISTINCT_OBD_CODE >", value, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INDISTINCT_OBD_CODE >=", value, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeLessThan(String value) {
            addCriterion("INDISTINCT_OBD_CODE <", value, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeLessThanOrEqualTo(String value) {
            addCriterion("INDISTINCT_OBD_CODE <=", value, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeLike(String value) {
            addCriterion("INDISTINCT_OBD_CODE like", value, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeNotLike(String value) {
            addCriterion("INDISTINCT_OBD_CODE not like", value, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeIn(List<String> values) {
            addCriterion("INDISTINCT_OBD_CODE in", values, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeNotIn(List<String> values) {
            addCriterion("INDISTINCT_OBD_CODE not in", values, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeBetween(String value1, String value2) {
            addCriterion("INDISTINCT_OBD_CODE between", value1, value2, "indistinctObdCode");
            return (Criteria) this;
        }

        public Criteria andIndistinctObdCodeNotBetween(String value1, String value2) {
            addCriterion("INDISTINCT_OBD_CODE not between", value1, value2, "indistinctObdCode");
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

        public Criteria andGridUnitIsNull() {
            addCriterion("GRID_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andGridUnitIsNotNull() {
            addCriterion("GRID_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andGridUnitEqualTo(String value) {
            addCriterion("GRID_UNIT =", value, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitNotEqualTo(String value) {
            addCriterion("GRID_UNIT <>", value, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitGreaterThan(String value) {
            addCriterion("GRID_UNIT >", value, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_UNIT >=", value, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitLessThan(String value) {
            addCriterion("GRID_UNIT <", value, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitLessThanOrEqualTo(String value) {
            addCriterion("GRID_UNIT <=", value, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitLike(String value) {
            addCriterion("GRID_UNIT like", value, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitNotLike(String value) {
            addCriterion("GRID_UNIT not like", value, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitIn(List<String> values) {
            addCriterion("GRID_UNIT in", values, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitNotIn(List<String> values) {
            addCriterion("GRID_UNIT not in", values, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitBetween(String value1, String value2) {
            addCriterion("GRID_UNIT between", value1, value2, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andGridUnitNotBetween(String value1, String value2) {
            addCriterion("GRID_UNIT not between", value1, value2, "gridUnit");
            return (Criteria) this;
        }

        public Criteria andObdNameIsNull() {
            addCriterion("OBD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andObdNameIsNotNull() {
            addCriterion("OBD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andObdNameEqualTo(String value) {
            addCriterion("OBD_NAME =", value, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameNotEqualTo(String value) {
            addCriterion("OBD_NAME <>", value, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameGreaterThan(String value) {
            addCriterion("OBD_NAME >", value, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameGreaterThanOrEqualTo(String value) {
            addCriterion("OBD_NAME >=", value, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameLessThan(String value) {
            addCriterion("OBD_NAME <", value, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameLessThanOrEqualTo(String value) {
            addCriterion("OBD_NAME <=", value, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameLike(String value) {
            addCriterion("OBD_NAME like", value, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameNotLike(String value) {
            addCriterion("OBD_NAME not like", value, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameIn(List<String> values) {
            addCriterion("OBD_NAME in", values, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameNotIn(List<String> values) {
            addCriterion("OBD_NAME not in", values, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameBetween(String value1, String value2) {
            addCriterion("OBD_NAME between", value1, value2, "obdName");
            return (Criteria) this;
        }

        public Criteria andObdNameNotBetween(String value1, String value2) {
            addCriterion("OBD_NAME not between", value1, value2, "obdName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbIsNull() {
            addCriterion("BELONGS_OTB is null");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbIsNotNull() {
            addCriterion("BELONGS_OTB is not null");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbEqualTo(String value) {
            addCriterion("BELONGS_OTB =", value, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNotEqualTo(String value) {
            addCriterion("BELONGS_OTB <>", value, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbGreaterThan(String value) {
            addCriterion("BELONGS_OTB >", value, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGS_OTB >=", value, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbLessThan(String value) {
            addCriterion("BELONGS_OTB <", value, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbLessThanOrEqualTo(String value) {
            addCriterion("BELONGS_OTB <=", value, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbLike(String value) {
            addCriterion("BELONGS_OTB like", value, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNotLike(String value) {
            addCriterion("BELONGS_OTB not like", value, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbIn(List<String> values) {
            addCriterion("BELONGS_OTB in", values, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNotIn(List<String> values) {
            addCriterion("BELONGS_OTB not in", values, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbBetween(String value1, String value2) {
            addCriterion("BELONGS_OTB between", value1, value2, "belongsOtb");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNotBetween(String value1, String value2) {
            addCriterion("BELONGS_OTB not between", value1, value2, "belongsOtb");
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

        public Criteria andUpdateManIdIsNull() {
            addCriterion("UPDATE_MAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdIsNotNull() {
            addCriterion("UPDATE_MAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdEqualTo(String value) {
            addCriterion("UPDATE_MAN_ID =", value, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdNotEqualTo(String value) {
            addCriterion("UPDATE_MAN_ID <>", value, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdGreaterThan(String value) {
            addCriterion("UPDATE_MAN_ID >", value, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_MAN_ID >=", value, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdLessThan(String value) {
            addCriterion("UPDATE_MAN_ID <", value, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_MAN_ID <=", value, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdLike(String value) {
            addCriterion("UPDATE_MAN_ID like", value, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdNotLike(String value) {
            addCriterion("UPDATE_MAN_ID not like", value, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdIn(List<String> values) {
            addCriterion("UPDATE_MAN_ID in", values, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdNotIn(List<String> values) {
            addCriterion("UPDATE_MAN_ID not in", values, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdBetween(String value1, String value2) {
            addCriterion("UPDATE_MAN_ID between", value1, value2, "updateManId");
            return (Criteria) this;
        }

        public Criteria andUpdateManIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_MAN_ID not between", value1, value2, "updateManId");
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

        public Criteria andProjectCodeIsNull() {
            addCriterion("PROJECT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("PROJECT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("PROJECT_CODE =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("PROJECT_CODE <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("PROJECT_CODE >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_CODE >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("PROJECT_CODE <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_CODE <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("PROJECT_CODE like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("PROJECT_CODE not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("PROJECT_CODE in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("PROJECT_CODE not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("PROJECT_CODE between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("PROJECT_CODE not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("PROJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("PROJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("PROJECT_NAME =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("PROJECT_NAME <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("PROJECT_NAME >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("PROJECT_NAME <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("PROJECT_NAME like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("PROJECT_NAME not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("PROJECT_NAME in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("PROJECT_NAME not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME not between", value1, value2, "projectName");
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

        public Criteria andMarketingServiceCenterIsNull() {
            addCriterion("MARKETING_SERVICE_CENTER is null");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterIsNotNull() {
            addCriterion("MARKETING_SERVICE_CENTER is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterEqualTo(String value) {
            addCriterion("MARKETING_SERVICE_CENTER =", value, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterNotEqualTo(String value) {
            addCriterion("MARKETING_SERVICE_CENTER <>", value, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterGreaterThan(String value) {
            addCriterion("MARKETING_SERVICE_CENTER >", value, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterGreaterThanOrEqualTo(String value) {
            addCriterion("MARKETING_SERVICE_CENTER >=", value, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterLessThan(String value) {
            addCriterion("MARKETING_SERVICE_CENTER <", value, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterLessThanOrEqualTo(String value) {
            addCriterion("MARKETING_SERVICE_CENTER <=", value, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterLike(String value) {
            addCriterion("MARKETING_SERVICE_CENTER like", value, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterNotLike(String value) {
            addCriterion("MARKETING_SERVICE_CENTER not like", value, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterIn(List<String> values) {
            addCriterion("MARKETING_SERVICE_CENTER in", values, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterNotIn(List<String> values) {
            addCriterion("MARKETING_SERVICE_CENTER not in", values, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterBetween(String value1, String value2) {
            addCriterion("MARKETING_SERVICE_CENTER between", value1, value2, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andMarketingServiceCenterNotBetween(String value1, String value2) {
            addCriterion("MARKETING_SERVICE_CENTER not between", value1, value2, "marketingServiceCenter");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameIsNull() {
            addCriterion("BELONGS_OTB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameIsNotNull() {
            addCriterion("BELONGS_OTB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameEqualTo(String value) {
            addCriterion("BELONGS_OTB_NAME =", value, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameNotEqualTo(String value) {
            addCriterion("BELONGS_OTB_NAME <>", value, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameGreaterThan(String value) {
            addCriterion("BELONGS_OTB_NAME >", value, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGS_OTB_NAME >=", value, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameLessThan(String value) {
            addCriterion("BELONGS_OTB_NAME <", value, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameLessThanOrEqualTo(String value) {
            addCriterion("BELONGS_OTB_NAME <=", value, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameLike(String value) {
            addCriterion("BELONGS_OTB_NAME like", value, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameNotLike(String value) {
            addCriterion("BELONGS_OTB_NAME not like", value, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameIn(List<String> values) {
            addCriterion("BELONGS_OTB_NAME in", values, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameNotIn(List<String> values) {
            addCriterion("BELONGS_OTB_NAME not in", values, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameBetween(String value1, String value2) {
            addCriterion("BELONGS_OTB_NAME between", value1, value2, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsOtbNameNotBetween(String value1, String value2) {
            addCriterion("BELONGS_OTB_NAME not between", value1, value2, "belongsOtbName");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaIsNull() {
            addCriterion("BELONGS_AREA is null");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaIsNotNull() {
            addCriterion("BELONGS_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaEqualTo(String value) {
            addCriterion("BELONGS_AREA =", value, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaNotEqualTo(String value) {
            addCriterion("BELONGS_AREA <>", value, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaGreaterThan(String value) {
            addCriterion("BELONGS_AREA >", value, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGS_AREA >=", value, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaLessThan(String value) {
            addCriterion("BELONGS_AREA <", value, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaLessThanOrEqualTo(String value) {
            addCriterion("BELONGS_AREA <=", value, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaLike(String value) {
            addCriterion("BELONGS_AREA like", value, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaNotLike(String value) {
            addCriterion("BELONGS_AREA not like", value, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaIn(List<String> values) {
            addCriterion("BELONGS_AREA in", values, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaNotIn(List<String> values) {
            addCriterion("BELONGS_AREA not in", values, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaBetween(String value1, String value2) {
            addCriterion("BELONGS_AREA between", value1, value2, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andBelongsAreaNotBetween(String value1, String value2) {
            addCriterion("BELONGS_AREA not between", value1, value2, "belongsArea");
            return (Criteria) this;
        }

        public Criteria andTheSiteIsNull() {
            addCriterion("THE_SITE is null");
            return (Criteria) this;
        }

        public Criteria andTheSiteIsNotNull() {
            addCriterion("THE_SITE is not null");
            return (Criteria) this;
        }

        public Criteria andTheSiteEqualTo(String value) {
            addCriterion("THE_SITE =", value, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteNotEqualTo(String value) {
            addCriterion("THE_SITE <>", value, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteGreaterThan(String value) {
            addCriterion("THE_SITE >", value, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteGreaterThanOrEqualTo(String value) {
            addCriterion("THE_SITE >=", value, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteLessThan(String value) {
            addCriterion("THE_SITE <", value, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteLessThanOrEqualTo(String value) {
            addCriterion("THE_SITE <=", value, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteLike(String value) {
            addCriterion("THE_SITE like", value, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteNotLike(String value) {
            addCriterion("THE_SITE not like", value, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteIn(List<String> values) {
            addCriterion("THE_SITE in", values, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteNotIn(List<String> values) {
            addCriterion("THE_SITE not in", values, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteBetween(String value1, String value2) {
            addCriterion("THE_SITE between", value1, value2, "theSite");
            return (Criteria) this;
        }

        public Criteria andTheSiteNotBetween(String value1, String value2) {
            addCriterion("THE_SITE not between", value1, value2, "theSite");
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