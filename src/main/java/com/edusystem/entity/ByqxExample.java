package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class ByqxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ByqxExample() {
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

        public Criteria andByqxIdIsNull() {
            addCriterion("byqx_id is null");
            return (Criteria) this;
        }

        public Criteria andByqxIdIsNotNull() {
            addCriterion("byqx_id is not null");
            return (Criteria) this;
        }

        public Criteria andByqxIdEqualTo(Integer value) {
            addCriterion("byqx_id =", value, "byqxId");
            return (Criteria) this;
        }

        public Criteria andByqxIdNotEqualTo(Integer value) {
            addCriterion("byqx_id <>", value, "byqxId");
            return (Criteria) this;
        }

        public Criteria andByqxIdGreaterThan(Integer value) {
            addCriterion("byqx_id >", value, "byqxId");
            return (Criteria) this;
        }

        public Criteria andByqxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("byqx_id >=", value, "byqxId");
            return (Criteria) this;
        }

        public Criteria andByqxIdLessThan(Integer value) {
            addCriterion("byqx_id <", value, "byqxId");
            return (Criteria) this;
        }

        public Criteria andByqxIdLessThanOrEqualTo(Integer value) {
            addCriterion("byqx_id <=", value, "byqxId");
            return (Criteria) this;
        }

        public Criteria andByqxIdIn(List<Integer> values) {
            addCriterion("byqx_id in", values, "byqxId");
            return (Criteria) this;
        }

        public Criteria andByqxIdNotIn(List<Integer> values) {
            addCriterion("byqx_id not in", values, "byqxId");
            return (Criteria) this;
        }

        public Criteria andByqxIdBetween(Integer value1, Integer value2) {
            addCriterion("byqx_id between", value1, value2, "byqxId");
            return (Criteria) this;
        }

        public Criteria andByqxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("byqx_id not between", value1, value2, "byqxId");
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

        public Criteria andByqxKindIsNull() {
            addCriterion("byqx_kind is null");
            return (Criteria) this;
        }

        public Criteria andByqxKindIsNotNull() {
            addCriterion("byqx_kind is not null");
            return (Criteria) this;
        }

        public Criteria andByqxKindEqualTo(Integer value) {
            addCriterion("byqx_kind =", value, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxKindNotEqualTo(Integer value) {
            addCriterion("byqx_kind <>", value, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxKindGreaterThan(Integer value) {
            addCriterion("byqx_kind >", value, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("byqx_kind >=", value, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxKindLessThan(Integer value) {
            addCriterion("byqx_kind <", value, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxKindLessThanOrEqualTo(Integer value) {
            addCriterion("byqx_kind <=", value, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxKindIn(List<Integer> values) {
            addCriterion("byqx_kind in", values, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxKindNotIn(List<Integer> values) {
            addCriterion("byqx_kind not in", values, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxKindBetween(Integer value1, Integer value2) {
            addCriterion("byqx_kind between", value1, value2, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxKindNotBetween(Integer value1, Integer value2) {
            addCriterion("byqx_kind not between", value1, value2, "byqxKind");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdIsNull() {
            addCriterion("byqx_name_id is null");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdIsNotNull() {
            addCriterion("byqx_name_id is not null");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdEqualTo(String value) {
            addCriterion("byqx_name_id =", value, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdNotEqualTo(String value) {
            addCriterion("byqx_name_id <>", value, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdGreaterThan(String value) {
            addCriterion("byqx_name_id >", value, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdGreaterThanOrEqualTo(String value) {
            addCriterion("byqx_name_id >=", value, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdLessThan(String value) {
            addCriterion("byqx_name_id <", value, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdLessThanOrEqualTo(String value) {
            addCriterion("byqx_name_id <=", value, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdLike(String value) {
            addCriterion("byqx_name_id like", value, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdNotLike(String value) {
            addCriterion("byqx_name_id not like", value, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdIn(List<String> values) {
            addCriterion("byqx_name_id in", values, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdNotIn(List<String> values) {
            addCriterion("byqx_name_id not in", values, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdBetween(String value1, String value2) {
            addCriterion("byqx_name_id between", value1, value2, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIdNotBetween(String value1, String value2) {
            addCriterion("byqx_name_id not between", value1, value2, "byqxNameId");
            return (Criteria) this;
        }

        public Criteria andByqxNameIsNull() {
            addCriterion("byqx_name is null");
            return (Criteria) this;
        }

        public Criteria andByqxNameIsNotNull() {
            addCriterion("byqx_name is not null");
            return (Criteria) this;
        }

        public Criteria andByqxNameEqualTo(String value) {
            addCriterion("byqx_name =", value, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameNotEqualTo(String value) {
            addCriterion("byqx_name <>", value, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameGreaterThan(String value) {
            addCriterion("byqx_name >", value, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameGreaterThanOrEqualTo(String value) {
            addCriterion("byqx_name >=", value, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameLessThan(String value) {
            addCriterion("byqx_name <", value, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameLessThanOrEqualTo(String value) {
            addCriterion("byqx_name <=", value, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameLike(String value) {
            addCriterion("byqx_name like", value, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameNotLike(String value) {
            addCriterion("byqx_name not like", value, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameIn(List<String> values) {
            addCriterion("byqx_name in", values, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameNotIn(List<String> values) {
            addCriterion("byqx_name not in", values, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameBetween(String value1, String value2) {
            addCriterion("byqx_name between", value1, value2, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxNameNotBetween(String value1, String value2) {
            addCriterion("byqx_name not between", value1, value2, "byqxName");
            return (Criteria) this;
        }

        public Criteria andByqxMydIsNull() {
            addCriterion("byqx_myd is null");
            return (Criteria) this;
        }

        public Criteria andByqxMydIsNotNull() {
            addCriterion("byqx_myd is not null");
            return (Criteria) this;
        }

        public Criteria andByqxMydEqualTo(Integer value) {
            addCriterion("byqx_myd =", value, "byqxMyd");
            return (Criteria) this;
        }

        public Criteria andByqxMydNotEqualTo(Integer value) {
            addCriterion("byqx_myd <>", value, "byqxMyd");
            return (Criteria) this;
        }

        public Criteria andByqxMydGreaterThan(Integer value) {
            addCriterion("byqx_myd >", value, "byqxMyd");
            return (Criteria) this;
        }

        public Criteria andByqxMydGreaterThanOrEqualTo(Integer value) {
            addCriterion("byqx_myd >=", value, "byqxMyd");
            return (Criteria) this;
        }

        public Criteria andByqxMydLessThan(Integer value) {
            addCriterion("byqx_myd <", value, "byqxMyd");
            return (Criteria) this;
        }

        public Criteria andByqxMydLessThanOrEqualTo(Integer value) {
            addCriterion("byqx_myd <=", value, "byqxMyd");
            return (Criteria) this;
        }

        public Criteria andByqxMydIn(List<Integer> values) {
            addCriterion("byqx_myd in", values, "byqxMyd");
            return (Criteria) this;
        }

        public Criteria andByqxMydNotIn(List<Integer> values) {
            addCriterion("byqx_myd not in", values, "byqxMyd");
            return (Criteria) this;
        }

        public Criteria andByqxMydBetween(Integer value1, Integer value2) {
            addCriterion("byqx_myd between", value1, value2, "byqxMyd");
            return (Criteria) this;
        }

        public Criteria andByqxMydNotBetween(Integer value1, Integer value2) {
            addCriterion("byqx_myd not between", value1, value2, "byqxMyd");
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