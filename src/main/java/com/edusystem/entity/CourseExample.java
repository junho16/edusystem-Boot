package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseCreditIsNull() {
            addCriterion("course_credit is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIsNotNull() {
            addCriterion("course_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditEqualTo(Integer value) {
            addCriterion("course_credit =", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotEqualTo(Integer value) {
            addCriterion("course_credit <>", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThan(Integer value) {
            addCriterion("course_credit >", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_credit >=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThan(Integer value) {
            addCriterion("course_credit <", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThanOrEqualTo(Integer value) {
            addCriterion("course_credit <=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIn(List<Integer> values) {
            addCriterion("course_credit in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotIn(List<Integer> values) {
            addCriterion("course_credit not in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditBetween(Integer value1, Integer value2) {
            addCriterion("course_credit between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("course_credit not between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursIsNull() {
            addCriterion("course_theoryHours is null");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursIsNotNull() {
            addCriterion("course_theoryHours is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursEqualTo(Integer value) {
            addCriterion("course_theoryHours =", value, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursNotEqualTo(Integer value) {
            addCriterion("course_theoryHours <>", value, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursGreaterThan(Integer value) {
            addCriterion("course_theoryHours >", value, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_theoryHours >=", value, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursLessThan(Integer value) {
            addCriterion("course_theoryHours <", value, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursLessThanOrEqualTo(Integer value) {
            addCriterion("course_theoryHours <=", value, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursIn(List<Integer> values) {
            addCriterion("course_theoryHours in", values, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursNotIn(List<Integer> values) {
            addCriterion("course_theoryHours not in", values, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursBetween(Integer value1, Integer value2) {
            addCriterion("course_theoryHours between", value1, value2, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseTheoryhoursNotBetween(Integer value1, Integer value2) {
            addCriterion("course_theoryHours not between", value1, value2, "courseTheoryhours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursIsNull() {
            addCriterion("course_experimentHours is null");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursIsNotNull() {
            addCriterion("course_experimentHours is not null");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursEqualTo(Integer value) {
            addCriterion("course_experimentHours =", value, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursNotEqualTo(Integer value) {
            addCriterion("course_experimentHours <>", value, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursGreaterThan(Integer value) {
            addCriterion("course_experimentHours >", value, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_experimentHours >=", value, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursLessThan(Integer value) {
            addCriterion("course_experimentHours <", value, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursLessThanOrEqualTo(Integer value) {
            addCriterion("course_experimentHours <=", value, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursIn(List<Integer> values) {
            addCriterion("course_experimentHours in", values, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursNotIn(List<Integer> values) {
            addCriterion("course_experimentHours not in", values, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursBetween(Integer value1, Integer value2) {
            addCriterion("course_experimentHours between", value1, value2, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseExperimenthoursNotBetween(Integer value1, Integer value2) {
            addCriterion("course_experimentHours not between", value1, value2, "courseExperimenthours");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksIsNull() {
            addCriterion("course_designWeeks is null");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksIsNotNull() {
            addCriterion("course_designWeeks is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksEqualTo(Integer value) {
            addCriterion("course_designWeeks =", value, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksNotEqualTo(Integer value) {
            addCriterion("course_designWeeks <>", value, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksGreaterThan(Integer value) {
            addCriterion("course_designWeeks >", value, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_designWeeks >=", value, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksLessThan(Integer value) {
            addCriterion("course_designWeeks <", value, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksLessThanOrEqualTo(Integer value) {
            addCriterion("course_designWeeks <=", value, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksIn(List<Integer> values) {
            addCriterion("course_designWeeks in", values, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksNotIn(List<Integer> values) {
            addCriterion("course_designWeeks not in", values, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksBetween(Integer value1, Integer value2) {
            addCriterion("course_designWeeks between", value1, value2, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDesignweeksNotBetween(Integer value1, Integer value2) {
            addCriterion("course_designWeeks not between", value1, value2, "courseDesignweeks");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionIsNull() {
            addCriterion("course_description is null");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionIsNotNull() {
            addCriterion("course_description is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionEqualTo(String value) {
            addCriterion("course_description =", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionNotEqualTo(String value) {
            addCriterion("course_description <>", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionGreaterThan(String value) {
            addCriterion("course_description >", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("course_description >=", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionLessThan(String value) {
            addCriterion("course_description <", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionLessThanOrEqualTo(String value) {
            addCriterion("course_description <=", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionLike(String value) {
            addCriterion("course_description like", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionNotLike(String value) {
            addCriterion("course_description not like", value, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionIn(List<String> values) {
            addCriterion("course_description in", values, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionNotIn(List<String> values) {
            addCriterion("course_description not in", values, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionBetween(String value1, String value2) {
            addCriterion("course_description between", value1, value2, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseDescriptionNotBetween(String value1, String value2) {
            addCriterion("course_description not between", value1, value2, "courseDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindIsNull() {
            addCriterion("course_checkKind is null");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindIsNotNull() {
            addCriterion("course_checkKind is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindEqualTo(String value) {
            addCriterion("course_checkKind =", value, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindNotEqualTo(String value) {
            addCriterion("course_checkKind <>", value, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindGreaterThan(String value) {
            addCriterion("course_checkKind >", value, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindGreaterThanOrEqualTo(String value) {
            addCriterion("course_checkKind >=", value, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindLessThan(String value) {
            addCriterion("course_checkKind <", value, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindLessThanOrEqualTo(String value) {
            addCriterion("course_checkKind <=", value, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindLike(String value) {
            addCriterion("course_checkKind like", value, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindNotLike(String value) {
            addCriterion("course_checkKind not like", value, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindIn(List<String> values) {
            addCriterion("course_checkKind in", values, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindNotIn(List<String> values) {
            addCriterion("course_checkKind not in", values, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindBetween(String value1, String value2) {
            addCriterion("course_checkKind between", value1, value2, "courseCheckkind");
            return (Criteria) this;
        }

        public Criteria andCourseCheckkindNotBetween(String value1, String value2) {
            addCriterion("course_checkKind not between", value1, value2, "courseCheckkind");
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

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
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