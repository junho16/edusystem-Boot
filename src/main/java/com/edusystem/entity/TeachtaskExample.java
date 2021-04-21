package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class TeachtaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachtaskExample() {
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

        public Criteria andProfessionIdIsNull() {
            addCriterion("profession_id is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIdIsNotNull() {
            addCriterion("profession_id is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionIdEqualTo(String value) {
            addCriterion("profession_id =", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotEqualTo(String value) {
            addCriterion("profession_id <>", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdGreaterThan(String value) {
            addCriterion("profession_id >", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("profession_id >=", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdLessThan(String value) {
            addCriterion("profession_id <", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdLessThanOrEqualTo(String value) {
            addCriterion("profession_id <=", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdLike(String value) {
            addCriterion("profession_id like", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotLike(String value) {
            addCriterion("profession_id not like", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdIn(List<String> values) {
            addCriterion("profession_id in", values, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotIn(List<String> values) {
            addCriterion("profession_id not in", values, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdBetween(String value1, String value2) {
            addCriterion("profession_id between", value1, value2, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotBetween(String value1, String value2) {
            addCriterion("profession_id not between", value1, value2, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionNameIsNull() {
            addCriterion("profession_name is null");
            return (Criteria) this;
        }

        public Criteria andProfessionNameIsNotNull() {
            addCriterion("profession_name is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionNameEqualTo(String value) {
            addCriterion("profession_name =", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameNotEqualTo(String value) {
            addCriterion("profession_name <>", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameGreaterThan(String value) {
            addCriterion("profession_name >", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameGreaterThanOrEqualTo(String value) {
            addCriterion("profession_name >=", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameLessThan(String value) {
            addCriterion("profession_name <", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameLessThanOrEqualTo(String value) {
            addCriterion("profession_name <=", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameLike(String value) {
            addCriterion("profession_name like", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameNotLike(String value) {
            addCriterion("profession_name not like", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameIn(List<String> values) {
            addCriterion("profession_name in", values, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameNotIn(List<String> values) {
            addCriterion("profession_name not in", values, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameBetween(String value1, String value2) {
            addCriterion("profession_name between", value1, value2, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameNotBetween(String value1, String value2) {
            addCriterion("profession_name not between", value1, value2, "professionName");
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

        public Criteria andTeachtaskMaxnumIsNull() {
            addCriterion("teachtask_maxNum is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumIsNotNull() {
            addCriterion("teachtask_maxNum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumEqualTo(Integer value) {
            addCriterion("teachtask_maxNum =", value, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumNotEqualTo(Integer value) {
            addCriterion("teachtask_maxNum <>", value, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumGreaterThan(Integer value) {
            addCriterion("teachtask_maxNum >", value, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_maxNum >=", value, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumLessThan(Integer value) {
            addCriterion("teachtask_maxNum <", value, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_maxNum <=", value, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumIn(List<Integer> values) {
            addCriterion("teachtask_maxNum in", values, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumNotIn(List<Integer> values) {
            addCriterion("teachtask_maxNum not in", values, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_maxNum between", value1, value2, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskMaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_maxNum not between", value1, value2, "teachtaskMaxnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumIsNull() {
            addCriterion("teachtask_selNum is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumIsNotNull() {
            addCriterion("teachtask_selNum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumEqualTo(Integer value) {
            addCriterion("teachtask_selNum =", value, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumNotEqualTo(Integer value) {
            addCriterion("teachtask_selNum <>", value, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumGreaterThan(Integer value) {
            addCriterion("teachtask_selNum >", value, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_selNum >=", value, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumLessThan(Integer value) {
            addCriterion("teachtask_selNum <", value, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_selNum <=", value, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumIn(List<Integer> values) {
            addCriterion("teachtask_selNum in", values, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumNotIn(List<Integer> values) {
            addCriterion("teachtask_selNum not in", values, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_selNum between", value1, value2, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskSelnumNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_selNum not between", value1, value2, "teachtaskSelnum");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitIsNull() {
            addCriterion("teachtask_gradeLimit is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitIsNotNull() {
            addCriterion("teachtask_gradeLimit is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitEqualTo(String value) {
            addCriterion("teachtask_gradeLimit =", value, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitNotEqualTo(String value) {
            addCriterion("teachtask_gradeLimit <>", value, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitGreaterThan(String value) {
            addCriterion("teachtask_gradeLimit >", value, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitGreaterThanOrEqualTo(String value) {
            addCriterion("teachtask_gradeLimit >=", value, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitLessThan(String value) {
            addCriterion("teachtask_gradeLimit <", value, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitLessThanOrEqualTo(String value) {
            addCriterion("teachtask_gradeLimit <=", value, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitLike(String value) {
            addCriterion("teachtask_gradeLimit like", value, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitNotLike(String value) {
            addCriterion("teachtask_gradeLimit not like", value, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitIn(List<String> values) {
            addCriterion("teachtask_gradeLimit in", values, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitNotIn(List<String> values) {
            addCriterion("teachtask_gradeLimit not in", values, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitBetween(String value1, String value2) {
            addCriterion("teachtask_gradeLimit between", value1, value2, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskGradelimitNotBetween(String value1, String value2) {
            addCriterion("teachtask_gradeLimit not between", value1, value2, "teachtaskGradelimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearIsNull() {
            addCriterion("teachtask_academicYear is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearIsNotNull() {
            addCriterion("teachtask_academicYear is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearEqualTo(Integer value) {
            addCriterion("teachtask_academicYear =", value, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearNotEqualTo(Integer value) {
            addCriterion("teachtask_academicYear <>", value, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearGreaterThan(Integer value) {
            addCriterion("teachtask_academicYear >", value, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_academicYear >=", value, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearLessThan(Integer value) {
            addCriterion("teachtask_academicYear <", value, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_academicYear <=", value, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearIn(List<Integer> values) {
            addCriterion("teachtask_academicYear in", values, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearNotIn(List<Integer> values) {
            addCriterion("teachtask_academicYear not in", values, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_academicYear between", value1, value2, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademicyearNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_academicYear not between", value1, value2, "teachtaskAcademicyear");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermIsNull() {
            addCriterion("teachtask_academicTerm is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermIsNotNull() {
            addCriterion("teachtask_academicTerm is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermEqualTo(Integer value) {
            addCriterion("teachtask_academicTerm =", value, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermNotEqualTo(Integer value) {
            addCriterion("teachtask_academicTerm <>", value, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermGreaterThan(Integer value) {
            addCriterion("teachtask_academicTerm >", value, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_academicTerm >=", value, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermLessThan(Integer value) {
            addCriterion("teachtask_academicTerm <", value, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_academicTerm <=", value, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermIn(List<Integer> values) {
            addCriterion("teachtask_academicTerm in", values, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermNotIn(List<Integer> values) {
            addCriterion("teachtask_academicTerm not in", values, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_academicTerm between", value1, value2, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskAcademictermNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_academicTerm not between", value1, value2, "teachtaskAcademicterm");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeIsNull() {
            addCriterion("teachtask_startTime is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeIsNotNull() {
            addCriterion("teachtask_startTime is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeEqualTo(Integer value) {
            addCriterion("teachtask_startTime =", value, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeNotEqualTo(Integer value) {
            addCriterion("teachtask_startTime <>", value, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeGreaterThan(Integer value) {
            addCriterion("teachtask_startTime >", value, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_startTime >=", value, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeLessThan(Integer value) {
            addCriterion("teachtask_startTime <", value, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_startTime <=", value, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeIn(List<Integer> values) {
            addCriterion("teachtask_startTime in", values, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeNotIn(List<Integer> values) {
            addCriterion("teachtask_startTime not in", values, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_startTime between", value1, value2, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskStarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_startTime not between", value1, value2, "teachtaskStarttime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeIsNull() {
            addCriterion("teachtask_endTime is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeIsNotNull() {
            addCriterion("teachtask_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeEqualTo(Integer value) {
            addCriterion("teachtask_endTime =", value, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeNotEqualTo(Integer value) {
            addCriterion("teachtask_endTime <>", value, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeGreaterThan(Integer value) {
            addCriterion("teachtask_endTime >", value, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_endTime >=", value, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeLessThan(Integer value) {
            addCriterion("teachtask_endTime <", value, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_endTime <=", value, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeIn(List<Integer> values) {
            addCriterion("teachtask_endTime in", values, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeNotIn(List<Integer> values) {
            addCriterion("teachtask_endTime not in", values, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_endTime between", value1, value2, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_endTime not between", value1, value2, "teachtaskEndtime");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekIsNull() {
            addCriterion("teachtask_isEveryWeek is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekIsNotNull() {
            addCriterion("teachtask_isEveryWeek is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekEqualTo(Integer value) {
            addCriterion("teachtask_isEveryWeek =", value, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekNotEqualTo(Integer value) {
            addCriterion("teachtask_isEveryWeek <>", value, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekGreaterThan(Integer value) {
            addCriterion("teachtask_isEveryWeek >", value, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_isEveryWeek >=", value, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekLessThan(Integer value) {
            addCriterion("teachtask_isEveryWeek <", value, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_isEveryWeek <=", value, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekIn(List<Integer> values) {
            addCriterion("teachtask_isEveryWeek in", values, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekNotIn(List<Integer> values) {
            addCriterion("teachtask_isEveryWeek not in", values, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_isEveryWeek between", value1, value2, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIseveryweekNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_isEveryWeek not between", value1, value2, "teachtaskIseveryweek");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitIsNull() {
            addCriterion("teachtask_numLimit is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitIsNotNull() {
            addCriterion("teachtask_numLimit is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitEqualTo(Integer value) {
            addCriterion("teachtask_numLimit =", value, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitNotEqualTo(Integer value) {
            addCriterion("teachtask_numLimit <>", value, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitGreaterThan(Integer value) {
            addCriterion("teachtask_numLimit >", value, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_numLimit >=", value, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitLessThan(Integer value) {
            addCriterion("teachtask_numLimit <", value, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_numLimit <=", value, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitIn(List<Integer> values) {
            addCriterion("teachtask_numLimit in", values, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitNotIn(List<Integer> values) {
            addCriterion("teachtask_numLimit not in", values, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_numLimit between", value1, value2, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskNumlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_numLimit not between", value1, value2, "teachtaskNumlimit");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityIsNull() {
            addCriterion("teachtask_priority is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityIsNotNull() {
            addCriterion("teachtask_priority is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityEqualTo(Integer value) {
            addCriterion("teachtask_priority =", value, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityNotEqualTo(Integer value) {
            addCriterion("teachtask_priority <>", value, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityGreaterThan(Integer value) {
            addCriterion("teachtask_priority >", value, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_priority >=", value, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityLessThan(Integer value) {
            addCriterion("teachtask_priority <", value, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_priority <=", value, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityIn(List<Integer> values) {
            addCriterion("teachtask_priority in", values, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityNotIn(List<Integer> values) {
            addCriterion("teachtask_priority not in", values, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_priority between", value1, value2, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_priority not between", value1, value2, "teachtaskPriority");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankIsNull() {
            addCriterion("teachtask_isRank is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankIsNotNull() {
            addCriterion("teachtask_isRank is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankEqualTo(Integer value) {
            addCriterion("teachtask_isRank =", value, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankNotEqualTo(Integer value) {
            addCriterion("teachtask_isRank <>", value, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankGreaterThan(Integer value) {
            addCriterion("teachtask_isRank >", value, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachtask_isRank >=", value, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankLessThan(Integer value) {
            addCriterion("teachtask_isRank <", value, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankLessThanOrEqualTo(Integer value) {
            addCriterion("teachtask_isRank <=", value, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankIn(List<Integer> values) {
            addCriterion("teachtask_isRank in", values, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankNotIn(List<Integer> values) {
            addCriterion("teachtask_isRank not in", values, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_isRank between", value1, value2, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskIsrankNotBetween(Integer value1, Integer value2) {
            addCriterion("teachtask_isRank not between", value1, value2, "teachtaskIsrank");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkIsNull() {
            addCriterion("teachtask_remaerk is null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkIsNotNull() {
            addCriterion("teachtask_remaerk is not null");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkEqualTo(String value) {
            addCriterion("teachtask_remaerk =", value, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkNotEqualTo(String value) {
            addCriterion("teachtask_remaerk <>", value, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkGreaterThan(String value) {
            addCriterion("teachtask_remaerk >", value, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkGreaterThanOrEqualTo(String value) {
            addCriterion("teachtask_remaerk >=", value, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkLessThan(String value) {
            addCriterion("teachtask_remaerk <", value, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkLessThanOrEqualTo(String value) {
            addCriterion("teachtask_remaerk <=", value, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkLike(String value) {
            addCriterion("teachtask_remaerk like", value, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkNotLike(String value) {
            addCriterion("teachtask_remaerk not like", value, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkIn(List<String> values) {
            addCriterion("teachtask_remaerk in", values, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkNotIn(List<String> values) {
            addCriterion("teachtask_remaerk not in", values, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkBetween(String value1, String value2) {
            addCriterion("teachtask_remaerk between", value1, value2, "teachtaskRemaerk");
            return (Criteria) this;
        }

        public Criteria andTeachtaskRemaerkNotBetween(String value1, String value2) {
            addCriterion("teachtask_remaerk not between", value1, value2, "teachtaskRemaerk");
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