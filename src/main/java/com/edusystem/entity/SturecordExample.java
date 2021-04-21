package com.edusystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SturecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SturecordExample() {
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

        public Criteria andSturecordPoliteIsNull() {
            addCriterion("sturecord_polite is null");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteIsNotNull() {
            addCriterion("sturecord_polite is not null");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteEqualTo(String value) {
            addCriterion("sturecord_polite =", value, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteNotEqualTo(String value) {
            addCriterion("sturecord_polite <>", value, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteGreaterThan(String value) {
            addCriterion("sturecord_polite >", value, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteGreaterThanOrEqualTo(String value) {
            addCriterion("sturecord_polite >=", value, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteLessThan(String value) {
            addCriterion("sturecord_polite <", value, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteLessThanOrEqualTo(String value) {
            addCriterion("sturecord_polite <=", value, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteLike(String value) {
            addCriterion("sturecord_polite like", value, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteNotLike(String value) {
            addCriterion("sturecord_polite not like", value, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteIn(List<String> values) {
            addCriterion("sturecord_polite in", values, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteNotIn(List<String> values) {
            addCriterion("sturecord_polite not in", values, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteBetween(String value1, String value2) {
            addCriterion("sturecord_polite between", value1, value2, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordPoliteNotBetween(String value1, String value2) {
            addCriterion("sturecord_polite not between", value1, value2, "sturecordPolite");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjIsNull() {
            addCriterion("sturecord_rdsj is null");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjIsNotNull() {
            addCriterion("sturecord_rdsj is not null");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjEqualTo(Date value) {
            addCriterionForJDBCDate("sturecord_rdsj =", value, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("sturecord_rdsj <>", value, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjGreaterThan(Date value) {
            addCriterionForJDBCDate("sturecord_rdsj >", value, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sturecord_rdsj >=", value, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjLessThan(Date value) {
            addCriterionForJDBCDate("sturecord_rdsj <", value, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sturecord_rdsj <=", value, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjIn(List<Date> values) {
            addCriterionForJDBCDate("sturecord_rdsj in", values, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("sturecord_rdsj not in", values, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sturecord_rdsj between", value1, value2, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordRdsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sturecord_rdsj not between", value1, value2, "sturecordRdsj");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateIsNull() {
            addCriterion("sturecord_graduateDate is null");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateIsNotNull() {
            addCriterion("sturecord_graduateDate is not null");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateEqualTo(Date value) {
            addCriterionForJDBCDate("sturecord_graduateDate =", value, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sturecord_graduateDate <>", value, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("sturecord_graduateDate >", value, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sturecord_graduateDate >=", value, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateLessThan(Date value) {
            addCriterionForJDBCDate("sturecord_graduateDate <", value, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sturecord_graduateDate <=", value, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateIn(List<Date> values) {
            addCriterionForJDBCDate("sturecord_graduateDate in", values, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sturecord_graduateDate not in", values, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sturecord_graduateDate between", value1, value2, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sturecord_graduateDate not between", value1, value2, "sturecordGraduatedate");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberIsNull() {
            addCriterion("sturecord_graduateNumber is null");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberIsNotNull() {
            addCriterion("sturecord_graduateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberEqualTo(String value) {
            addCriterion("sturecord_graduateNumber =", value, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberNotEqualTo(String value) {
            addCriterion("sturecord_graduateNumber <>", value, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberGreaterThan(String value) {
            addCriterion("sturecord_graduateNumber >", value, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("sturecord_graduateNumber >=", value, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberLessThan(String value) {
            addCriterion("sturecord_graduateNumber <", value, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberLessThanOrEqualTo(String value) {
            addCriterion("sturecord_graduateNumber <=", value, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberLike(String value) {
            addCriterion("sturecord_graduateNumber like", value, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberNotLike(String value) {
            addCriterion("sturecord_graduateNumber not like", value, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberIn(List<String> values) {
            addCriterion("sturecord_graduateNumber in", values, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberNotIn(List<String> values) {
            addCriterion("sturecord_graduateNumber not in", values, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberBetween(String value1, String value2) {
            addCriterion("sturecord_graduateNumber between", value1, value2, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordGraduatenumberNotBetween(String value1, String value2) {
            addCriterion("sturecord_graduateNumber not between", value1, value2, "sturecordGraduatenumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberIsNull() {
            addCriterion("sturecord_diplomaNumber is null");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberIsNotNull() {
            addCriterion("sturecord_diplomaNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberEqualTo(String value) {
            addCriterion("sturecord_diplomaNumber =", value, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberNotEqualTo(String value) {
            addCriterion("sturecord_diplomaNumber <>", value, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberGreaterThan(String value) {
            addCriterion("sturecord_diplomaNumber >", value, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberGreaterThanOrEqualTo(String value) {
            addCriterion("sturecord_diplomaNumber >=", value, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberLessThan(String value) {
            addCriterion("sturecord_diplomaNumber <", value, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberLessThanOrEqualTo(String value) {
            addCriterion("sturecord_diplomaNumber <=", value, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberLike(String value) {
            addCriterion("sturecord_diplomaNumber like", value, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberNotLike(String value) {
            addCriterion("sturecord_diplomaNumber not like", value, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberIn(List<String> values) {
            addCriterion("sturecord_diplomaNumber in", values, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberNotIn(List<String> values) {
            addCriterion("sturecord_diplomaNumber not in", values, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberBetween(String value1, String value2) {
            addCriterion("sturecord_diplomaNumber between", value1, value2, "sturecordDiplomanumber");
            return (Criteria) this;
        }

        public Criteria andSturecordDiplomanumberNotBetween(String value1, String value2) {
            addCriterion("sturecord_diplomaNumber not between", value1, value2, "sturecordDiplomanumber");
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