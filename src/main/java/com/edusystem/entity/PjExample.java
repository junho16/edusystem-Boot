package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class PjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PjExample() {
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

        public Criteria andPjIdIsNull() {
            addCriterion("pj_id is null");
            return (Criteria) this;
        }

        public Criteria andPjIdIsNotNull() {
            addCriterion("pj_id is not null");
            return (Criteria) this;
        }

        public Criteria andPjIdEqualTo(String value) {
            addCriterion("pj_id =", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotEqualTo(String value) {
            addCriterion("pj_id <>", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdGreaterThan(String value) {
            addCriterion("pj_id >", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdGreaterThanOrEqualTo(String value) {
            addCriterion("pj_id >=", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLessThan(String value) {
            addCriterion("pj_id <", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLessThanOrEqualTo(String value) {
            addCriterion("pj_id <=", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLike(String value) {
            addCriterion("pj_id like", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotLike(String value) {
            addCriterion("pj_id not like", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdIn(List<String> values) {
            addCriterion("pj_id in", values, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotIn(List<String> values) {
            addCriterion("pj_id not in", values, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdBetween(String value1, String value2) {
            addCriterion("pj_id between", value1, value2, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotBetween(String value1, String value2) {
            addCriterion("pj_id not between", value1, value2, "pjId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdIsNull() {
            addCriterion("teachtask_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdIsNotNull() {
            addCriterion("teachtask_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdEqualTo(String value) {
            addCriterion("teachtask_id =", value, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdNotEqualTo(String value) {
            addCriterion("teachtask_id <>", value, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdGreaterThan(String value) {
            addCriterion("teachtask_id >", value, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("teachtask_id >=", value, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdLessThan(String value) {
            addCriterion("teachtask_id <", value, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdLessThanOrEqualTo(String value) {
            addCriterion("teachtask_id <=", value, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdLike(String value) {
            addCriterion("teachtask_id like", value, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdNotLike(String value) {
            addCriterion("teachtask_id not like", value, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdIn(List<String> values) {
            addCriterion("teachtask_id in", values, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdNotIn(List<String> values) {
            addCriterion("teachtask_id not in", values, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdBetween(String value1, String value2) {
            addCriterion("teachtask_id between", value1, value2, "teachtaskId");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIdNotBetween(String value1, String value2) {
            addCriterion("teachtask_id not between", value1, value2, "teachtaskId");
            return (Criteria) this;
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

        public Criteria andPjResIsNull() {
            addCriterion("pj_res is null");
            return (Criteria) this;
        }

        public Criteria andPjResIsNotNull() {
            addCriterion("pj_res is not null");
            return (Criteria) this;
        }

        public Criteria andPjResEqualTo(Integer value) {
            addCriterion("pj_res =", value, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjResNotEqualTo(Integer value) {
            addCriterion("pj_res <>", value, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjResGreaterThan(Integer value) {
            addCriterion("pj_res >", value, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjResGreaterThanOrEqualTo(Integer value) {
            addCriterion("pj_res >=", value, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjResLessThan(Integer value) {
            addCriterion("pj_res <", value, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjResLessThanOrEqualTo(Integer value) {
            addCriterion("pj_res <=", value, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjResIn(List<Integer> values) {
            addCriterion("pj_res in", values, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjResNotIn(List<Integer> values) {
            addCriterion("pj_res not in", values, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjResBetween(Integer value1, Integer value2) {
            addCriterion("pj_res between", value1, value2, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjResNotBetween(Integer value1, Integer value2) {
            addCriterion("pj_res not between", value1, value2, "pjRes");
            return (Criteria) this;
        }

        public Criteria andPjRemarkIsNull() {
            addCriterion("pj_remark is null");
            return (Criteria) this;
        }

        public Criteria andPjRemarkIsNotNull() {
            addCriterion("pj_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPjRemarkEqualTo(String value) {
            addCriterion("pj_remark =", value, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkNotEqualTo(String value) {
            addCriterion("pj_remark <>", value, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkGreaterThan(String value) {
            addCriterion("pj_remark >", value, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pj_remark >=", value, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkLessThan(String value) {
            addCriterion("pj_remark <", value, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkLessThanOrEqualTo(String value) {
            addCriterion("pj_remark <=", value, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkLike(String value) {
            addCriterion("pj_remark like", value, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkNotLike(String value) {
            addCriterion("pj_remark not like", value, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkIn(List<String> values) {
            addCriterion("pj_remark in", values, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkNotIn(List<String> values) {
            addCriterion("pj_remark not in", values, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkBetween(String value1, String value2) {
            addCriterion("pj_remark between", value1, value2, "pjRemark");
            return (Criteria) this;
        }

        public Criteria andPjRemarkNotBetween(String value1, String value2) {
            addCriterion("pj_remark not between", value1, value2, "pjRemark");
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