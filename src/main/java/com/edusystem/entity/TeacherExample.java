package com.edusystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTeacherIdnumberIsNull() {
            addCriterion("teacher_idNumber is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberIsNotNull() {
            addCriterion("teacher_idNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberEqualTo(String value) {
            addCriterion("teacher_idNumber =", value, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberNotEqualTo(String value) {
            addCriterion("teacher_idNumber <>", value, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberGreaterThan(String value) {
            addCriterion("teacher_idNumber >", value, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_idNumber >=", value, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberLessThan(String value) {
            addCriterion("teacher_idNumber <", value, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberLessThanOrEqualTo(String value) {
            addCriterion("teacher_idNumber <=", value, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberLike(String value) {
            addCriterion("teacher_idNumber like", value, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberNotLike(String value) {
            addCriterion("teacher_idNumber not like", value, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberIn(List<String> values) {
            addCriterion("teacher_idNumber in", values, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberNotIn(List<String> values) {
            addCriterion("teacher_idNumber not in", values, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberBetween(String value1, String value2) {
            addCriterion("teacher_idNumber between", value1, value2, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherIdnumberNotBetween(String value1, String value2) {
            addCriterion("teacher_idNumber not between", value1, value2, "teacherIdnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIsNull() {
            addCriterion("teacher_gender is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIsNotNull() {
            addCriterion("teacher_gender is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderEqualTo(String value) {
            addCriterion("teacher_gender =", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotEqualTo(String value) {
            addCriterion("teacher_gender <>", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderGreaterThan(String value) {
            addCriterion("teacher_gender >", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_gender >=", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLessThan(String value) {
            addCriterion("teacher_gender <", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLessThanOrEqualTo(String value) {
            addCriterion("teacher_gender <=", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLike(String value) {
            addCriterion("teacher_gender like", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotLike(String value) {
            addCriterion("teacher_gender not like", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIn(List<String> values) {
            addCriterion("teacher_gender in", values, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotIn(List<String> values) {
            addCriterion("teacher_gender not in", values, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderBetween(String value1, String value2) {
            addCriterion("teacher_gender between", value1, value2, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotBetween(String value1, String value2) {
            addCriterion("teacher_gender not between", value1, value2, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIsNull() {
            addCriterion("teacher_age is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIsNotNull() {
            addCriterion("teacher_age is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeEqualTo(Integer value) {
            addCriterion("teacher_age =", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotEqualTo(Integer value) {
            addCriterion("teacher_age <>", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeGreaterThan(Integer value) {
            addCriterion("teacher_age >", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_age >=", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeLessThan(Integer value) {
            addCriterion("teacher_age <", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_age <=", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIn(List<Integer> values) {
            addCriterion("teacher_age in", values, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotIn(List<Integer> values) {
            addCriterion("teacher_age not in", values, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeBetween(Integer value1, Integer value2) {
            addCriterion("teacher_age between", value1, value2, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_age not between", value1, value2, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdIsNull() {
            addCriterion("teacher_psd is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdIsNotNull() {
            addCriterion("teacher_psd is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdEqualTo(String value) {
            addCriterion("teacher_psd =", value, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdNotEqualTo(String value) {
            addCriterion("teacher_psd <>", value, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdGreaterThan(String value) {
            addCriterion("teacher_psd >", value, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_psd >=", value, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdLessThan(String value) {
            addCriterion("teacher_psd <", value, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdLessThanOrEqualTo(String value) {
            addCriterion("teacher_psd <=", value, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdLike(String value) {
            addCriterion("teacher_psd like", value, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdNotLike(String value) {
            addCriterion("teacher_psd not like", value, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdIn(List<String> values) {
            addCriterion("teacher_psd in", values, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdNotIn(List<String> values) {
            addCriterion("teacher_psd not in", values, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdBetween(String value1, String value2) {
            addCriterion("teacher_psd between", value1, value2, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherPsdNotBetween(String value1, String value2) {
            addCriterion("teacher_psd not between", value1, value2, "teacherPsd");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayIsNull() {
            addCriterion("teacher_birthday is null");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayIsNotNull() {
            addCriterion("teacher_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("teacher_birthday =", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("teacher_birthday <>", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("teacher_birthday >", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("teacher_birthday >=", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("teacher_birthday <", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("teacher_birthday <=", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("teacher_birthday in", values, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("teacher_birthday not in", values, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("teacher_birthday between", value1, value2, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("teacher_birthday not between", value1, value2, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicIsNull() {
            addCriterion("teacher_ethnic is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicIsNotNull() {
            addCriterion("teacher_ethnic is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicEqualTo(String value) {
            addCriterion("teacher_ethnic =", value, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicNotEqualTo(String value) {
            addCriterion("teacher_ethnic <>", value, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicGreaterThan(String value) {
            addCriterion("teacher_ethnic >", value, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_ethnic >=", value, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicLessThan(String value) {
            addCriterion("teacher_ethnic <", value, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicLessThanOrEqualTo(String value) {
            addCriterion("teacher_ethnic <=", value, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicLike(String value) {
            addCriterion("teacher_ethnic like", value, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicNotLike(String value) {
            addCriterion("teacher_ethnic not like", value, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicIn(List<String> values) {
            addCriterion("teacher_ethnic in", values, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicNotIn(List<String> values) {
            addCriterion("teacher_ethnic not in", values, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicBetween(String value1, String value2) {
            addCriterion("teacher_ethnic between", value1, value2, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEthnicNotBetween(String value1, String value2) {
            addCriterion("teacher_ethnic not between", value1, value2, "teacherEthnic");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationIsNull() {
            addCriterion("teacher_education is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationIsNotNull() {
            addCriterion("teacher_education is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationEqualTo(String value) {
            addCriterion("teacher_education =", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationNotEqualTo(String value) {
            addCriterion("teacher_education <>", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationGreaterThan(String value) {
            addCriterion("teacher_education >", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_education >=", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationLessThan(String value) {
            addCriterion("teacher_education <", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationLessThanOrEqualTo(String value) {
            addCriterion("teacher_education <=", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationLike(String value) {
            addCriterion("teacher_education like", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationNotLike(String value) {
            addCriterion("teacher_education not like", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationIn(List<String> values) {
            addCriterion("teacher_education in", values, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationNotIn(List<String> values) {
            addCriterion("teacher_education not in", values, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationBetween(String value1, String value2) {
            addCriterion("teacher_education between", value1, value2, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationNotBetween(String value1, String value2) {
            addCriterion("teacher_education not between", value1, value2, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolIsNull() {
            addCriterion("teacher_graduatedSchool is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolIsNotNull() {
            addCriterion("teacher_graduatedSchool is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolEqualTo(String value) {
            addCriterion("teacher_graduatedSchool =", value, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolNotEqualTo(String value) {
            addCriterion("teacher_graduatedSchool <>", value, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolGreaterThan(String value) {
            addCriterion("teacher_graduatedSchool >", value, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_graduatedSchool >=", value, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolLessThan(String value) {
            addCriterion("teacher_graduatedSchool <", value, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolLessThanOrEqualTo(String value) {
            addCriterion("teacher_graduatedSchool <=", value, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolLike(String value) {
            addCriterion("teacher_graduatedSchool like", value, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolNotLike(String value) {
            addCriterion("teacher_graduatedSchool not like", value, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolIn(List<String> values) {
            addCriterion("teacher_graduatedSchool in", values, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolNotIn(List<String> values) {
            addCriterion("teacher_graduatedSchool not in", values, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolBetween(String value1, String value2) {
            addCriterion("teacher_graduatedSchool between", value1, value2, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduatedschoolNotBetween(String value1, String value2) {
            addCriterion("teacher_graduatedSchool not between", value1, value2, "teacherGraduatedschool");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateIsNull() {
            addCriterion("teacher_graduatedDate is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateIsNotNull() {
            addCriterion("teacher_graduatedDate is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateEqualTo(String value) {
            addCriterion("teacher_graduatedDate =", value, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateNotEqualTo(String value) {
            addCriterion("teacher_graduatedDate <>", value, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateGreaterThan(String value) {
            addCriterion("teacher_graduatedDate >", value, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_graduatedDate >=", value, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateLessThan(String value) {
            addCriterion("teacher_graduatedDate <", value, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateLessThanOrEqualTo(String value) {
            addCriterion("teacher_graduatedDate <=", value, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateLike(String value) {
            addCriterion("teacher_graduatedDate like", value, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateNotLike(String value) {
            addCriterion("teacher_graduatedDate not like", value, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateIn(List<String> values) {
            addCriterion("teacher_graduatedDate in", values, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateNotIn(List<String> values) {
            addCriterion("teacher_graduatedDate not in", values, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateBetween(String value1, String value2) {
            addCriterion("teacher_graduatedDate between", value1, value2, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherGraduateddateNotBetween(String value1, String value2) {
            addCriterion("teacher_graduatedDate not between", value1, value2, "teacherGraduateddate");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeIsNull() {
            addCriterion("teacher_workTime is null");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeIsNotNull() {
            addCriterion("teacher_workTime is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeEqualTo(String value) {
            addCriterion("teacher_workTime =", value, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeNotEqualTo(String value) {
            addCriterion("teacher_workTime <>", value, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeGreaterThan(String value) {
            addCriterion("teacher_workTime >", value, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_workTime >=", value, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeLessThan(String value) {
            addCriterion("teacher_workTime <", value, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeLessThanOrEqualTo(String value) {
            addCriterion("teacher_workTime <=", value, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeLike(String value) {
            addCriterion("teacher_workTime like", value, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeNotLike(String value) {
            addCriterion("teacher_workTime not like", value, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeIn(List<String> values) {
            addCriterion("teacher_workTime in", values, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeNotIn(List<String> values) {
            addCriterion("teacher_workTime not in", values, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeBetween(String value1, String value2) {
            addCriterion("teacher_workTime between", value1, value2, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherWorktimeNotBetween(String value1, String value2) {
            addCriterion("teacher_workTime not between", value1, value2, "teacherWorktime");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeIsNull() {
            addCriterion("teacher_degree is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeIsNotNull() {
            addCriterion("teacher_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeEqualTo(String value) {
            addCriterion("teacher_degree =", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotEqualTo(String value) {
            addCriterion("teacher_degree <>", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeGreaterThan(String value) {
            addCriterion("teacher_degree >", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_degree >=", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeLessThan(String value) {
            addCriterion("teacher_degree <", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeLessThanOrEqualTo(String value) {
            addCriterion("teacher_degree <=", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeLike(String value) {
            addCriterion("teacher_degree like", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotLike(String value) {
            addCriterion("teacher_degree not like", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeIn(List<String> values) {
            addCriterion("teacher_degree in", values, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotIn(List<String> values) {
            addCriterion("teacher_degree not in", values, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeBetween(String value1, String value2) {
            addCriterion("teacher_degree between", value1, value2, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotBetween(String value1, String value2) {
            addCriterion("teacher_degree not between", value1, value2, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleIsNull() {
            addCriterion("teacher_jobTitle is null");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleIsNotNull() {
            addCriterion("teacher_jobTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleEqualTo(String value) {
            addCriterion("teacher_jobTitle =", value, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleNotEqualTo(String value) {
            addCriterion("teacher_jobTitle <>", value, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleGreaterThan(String value) {
            addCriterion("teacher_jobTitle >", value, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_jobTitle >=", value, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleLessThan(String value) {
            addCriterion("teacher_jobTitle <", value, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleLessThanOrEqualTo(String value) {
            addCriterion("teacher_jobTitle <=", value, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleLike(String value) {
            addCriterion("teacher_jobTitle like", value, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleNotLike(String value) {
            addCriterion("teacher_jobTitle not like", value, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleIn(List<String> values) {
            addCriterion("teacher_jobTitle in", values, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleNotIn(List<String> values) {
            addCriterion("teacher_jobTitle not in", values, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleBetween(String value1, String value2) {
            addCriterion("teacher_jobTitle between", value1, value2, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeacherJobtitleNotBetween(String value1, String value2) {
            addCriterion("teacher_jobTitle not between", value1, value2, "teacherJobtitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownIsNull() {
            addCriterion("teacher_hometown is null");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownIsNotNull() {
            addCriterion("teacher_hometown is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownEqualTo(String value) {
            addCriterion("teacher_hometown =", value, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownNotEqualTo(String value) {
            addCriterion("teacher_hometown <>", value, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownGreaterThan(String value) {
            addCriterion("teacher_hometown >", value, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_hometown >=", value, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownLessThan(String value) {
            addCriterion("teacher_hometown <", value, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownLessThanOrEqualTo(String value) {
            addCriterion("teacher_hometown <=", value, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownLike(String value) {
            addCriterion("teacher_hometown like", value, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownNotLike(String value) {
            addCriterion("teacher_hometown not like", value, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownIn(List<String> values) {
            addCriterion("teacher_hometown in", values, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownNotIn(List<String> values) {
            addCriterion("teacher_hometown not in", values, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownBetween(String value1, String value2) {
            addCriterion("teacher_hometown between", value1, value2, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherHometownNotBetween(String value1, String value2) {
            addCriterion("teacher_hometown not between", value1, value2, "teacherHometown");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressIsNull() {
            addCriterion("teacher_workAddress is null");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressIsNotNull() {
            addCriterion("teacher_workAddress is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressEqualTo(String value) {
            addCriterion("teacher_workAddress =", value, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressNotEqualTo(String value) {
            addCriterion("teacher_workAddress <>", value, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressGreaterThan(String value) {
            addCriterion("teacher_workAddress >", value, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_workAddress >=", value, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressLessThan(String value) {
            addCriterion("teacher_workAddress <", value, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressLessThanOrEqualTo(String value) {
            addCriterion("teacher_workAddress <=", value, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressLike(String value) {
            addCriterion("teacher_workAddress like", value, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressNotLike(String value) {
            addCriterion("teacher_workAddress not like", value, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressIn(List<String> values) {
            addCriterion("teacher_workAddress in", values, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressNotIn(List<String> values) {
            addCriterion("teacher_workAddress not in", values, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressBetween(String value1, String value2) {
            addCriterion("teacher_workAddress between", value1, value2, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkaddressNotBetween(String value1, String value2) {
            addCriterion("teacher_workAddress not between", value1, value2, "teacherWorkaddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressIsNull() {
            addCriterion("teacher_address is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressIsNotNull() {
            addCriterion("teacher_address is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressEqualTo(String value) {
            addCriterion("teacher_address =", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotEqualTo(String value) {
            addCriterion("teacher_address <>", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressGreaterThan(String value) {
            addCriterion("teacher_address >", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_address >=", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressLessThan(String value) {
            addCriterion("teacher_address <", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressLessThanOrEqualTo(String value) {
            addCriterion("teacher_address <=", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressLike(String value) {
            addCriterion("teacher_address like", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotLike(String value) {
            addCriterion("teacher_address not like", value, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressIn(List<String> values) {
            addCriterion("teacher_address in", values, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotIn(List<String> values) {
            addCriterion("teacher_address not in", values, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressBetween(String value1, String value2) {
            addCriterion("teacher_address between", value1, value2, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherAddressNotBetween(String value1, String value2) {
            addCriterion("teacher_address not between", value1, value2, "teacherAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNull() {
            addCriterion("teacher_email is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNotNull() {
            addCriterion("teacher_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailEqualTo(String value) {
            addCriterion("teacher_email =", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotEqualTo(String value) {
            addCriterion("teacher_email <>", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThan(String value) {
            addCriterion("teacher_email >", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_email >=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThan(String value) {
            addCriterion("teacher_email <", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThanOrEqualTo(String value) {
            addCriterion("teacher_email <=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLike(String value) {
            addCriterion("teacher_email like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotLike(String value) {
            addCriterion("teacher_email not like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIn(List<String> values) {
            addCriterion("teacher_email in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotIn(List<String> values) {
            addCriterion("teacher_email not in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailBetween(String value1, String value2) {
            addCriterion("teacher_email between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotBetween(String value1, String value2) {
            addCriterion("teacher_email not between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNull() {
            addCriterion("teacher_phone is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNotNull() {
            addCriterion("teacher_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneEqualTo(String value) {
            addCriterion("teacher_phone =", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotEqualTo(String value) {
            addCriterion("teacher_phone <>", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThan(String value) {
            addCriterion("teacher_phone >", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_phone >=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThan(String value) {
            addCriterion("teacher_phone <", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThanOrEqualTo(String value) {
            addCriterion("teacher_phone <=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLike(String value) {
            addCriterion("teacher_phone like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotLike(String value) {
            addCriterion("teacher_phone not like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIn(List<String> values) {
            addCriterion("teacher_phone in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotIn(List<String> values) {
            addCriterion("teacher_phone not in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneBetween(String value1, String value2) {
            addCriterion("teacher_phone between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotBetween(String value1, String value2) {
            addCriterion("teacher_phone not between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzIsNull() {
            addCriterion("teacher_xgbz is null");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzIsNotNull() {
            addCriterion("teacher_xgbz is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzEqualTo(Integer value) {
            addCriterion("teacher_xgbz =", value, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzNotEqualTo(Integer value) {
            addCriterion("teacher_xgbz <>", value, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzGreaterThan(Integer value) {
            addCriterion("teacher_xgbz >", value, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_xgbz >=", value, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzLessThan(Integer value) {
            addCriterion("teacher_xgbz <", value, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_xgbz <=", value, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzIn(List<Integer> values) {
            addCriterion("teacher_xgbz in", values, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzNotIn(List<Integer> values) {
            addCriterion("teacher_xgbz not in", values, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzBetween(Integer value1, Integer value2) {
            addCriterion("teacher_xgbz between", value1, value2, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherXgbzNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_xgbz not between", value1, value2, "teacherXgbz");
            return (Criteria) this;
        }

        public Criteria andTeacherPicIsNull() {
            addCriterion("teacher_pic is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPicIsNotNull() {
            addCriterion("teacher_pic is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPicEqualTo(String value) {
            addCriterion("teacher_pic =", value, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicNotEqualTo(String value) {
            addCriterion("teacher_pic <>", value, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicGreaterThan(String value) {
            addCriterion("teacher_pic >", value, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_pic >=", value, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicLessThan(String value) {
            addCriterion("teacher_pic <", value, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicLessThanOrEqualTo(String value) {
            addCriterion("teacher_pic <=", value, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicLike(String value) {
            addCriterion("teacher_pic like", value, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicNotLike(String value) {
            addCriterion("teacher_pic not like", value, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicIn(List<String> values) {
            addCriterion("teacher_pic in", values, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicNotIn(List<String> values) {
            addCriterion("teacher_pic not in", values, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicBetween(String value1, String value2) {
            addCriterion("teacher_pic between", value1, value2, "teacherPic");
            return (Criteria) this;
        }

        public Criteria andTeacherPicNotBetween(String value1, String value2) {
            addCriterion("teacher_pic not between", value1, value2, "teacherPic");
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