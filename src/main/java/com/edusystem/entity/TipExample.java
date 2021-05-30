package com.edusystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TipExample() {
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

        public Criteria andTipIdIsNull() {
            addCriterion("tip_id is null");
            return (Criteria) this;
        }

        public Criteria andTipIdIsNotNull() {
            addCriterion("tip_id is not null");
            return (Criteria) this;
        }

        public Criteria andTipIdEqualTo(String value) {
            addCriterion("tip_id =", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdNotEqualTo(String value) {
            addCriterion("tip_id <>", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdGreaterThan(String value) {
            addCriterion("tip_id >", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdGreaterThanOrEqualTo(String value) {
            addCriterion("tip_id >=", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdLessThan(String value) {
            addCriterion("tip_id <", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdLessThanOrEqualTo(String value) {
            addCriterion("tip_id <=", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdLike(String value) {
            addCriterion("tip_id like", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdNotLike(String value) {
            addCriterion("tip_id not like", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdIn(List<String> values) {
            addCriterion("tip_id in", values, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdNotIn(List<String> values) {
            addCriterion("tip_id not in", values, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdBetween(String value1, String value2) {
            addCriterion("tip_id between", value1, value2, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdNotBetween(String value1, String value2) {
            addCriterion("tip_id not between", value1, value2, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipUseridIsNull() {
            addCriterion("tip_userid is null");
            return (Criteria) this;
        }

        public Criteria andTipUseridIsNotNull() {
            addCriterion("tip_userid is not null");
            return (Criteria) this;
        }

        public Criteria andTipUseridEqualTo(String value) {
            addCriterion("tip_userid =", value, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridNotEqualTo(String value) {
            addCriterion("tip_userid <>", value, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridGreaterThan(String value) {
            addCriterion("tip_userid >", value, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridGreaterThanOrEqualTo(String value) {
            addCriterion("tip_userid >=", value, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridLessThan(String value) {
            addCriterion("tip_userid <", value, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridLessThanOrEqualTo(String value) {
            addCriterion("tip_userid <=", value, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridLike(String value) {
            addCriterion("tip_userid like", value, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridNotLike(String value) {
            addCriterion("tip_userid not like", value, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridIn(List<String> values) {
            addCriterion("tip_userid in", values, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridNotIn(List<String> values) {
            addCriterion("tip_userid not in", values, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridBetween(String value1, String value2) {
            addCriterion("tip_userid between", value1, value2, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipUseridNotBetween(String value1, String value2) {
            addCriterion("tip_userid not between", value1, value2, "tipUserid");
            return (Criteria) this;
        }

        public Criteria andTipKindIsNull() {
            addCriterion("tip_kind is null");
            return (Criteria) this;
        }

        public Criteria andTipKindIsNotNull() {
            addCriterion("tip_kind is not null");
            return (Criteria) this;
        }

        public Criteria andTipKindEqualTo(Integer value) {
            addCriterion("tip_kind =", value, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipKindNotEqualTo(Integer value) {
            addCriterion("tip_kind <>", value, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipKindGreaterThan(Integer value) {
            addCriterion("tip_kind >", value, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("tip_kind >=", value, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipKindLessThan(Integer value) {
            addCriterion("tip_kind <", value, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipKindLessThanOrEqualTo(Integer value) {
            addCriterion("tip_kind <=", value, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipKindIn(List<Integer> values) {
            addCriterion("tip_kind in", values, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipKindNotIn(List<Integer> values) {
            addCriterion("tip_kind not in", values, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipKindBetween(Integer value1, Integer value2) {
            addCriterion("tip_kind between", value1, value2, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipKindNotBetween(Integer value1, Integer value2) {
            addCriterion("tip_kind not between", value1, value2, "tipKind");
            return (Criteria) this;
        }

        public Criteria andTipContentIsNull() {
            addCriterion("tip_content is null");
            return (Criteria) this;
        }

        public Criteria andTipContentIsNotNull() {
            addCriterion("tip_content is not null");
            return (Criteria) this;
        }

        public Criteria andTipContentEqualTo(String value) {
            addCriterion("tip_content =", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentNotEqualTo(String value) {
            addCriterion("tip_content <>", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentGreaterThan(String value) {
            addCriterion("tip_content >", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentGreaterThanOrEqualTo(String value) {
            addCriterion("tip_content >=", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentLessThan(String value) {
            addCriterion("tip_content <", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentLessThanOrEqualTo(String value) {
            addCriterion("tip_content <=", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentLike(String value) {
            addCriterion("tip_content like", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentNotLike(String value) {
            addCriterion("tip_content not like", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentIn(List<String> values) {
            addCriterion("tip_content in", values, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentNotIn(List<String> values) {
            addCriterion("tip_content not in", values, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentBetween(String value1, String value2) {
            addCriterion("tip_content between", value1, value2, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentNotBetween(String value1, String value2) {
            addCriterion("tip_content not between", value1, value2, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipTimeIsNull() {
            addCriterion("tip_time is null");
            return (Criteria) this;
        }

        public Criteria andTipTimeIsNotNull() {
            addCriterion("tip_time is not null");
            return (Criteria) this;
        }

        public Criteria andTipTimeEqualTo(Date value) {
            addCriterion("tip_time =", value, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipTimeNotEqualTo(Date value) {
            addCriterion("tip_time <>", value, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipTimeGreaterThan(Date value) {
            addCriterion("tip_time >", value, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tip_time >=", value, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipTimeLessThan(Date value) {
            addCriterion("tip_time <", value, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipTimeLessThanOrEqualTo(Date value) {
            addCriterion("tip_time <=", value, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipTimeIn(List<Date> values) {
            addCriterion("tip_time in", values, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipTimeNotIn(List<Date> values) {
            addCriterion("tip_time not in", values, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipTimeBetween(Date value1, Date value2) {
            addCriterion("tip_time between", value1, value2, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipTimeNotBetween(Date value1, Date value2) {
            addCriterion("tip_time not between", value1, value2, "tipTime");
            return (Criteria) this;
        }

        public Criteria andTipIscheckIsNull() {
            addCriterion("tip_isCheck is null");
            return (Criteria) this;
        }

        public Criteria andTipIscheckIsNotNull() {
            addCriterion("tip_isCheck is not null");
            return (Criteria) this;
        }

        public Criteria andTipIscheckEqualTo(Integer value) {
            addCriterion("tip_isCheck =", value, "tipIscheck");
            return (Criteria) this;
        }

        public Criteria andTipIscheckNotEqualTo(Integer value) {
            addCriterion("tip_isCheck <>", value, "tipIscheck");
            return (Criteria) this;
        }

        public Criteria andTipIscheckGreaterThan(Integer value) {
            addCriterion("tip_isCheck >", value, "tipIscheck");
            return (Criteria) this;
        }

        public Criteria andTipIscheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("tip_isCheck >=", value, "tipIscheck");
            return (Criteria) this;
        }

        public Criteria andTipIscheckLessThan(Integer value) {
            addCriterion("tip_isCheck <", value, "tipIscheck");
            return (Criteria) this;
        }

        public Criteria andTipIscheckLessThanOrEqualTo(Integer value) {
            addCriterion("tip_isCheck <=", value, "tipIscheck");
            return (Criteria) this;
        }

        public Criteria andTipIscheckIn(List<Integer> values) {
            addCriterion("tip_isCheck in", values, "tipIscheck");
            return (Criteria) this;
        }

        public Criteria andTipIscheckNotIn(List<Integer> values) {
            addCriterion("tip_isCheck not in", values, "tipIscheck");
            return (Criteria) this;
        }

        public Criteria andTipIscheckBetween(Integer value1, Integer value2) {
            addCriterion("tip_isCheck between", value1, value2, "tipIscheck");
            return (Criteria) this;
        }

        public Criteria andTipIscheckNotBetween(Integer value1, Integer value2) {
            addCriterion("tip_isCheck not between", value1, value2, "tipIscheck");
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