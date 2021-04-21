package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassplanExample() {
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

        public Criteria andClassplanIdIsNull() {
            addCriterion("classplan_id is null");
            return (Criteria) this;
        }

        public Criteria andClassplanIdIsNotNull() {
            addCriterion("classplan_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassplanIdEqualTo(String value) {
            addCriterion("classplan_id =", value, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdNotEqualTo(String value) {
            addCriterion("classplan_id <>", value, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdGreaterThan(String value) {
            addCriterion("classplan_id >", value, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdGreaterThanOrEqualTo(String value) {
            addCriterion("classplan_id >=", value, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdLessThan(String value) {
            addCriterion("classplan_id <", value, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdLessThanOrEqualTo(String value) {
            addCriterion("classplan_id <=", value, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdLike(String value) {
            addCriterion("classplan_id like", value, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdNotLike(String value) {
            addCriterion("classplan_id not like", value, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdIn(List<String> values) {
            addCriterion("classplan_id in", values, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdNotIn(List<String> values) {
            addCriterion("classplan_id not in", values, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdBetween(String value1, String value2) {
            addCriterion("classplan_id between", value1, value2, "classplanId");
            return (Criteria) this;
        }

        public Criteria andClassplanIdNotBetween(String value1, String value2) {
            addCriterion("classplan_id not between", value1, value2, "classplanId");
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

        public Criteria andClassroomIdIsNull() {
            addCriterion("classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(String value) {
            addCriterion("classroom_id =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(String value) {
            addCriterion("classroom_id <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(String value) {
            addCriterion("classroom_id >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_id >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(String value) {
            addCriterion("classroom_id <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(String value) {
            addCriterion("classroom_id <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLike(String value) {
            addCriterion("classroom_id like", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotLike(String value) {
            addCriterion("classroom_id not like", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<String> values) {
            addCriterion("classroom_id in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<String> values) {
            addCriterion("classroom_id not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(String value1, String value2) {
            addCriterion("classroom_id between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(String value1, String value2) {
            addCriterion("classroom_id not between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNull() {
            addCriterion("classroom_name is null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNotNull() {
            addCriterion("classroom_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameEqualTo(String value) {
            addCriterion("classroom_name =", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotEqualTo(String value) {
            addCriterion("classroom_name <>", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThan(String value) {
            addCriterion("classroom_name >", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_name >=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThan(String value) {
            addCriterion("classroom_name <", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThanOrEqualTo(String value) {
            addCriterion("classroom_name <=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLike(String value) {
            addCriterion("classroom_name like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotLike(String value) {
            addCriterion("classroom_name not like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIn(List<String> values) {
            addCriterion("classroom_name in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotIn(List<String> values) {
            addCriterion("classroom_name not in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameBetween(String value1, String value2) {
            addCriterion("classroom_name between", value1, value2, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotBetween(String value1, String value2) {
            addCriterion("classroom_name not between", value1, value2, "classroomName");
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

        public Criteria andClassplanTimeIsNull() {
            addCriterion("classplan_time is null");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeIsNotNull() {
            addCriterion("classplan_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeEqualTo(String value) {
            addCriterion("classplan_time =", value, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeNotEqualTo(String value) {
            addCriterion("classplan_time <>", value, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeGreaterThan(String value) {
            addCriterion("classplan_time >", value, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeGreaterThanOrEqualTo(String value) {
            addCriterion("classplan_time >=", value, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeLessThan(String value) {
            addCriterion("classplan_time <", value, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeLessThanOrEqualTo(String value) {
            addCriterion("classplan_time <=", value, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeLike(String value) {
            addCriterion("classplan_time like", value, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeNotLike(String value) {
            addCriterion("classplan_time not like", value, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeIn(List<String> values) {
            addCriterion("classplan_time in", values, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeNotIn(List<String> values) {
            addCriterion("classplan_time not in", values, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeBetween(String value1, String value2) {
            addCriterion("classplan_time between", value1, value2, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanTimeNotBetween(String value1, String value2) {
            addCriterion("classplan_time not between", value1, value2, "classplanTime");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumIsNull() {
            addCriterion("classplan_classNum is null");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumIsNotNull() {
            addCriterion("classplan_classNum is not null");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumEqualTo(Integer value) {
            addCriterion("classplan_classNum =", value, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumNotEqualTo(Integer value) {
            addCriterion("classplan_classNum <>", value, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumGreaterThan(Integer value) {
            addCriterion("classplan_classNum >", value, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("classplan_classNum >=", value, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumLessThan(Integer value) {
            addCriterion("classplan_classNum <", value, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumLessThanOrEqualTo(Integer value) {
            addCriterion("classplan_classNum <=", value, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumIn(List<Integer> values) {
            addCriterion("classplan_classNum in", values, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumNotIn(List<Integer> values) {
            addCriterion("classplan_classNum not in", values, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumBetween(Integer value1, Integer value2) {
            addCriterion("classplan_classNum between", value1, value2, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanClassnumNotBetween(Integer value1, Integer value2) {
            addCriterion("classplan_classNum not between", value1, value2, "classplanClassnum");
            return (Criteria) this;
        }

        public Criteria andClassplanDayIsNull() {
            addCriterion("classplan_day is null");
            return (Criteria) this;
        }

        public Criteria andClassplanDayIsNotNull() {
            addCriterion("classplan_day is not null");
            return (Criteria) this;
        }

        public Criteria andClassplanDayEqualTo(Integer value) {
            addCriterion("classplan_day =", value, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanDayNotEqualTo(Integer value) {
            addCriterion("classplan_day <>", value, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanDayGreaterThan(Integer value) {
            addCriterion("classplan_day >", value, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("classplan_day >=", value, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanDayLessThan(Integer value) {
            addCriterion("classplan_day <", value, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanDayLessThanOrEqualTo(Integer value) {
            addCriterion("classplan_day <=", value, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanDayIn(List<Integer> values) {
            addCriterion("classplan_day in", values, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanDayNotIn(List<Integer> values) {
            addCriterion("classplan_day not in", values, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanDayBetween(Integer value1, Integer value2) {
            addCriterion("classplan_day between", value1, value2, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanDayNotBetween(Integer value1, Integer value2) {
            addCriterion("classplan_day not between", value1, value2, "classplanDay");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekIsNull() {
            addCriterion("classplan_week is null");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekIsNotNull() {
            addCriterion("classplan_week is not null");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekEqualTo(Integer value) {
            addCriterion("classplan_week =", value, "classplanWeek");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekNotEqualTo(Integer value) {
            addCriterion("classplan_week <>", value, "classplanWeek");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekGreaterThan(Integer value) {
            addCriterion("classplan_week >", value, "classplanWeek");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("classplan_week >=", value, "classplanWeek");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekLessThan(Integer value) {
            addCriterion("classplan_week <", value, "classplanWeek");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekLessThanOrEqualTo(Integer value) {
            addCriterion("classplan_week <=", value, "classplanWeek");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekIn(List<Integer> values) {
            addCriterion("classplan_week in", values, "classplanWeek");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekNotIn(List<Integer> values) {
            addCriterion("classplan_week not in", values, "classplanWeek");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekBetween(Integer value1, Integer value2) {
            addCriterion("classplan_week between", value1, value2, "classplanWeek");
            return (Criteria) this;
        }

        public Criteria andClassplanWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("classplan_week not between", value1, value2, "classplanWeek");
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