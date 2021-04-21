package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class ProfessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfessionExample() {
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

        public Criteria andProfessionCreateyearIsNull() {
            addCriterion("profession_createYear is null");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearIsNotNull() {
            addCriterion("profession_createYear is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearEqualTo(String value) {
            addCriterion("profession_createYear =", value, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearNotEqualTo(String value) {
            addCriterion("profession_createYear <>", value, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearGreaterThan(String value) {
            addCriterion("profession_createYear >", value, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearGreaterThanOrEqualTo(String value) {
            addCriterion("profession_createYear >=", value, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearLessThan(String value) {
            addCriterion("profession_createYear <", value, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearLessThanOrEqualTo(String value) {
            addCriterion("profession_createYear <=", value, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearLike(String value) {
            addCriterion("profession_createYear like", value, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearNotLike(String value) {
            addCriterion("profession_createYear not like", value, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearIn(List<String> values) {
            addCriterion("profession_createYear in", values, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearNotIn(List<String> values) {
            addCriterion("profession_createYear not in", values, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearBetween(String value1, String value2) {
            addCriterion("profession_createYear between", value1, value2, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionCreateyearNotBetween(String value1, String value2) {
            addCriterion("profession_createYear not between", value1, value2, "professionCreateyear");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumIsNull() {
            addCriterion("profession_studyYearNum is null");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumIsNotNull() {
            addCriterion("profession_studyYearNum is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumEqualTo(Integer value) {
            addCriterion("profession_studyYearNum =", value, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumNotEqualTo(Integer value) {
            addCriterion("profession_studyYearNum <>", value, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumGreaterThan(Integer value) {
            addCriterion("profession_studyYearNum >", value, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("profession_studyYearNum >=", value, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumLessThan(Integer value) {
            addCriterion("profession_studyYearNum <", value, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumLessThanOrEqualTo(Integer value) {
            addCriterion("profession_studyYearNum <=", value, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumIn(List<Integer> values) {
            addCriterion("profession_studyYearNum in", values, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumNotIn(List<Integer> values) {
            addCriterion("profession_studyYearNum not in", values, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumBetween(Integer value1, Integer value2) {
            addCriterion("profession_studyYearNum between", value1, value2, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionStudyyearnumNotBetween(Integer value1, Integer value2) {
            addCriterion("profession_studyYearNum not between", value1, value2, "professionStudyyearnum");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectIsNull() {
            addCriterion("profession_belongSubject is null");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectIsNotNull() {
            addCriterion("profession_belongSubject is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectEqualTo(String value) {
            addCriterion("profession_belongSubject =", value, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectNotEqualTo(String value) {
            addCriterion("profession_belongSubject <>", value, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectGreaterThan(String value) {
            addCriterion("profession_belongSubject >", value, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectGreaterThanOrEqualTo(String value) {
            addCriterion("profession_belongSubject >=", value, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectLessThan(String value) {
            addCriterion("profession_belongSubject <", value, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectLessThanOrEqualTo(String value) {
            addCriterion("profession_belongSubject <=", value, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectLike(String value) {
            addCriterion("profession_belongSubject like", value, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectNotLike(String value) {
            addCriterion("profession_belongSubject not like", value, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectIn(List<String> values) {
            addCriterion("profession_belongSubject in", values, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectNotIn(List<String> values) {
            addCriterion("profession_belongSubject not in", values, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectBetween(String value1, String value2) {
            addCriterion("profession_belongSubject between", value1, value2, "professionBelongsubject");
            return (Criteria) this;
        }

        public Criteria andProfessionBelongsubjectNotBetween(String value1, String value2) {
            addCriterion("profession_belongSubject not between", value1, value2, "professionBelongsubject");
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