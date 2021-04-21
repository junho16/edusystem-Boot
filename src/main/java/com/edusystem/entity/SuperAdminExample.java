package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class SuperAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperAdminExample() {
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

        public Criteria andSuperadminIdIsNull() {
            addCriterion("superadmin_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdIsNotNull() {
            addCriterion("superadmin_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdEqualTo(String value) {
            addCriterion("superadmin_id =", value, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdNotEqualTo(String value) {
            addCriterion("superadmin_id <>", value, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdGreaterThan(String value) {
            addCriterion("superadmin_id >", value, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdGreaterThanOrEqualTo(String value) {
            addCriterion("superadmin_id >=", value, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdLessThan(String value) {
            addCriterion("superadmin_id <", value, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdLessThanOrEqualTo(String value) {
            addCriterion("superadmin_id <=", value, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdLike(String value) {
            addCriterion("superadmin_id like", value, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdNotLike(String value) {
            addCriterion("superadmin_id not like", value, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdIn(List<String> values) {
            addCriterion("superadmin_id in", values, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdNotIn(List<String> values) {
            addCriterion("superadmin_id not in", values, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdBetween(String value1, String value2) {
            addCriterion("superadmin_id between", value1, value2, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminIdNotBetween(String value1, String value2) {
            addCriterion("superadmin_id not between", value1, value2, "superadminId");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdIsNull() {
            addCriterion("superadmin_psd is null");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdIsNotNull() {
            addCriterion("superadmin_psd is not null");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdEqualTo(String value) {
            addCriterion("superadmin_psd =", value, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdNotEqualTo(String value) {
            addCriterion("superadmin_psd <>", value, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdGreaterThan(String value) {
            addCriterion("superadmin_psd >", value, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdGreaterThanOrEqualTo(String value) {
            addCriterion("superadmin_psd >=", value, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdLessThan(String value) {
            addCriterion("superadmin_psd <", value, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdLessThanOrEqualTo(String value) {
            addCriterion("superadmin_psd <=", value, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdLike(String value) {
            addCriterion("superadmin_psd like", value, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdNotLike(String value) {
            addCriterion("superadmin_psd not like", value, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdIn(List<String> values) {
            addCriterion("superadmin_psd in", values, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdNotIn(List<String> values) {
            addCriterion("superadmin_psd not in", values, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdBetween(String value1, String value2) {
            addCriterion("superadmin_psd between", value1, value2, "superadminPsd");
            return (Criteria) this;
        }

        public Criteria andSuperadminPsdNotBetween(String value1, String value2) {
            addCriterion("superadmin_psd not between", value1, value2, "superadminPsd");
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