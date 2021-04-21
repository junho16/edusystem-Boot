package com.edusystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KqinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KqinfoExample() {
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

        public Criteria andKqinfoIdIsNull() {
            addCriterion("kqinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdIsNotNull() {
            addCriterion("kqinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdEqualTo(String value) {
            addCriterion("kqinfo_id =", value, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdNotEqualTo(String value) {
            addCriterion("kqinfo_id <>", value, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdGreaterThan(String value) {
            addCriterion("kqinfo_id >", value, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("kqinfo_id >=", value, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdLessThan(String value) {
            addCriterion("kqinfo_id <", value, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdLessThanOrEqualTo(String value) {
            addCriterion("kqinfo_id <=", value, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdLike(String value) {
            addCriterion("kqinfo_id like", value, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdNotLike(String value) {
            addCriterion("kqinfo_id not like", value, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdIn(List<String> values) {
            addCriterion("kqinfo_id in", values, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdNotIn(List<String> values) {
            addCriterion("kqinfo_id not in", values, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdBetween(String value1, String value2) {
            addCriterion("kqinfo_id between", value1, value2, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqinfoIdNotBetween(String value1, String value2) {
            addCriterion("kqinfo_id not between", value1, value2, "kqinfoId");
            return (Criteria) this;
        }

        public Criteria andKqIdIsNull() {
            addCriterion("kq_id is null");
            return (Criteria) this;
        }

        public Criteria andKqIdIsNotNull() {
            addCriterion("kq_id is not null");
            return (Criteria) this;
        }

        public Criteria andKqIdEqualTo(String value) {
            addCriterion("kq_id =", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdNotEqualTo(String value) {
            addCriterion("kq_id <>", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdGreaterThan(String value) {
            addCriterion("kq_id >", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdGreaterThanOrEqualTo(String value) {
            addCriterion("kq_id >=", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdLessThan(String value) {
            addCriterion("kq_id <", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdLessThanOrEqualTo(String value) {
            addCriterion("kq_id <=", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdLike(String value) {
            addCriterion("kq_id like", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdNotLike(String value) {
            addCriterion("kq_id not like", value, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdIn(List<String> values) {
            addCriterion("kq_id in", values, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdNotIn(List<String> values) {
            addCriterion("kq_id not in", values, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdBetween(String value1, String value2) {
            addCriterion("kq_id between", value1, value2, "kqId");
            return (Criteria) this;
        }

        public Criteria andKqIdNotBetween(String value1, String value2) {
            addCriterion("kq_id not between", value1, value2, "kqId");
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

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("class_id like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("class_id not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andKqinfoResIsNull() {
            addCriterion("kqinfo_res is null");
            return (Criteria) this;
        }

        public Criteria andKqinfoResIsNotNull() {
            addCriterion("kqinfo_res is not null");
            return (Criteria) this;
        }

        public Criteria andKqinfoResEqualTo(Integer value) {
            addCriterion("kqinfo_res =", value, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoResNotEqualTo(Integer value) {
            addCriterion("kqinfo_res <>", value, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoResGreaterThan(Integer value) {
            addCriterion("kqinfo_res >", value, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoResGreaterThanOrEqualTo(Integer value) {
            addCriterion("kqinfo_res >=", value, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoResLessThan(Integer value) {
            addCriterion("kqinfo_res <", value, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoResLessThanOrEqualTo(Integer value) {
            addCriterion("kqinfo_res <=", value, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoResIn(List<Integer> values) {
            addCriterion("kqinfo_res in", values, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoResNotIn(List<Integer> values) {
            addCriterion("kqinfo_res not in", values, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoResBetween(Integer value1, Integer value2) {
            addCriterion("kqinfo_res between", value1, value2, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoResNotBetween(Integer value1, Integer value2) {
            addCriterion("kqinfo_res not between", value1, value2, "kqinfoRes");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeIsNull() {
            addCriterion("kqinfo_time is null");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeIsNotNull() {
            addCriterion("kqinfo_time is not null");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeEqualTo(Date value) {
            addCriterion("kqinfo_time =", value, "kqinfoTime");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeNotEqualTo(Date value) {
            addCriterion("kqinfo_time <>", value, "kqinfoTime");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeGreaterThan(Date value) {
            addCriterion("kqinfo_time >", value, "kqinfoTime");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("kqinfo_time >=", value, "kqinfoTime");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeLessThan(Date value) {
            addCriterion("kqinfo_time <", value, "kqinfoTime");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeLessThanOrEqualTo(Date value) {
            addCriterion("kqinfo_time <=", value, "kqinfoTime");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeIn(List<Date> values) {
            addCriterion("kqinfo_time in", values, "kqinfoTime");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeNotIn(List<Date> values) {
            addCriterion("kqinfo_time not in", values, "kqinfoTime");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeBetween(Date value1, Date value2) {
            addCriterion("kqinfo_time between", value1, value2, "kqinfoTime");
            return (Criteria) this;
        }

        public Criteria andKqinfoTimeNotBetween(Date value1, Date value2) {
            addCriterion("kqinfo_time not between", value1, value2, "kqinfoTime");
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
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