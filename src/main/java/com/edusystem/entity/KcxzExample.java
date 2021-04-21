package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class KcxzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KcxzExample() {
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

        public Criteria andKcxzIdIsNull() {
            addCriterion("kcxz_id is null");
            return (Criteria) this;
        }

        public Criteria andKcxzIdIsNotNull() {
            addCriterion("kcxz_id is not null");
            return (Criteria) this;
        }

        public Criteria andKcxzIdEqualTo(String value) {
            addCriterion("kcxz_id =", value, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdNotEqualTo(String value) {
            addCriterion("kcxz_id <>", value, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdGreaterThan(String value) {
            addCriterion("kcxz_id >", value, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdGreaterThanOrEqualTo(String value) {
            addCriterion("kcxz_id >=", value, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdLessThan(String value) {
            addCriterion("kcxz_id <", value, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdLessThanOrEqualTo(String value) {
            addCriterion("kcxz_id <=", value, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdLike(String value) {
            addCriterion("kcxz_id like", value, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdNotLike(String value) {
            addCriterion("kcxz_id not like", value, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdIn(List<String> values) {
            addCriterion("kcxz_id in", values, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdNotIn(List<String> values) {
            addCriterion("kcxz_id not in", values, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdBetween(String value1, String value2) {
            addCriterion("kcxz_id between", value1, value2, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzIdNotBetween(String value1, String value2) {
            addCriterion("kcxz_id not between", value1, value2, "kcxzId");
            return (Criteria) this;
        }

        public Criteria andKcxzNameIsNull() {
            addCriterion("kcxz_name is null");
            return (Criteria) this;
        }

        public Criteria andKcxzNameIsNotNull() {
            addCriterion("kcxz_name is not null");
            return (Criteria) this;
        }

        public Criteria andKcxzNameEqualTo(String value) {
            addCriterion("kcxz_name =", value, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameNotEqualTo(String value) {
            addCriterion("kcxz_name <>", value, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameGreaterThan(String value) {
            addCriterion("kcxz_name >", value, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameGreaterThanOrEqualTo(String value) {
            addCriterion("kcxz_name >=", value, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameLessThan(String value) {
            addCriterion("kcxz_name <", value, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameLessThanOrEqualTo(String value) {
            addCriterion("kcxz_name <=", value, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameLike(String value) {
            addCriterion("kcxz_name like", value, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameNotLike(String value) {
            addCriterion("kcxz_name not like", value, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameIn(List<String> values) {
            addCriterion("kcxz_name in", values, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameNotIn(List<String> values) {
            addCriterion("kcxz_name not in", values, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameBetween(String value1, String value2) {
            addCriterion("kcxz_name between", value1, value2, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzNameNotBetween(String value1, String value2) {
            addCriterion("kcxz_name not between", value1, value2, "kcxzName");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkIsNull() {
            addCriterion("kcxz_remark is null");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkIsNotNull() {
            addCriterion("kcxz_remark is not null");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkEqualTo(String value) {
            addCriterion("kcxz_remark =", value, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkNotEqualTo(String value) {
            addCriterion("kcxz_remark <>", value, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkGreaterThan(String value) {
            addCriterion("kcxz_remark >", value, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("kcxz_remark >=", value, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkLessThan(String value) {
            addCriterion("kcxz_remark <", value, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkLessThanOrEqualTo(String value) {
            addCriterion("kcxz_remark <=", value, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkLike(String value) {
            addCriterion("kcxz_remark like", value, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkNotLike(String value) {
            addCriterion("kcxz_remark not like", value, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkIn(List<String> values) {
            addCriterion("kcxz_remark in", values, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkNotIn(List<String> values) {
            addCriterion("kcxz_remark not in", values, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkBetween(String value1, String value2) {
            addCriterion("kcxz_remark between", value1, value2, "kcxzRemark");
            return (Criteria) this;
        }

        public Criteria andKcxzRemarkNotBetween(String value1, String value2) {
            addCriterion("kcxz_remark not between", value1, value2, "kcxzRemark");
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