package com.edusystem.entity;

import java.util.ArrayList;
import java.util.List;

public class CollegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollegeExample() {
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

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalIsNull() {
            addCriterion("college_principal is null");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalIsNotNull() {
            addCriterion("college_principal is not null");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalEqualTo(String value) {
            addCriterion("college_principal =", value, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalNotEqualTo(String value) {
            addCriterion("college_principal <>", value, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalGreaterThan(String value) {
            addCriterion("college_principal >", value, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("college_principal >=", value, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalLessThan(String value) {
            addCriterion("college_principal <", value, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalLessThanOrEqualTo(String value) {
            addCriterion("college_principal <=", value, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalLike(String value) {
            addCriterion("college_principal like", value, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalNotLike(String value) {
            addCriterion("college_principal not like", value, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalIn(List<String> values) {
            addCriterion("college_principal in", values, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalNotIn(List<String> values) {
            addCriterion("college_principal not in", values, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalBetween(String value1, String value2) {
            addCriterion("college_principal between", value1, value2, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegePrincipalNotBetween(String value1, String value2) {
            addCriterion("college_principal not between", value1, value2, "collegePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumIsNull() {
            addCriterion("college_workernum is null");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumIsNotNull() {
            addCriterion("college_workernum is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumEqualTo(Integer value) {
            addCriterion("college_workernum =", value, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumNotEqualTo(Integer value) {
            addCriterion("college_workernum <>", value, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumGreaterThan(Integer value) {
            addCriterion("college_workernum >", value, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_workernum >=", value, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumLessThan(Integer value) {
            addCriterion("college_workernum <", value, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumLessThanOrEqualTo(Integer value) {
            addCriterion("college_workernum <=", value, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumIn(List<Integer> values) {
            addCriterion("college_workernum in", values, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumNotIn(List<Integer> values) {
            addCriterion("college_workernum not in", values, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumBetween(Integer value1, Integer value2) {
            addCriterion("college_workernum between", value1, value2, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeWorkernumNotBetween(Integer value1, Integer value2) {
            addCriterion("college_workernum not between", value1, value2, "collegeWorkernum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumIsNull() {
            addCriterion("college_studentnum is null");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumIsNotNull() {
            addCriterion("college_studentnum is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumEqualTo(Integer value) {
            addCriterion("college_studentnum =", value, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumNotEqualTo(Integer value) {
            addCriterion("college_studentnum <>", value, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumGreaterThan(Integer value) {
            addCriterion("college_studentnum >", value, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_studentnum >=", value, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumLessThan(Integer value) {
            addCriterion("college_studentnum <", value, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumLessThanOrEqualTo(Integer value) {
            addCriterion("college_studentnum <=", value, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumIn(List<Integer> values) {
            addCriterion("college_studentnum in", values, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumNotIn(List<Integer> values) {
            addCriterion("college_studentnum not in", values, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumBetween(Integer value1, Integer value2) {
            addCriterion("college_studentnum between", value1, value2, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegeStudentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("college_studentnum not between", value1, value2, "collegeStudentnum");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneIsNull() {
            addCriterion("college_phone is null");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneIsNotNull() {
            addCriterion("college_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneEqualTo(String value) {
            addCriterion("college_phone =", value, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneNotEqualTo(String value) {
            addCriterion("college_phone <>", value, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneGreaterThan(String value) {
            addCriterion("college_phone >", value, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("college_phone >=", value, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneLessThan(String value) {
            addCriterion("college_phone <", value, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneLessThanOrEqualTo(String value) {
            addCriterion("college_phone <=", value, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneLike(String value) {
            addCriterion("college_phone like", value, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneNotLike(String value) {
            addCriterion("college_phone not like", value, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneIn(List<String> values) {
            addCriterion("college_phone in", values, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneNotIn(List<String> values) {
            addCriterion("college_phone not in", values, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneBetween(String value1, String value2) {
            addCriterion("college_phone between", value1, value2, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegePhoneNotBetween(String value1, String value2) {
            addCriterion("college_phone not between", value1, value2, "collegePhone");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressIsNull() {
            addCriterion("college_address is null");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressIsNotNull() {
            addCriterion("college_address is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressEqualTo(String value) {
            addCriterion("college_address =", value, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressNotEqualTo(String value) {
            addCriterion("college_address <>", value, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressGreaterThan(String value) {
            addCriterion("college_address >", value, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("college_address >=", value, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressLessThan(String value) {
            addCriterion("college_address <", value, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressLessThanOrEqualTo(String value) {
            addCriterion("college_address <=", value, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressLike(String value) {
            addCriterion("college_address like", value, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressNotLike(String value) {
            addCriterion("college_address not like", value, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressIn(List<String> values) {
            addCriterion("college_address in", values, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressNotIn(List<String> values) {
            addCriterion("college_address not in", values, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressBetween(String value1, String value2) {
            addCriterion("college_address between", value1, value2, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeAddressNotBetween(String value1, String value2) {
            addCriterion("college_address not between", value1, value2, "collegeAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressIsNull() {
            addCriterion("college_buildingaddress is null");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressIsNotNull() {
            addCriterion("college_buildingaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressEqualTo(String value) {
            addCriterion("college_buildingaddress =", value, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressNotEqualTo(String value) {
            addCriterion("college_buildingaddress <>", value, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressGreaterThan(String value) {
            addCriterion("college_buildingaddress >", value, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressGreaterThanOrEqualTo(String value) {
            addCriterion("college_buildingaddress >=", value, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressLessThan(String value) {
            addCriterion("college_buildingaddress <", value, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressLessThanOrEqualTo(String value) {
            addCriterion("college_buildingaddress <=", value, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressLike(String value) {
            addCriterion("college_buildingaddress like", value, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressNotLike(String value) {
            addCriterion("college_buildingaddress not like", value, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressIn(List<String> values) {
            addCriterion("college_buildingaddress in", values, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressNotIn(List<String> values) {
            addCriterion("college_buildingaddress not in", values, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressBetween(String value1, String value2) {
            addCriterion("college_buildingaddress between", value1, value2, "collegeBuildingaddress");
            return (Criteria) this;
        }

        public Criteria andCollegeBuildingaddressNotBetween(String value1, String value2) {
            addCriterion("college_buildingaddress not between", value1, value2, "collegeBuildingaddress");
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