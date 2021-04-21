package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class PowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerExample() {
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

        public Criteria andPowerIdIsNull() {
            addCriterion("power_id is null");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNotNull() {
            addCriterion("power_id is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIdEqualTo(String value) {
            addCriterion("power_id =", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotEqualTo(String value) {
            addCriterion("power_id <>", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThan(String value) {
            addCriterion("power_id >", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("power_id >=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThan(String value) {
            addCriterion("power_id <", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThanOrEqualTo(String value) {
            addCriterion("power_id <=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLike(String value) {
            addCriterion("power_id like", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotLike(String value) {
            addCriterion("power_id not like", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIn(List<String> values) {
            addCriterion("power_id in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotIn(List<String> values) {
            addCriterion("power_id not in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdBetween(String value1, String value2) {
            addCriterion("power_id between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotBetween(String value1, String value2) {
            addCriterion("power_id not between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerRoseIsNull() {
            addCriterion("power_rose is null");
            return (Criteria) this;
        }

        public Criteria andPowerRoseIsNotNull() {
            addCriterion("power_rose is not null");
            return (Criteria) this;
        }

        public Criteria andPowerRoseEqualTo(Integer value) {
            addCriterion("power_rose =", value, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerRoseNotEqualTo(Integer value) {
            addCriterion("power_rose <>", value, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerRoseGreaterThan(Integer value) {
            addCriterion("power_rose >", value, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerRoseGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_rose >=", value, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerRoseLessThan(Integer value) {
            addCriterion("power_rose <", value, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerRoseLessThanOrEqualTo(Integer value) {
            addCriterion("power_rose <=", value, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerRoseIn(List<Integer> values) {
            addCriterion("power_rose in", values, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerRoseNotIn(List<Integer> values) {
            addCriterion("power_rose not in", values, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerRoseBetween(Integer value1, Integer value2) {
            addCriterion("power_rose between", value1, value2, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerRoseNotBetween(Integer value1, Integer value2) {
            addCriterion("power_rose not between", value1, value2, "powerRose");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptIsNull() {
            addCriterion("power_descript is null");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptIsNotNull() {
            addCriterion("power_descript is not null");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptEqualTo(String value) {
            addCriterion("power_descript =", value, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptNotEqualTo(String value) {
            addCriterion("power_descript <>", value, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptGreaterThan(String value) {
            addCriterion("power_descript >", value, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("power_descript >=", value, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptLessThan(String value) {
            addCriterion("power_descript <", value, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptLessThanOrEqualTo(String value) {
            addCriterion("power_descript <=", value, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptLike(String value) {
            addCriterion("power_descript like", value, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptNotLike(String value) {
            addCriterion("power_descript not like", value, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptIn(List<String> values) {
            addCriterion("power_descript in", values, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptNotIn(List<String> values) {
            addCriterion("power_descript not in", values, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptBetween(String value1, String value2) {
            addCriterion("power_descript between", value1, value2, "powerDescript");
            return (Criteria) this;
        }

        public Criteria andPowerDescriptNotBetween(String value1, String value2) {
            addCriterion("power_descript not between", value1, value2, "powerDescript");
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