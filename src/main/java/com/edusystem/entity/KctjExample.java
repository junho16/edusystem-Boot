package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class KctjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KctjExample() {
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

        public Criteria andKctjIdIsNull() {
            addCriterion("kctj_id is null");
            return (Criteria) this;
        }

        public Criteria andKctjIdIsNotNull() {
            addCriterion("kctj_id is not null");
            return (Criteria) this;
        }

        public Criteria andKctjIdEqualTo(Integer value) {
            addCriterion("kctj_id =", value, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjIdNotEqualTo(Integer value) {
            addCriterion("kctj_id <>", value, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjIdGreaterThan(Integer value) {
            addCriterion("kctj_id >", value, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kctj_id >=", value, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjIdLessThan(Integer value) {
            addCriterion("kctj_id <", value, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjIdLessThanOrEqualTo(Integer value) {
            addCriterion("kctj_id <=", value, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjIdIn(List<Integer> values) {
            addCriterion("kctj_id in", values, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjIdNotIn(List<Integer> values) {
            addCriterion("kctj_id not in", values, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjIdBetween(Integer value1, Integer value2) {
            addCriterion("kctj_id between", value1, value2, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kctj_id not between", value1, value2, "kctjId");
            return (Criteria) this;
        }

        public Criteria andKctjScoreIsNull() {
            addCriterion("kctj_score is null");
            return (Criteria) this;
        }

        public Criteria andKctjScoreIsNotNull() {
            addCriterion("kctj_score is not null");
            return (Criteria) this;
        }

        public Criteria andKctjScoreEqualTo(Double value) {
            addCriterion("kctj_score =", value, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjScoreNotEqualTo(Double value) {
            addCriterion("kctj_score <>", value, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjScoreGreaterThan(Double value) {
            addCriterion("kctj_score >", value, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("kctj_score >=", value, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjScoreLessThan(Double value) {
            addCriterion("kctj_score <", value, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjScoreLessThanOrEqualTo(Double value) {
            addCriterion("kctj_score <=", value, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjScoreIn(List<Double> values) {
            addCriterion("kctj_score in", values, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjScoreNotIn(List<Double> values) {
            addCriterion("kctj_score not in", values, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjScoreBetween(Double value1, Double value2) {
            addCriterion("kctj_score between", value1, value2, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjScoreNotBetween(Double value1, Double value2) {
            addCriterion("kctj_score not between", value1, value2, "kctjScore");
            return (Criteria) this;
        }

        public Criteria andKctjHourIsNull() {
            addCriterion("kctj_hour is null");
            return (Criteria) this;
        }

        public Criteria andKctjHourIsNotNull() {
            addCriterion("kctj_hour is not null");
            return (Criteria) this;
        }

        public Criteria andKctjHourEqualTo(Double value) {
            addCriterion("kctj_hour =", value, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjHourNotEqualTo(Double value) {
            addCriterion("kctj_hour <>", value, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjHourGreaterThan(Double value) {
            addCriterion("kctj_hour >", value, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjHourGreaterThanOrEqualTo(Double value) {
            addCriterion("kctj_hour >=", value, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjHourLessThan(Double value) {
            addCriterion("kctj_hour <", value, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjHourLessThanOrEqualTo(Double value) {
            addCriterion("kctj_hour <=", value, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjHourIn(List<Double> values) {
            addCriterion("kctj_hour in", values, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjHourNotIn(List<Double> values) {
            addCriterion("kctj_hour not in", values, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjHourBetween(Double value1, Double value2) {
            addCriterion("kctj_hour between", value1, value2, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjHourNotBetween(Double value1, Double value2) {
            addCriterion("kctj_hour not between", value1, value2, "kctjHour");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumIsNull() {
            addCriterion("kctj_booknum is null");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumIsNotNull() {
            addCriterion("kctj_booknum is not null");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumEqualTo(String value) {
            addCriterion("kctj_booknum =", value, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumNotEqualTo(String value) {
            addCriterion("kctj_booknum <>", value, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumGreaterThan(String value) {
            addCriterion("kctj_booknum >", value, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumGreaterThanOrEqualTo(String value) {
            addCriterion("kctj_booknum >=", value, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumLessThan(String value) {
            addCriterion("kctj_booknum <", value, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumLessThanOrEqualTo(String value) {
            addCriterion("kctj_booknum <=", value, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumLike(String value) {
            addCriterion("kctj_booknum like", value, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumNotLike(String value) {
            addCriterion("kctj_booknum not like", value, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumIn(List<String> values) {
            addCriterion("kctj_booknum in", values, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumNotIn(List<String> values) {
            addCriterion("kctj_booknum not in", values, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumBetween(String value1, String value2) {
            addCriterion("kctj_booknum between", value1, value2, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjBooknumNotBetween(String value1, String value2) {
            addCriterion("kctj_booknum not between", value1, value2, "kctjBooknum");
            return (Criteria) this;
        }

        public Criteria andKctjPriceIsNull() {
            addCriterion("kctj_price is null");
            return (Criteria) this;
        }

        public Criteria andKctjPriceIsNotNull() {
            addCriterion("kctj_price is not null");
            return (Criteria) this;
        }

        public Criteria andKctjPriceEqualTo(Double value) {
            addCriterion("kctj_price =", value, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjPriceNotEqualTo(Double value) {
            addCriterion("kctj_price <>", value, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjPriceGreaterThan(Double value) {
            addCriterion("kctj_price >", value, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("kctj_price >=", value, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjPriceLessThan(Double value) {
            addCriterion("kctj_price <", value, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjPriceLessThanOrEqualTo(Double value) {
            addCriterion("kctj_price <=", value, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjPriceIn(List<Double> values) {
            addCriterion("kctj_price in", values, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjPriceNotIn(List<Double> values) {
            addCriterion("kctj_price not in", values, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjPriceBetween(Double value1, Double value2) {
            addCriterion("kctj_price between", value1, value2, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjPriceNotBetween(Double value1, Double value2) {
            addCriterion("kctj_price not between", value1, value2, "kctjPrice");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumIsNull() {
            addCriterion("kctj_studynum is null");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumIsNotNull() {
            addCriterion("kctj_studynum is not null");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumEqualTo(Double value) {
            addCriterion("kctj_studynum =", value, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumNotEqualTo(Double value) {
            addCriterion("kctj_studynum <>", value, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumGreaterThan(Double value) {
            addCriterion("kctj_studynum >", value, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumGreaterThanOrEqualTo(Double value) {
            addCriterion("kctj_studynum >=", value, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumLessThan(Double value) {
            addCriterion("kctj_studynum <", value, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumLessThanOrEqualTo(Double value) {
            addCriterion("kctj_studynum <=", value, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumIn(List<Double> values) {
            addCriterion("kctj_studynum in", values, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumNotIn(List<Double> values) {
            addCriterion("kctj_studynum not in", values, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumBetween(Double value1, Double value2) {
            addCriterion("kctj_studynum between", value1, value2, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjStudynumNotBetween(Double value1, Double value2) {
            addCriterion("kctj_studynum not between", value1, value2, "kctjStudynum");
            return (Criteria) this;
        }

        public Criteria andKctjLinkIsNull() {
            addCriterion("kctj_link is null");
            return (Criteria) this;
        }

        public Criteria andKctjLinkIsNotNull() {
            addCriterion("kctj_link is not null");
            return (Criteria) this;
        }

        public Criteria andKctjLinkEqualTo(String value) {
            addCriterion("kctj_link =", value, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkNotEqualTo(String value) {
            addCriterion("kctj_link <>", value, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkGreaterThan(String value) {
            addCriterion("kctj_link >", value, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkGreaterThanOrEqualTo(String value) {
            addCriterion("kctj_link >=", value, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkLessThan(String value) {
            addCriterion("kctj_link <", value, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkLessThanOrEqualTo(String value) {
            addCriterion("kctj_link <=", value, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkLike(String value) {
            addCriterion("kctj_link like", value, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkNotLike(String value) {
            addCriterion("kctj_link not like", value, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkIn(List<String> values) {
            addCriterion("kctj_link in", values, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkNotIn(List<String> values) {
            addCriterion("kctj_link not in", values, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkBetween(String value1, String value2) {
            addCriterion("kctj_link between", value1, value2, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjLinkNotBetween(String value1, String value2) {
            addCriterion("kctj_link not between", value1, value2, "kctjLink");
            return (Criteria) this;
        }

        public Criteria andKctjHardIsNull() {
            addCriterion("kctj_hard is null");
            return (Criteria) this;
        }

        public Criteria andKctjHardIsNotNull() {
            addCriterion("kctj_hard is not null");
            return (Criteria) this;
        }

        public Criteria andKctjHardEqualTo(String value) {
            addCriterion("kctj_hard =", value, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardNotEqualTo(String value) {
            addCriterion("kctj_hard <>", value, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardGreaterThan(String value) {
            addCriterion("kctj_hard >", value, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardGreaterThanOrEqualTo(String value) {
            addCriterion("kctj_hard >=", value, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardLessThan(String value) {
            addCriterion("kctj_hard <", value, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardLessThanOrEqualTo(String value) {
            addCriterion("kctj_hard <=", value, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardLike(String value) {
            addCriterion("kctj_hard like", value, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardNotLike(String value) {
            addCriterion("kctj_hard not like", value, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardIn(List<String> values) {
            addCriterion("kctj_hard in", values, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardNotIn(List<String> values) {
            addCriterion("kctj_hard not in", values, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardBetween(String value1, String value2) {
            addCriterion("kctj_hard between", value1, value2, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjHardNotBetween(String value1, String value2) {
            addCriterion("kctj_hard not between", value1, value2, "kctjHard");
            return (Criteria) this;
        }

        public Criteria andKctjTitleIsNull() {
            addCriterion("kctj_title is null");
            return (Criteria) this;
        }

        public Criteria andKctjTitleIsNotNull() {
            addCriterion("kctj_title is not null");
            return (Criteria) this;
        }

        public Criteria andKctjTitleEqualTo(String value) {
            addCriterion("kctj_title =", value, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleNotEqualTo(String value) {
            addCriterion("kctj_title <>", value, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleGreaterThan(String value) {
            addCriterion("kctj_title >", value, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleGreaterThanOrEqualTo(String value) {
            addCriterion("kctj_title >=", value, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleLessThan(String value) {
            addCriterion("kctj_title <", value, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleLessThanOrEqualTo(String value) {
            addCriterion("kctj_title <=", value, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleLike(String value) {
            addCriterion("kctj_title like", value, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleNotLike(String value) {
            addCriterion("kctj_title not like", value, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleIn(List<String> values) {
            addCriterion("kctj_title in", values, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleNotIn(List<String> values) {
            addCriterion("kctj_title not in", values, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleBetween(String value1, String value2) {
            addCriterion("kctj_title between", value1, value2, "kctjTitle");
            return (Criteria) this;
        }

        public Criteria andKctjTitleNotBetween(String value1, String value2) {
            addCriterion("kctj_title not between", value1, value2, "kctjTitle");
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