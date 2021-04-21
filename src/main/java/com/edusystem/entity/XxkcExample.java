package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class XxkcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XxkcExample() {
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

        public Criteria andXxkcIdIsNull() {
            addCriterion("xxkc_id is null");
            return (Criteria) this;
        }

        public Criteria andXxkcIdIsNotNull() {
            addCriterion("xxkc_id is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcIdEqualTo(String value) {
            addCriterion("xxkc_id =", value, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdNotEqualTo(String value) {
            addCriterion("xxkc_id <>", value, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdGreaterThan(String value) {
            addCriterion("xxkc_id >", value, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdGreaterThanOrEqualTo(String value) {
            addCriterion("xxkc_id >=", value, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdLessThan(String value) {
            addCriterion("xxkc_id <", value, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdLessThanOrEqualTo(String value) {
            addCriterion("xxkc_id <=", value, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdLike(String value) {
            addCriterion("xxkc_id like", value, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdNotLike(String value) {
            addCriterion("xxkc_id not like", value, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdIn(List<String> values) {
            addCriterion("xxkc_id in", values, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdNotIn(List<String> values) {
            addCriterion("xxkc_id not in", values, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdBetween(String value1, String value2) {
            addCriterion("xxkc_id between", value1, value2, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcIdNotBetween(String value1, String value2) {
            addCriterion("xxkc_id not between", value1, value2, "xxkcId");
            return (Criteria) this;
        }

        public Criteria andXxkcNameIsNull() {
            addCriterion("xxkc_name is null");
            return (Criteria) this;
        }

        public Criteria andXxkcNameIsNotNull() {
            addCriterion("xxkc_name is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcNameEqualTo(String value) {
            addCriterion("xxkc_name =", value, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameNotEqualTo(String value) {
            addCriterion("xxkc_name <>", value, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameGreaterThan(String value) {
            addCriterion("xxkc_name >", value, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameGreaterThanOrEqualTo(String value) {
            addCriterion("xxkc_name >=", value, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameLessThan(String value) {
            addCriterion("xxkc_name <", value, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameLessThanOrEqualTo(String value) {
            addCriterion("xxkc_name <=", value, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameLike(String value) {
            addCriterion("xxkc_name like", value, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameNotLike(String value) {
            addCriterion("xxkc_name not like", value, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameIn(List<String> values) {
            addCriterion("xxkc_name in", values, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameNotIn(List<String> values) {
            addCriterion("xxkc_name not in", values, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameBetween(String value1, String value2) {
            addCriterion("xxkc_name between", value1, value2, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcNameNotBetween(String value1, String value2) {
            addCriterion("xxkc_name not between", value1, value2, "xxkcName");
            return (Criteria) this;
        }

        public Criteria andXxkcKindIsNull() {
            addCriterion("xxkc_kind is null");
            return (Criteria) this;
        }

        public Criteria andXxkcKindIsNotNull() {
            addCriterion("xxkc_kind is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcKindEqualTo(String value) {
            addCriterion("xxkc_kind =", value, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindNotEqualTo(String value) {
            addCriterion("xxkc_kind <>", value, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindGreaterThan(String value) {
            addCriterion("xxkc_kind >", value, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindGreaterThanOrEqualTo(String value) {
            addCriterion("xxkc_kind >=", value, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindLessThan(String value) {
            addCriterion("xxkc_kind <", value, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindLessThanOrEqualTo(String value) {
            addCriterion("xxkc_kind <=", value, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindLike(String value) {
            addCriterion("xxkc_kind like", value, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindNotLike(String value) {
            addCriterion("xxkc_kind not like", value, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindIn(List<String> values) {
            addCriterion("xxkc_kind in", values, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindNotIn(List<String> values) {
            addCriterion("xxkc_kind not in", values, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindBetween(String value1, String value2) {
            addCriterion("xxkc_kind between", value1, value2, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcKindNotBetween(String value1, String value2) {
            addCriterion("xxkc_kind not between", value1, value2, "xxkcKind");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditIsNull() {
            addCriterion("xxkc_credit is null");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditIsNotNull() {
            addCriterion("xxkc_credit is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditEqualTo(Integer value) {
            addCriterion("xxkc_credit =", value, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditNotEqualTo(Integer value) {
            addCriterion("xxkc_credit <>", value, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditGreaterThan(Integer value) {
            addCriterion("xxkc_credit >", value, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_credit >=", value, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditLessThan(Integer value) {
            addCriterion("xxkc_credit <", value, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_credit <=", value, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditIn(List<Integer> values) {
            addCriterion("xxkc_credit in", values, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditNotIn(List<Integer> values) {
            addCriterion("xxkc_credit not in", values, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_credit between", value1, value2, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_credit not between", value1, value2, "xxkcCredit");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursIsNull() {
            addCriterion("xxkc_learn_hours is null");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursIsNotNull() {
            addCriterion("xxkc_learn_hours is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursEqualTo(Integer value) {
            addCriterion("xxkc_learn_hours =", value, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursNotEqualTo(Integer value) {
            addCriterion("xxkc_learn_hours <>", value, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursGreaterThan(Integer value) {
            addCriterion("xxkc_learn_hours >", value, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_learn_hours >=", value, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursLessThan(Integer value) {
            addCriterion("xxkc_learn_hours <", value, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_learn_hours <=", value, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursIn(List<Integer> values) {
            addCriterion("xxkc_learn_hours in", values, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursNotIn(List<Integer> values) {
            addCriterion("xxkc_learn_hours not in", values, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_learn_hours between", value1, value2, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcLearnHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_learn_hours not between", value1, value2, "xxkcLearnHours");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitIsNull() {
            addCriterion("xxkc_maxlimit is null");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitIsNotNull() {
            addCriterion("xxkc_maxlimit is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitEqualTo(Integer value) {
            addCriterion("xxkc_maxlimit =", value, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitNotEqualTo(Integer value) {
            addCriterion("xxkc_maxlimit <>", value, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitGreaterThan(Integer value) {
            addCriterion("xxkc_maxlimit >", value, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_maxlimit >=", value, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitLessThan(Integer value) {
            addCriterion("xxkc_maxlimit <", value, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_maxlimit <=", value, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitIn(List<Integer> values) {
            addCriterion("xxkc_maxlimit in", values, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitNotIn(List<Integer> values) {
            addCriterion("xxkc_maxlimit not in", values, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_maxlimit between", value1, value2, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcMaxlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_maxlimit not between", value1, value2, "xxkcMaxlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumIsNull() {
            addCriterion("xxkc_selnum is null");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumIsNotNull() {
            addCriterion("xxkc_selnum is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumEqualTo(Integer value) {
            addCriterion("xxkc_selnum =", value, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumNotEqualTo(Integer value) {
            addCriterion("xxkc_selnum <>", value, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumGreaterThan(Integer value) {
            addCriterion("xxkc_selnum >", value, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_selnum >=", value, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumLessThan(Integer value) {
            addCriterion("xxkc_selnum <", value, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_selnum <=", value, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumIn(List<Integer> values) {
            addCriterion("xxkc_selnum in", values, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumNotIn(List<Integer> values) {
            addCriterion("xxkc_selnum not in", values, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_selnum between", value1, value2, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcSelnumNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_selnum not between", value1, value2, "xxkcSelnum");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitIsNull() {
            addCriterion("xxkc_gradelimit is null");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitIsNotNull() {
            addCriterion("xxkc_gradelimit is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitEqualTo(String value) {
            addCriterion("xxkc_gradelimit =", value, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitNotEqualTo(String value) {
            addCriterion("xxkc_gradelimit <>", value, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitGreaterThan(String value) {
            addCriterion("xxkc_gradelimit >", value, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitGreaterThanOrEqualTo(String value) {
            addCriterion("xxkc_gradelimit >=", value, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitLessThan(String value) {
            addCriterion("xxkc_gradelimit <", value, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitLessThanOrEqualTo(String value) {
            addCriterion("xxkc_gradelimit <=", value, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitLike(String value) {
            addCriterion("xxkc_gradelimit like", value, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitNotLike(String value) {
            addCriterion("xxkc_gradelimit not like", value, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitIn(List<String> values) {
            addCriterion("xxkc_gradelimit in", values, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitNotIn(List<String> values) {
            addCriterion("xxkc_gradelimit not in", values, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitBetween(String value1, String value2) {
            addCriterion("xxkc_gradelimit between", value1, value2, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcGradelimitNotBetween(String value1, String value2) {
            addCriterion("xxkc_gradelimit not between", value1, value2, "xxkcGradelimit");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearIsNull() {
            addCriterion("xxkc_academicYear is null");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearIsNotNull() {
            addCriterion("xxkc_academicYear is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearEqualTo(Integer value) {
            addCriterion("xxkc_academicYear =", value, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearNotEqualTo(Integer value) {
            addCriterion("xxkc_academicYear <>", value, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearGreaterThan(Integer value) {
            addCriterion("xxkc_academicYear >", value, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_academicYear >=", value, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearLessThan(Integer value) {
            addCriterion("xxkc_academicYear <", value, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_academicYear <=", value, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearIn(List<Integer> values) {
            addCriterion("xxkc_academicYear in", values, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearNotIn(List<Integer> values) {
            addCriterion("xxkc_academicYear not in", values, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_academicYear between", value1, value2, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademicyearNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_academicYear not between", value1, value2, "xxkcAcademicyear");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermIsNull() {
            addCriterion("xxkc_academicTerm is null");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermIsNotNull() {
            addCriterion("xxkc_academicTerm is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermEqualTo(Integer value) {
            addCriterion("xxkc_academicTerm =", value, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermNotEqualTo(Integer value) {
            addCriterion("xxkc_academicTerm <>", value, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermGreaterThan(Integer value) {
            addCriterion("xxkc_academicTerm >", value, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_academicTerm >=", value, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermLessThan(Integer value) {
            addCriterion("xxkc_academicTerm <", value, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_academicTerm <=", value, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermIn(List<Integer> values) {
            addCriterion("xxkc_academicTerm in", values, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermNotIn(List<Integer> values) {
            addCriterion("xxkc_academicTerm not in", values, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_academicTerm between", value1, value2, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcAcademictermNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_academicTerm not between", value1, value2, "xxkcAcademicterm");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeIsNull() {
            addCriterion("xxkc_startTime is null");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeIsNotNull() {
            addCriterion("xxkc_startTime is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeEqualTo(Integer value) {
            addCriterion("xxkc_startTime =", value, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeNotEqualTo(Integer value) {
            addCriterion("xxkc_startTime <>", value, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeGreaterThan(Integer value) {
            addCriterion("xxkc_startTime >", value, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_startTime >=", value, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeLessThan(Integer value) {
            addCriterion("xxkc_startTime <", value, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_startTime <=", value, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeIn(List<Integer> values) {
            addCriterion("xxkc_startTime in", values, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeNotIn(List<Integer> values) {
            addCriterion("xxkc_startTime not in", values, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_startTime between", value1, value2, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcStarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_startTime not between", value1, value2, "xxkcStarttime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeIsNull() {
            addCriterion("xxkc_endTime is null");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeIsNotNull() {
            addCriterion("xxkc_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeEqualTo(Integer value) {
            addCriterion("xxkc_endTime =", value, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeNotEqualTo(Integer value) {
            addCriterion("xxkc_endTime <>", value, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeGreaterThan(Integer value) {
            addCriterion("xxkc_endTime >", value, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_endTime >=", value, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeLessThan(Integer value) {
            addCriterion("xxkc_endTime <", value, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_endTime <=", value, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeIn(List<Integer> values) {
            addCriterion("xxkc_endTime in", values, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeNotIn(List<Integer> values) {
            addCriterion("xxkc_endTime not in", values, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_endTime between", value1, value2, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_endTime not between", value1, value2, "xxkcEndtime");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitIsNull() {
            addCriterion("xxkc_numLimit is null");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitIsNotNull() {
            addCriterion("xxkc_numLimit is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitEqualTo(Integer value) {
            addCriterion("xxkc_numLimit =", value, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitNotEqualTo(Integer value) {
            addCriterion("xxkc_numLimit <>", value, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitGreaterThan(Integer value) {
            addCriterion("xxkc_numLimit >", value, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_numLimit >=", value, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitLessThan(Integer value) {
            addCriterion("xxkc_numLimit <", value, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_numLimit <=", value, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitIn(List<Integer> values) {
            addCriterion("xxkc_numLimit in", values, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitNotIn(List<Integer> values) {
            addCriterion("xxkc_numLimit not in", values, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_numLimit between", value1, value2, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcNumlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_numLimit not between", value1, value2, "xxkcNumlimit");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankIsNull() {
            addCriterion("xxkc_isRank is null");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankIsNotNull() {
            addCriterion("xxkc_isRank is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankEqualTo(Integer value) {
            addCriterion("xxkc_isRank =", value, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankNotEqualTo(Integer value) {
            addCriterion("xxkc_isRank <>", value, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankGreaterThan(Integer value) {
            addCriterion("xxkc_isRank >", value, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxkc_isRank >=", value, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankLessThan(Integer value) {
            addCriterion("xxkc_isRank <", value, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankLessThanOrEqualTo(Integer value) {
            addCriterion("xxkc_isRank <=", value, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankIn(List<Integer> values) {
            addCriterion("xxkc_isRank in", values, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankNotIn(List<Integer> values) {
            addCriterion("xxkc_isRank not in", values, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_isRank between", value1, value2, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcIsrankNotBetween(Integer value1, Integer value2) {
            addCriterion("xxkc_isRank not between", value1, value2, "xxkcIsrank");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkIsNull() {
            addCriterion("xxkc_remaerk is null");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkIsNotNull() {
            addCriterion("xxkc_remaerk is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkEqualTo(String value) {
            addCriterion("xxkc_remaerk =", value, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkNotEqualTo(String value) {
            addCriterion("xxkc_remaerk <>", value, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkGreaterThan(String value) {
            addCriterion("xxkc_remaerk >", value, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkGreaterThanOrEqualTo(String value) {
            addCriterion("xxkc_remaerk >=", value, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkLessThan(String value) {
            addCriterion("xxkc_remaerk <", value, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkLessThanOrEqualTo(String value) {
            addCriterion("xxkc_remaerk <=", value, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkLike(String value) {
            addCriterion("xxkc_remaerk like", value, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkNotLike(String value) {
            addCriterion("xxkc_remaerk not like", value, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkIn(List<String> values) {
            addCriterion("xxkc_remaerk in", values, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkNotIn(List<String> values) {
            addCriterion("xxkc_remaerk not in", values, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkBetween(String value1, String value2) {
            addCriterion("xxkc_remaerk between", value1, value2, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcRemaerkNotBetween(String value1, String value2) {
            addCriterion("xxkc_remaerk not between", value1, value2, "xxkcRemaerk");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseIsNull() {
            addCriterion("xxkc_sourse is null");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseIsNotNull() {
            addCriterion("xxkc_sourse is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseEqualTo(String value) {
            addCriterion("xxkc_sourse =", value, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseNotEqualTo(String value) {
            addCriterion("xxkc_sourse <>", value, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseGreaterThan(String value) {
            addCriterion("xxkc_sourse >", value, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseGreaterThanOrEqualTo(String value) {
            addCriterion("xxkc_sourse >=", value, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseLessThan(String value) {
            addCriterion("xxkc_sourse <", value, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseLessThanOrEqualTo(String value) {
            addCriterion("xxkc_sourse <=", value, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseLike(String value) {
            addCriterion("xxkc_sourse like", value, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseNotLike(String value) {
            addCriterion("xxkc_sourse not like", value, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseIn(List<String> values) {
            addCriterion("xxkc_sourse in", values, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseNotIn(List<String> values) {
            addCriterion("xxkc_sourse not in", values, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseBetween(String value1, String value2) {
            addCriterion("xxkc_sourse between", value1, value2, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseNotBetween(String value1, String value2) {
            addCriterion("xxkc_sourse not between", value1, value2, "xxkcSourse");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidIsNull() {
            addCriterion("xxkc_kindId is null");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidIsNotNull() {
            addCriterion("xxkc_kindId is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidEqualTo(String value) {
            addCriterion("xxkc_kindId =", value, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidNotEqualTo(String value) {
            addCriterion("xxkc_kindId <>", value, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidGreaterThan(String value) {
            addCriterion("xxkc_kindId >", value, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidGreaterThanOrEqualTo(String value) {
            addCriterion("xxkc_kindId >=", value, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidLessThan(String value) {
            addCriterion("xxkc_kindId <", value, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidLessThanOrEqualTo(String value) {
            addCriterion("xxkc_kindId <=", value, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidLike(String value) {
            addCriterion("xxkc_kindId like", value, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidNotLike(String value) {
            addCriterion("xxkc_kindId not like", value, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidIn(List<String> values) {
            addCriterion("xxkc_kindId in", values, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidNotIn(List<String> values) {
            addCriterion("xxkc_kindId not in", values, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidBetween(String value1, String value2) {
            addCriterion("xxkc_kindId between", value1, value2, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcKindidNotBetween(String value1, String value2) {
            addCriterion("xxkc_kindId not between", value1, value2, "xxkcKindid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidIsNull() {
            addCriterion("xxkc_SourseId is null");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidIsNotNull() {
            addCriterion("xxkc_SourseId is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidEqualTo(String value) {
            addCriterion("xxkc_SourseId =", value, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidNotEqualTo(String value) {
            addCriterion("xxkc_SourseId <>", value, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidGreaterThan(String value) {
            addCriterion("xxkc_SourseId >", value, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidGreaterThanOrEqualTo(String value) {
            addCriterion("xxkc_SourseId >=", value, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidLessThan(String value) {
            addCriterion("xxkc_SourseId <", value, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidLessThanOrEqualTo(String value) {
            addCriterion("xxkc_SourseId <=", value, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidLike(String value) {
            addCriterion("xxkc_SourseId like", value, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidNotLike(String value) {
            addCriterion("xxkc_SourseId not like", value, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidIn(List<String> values) {
            addCriterion("xxkc_SourseId in", values, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidNotIn(List<String> values) {
            addCriterion("xxkc_SourseId not in", values, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidBetween(String value1, String value2) {
            addCriterion("xxkc_SourseId between", value1, value2, "xxkcSourseid");
            return (Criteria) this;
        }

        public Criteria andXxkcSourseidNotBetween(String value1, String value2) {
            addCriterion("xxkc_SourseId not between", value1, value2, "xxkcSourseid");
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