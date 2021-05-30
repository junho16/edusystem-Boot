package com.edusystem.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class KctjSimilarityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KctjSimilarityExample() {
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

        public Criteria andStuedntIdIsNull() {
            addCriterion("stuednt_id is null");
            return (Criteria) this;
        }

        public Criteria andStuedntIdIsNotNull() {
            addCriterion("stuednt_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuedntIdEqualTo(String value) {
            addCriterion("stuednt_id =", value, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdNotEqualTo(String value) {
            addCriterion("stuednt_id <>", value, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdGreaterThan(String value) {
            addCriterion("stuednt_id >", value, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdGreaterThanOrEqualTo(String value) {
            addCriterion("stuednt_id >=", value, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdLessThan(String value) {
            addCriterion("stuednt_id <", value, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdLessThanOrEqualTo(String value) {
            addCriterion("stuednt_id <=", value, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdLike(String value) {
            addCriterion("stuednt_id like", value, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdNotLike(String value) {
            addCriterion("stuednt_id not like", value, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdIn(List<String> values) {
            addCriterion("stuednt_id in", values, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdNotIn(List<String> values) {
            addCriterion("stuednt_id not in", values, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdBetween(String value1, String value2) {
            addCriterion("stuednt_id between", value1, value2, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStuedntIdNotBetween(String value1, String value2) {
            addCriterion("stuednt_id not between", value1, value2, "stuedntId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdIsNull() {
            addCriterion("student_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdIsNotNull() {
            addCriterion("student_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdEqualTo(String value) {
            addCriterion("student_ref_id =", value, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdNotEqualTo(String value) {
            addCriterion("student_ref_id <>", value, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdGreaterThan(String value) {
            addCriterion("student_ref_id >", value, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_ref_id >=", value, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdLessThan(String value) {
            addCriterion("student_ref_id <", value, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdLessThanOrEqualTo(String value) {
            addCriterion("student_ref_id <=", value, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdLike(String value) {
            addCriterion("student_ref_id like", value, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdNotLike(String value) {
            addCriterion("student_ref_id not like", value, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdIn(List<String> values) {
            addCriterion("student_ref_id in", values, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdNotIn(List<String> values) {
            addCriterion("student_ref_id not in", values, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdBetween(String value1, String value2) {
            addCriterion("student_ref_id between", value1, value2, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andStudentRefIdNotBetween(String value1, String value2) {
            addCriterion("student_ref_id not between", value1, value2, "studentRefId");
            return (Criteria) this;
        }

        public Criteria andSimilarityIsNull() {
            addCriterion("similarity is null");
            return (Criteria) this;
        }

        public Criteria andSimilarityIsNotNull() {
            addCriterion("similarity is not null");
            return (Criteria) this;
        }

        public Criteria andSimilarityEqualTo(BigDecimal value) {
            addCriterion("similarity =", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityNotEqualTo(BigDecimal value) {
            addCriterion("similarity <>", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityGreaterThan(BigDecimal value) {
            addCriterion("similarity >", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("similarity >=", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityLessThan(BigDecimal value) {
            addCriterion("similarity <", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("similarity <=", value, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityIn(List<BigDecimal> values) {
            addCriterion("similarity in", values, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityNotIn(List<BigDecimal> values) {
            addCriterion("similarity not in", values, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("similarity between", value1, value2, "similarity");
            return (Criteria) this;
        }

        public Criteria andSimilarityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("similarity not between", value1, value2, "similarity");
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