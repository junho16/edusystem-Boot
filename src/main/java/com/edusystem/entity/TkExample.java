package com.edusystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TkExample() {
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

        public Criteria andTkIdIsNull() {
            addCriterion("tk_id is null");
            return (Criteria) this;
        }

        public Criteria andTkIdIsNotNull() {
            addCriterion("tk_id is not null");
            return (Criteria) this;
        }

        public Criteria andTkIdEqualTo(String value) {
            addCriterion("tk_id =", value, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdNotEqualTo(String value) {
            addCriterion("tk_id <>", value, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdGreaterThan(String value) {
            addCriterion("tk_id >", value, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdGreaterThanOrEqualTo(String value) {
            addCriterion("tk_id >=", value, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdLessThan(String value) {
            addCriterion("tk_id <", value, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdLessThanOrEqualTo(String value) {
            addCriterion("tk_id <=", value, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdLike(String value) {
            addCriterion("tk_id like", value, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdNotLike(String value) {
            addCriterion("tk_id not like", value, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdIn(List<String> values) {
            addCriterion("tk_id in", values, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdNotIn(List<String> values) {
            addCriterion("tk_id not in", values, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdBetween(String value1, String value2) {
            addCriterion("tk_id between", value1, value2, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkIdNotBetween(String value1, String value2) {
            addCriterion("tk_id not between", value1, value2, "tkId");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidIsNull() {
            addCriterion("tk_tkjsId is null");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidIsNotNull() {
            addCriterion("tk_tkjsId is not null");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidEqualTo(String value) {
            addCriterion("tk_tkjsId =", value, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidNotEqualTo(String value) {
            addCriterion("tk_tkjsId <>", value, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidGreaterThan(String value) {
            addCriterion("tk_tkjsId >", value, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidGreaterThanOrEqualTo(String value) {
            addCriterion("tk_tkjsId >=", value, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidLessThan(String value) {
            addCriterion("tk_tkjsId <", value, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidLessThanOrEqualTo(String value) {
            addCriterion("tk_tkjsId <=", value, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidLike(String value) {
            addCriterion("tk_tkjsId like", value, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidNotLike(String value) {
            addCriterion("tk_tkjsId not like", value, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidIn(List<String> values) {
            addCriterion("tk_tkjsId in", values, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidNotIn(List<String> values) {
            addCriterion("tk_tkjsId not in", values, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidBetween(String value1, String value2) {
            addCriterion("tk_tkjsId between", value1, value2, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkTkjsidNotBetween(String value1, String value2) {
            addCriterion("tk_tkjsId not between", value1, value2, "tkTkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidIsNull() {
            addCriterion("tk_btkjsId is null");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidIsNotNull() {
            addCriterion("tk_btkjsId is not null");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidEqualTo(String value) {
            addCriterion("tk_btkjsId =", value, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidNotEqualTo(String value) {
            addCriterion("tk_btkjsId <>", value, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidGreaterThan(String value) {
            addCriterion("tk_btkjsId >", value, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidGreaterThanOrEqualTo(String value) {
            addCriterion("tk_btkjsId >=", value, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidLessThan(String value) {
            addCriterion("tk_btkjsId <", value, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidLessThanOrEqualTo(String value) {
            addCriterion("tk_btkjsId <=", value, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidLike(String value) {
            addCriterion("tk_btkjsId like", value, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidNotLike(String value) {
            addCriterion("tk_btkjsId not like", value, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidIn(List<String> values) {
            addCriterion("tk_btkjsId in", values, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidNotIn(List<String> values) {
            addCriterion("tk_btkjsId not in", values, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidBetween(String value1, String value2) {
            addCriterion("tk_btkjsId between", value1, value2, "tkBtkjsid");
            return (Criteria) this;
        }

        public Criteria andTkBtkjsidNotBetween(String value1, String value2) {
            addCriterion("tk_btkjsId not between", value1, value2, "tkBtkjsid");
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

        public Criteria andTkNeednumIsNull() {
            addCriterion("tk_needNum is null");
            return (Criteria) this;
        }

        public Criteria andTkNeednumIsNotNull() {
            addCriterion("tk_needNum is not null");
            return (Criteria) this;
        }

        public Criteria andTkNeednumEqualTo(Integer value) {
            addCriterion("tk_needNum =", value, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkNeednumNotEqualTo(Integer value) {
            addCriterion("tk_needNum <>", value, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkNeednumGreaterThan(Integer value) {
            addCriterion("tk_needNum >", value, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkNeednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tk_needNum >=", value, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkNeednumLessThan(Integer value) {
            addCriterion("tk_needNum <", value, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkNeednumLessThanOrEqualTo(Integer value) {
            addCriterion("tk_needNum <=", value, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkNeednumIn(List<Integer> values) {
            addCriterion("tk_needNum in", values, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkNeednumNotIn(List<Integer> values) {
            addCriterion("tk_needNum not in", values, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkNeednumBetween(Integer value1, Integer value2) {
            addCriterion("tk_needNum between", value1, value2, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkNeednumNotBetween(Integer value1, Integer value2) {
            addCriterion("tk_needNum not between", value1, value2, "tkNeednum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumIsNull() {
            addCriterion("tk_realNum is null");
            return (Criteria) this;
        }

        public Criteria andTkRealnumIsNotNull() {
            addCriterion("tk_realNum is not null");
            return (Criteria) this;
        }

        public Criteria andTkRealnumEqualTo(Integer value) {
            addCriterion("tk_realNum =", value, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumNotEqualTo(Integer value) {
            addCriterion("tk_realNum <>", value, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumGreaterThan(Integer value) {
            addCriterion("tk_realNum >", value, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tk_realNum >=", value, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumLessThan(Integer value) {
            addCriterion("tk_realNum <", value, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumLessThanOrEqualTo(Integer value) {
            addCriterion("tk_realNum <=", value, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumIn(List<Integer> values) {
            addCriterion("tk_realNum in", values, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumNotIn(List<Integer> values) {
            addCriterion("tk_realNum not in", values, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumBetween(Integer value1, Integer value2) {
            addCriterion("tk_realNum between", value1, value2, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkRealnumNotBetween(Integer value1, Integer value2) {
            addCriterion("tk_realNum not between", value1, value2, "tkRealnum");
            return (Criteria) this;
        }

        public Criteria andTkScoreIsNull() {
            addCriterion("tk_score is null");
            return (Criteria) this;
        }

        public Criteria andTkScoreIsNotNull() {
            addCriterion("tk_score is not null");
            return (Criteria) this;
        }

        public Criteria andTkScoreEqualTo(Integer value) {
            addCriterion("tk_score =", value, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkScoreNotEqualTo(Integer value) {
            addCriterion("tk_score <>", value, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkScoreGreaterThan(Integer value) {
            addCriterion("tk_score >", value, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("tk_score >=", value, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkScoreLessThan(Integer value) {
            addCriterion("tk_score <", value, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkScoreLessThanOrEqualTo(Integer value) {
            addCriterion("tk_score <=", value, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkScoreIn(List<Integer> values) {
            addCriterion("tk_score in", values, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkScoreNotIn(List<Integer> values) {
            addCriterion("tk_score not in", values, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkScoreBetween(Integer value1, Integer value2) {
            addCriterion("tk_score between", value1, value2, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("tk_score not between", value1, value2, "tkScore");
            return (Criteria) this;
        }

        public Criteria andTkCommentsIsNull() {
            addCriterion("tk_comments is null");
            return (Criteria) this;
        }

        public Criteria andTkCommentsIsNotNull() {
            addCriterion("tk_comments is not null");
            return (Criteria) this;
        }

        public Criteria andTkCommentsEqualTo(String value) {
            addCriterion("tk_comments =", value, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsNotEqualTo(String value) {
            addCriterion("tk_comments <>", value, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsGreaterThan(String value) {
            addCriterion("tk_comments >", value, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("tk_comments >=", value, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsLessThan(String value) {
            addCriterion("tk_comments <", value, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsLessThanOrEqualTo(String value) {
            addCriterion("tk_comments <=", value, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsLike(String value) {
            addCriterion("tk_comments like", value, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsNotLike(String value) {
            addCriterion("tk_comments not like", value, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsIn(List<String> values) {
            addCriterion("tk_comments in", values, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsNotIn(List<String> values) {
            addCriterion("tk_comments not in", values, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsBetween(String value1, String value2) {
            addCriterion("tk_comments between", value1, value2, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkCommentsNotBetween(String value1, String value2) {
            addCriterion("tk_comments not between", value1, value2, "tkComments");
            return (Criteria) this;
        }

        public Criteria andTkTimeIsNull() {
            addCriterion("tk_time is null");
            return (Criteria) this;
        }

        public Criteria andTkTimeIsNotNull() {
            addCriterion("tk_time is not null");
            return (Criteria) this;
        }

        public Criteria andTkTimeEqualTo(Date value) {
            addCriterion("tk_time =", value, "tkTime");
            return (Criteria) this;
        }

        public Criteria andTkTimeNotEqualTo(Date value) {
            addCriterion("tk_time <>", value, "tkTime");
            return (Criteria) this;
        }

        public Criteria andTkTimeGreaterThan(Date value) {
            addCriterion("tk_time >", value, "tkTime");
            return (Criteria) this;
        }

        public Criteria andTkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tk_time >=", value, "tkTime");
            return (Criteria) this;
        }

        public Criteria andTkTimeLessThan(Date value) {
            addCriterion("tk_time <", value, "tkTime");
            return (Criteria) this;
        }

        public Criteria andTkTimeLessThanOrEqualTo(Date value) {
            addCriterion("tk_time <=", value, "tkTime");
            return (Criteria) this;
        }

        public Criteria andTkTimeIn(List<Date> values) {
            addCriterion("tk_time in", values, "tkTime");
            return (Criteria) this;
        }

        public Criteria andTkTimeNotIn(List<Date> values) {
            addCriterion("tk_time not in", values, "tkTime");
            return (Criteria) this;
        }

        public Criteria andTkTimeBetween(Date value1, Date value2) {
            addCriterion("tk_time between", value1, value2, "tkTime");
            return (Criteria) this;
        }

        public Criteria andTkTimeNotBetween(Date value1, Date value2) {
            addCriterion("tk_time not between", value1, value2, "tkTime");
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