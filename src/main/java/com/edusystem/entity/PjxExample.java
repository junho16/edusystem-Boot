package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class PjxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PjxExample() {
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

        public Criteria andPjxIdIsNull() {
            addCriterion("pjx_id is null");
            return (Criteria) this;
        }

        public Criteria andPjxIdIsNotNull() {
            addCriterion("pjx_id is not null");
            return (Criteria) this;
        }

        public Criteria andPjxIdEqualTo(String value) {
            addCriterion("pjx_id =", value, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdNotEqualTo(String value) {
            addCriterion("pjx_id <>", value, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdGreaterThan(String value) {
            addCriterion("pjx_id >", value, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdGreaterThanOrEqualTo(String value) {
            addCriterion("pjx_id >=", value, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdLessThan(String value) {
            addCriterion("pjx_id <", value, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdLessThanOrEqualTo(String value) {
            addCriterion("pjx_id <=", value, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdLike(String value) {
            addCriterion("pjx_id like", value, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdNotLike(String value) {
            addCriterion("pjx_id not like", value, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdIn(List<String> values) {
            addCriterion("pjx_id in", values, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdNotIn(List<String> values) {
            addCriterion("pjx_id not in", values, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdBetween(String value1, String value2) {
            addCriterion("pjx_id between", value1, value2, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxIdNotBetween(String value1, String value2) {
            addCriterion("pjx_id not between", value1, value2, "pjxId");
            return (Criteria) this;
        }

        public Criteria andPjxNameIsNull() {
            addCriterion("pjx_name is null");
            return (Criteria) this;
        }

        public Criteria andPjxNameIsNotNull() {
            addCriterion("pjx_name is not null");
            return (Criteria) this;
        }

        public Criteria andPjxNameEqualTo(String value) {
            addCriterion("pjx_name =", value, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameNotEqualTo(String value) {
            addCriterion("pjx_name <>", value, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameGreaterThan(String value) {
            addCriterion("pjx_name >", value, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameGreaterThanOrEqualTo(String value) {
            addCriterion("pjx_name >=", value, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameLessThan(String value) {
            addCriterion("pjx_name <", value, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameLessThanOrEqualTo(String value) {
            addCriterion("pjx_name <=", value, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameLike(String value) {
            addCriterion("pjx_name like", value, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameNotLike(String value) {
            addCriterion("pjx_name not like", value, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameIn(List<String> values) {
            addCriterion("pjx_name in", values, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameNotIn(List<String> values) {
            addCriterion("pjx_name not in", values, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameBetween(String value1, String value2) {
            addCriterion("pjx_name between", value1, value2, "pjxName");
            return (Criteria) this;
        }

        public Criteria andPjxNameNotBetween(String value1, String value2) {
            addCriterion("pjx_name not between", value1, value2, "pjxName");
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