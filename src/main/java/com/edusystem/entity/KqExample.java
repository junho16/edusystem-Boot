package com.edusystem.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KqExample() {
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

        public Criteria andKqTimeIsNull() {
            addCriterion("kq_time is null");
            return (Criteria) this;
        }

        public Criteria andKqTimeIsNotNull() {
            addCriterion("kq_time is not null");
            return (Criteria) this;
        }

        public Criteria andKqTimeEqualTo(Date value) {
            addCriterion("kq_time =", value, "kqTime");
            return (Criteria) this;
        }

        public Criteria andKqTimeNotEqualTo(Date value) {
            addCriterion("kq_time <>", value, "kqTime");
            return (Criteria) this;
        }

        public Criteria andKqTimeGreaterThan(Date value) {
            addCriterion("kq_time >", value, "kqTime");
            return (Criteria) this;
        }

        public Criteria andKqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("kq_time >=", value, "kqTime");
            return (Criteria) this;
        }

        public Criteria andKqTimeLessThan(Date value) {
            addCriterion("kq_time <", value, "kqTime");
            return (Criteria) this;
        }

        public Criteria andKqTimeLessThanOrEqualTo(Date value) {
            addCriterion("kq_time <=", value, "kqTime");
            return (Criteria) this;
        }

        public Criteria andKqTimeIn(List<Date> values) {
            addCriterion("kq_time in", values, "kqTime");
            return (Criteria) this;
        }

        public Criteria andKqTimeNotIn(List<Date> values) {
            addCriterion("kq_time not in", values, "kqTime");
            return (Criteria) this;
        }

        public Criteria andKqTimeBetween(Date value1, Date value2) {
            addCriterion("kq_time between", value1, value2, "kqTime");
            return (Criteria) this;
        }

        public Criteria andKqTimeNotBetween(Date value1, Date value2) {
            addCriterion("kq_time not between", value1, value2, "kqTime");
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

        public Criteria andKqClassnumIsNull() {
            addCriterion("kq_classNum is null");
            return (Criteria) this;
        }

        public Criteria andKqClassnumIsNotNull() {
            addCriterion("kq_classNum is not null");
            return (Criteria) this;
        }

        public Criteria andKqClassnumEqualTo(Integer value) {
            addCriterion("kq_classNum =", value, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqClassnumNotEqualTo(Integer value) {
            addCriterion("kq_classNum <>", value, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqClassnumGreaterThan(Integer value) {
            addCriterion("kq_classNum >", value, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqClassnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("kq_classNum >=", value, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqClassnumLessThan(Integer value) {
            addCriterion("kq_classNum <", value, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqClassnumLessThanOrEqualTo(Integer value) {
            addCriterion("kq_classNum <=", value, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqClassnumIn(List<Integer> values) {
            addCriterion("kq_classNum in", values, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqClassnumNotIn(List<Integer> values) {
            addCriterion("kq_classNum not in", values, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqClassnumBetween(Integer value1, Integer value2) {
            addCriterion("kq_classNum between", value1, value2, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqClassnumNotBetween(Integer value1, Integer value2) {
            addCriterion("kq_classNum not between", value1, value2, "kqClassnum");
            return (Criteria) this;
        }

        public Criteria andKqKindIsNull() {
            addCriterion("kq_kind is null");
            return (Criteria) this;
        }

        public Criteria andKqKindIsNotNull() {
            addCriterion("kq_kind is not null");
            return (Criteria) this;
        }

        public Criteria andKqKindEqualTo(Integer value) {
            addCriterion("kq_kind =", value, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqKindNotEqualTo(Integer value) {
            addCriterion("kq_kind <>", value, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqKindGreaterThan(Integer value) {
            addCriterion("kq_kind >", value, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("kq_kind >=", value, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqKindLessThan(Integer value) {
            addCriterion("kq_kind <", value, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqKindLessThanOrEqualTo(Integer value) {
            addCriterion("kq_kind <=", value, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqKindIn(List<Integer> values) {
            addCriterion("kq_kind in", values, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqKindNotIn(List<Integer> values) {
            addCriterion("kq_kind not in", values, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqKindBetween(Integer value1, Integer value2) {
            addCriterion("kq_kind between", value1, value2, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqKindNotBetween(Integer value1, Integer value2) {
            addCriterion("kq_kind not between", value1, value2, "kqKind");
            return (Criteria) this;
        }

        public Criteria andKqAddressIsNull() {
            addCriterion("kq_address is null");
            return (Criteria) this;
        }

        public Criteria andKqAddressIsNotNull() {
            addCriterion("kq_address is not null");
            return (Criteria) this;
        }

        public Criteria andKqAddressEqualTo(String value) {
            addCriterion("kq_address =", value, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressNotEqualTo(String value) {
            addCriterion("kq_address <>", value, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressGreaterThan(String value) {
            addCriterion("kq_address >", value, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressGreaterThanOrEqualTo(String value) {
            addCriterion("kq_address >=", value, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressLessThan(String value) {
            addCriterion("kq_address <", value, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressLessThanOrEqualTo(String value) {
            addCriterion("kq_address <=", value, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressLike(String value) {
            addCriterion("kq_address like", value, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressNotLike(String value) {
            addCriterion("kq_address not like", value, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressIn(List<String> values) {
            addCriterion("kq_address in", values, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressNotIn(List<String> values) {
            addCriterion("kq_address not in", values, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressBetween(String value1, String value2) {
            addCriterion("kq_address between", value1, value2, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqAddressNotBetween(String value1, String value2) {
            addCriterion("kq_address not between", value1, value2, "kqAddress");
            return (Criteria) this;
        }

        public Criteria andKqFwIsNull() {
            addCriterion("kq_fw is null");
            return (Criteria) this;
        }

        public Criteria andKqFwIsNotNull() {
            addCriterion("kq_fw is not null");
            return (Criteria) this;
        }

        public Criteria andKqFwEqualTo(Integer value) {
            addCriterion("kq_fw =", value, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqFwNotEqualTo(Integer value) {
            addCriterion("kq_fw <>", value, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqFwGreaterThan(Integer value) {
            addCriterion("kq_fw >", value, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqFwGreaterThanOrEqualTo(Integer value) {
            addCriterion("kq_fw >=", value, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqFwLessThan(Integer value) {
            addCriterion("kq_fw <", value, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqFwLessThanOrEqualTo(Integer value) {
            addCriterion("kq_fw <=", value, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqFwIn(List<Integer> values) {
            addCriterion("kq_fw in", values, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqFwNotIn(List<Integer> values) {
            addCriterion("kq_fw not in", values, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqFwBetween(Integer value1, Integer value2) {
            addCriterion("kq_fw between", value1, value2, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqFwNotBetween(Integer value1, Integer value2) {
            addCriterion("kq_fw not between", value1, value2, "kqFw");
            return (Criteria) this;
        }

        public Criteria andKqQdahIsNull() {
            addCriterion("kq_qdah is null");
            return (Criteria) this;
        }

        public Criteria andKqQdahIsNotNull() {
            addCriterion("kq_qdah is not null");
            return (Criteria) this;
        }

        public Criteria andKqQdahEqualTo(String value) {
            addCriterion("kq_qdah =", value, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahNotEqualTo(String value) {
            addCriterion("kq_qdah <>", value, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahGreaterThan(String value) {
            addCriterion("kq_qdah >", value, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahGreaterThanOrEqualTo(String value) {
            addCriterion("kq_qdah >=", value, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahLessThan(String value) {
            addCriterion("kq_qdah <", value, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahLessThanOrEqualTo(String value) {
            addCriterion("kq_qdah <=", value, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahLike(String value) {
            addCriterion("kq_qdah like", value, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahNotLike(String value) {
            addCriterion("kq_qdah not like", value, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahIn(List<String> values) {
            addCriterion("kq_qdah in", values, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahNotIn(List<String> values) {
            addCriterion("kq_qdah not in", values, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahBetween(String value1, String value2) {
            addCriterion("kq_qdah between", value1, value2, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqQdahNotBetween(String value1, String value2) {
            addCriterion("kq_qdah not between", value1, value2, "kqQdah");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeIsNull() {
            addCriterion("kq_latitude is null");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeIsNotNull() {
            addCriterion("kq_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeEqualTo(BigDecimal value) {
            addCriterion("kq_latitude =", value, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("kq_latitude <>", value, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeGreaterThan(BigDecimal value) {
            addCriterion("kq_latitude >", value, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kq_latitude >=", value, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeLessThan(BigDecimal value) {
            addCriterion("kq_latitude <", value, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kq_latitude <=", value, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeIn(List<BigDecimal> values) {
            addCriterion("kq_latitude in", values, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("kq_latitude not in", values, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kq_latitude between", value1, value2, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kq_latitude not between", value1, value2, "kqLatitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeIsNull() {
            addCriterion("kq_longitude is null");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeIsNotNull() {
            addCriterion("kq_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeEqualTo(BigDecimal value) {
            addCriterion("kq_longitude =", value, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("kq_longitude <>", value, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeGreaterThan(BigDecimal value) {
            addCriterion("kq_longitude >", value, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kq_longitude >=", value, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeLessThan(BigDecimal value) {
            addCriterion("kq_longitude <", value, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kq_longitude <=", value, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeIn(List<BigDecimal> values) {
            addCriterion("kq_longitude in", values, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("kq_longitude not in", values, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kq_longitude between", value1, value2, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kq_longitude not between", value1, value2, "kqLongitude");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeIsNull() {
            addCriterion("kq_stop_time is null");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeIsNotNull() {
            addCriterion("kq_stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeEqualTo(Date value) {
            addCriterion("kq_stop_time =", value, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeNotEqualTo(Date value) {
            addCriterion("kq_stop_time <>", value, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeGreaterThan(Date value) {
            addCriterion("kq_stop_time >", value, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("kq_stop_time >=", value, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeLessThan(Date value) {
            addCriterion("kq_stop_time <", value, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeLessThanOrEqualTo(Date value) {
            addCriterion("kq_stop_time <=", value, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeIn(List<Date> values) {
            addCriterion("kq_stop_time in", values, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeNotIn(List<Date> values) {
            addCriterion("kq_stop_time not in", values, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeBetween(Date value1, Date value2) {
            addCriterion("kq_stop_time between", value1, value2, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqStopTimeNotBetween(Date value1, Date value2) {
            addCriterion("kq_stop_time not between", value1, value2, "kqStopTime");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeIsNull() {
            addCriterion("kq_wifi_ame is null");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeIsNotNull() {
            addCriterion("kq_wifi_ame is not null");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeEqualTo(String value) {
            addCriterion("kq_wifi_ame =", value, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeNotEqualTo(String value) {
            addCriterion("kq_wifi_ame <>", value, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeGreaterThan(String value) {
            addCriterion("kq_wifi_ame >", value, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeGreaterThanOrEqualTo(String value) {
            addCriterion("kq_wifi_ame >=", value, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeLessThan(String value) {
            addCriterion("kq_wifi_ame <", value, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeLessThanOrEqualTo(String value) {
            addCriterion("kq_wifi_ame <=", value, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeLike(String value) {
            addCriterion("kq_wifi_ame like", value, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeNotLike(String value) {
            addCriterion("kq_wifi_ame not like", value, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeIn(List<String> values) {
            addCriterion("kq_wifi_ame in", values, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeNotIn(List<String> values) {
            addCriterion("kq_wifi_ame not in", values, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeBetween(String value1, String value2) {
            addCriterion("kq_wifi_ame between", value1, value2, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiAmeNotBetween(String value1, String value2) {
            addCriterion("kq_wifi_ame not between", value1, value2, "kqWifiAme");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdIsNull() {
            addCriterion("kq_wifi_id is null");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdIsNotNull() {
            addCriterion("kq_wifi_id is not null");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdEqualTo(String value) {
            addCriterion("kq_wifi_id =", value, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdNotEqualTo(String value) {
            addCriterion("kq_wifi_id <>", value, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdGreaterThan(String value) {
            addCriterion("kq_wifi_id >", value, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdGreaterThanOrEqualTo(String value) {
            addCriterion("kq_wifi_id >=", value, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdLessThan(String value) {
            addCriterion("kq_wifi_id <", value, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdLessThanOrEqualTo(String value) {
            addCriterion("kq_wifi_id <=", value, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdLike(String value) {
            addCriterion("kq_wifi_id like", value, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdNotLike(String value) {
            addCriterion("kq_wifi_id not like", value, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdIn(List<String> values) {
            addCriterion("kq_wifi_id in", values, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdNotIn(List<String> values) {
            addCriterion("kq_wifi_id not in", values, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdBetween(String value1, String value2) {
            addCriterion("kq_wifi_id between", value1, value2, "kqWifiId");
            return (Criteria) this;
        }

        public Criteria andKqWifiIdNotBetween(String value1, String value2) {
            addCriterion("kq_wifi_id not between", value1, value2, "kqWifiId");
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