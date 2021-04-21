package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andScoreIdIsNull() {
            addCriterion("score_id is null");
            return (Criteria) this;
        }

        public Criteria andScoreIdIsNotNull() {
            addCriterion("score_id is not null");
            return (Criteria) this;
        }

        public Criteria andScoreIdEqualTo(String value) {
            addCriterion("score_id =", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotEqualTo(String value) {
            addCriterion("score_id <>", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThan(String value) {
            addCriterion("score_id >", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("score_id >=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThan(String value) {
            addCriterion("score_id <", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThanOrEqualTo(String value) {
            addCriterion("score_id <=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLike(String value) {
            addCriterion("score_id like", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotLike(String value) {
            addCriterion("score_id not like", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdIn(List<String> values) {
            addCriterion("score_id in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotIn(List<String> values) {
            addCriterion("score_id not in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdBetween(String value1, String value2) {
            addCriterion("score_id between", value1, value2, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotBetween(String value1, String value2) {
            addCriterion("score_id not between", value1, value2, "scoreId");
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

        public Criteria andScoreDeduceIsNull() {
            addCriterion("score_deduce is null");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceIsNotNull() {
            addCriterion("score_deduce is not null");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceEqualTo(Integer value) {
            addCriterion("score_deduce =", value, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceNotEqualTo(Integer value) {
            addCriterion("score_deduce <>", value, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceGreaterThan(Integer value) {
            addCriterion("score_deduce >", value, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_deduce >=", value, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceLessThan(Integer value) {
            addCriterion("score_deduce <", value, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceLessThanOrEqualTo(Integer value) {
            addCriterion("score_deduce <=", value, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceIn(List<Integer> values) {
            addCriterion("score_deduce in", values, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceNotIn(List<Integer> values) {
            addCriterion("score_deduce not in", values, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceBetween(Integer value1, Integer value2) {
            addCriterion("score_deduce between", value1, value2, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreDeduceNotBetween(Integer value1, Integer value2) {
            addCriterion("score_deduce not between", value1, value2, "scoreDeduce");
            return (Criteria) this;
        }

        public Criteria andScoreMidIsNull() {
            addCriterion("score_mid is null");
            return (Criteria) this;
        }

        public Criteria andScoreMidIsNotNull() {
            addCriterion("score_mid is not null");
            return (Criteria) this;
        }

        public Criteria andScoreMidEqualTo(Integer value) {
            addCriterion("score_mid =", value, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreMidNotEqualTo(Integer value) {
            addCriterion("score_mid <>", value, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreMidGreaterThan(Integer value) {
            addCriterion("score_mid >", value, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_mid >=", value, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreMidLessThan(Integer value) {
            addCriterion("score_mid <", value, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreMidLessThanOrEqualTo(Integer value) {
            addCriterion("score_mid <=", value, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreMidIn(List<Integer> values) {
            addCriterion("score_mid in", values, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreMidNotIn(List<Integer> values) {
            addCriterion("score_mid not in", values, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreMidBetween(Integer value1, Integer value2) {
            addCriterion("score_mid between", value1, value2, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreMidNotBetween(Integer value1, Integer value2) {
            addCriterion("score_mid not between", value1, value2, "scoreMid");
            return (Criteria) this;
        }

        public Criteria andScoreTestIsNull() {
            addCriterion("score_test is null");
            return (Criteria) this;
        }

        public Criteria andScoreTestIsNotNull() {
            addCriterion("score_test is not null");
            return (Criteria) this;
        }

        public Criteria andScoreTestEqualTo(Integer value) {
            addCriterion("score_test =", value, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreTestNotEqualTo(Integer value) {
            addCriterion("score_test <>", value, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreTestGreaterThan(Integer value) {
            addCriterion("score_test >", value, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreTestGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_test >=", value, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreTestLessThan(Integer value) {
            addCriterion("score_test <", value, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreTestLessThanOrEqualTo(Integer value) {
            addCriterion("score_test <=", value, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreTestIn(List<Integer> values) {
            addCriterion("score_test in", values, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreTestNotIn(List<Integer> values) {
            addCriterion("score_test not in", values, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreTestBetween(Integer value1, Integer value2) {
            addCriterion("score_test between", value1, value2, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreTestNotBetween(Integer value1, Integer value2) {
            addCriterion("score_test not between", value1, value2, "scoreTest");
            return (Criteria) this;
        }

        public Criteria andScoreUsualIsNull() {
            addCriterion("score_usual is null");
            return (Criteria) this;
        }

        public Criteria andScoreUsualIsNotNull() {
            addCriterion("score_usual is not null");
            return (Criteria) this;
        }

        public Criteria andScoreUsualEqualTo(Integer value) {
            addCriterion("score_usual =", value, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreUsualNotEqualTo(Integer value) {
            addCriterion("score_usual <>", value, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreUsualGreaterThan(Integer value) {
            addCriterion("score_usual >", value, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreUsualGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_usual >=", value, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreUsualLessThan(Integer value) {
            addCriterion("score_usual <", value, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreUsualLessThanOrEqualTo(Integer value) {
            addCriterion("score_usual <=", value, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreUsualIn(List<Integer> values) {
            addCriterion("score_usual in", values, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreUsualNotIn(List<Integer> values) {
            addCriterion("score_usual not in", values, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreUsualBetween(Integer value1, Integer value2) {
            addCriterion("score_usual between", value1, value2, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreUsualNotBetween(Integer value1, Integer value2) {
            addCriterion("score_usual not between", value1, value2, "scoreUsual");
            return (Criteria) this;
        }

        public Criteria andScoreEndIsNull() {
            addCriterion("score_end is null");
            return (Criteria) this;
        }

        public Criteria andScoreEndIsNotNull() {
            addCriterion("score_end is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEndEqualTo(Integer value) {
            addCriterion("score_end =", value, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreEndNotEqualTo(Integer value) {
            addCriterion("score_end <>", value, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreEndGreaterThan(Integer value) {
            addCriterion("score_end >", value, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_end >=", value, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreEndLessThan(Integer value) {
            addCriterion("score_end <", value, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreEndLessThanOrEqualTo(Integer value) {
            addCriterion("score_end <=", value, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreEndIn(List<Integer> values) {
            addCriterion("score_end in", values, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreEndNotIn(List<Integer> values) {
            addCriterion("score_end not in", values, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreEndBetween(Integer value1, Integer value2) {
            addCriterion("score_end between", value1, value2, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreEndNotBetween(Integer value1, Integer value2) {
            addCriterion("score_end not between", value1, value2, "scoreEnd");
            return (Criteria) this;
        }

        public Criteria andScoreTotalIsNull() {
            addCriterion("score_total is null");
            return (Criteria) this;
        }

        public Criteria andScoreTotalIsNotNull() {
            addCriterion("score_total is not null");
            return (Criteria) this;
        }

        public Criteria andScoreTotalEqualTo(Integer value) {
            addCriterion("score_total =", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotEqualTo(Integer value) {
            addCriterion("score_total <>", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalGreaterThan(Integer value) {
            addCriterion("score_total >", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_total >=", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalLessThan(Integer value) {
            addCriterion("score_total <", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalLessThanOrEqualTo(Integer value) {
            addCriterion("score_total <=", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalIn(List<Integer> values) {
            addCriterion("score_total in", values, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotIn(List<Integer> values) {
            addCriterion("score_total not in", values, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalBetween(Integer value1, Integer value2) {
            addCriterion("score_total between", value1, value2, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("score_total not between", value1, value2, "scoreTotal");
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