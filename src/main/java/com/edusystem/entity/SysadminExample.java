package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class SysadminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysadminExample() {
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

        public Criteria andSysadminIdIsNull() {
            addCriterion("sysadmin_id is null");
            return (Criteria) this;
        }

        public Criteria andSysadminIdIsNotNull() {
            addCriterion("sysadmin_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysadminIdEqualTo(String value) {
            addCriterion("sysadmin_id =", value, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdNotEqualTo(String value) {
            addCriterion("sysadmin_id <>", value, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdGreaterThan(String value) {
            addCriterion("sysadmin_id >", value, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdGreaterThanOrEqualTo(String value) {
            addCriterion("sysadmin_id >=", value, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdLessThan(String value) {
            addCriterion("sysadmin_id <", value, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdLessThanOrEqualTo(String value) {
            addCriterion("sysadmin_id <=", value, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdLike(String value) {
            addCriterion("sysadmin_id like", value, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdNotLike(String value) {
            addCriterion("sysadmin_id not like", value, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdIn(List<String> values) {
            addCriterion("sysadmin_id in", values, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdNotIn(List<String> values) {
            addCriterion("sysadmin_id not in", values, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdBetween(String value1, String value2) {
            addCriterion("sysadmin_id between", value1, value2, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminIdNotBetween(String value1, String value2) {
            addCriterion("sysadmin_id not between", value1, value2, "sysadminId");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdIsNull() {
            addCriterion("sysadmin_psd is null");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdIsNotNull() {
            addCriterion("sysadmin_psd is not null");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdEqualTo(String value) {
            addCriterion("sysadmin_psd =", value, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdNotEqualTo(String value) {
            addCriterion("sysadmin_psd <>", value, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdGreaterThan(String value) {
            addCriterion("sysadmin_psd >", value, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdGreaterThanOrEqualTo(String value) {
            addCriterion("sysadmin_psd >=", value, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdLessThan(String value) {
            addCriterion("sysadmin_psd <", value, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdLessThanOrEqualTo(String value) {
            addCriterion("sysadmin_psd <=", value, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdLike(String value) {
            addCriterion("sysadmin_psd like", value, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdNotLike(String value) {
            addCriterion("sysadmin_psd not like", value, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdIn(List<String> values) {
            addCriterion("sysadmin_psd in", values, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdNotIn(List<String> values) {
            addCriterion("sysadmin_psd not in", values, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdBetween(String value1, String value2) {
            addCriterion("sysadmin_psd between", value1, value2, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andSysadminPsdNotBetween(String value1, String value2) {
            addCriterion("sysadmin_psd not between", value1, value2, "sysadminPsd");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(String value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(String value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(String value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(String value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(String value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(String value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLike(String value) {
            addCriterion("college_id like", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotLike(String value) {
            addCriterion("college_id not like", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<String> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<String> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(String value1, String value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(String value1, String value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
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