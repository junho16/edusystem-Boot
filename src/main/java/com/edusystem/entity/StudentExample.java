package com.edusystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentIdnumberIsNull() {
            addCriterion("student_idNumber is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberIsNotNull() {
            addCriterion("student_idNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberEqualTo(String value) {
            addCriterion("student_idNumber =", value, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberNotEqualTo(String value) {
            addCriterion("student_idNumber <>", value, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberGreaterThan(String value) {
            addCriterion("student_idNumber >", value, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("student_idNumber >=", value, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberLessThan(String value) {
            addCriterion("student_idNumber <", value, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberLessThanOrEqualTo(String value) {
            addCriterion("student_idNumber <=", value, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberLike(String value) {
            addCriterion("student_idNumber like", value, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberNotLike(String value) {
            addCriterion("student_idNumber not like", value, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberIn(List<String> values) {
            addCriterion("student_idNumber in", values, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberNotIn(List<String> values) {
            addCriterion("student_idNumber not in", values, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberBetween(String value1, String value2) {
            addCriterion("student_idNumber between", value1, value2, "studentIdnumber");
            return (Criteria) this;
        }

        public Criteria andStudentIdnumberNotBetween(String value1, String value2) {
            addCriterion("student_idNumber not between", value1, value2, "studentIdnumber");
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

        public Criteria andStudentGenderIsNull() {
            addCriterion("student_gender is null");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIsNotNull() {
            addCriterion("student_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGenderEqualTo(String value) {
            addCriterion("student_gender =", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotEqualTo(String value) {
            addCriterion("student_gender <>", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderGreaterThan(String value) {
            addCriterion("student_gender >", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderGreaterThanOrEqualTo(String value) {
            addCriterion("student_gender >=", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLessThan(String value) {
            addCriterion("student_gender <", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLessThanOrEqualTo(String value) {
            addCriterion("student_gender <=", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLike(String value) {
            addCriterion("student_gender like", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotLike(String value) {
            addCriterion("student_gender not like", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIn(List<String> values) {
            addCriterion("student_gender in", values, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotIn(List<String> values) {
            addCriterion("student_gender not in", values, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderBetween(String value1, String value2) {
            addCriterion("student_gender between", value1, value2, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotBetween(String value1, String value2) {
            addCriterion("student_gender not between", value1, value2, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNull() {
            addCriterion("student_age is null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNotNull() {
            addCriterion("student_age is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeEqualTo(Integer value) {
            addCriterion("student_age =", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotEqualTo(Integer value) {
            addCriterion("student_age <>", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThan(Integer value) {
            addCriterion("student_age >", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_age >=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThan(Integer value) {
            addCriterion("student_age <", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThanOrEqualTo(Integer value) {
            addCriterion("student_age <=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIn(List<Integer> values) {
            addCriterion("student_age in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotIn(List<Integer> values) {
            addCriterion("student_age not in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeBetween(Integer value1, Integer value2) {
            addCriterion("student_age between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_age not between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentPsdIsNull() {
            addCriterion("student_psd is null");
            return (Criteria) this;
        }

        public Criteria andStudentPsdIsNotNull() {
            addCriterion("student_psd is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPsdEqualTo(String value) {
            addCriterion("student_psd =", value, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdNotEqualTo(String value) {
            addCriterion("student_psd <>", value, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdGreaterThan(String value) {
            addCriterion("student_psd >", value, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdGreaterThanOrEqualTo(String value) {
            addCriterion("student_psd >=", value, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdLessThan(String value) {
            addCriterion("student_psd <", value, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdLessThanOrEqualTo(String value) {
            addCriterion("student_psd <=", value, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdLike(String value) {
            addCriterion("student_psd like", value, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdNotLike(String value) {
            addCriterion("student_psd not like", value, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdIn(List<String> values) {
            addCriterion("student_psd in", values, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdNotIn(List<String> values) {
            addCriterion("student_psd not in", values, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdBetween(String value1, String value2) {
            addCriterion("student_psd between", value1, value2, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentPsdNotBetween(String value1, String value2) {
            addCriterion("student_psd not between", value1, value2, "studentPsd");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIsNull() {
            addCriterion("student_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIsNotNull() {
            addCriterion("student_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("student_birthday =", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("student_birthday <>", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("student_birthday >", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("student_birthday >=", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("student_birthday <", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("student_birthday <=", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("student_birthday in", values, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("student_birthday not in", values, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("student_birthday between", value1, value2, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("student_birthday not between", value1, value2, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidIsNull() {
            addCriterion("student_roomId is null");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidIsNotNull() {
            addCriterion("student_roomId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidEqualTo(String value) {
            addCriterion("student_roomId =", value, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidNotEqualTo(String value) {
            addCriterion("student_roomId <>", value, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidGreaterThan(String value) {
            addCriterion("student_roomId >", value, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidGreaterThanOrEqualTo(String value) {
            addCriterion("student_roomId >=", value, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidLessThan(String value) {
            addCriterion("student_roomId <", value, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidLessThanOrEqualTo(String value) {
            addCriterion("student_roomId <=", value, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidLike(String value) {
            addCriterion("student_roomId like", value, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidNotLike(String value) {
            addCriterion("student_roomId not like", value, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidIn(List<String> values) {
            addCriterion("student_roomId in", values, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidNotIn(List<String> values) {
            addCriterion("student_roomId not in", values, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidBetween(String value1, String value2) {
            addCriterion("student_roomId between", value1, value2, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentRoomidNotBetween(String value1, String value2) {
            addCriterion("student_roomId not between", value1, value2, "studentRoomid");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicIsNull() {
            addCriterion("student_ethnic is null");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicIsNotNull() {
            addCriterion("student_ethnic is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicEqualTo(String value) {
            addCriterion("student_ethnic =", value, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicNotEqualTo(String value) {
            addCriterion("student_ethnic <>", value, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicGreaterThan(String value) {
            addCriterion("student_ethnic >", value, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicGreaterThanOrEqualTo(String value) {
            addCriterion("student_ethnic >=", value, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicLessThan(String value) {
            addCriterion("student_ethnic <", value, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicLessThanOrEqualTo(String value) {
            addCriterion("student_ethnic <=", value, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicLike(String value) {
            addCriterion("student_ethnic like", value, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicNotLike(String value) {
            addCriterion("student_ethnic not like", value, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicIn(List<String> values) {
            addCriterion("student_ethnic in", values, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicNotIn(List<String> values) {
            addCriterion("student_ethnic not in", values, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicBetween(String value1, String value2) {
            addCriterion("student_ethnic between", value1, value2, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentEthnicNotBetween(String value1, String value2) {
            addCriterion("student_ethnic not between", value1, value2, "studentEthnic");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqIsNull() {
            addCriterion("student_rxrq is null");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqIsNotNull() {
            addCriterion("student_rxrq is not null");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqEqualTo(String value) {
            addCriterion("student_rxrq =", value, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqNotEqualTo(String value) {
            addCriterion("student_rxrq <>", value, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqGreaterThan(String value) {
            addCriterion("student_rxrq >", value, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqGreaterThanOrEqualTo(String value) {
            addCriterion("student_rxrq >=", value, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqLessThan(String value) {
            addCriterion("student_rxrq <", value, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqLessThanOrEqualTo(String value) {
            addCriterion("student_rxrq <=", value, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqLike(String value) {
            addCriterion("student_rxrq like", value, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqNotLike(String value) {
            addCriterion("student_rxrq not like", value, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqIn(List<String> values) {
            addCriterion("student_rxrq in", values, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqNotIn(List<String> values) {
            addCriterion("student_rxrq not in", values, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqBetween(String value1, String value2) {
            addCriterion("student_rxrq between", value1, value2, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentRxrqNotBetween(String value1, String value2) {
            addCriterion("student_rxrq not between", value1, value2, "studentRxrq");
            return (Criteria) this;
        }

        public Criteria andStudentHometownIsNull() {
            addCriterion("student_hometown is null");
            return (Criteria) this;
        }

        public Criteria andStudentHometownIsNotNull() {
            addCriterion("student_hometown is not null");
            return (Criteria) this;
        }

        public Criteria andStudentHometownEqualTo(String value) {
            addCriterion("student_hometown =", value, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownNotEqualTo(String value) {
            addCriterion("student_hometown <>", value, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownGreaterThan(String value) {
            addCriterion("student_hometown >", value, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownGreaterThanOrEqualTo(String value) {
            addCriterion("student_hometown >=", value, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownLessThan(String value) {
            addCriterion("student_hometown <", value, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownLessThanOrEqualTo(String value) {
            addCriterion("student_hometown <=", value, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownLike(String value) {
            addCriterion("student_hometown like", value, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownNotLike(String value) {
            addCriterion("student_hometown not like", value, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownIn(List<String> values) {
            addCriterion("student_hometown in", values, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownNotIn(List<String> values) {
            addCriterion("student_hometown not in", values, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownBetween(String value1, String value2) {
            addCriterion("student_hometown between", value1, value2, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentHometownNotBetween(String value1, String value2) {
            addCriterion("student_hometown not between", value1, value2, "studentHometown");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNull() {
            addCriterion("student_address is null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNotNull() {
            addCriterion("student_address is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressEqualTo(String value) {
            addCriterion("student_address =", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotEqualTo(String value) {
            addCriterion("student_address <>", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThan(String value) {
            addCriterion("student_address >", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("student_address >=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThan(String value) {
            addCriterion("student_address <", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThanOrEqualTo(String value) {
            addCriterion("student_address <=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLike(String value) {
            addCriterion("student_address like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotLike(String value) {
            addCriterion("student_address not like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIn(List<String> values) {
            addCriterion("student_address in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotIn(List<String> values) {
            addCriterion("student_address not in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressBetween(String value1, String value2) {
            addCriterion("student_address between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotBetween(String value1, String value2) {
            addCriterion("student_address not between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNull() {
            addCriterion("student_email is null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNotNull() {
            addCriterion("student_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailEqualTo(String value) {
            addCriterion("student_email =", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotEqualTo(String value) {
            addCriterion("student_email <>", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThan(String value) {
            addCriterion("student_email >", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("student_email >=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThan(String value) {
            addCriterion("student_email <", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("student_email <=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLike(String value) {
            addCriterion("student_email like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotLike(String value) {
            addCriterion("student_email not like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIn(List<String> values) {
            addCriterion("student_email in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotIn(List<String> values) {
            addCriterion("student_email not in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailBetween(String value1, String value2) {
            addCriterion("student_email between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotBetween(String value1, String value2) {
            addCriterion("student_email not between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNull() {
            addCriterion("student_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNotNull() {
            addCriterion("student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneEqualTo(String value) {
            addCriterion("student_phone =", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotEqualTo(String value) {
            addCriterion("student_phone <>", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThan(String value) {
            addCriterion("student_phone >", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_phone >=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThan(String value) {
            addCriterion("student_phone <", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("student_phone <=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLike(String value) {
            addCriterion("student_phone like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotLike(String value) {
            addCriterion("student_phone not like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIn(List<String> values) {
            addCriterion("student_phone in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotIn(List<String> values) {
            addCriterion("student_phone not in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneBetween(String value1, String value2) {
            addCriterion("student_phone between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("student_phone not between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzIsNull() {
            addCriterion("student_xgbz is null");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzIsNotNull() {
            addCriterion("student_xgbz is not null");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzEqualTo(Integer value) {
            addCriterion("student_xgbz =", value, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzNotEqualTo(Integer value) {
            addCriterion("student_xgbz <>", value, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzGreaterThan(Integer value) {
            addCriterion("student_xgbz >", value, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_xgbz >=", value, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzLessThan(Integer value) {
            addCriterion("student_xgbz <", value, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzLessThanOrEqualTo(Integer value) {
            addCriterion("student_xgbz <=", value, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzIn(List<Integer> values) {
            addCriterion("student_xgbz in", values, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzNotIn(List<Integer> values) {
            addCriterion("student_xgbz not in", values, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzBetween(Integer value1, Integer value2) {
            addCriterion("student_xgbz between", value1, value2, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentXgbzNotBetween(Integer value1, Integer value2) {
            addCriterion("student_xgbz not between", value1, value2, "studentXgbz");
            return (Criteria) this;
        }

        public Criteria andStudentPicIsNull() {
            addCriterion("student_pic is null");
            return (Criteria) this;
        }

        public Criteria andStudentPicIsNotNull() {
            addCriterion("student_pic is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPicEqualTo(String value) {
            addCriterion("student_pic =", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicNotEqualTo(String value) {
            addCriterion("student_pic <>", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicGreaterThan(String value) {
            addCriterion("student_pic >", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicGreaterThanOrEqualTo(String value) {
            addCriterion("student_pic >=", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicLessThan(String value) {
            addCriterion("student_pic <", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicLessThanOrEqualTo(String value) {
            addCriterion("student_pic <=", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicLike(String value) {
            addCriterion("student_pic like", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicNotLike(String value) {
            addCriterion("student_pic not like", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicIn(List<String> values) {
            addCriterion("student_pic in", values, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicNotIn(List<String> values) {
            addCriterion("student_pic not in", values, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicBetween(String value1, String value2) {
            addCriterion("student_pic between", value1, value2, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicNotBetween(String value1, String value2) {
            addCriterion("student_pic not between", value1, value2, "studentPic");
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