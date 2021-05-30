package com.edusystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(String value) {
            addCriterion("notice_id =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(String value) {
            addCriterion("notice_id <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(String value) {
            addCriterion("notice_id >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(String value) {
            addCriterion("notice_id >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(String value) {
            addCriterion("notice_id <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(String value) {
            addCriterion("notice_id <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLike(String value) {
            addCriterion("notice_id like", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotLike(String value) {
            addCriterion("notice_id not like", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<String> values) {
            addCriterion("notice_id in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<String> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(String value1, String value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(String value1, String value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("notice_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("notice_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Date value) {
            addCriterion("notice_time =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Date value) {
            addCriterion("notice_time <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Date value) {
            addCriterion("notice_time >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_time >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Date value) {
            addCriterion("notice_time <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Date value) {
            addCriterion("notice_time <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Date> values) {
            addCriterion("notice_time in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Date> values) {
            addCriterion("notice_time not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Date value1, Date value2) {
            addCriterion("notice_time between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Date value1, Date value2) {
            addCriterion("notice_time not between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNull() {
            addCriterion("notice_title is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("notice_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("notice_title =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("notice_title <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("notice_title >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notice_title >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("notice_title <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("notice_title <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("notice_title like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("notice_title not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("notice_title in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("notice_title not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("notice_title between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("notice_title not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidIsNull() {
            addCriterion("notice_fromId is null");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidIsNotNull() {
            addCriterion("notice_fromId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidEqualTo(String value) {
            addCriterion("notice_fromId =", value, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidNotEqualTo(String value) {
            addCriterion("notice_fromId <>", value, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidGreaterThan(String value) {
            addCriterion("notice_fromId >", value, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidGreaterThanOrEqualTo(String value) {
            addCriterion("notice_fromId >=", value, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidLessThan(String value) {
            addCriterion("notice_fromId <", value, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidLessThanOrEqualTo(String value) {
            addCriterion("notice_fromId <=", value, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidLike(String value) {
            addCriterion("notice_fromId like", value, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidNotLike(String value) {
            addCriterion("notice_fromId not like", value, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidIn(List<String> values) {
            addCriterion("notice_fromId in", values, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidNotIn(List<String> values) {
            addCriterion("notice_fromId not in", values, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidBetween(String value1, String value2) {
            addCriterion("notice_fromId between", value1, value2, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeFromidNotBetween(String value1, String value2) {
            addCriterion("notice_fromId not between", value1, value2, "noticeFromid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidIsNull() {
            addCriterion("notice_toId is null");
            return (Criteria) this;
        }

        public Criteria andNoticeToidIsNotNull() {
            addCriterion("notice_toId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeToidEqualTo(String value) {
            addCriterion("notice_toId =", value, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidNotEqualTo(String value) {
            addCriterion("notice_toId <>", value, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidGreaterThan(String value) {
            addCriterion("notice_toId >", value, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidGreaterThanOrEqualTo(String value) {
            addCriterion("notice_toId >=", value, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidLessThan(String value) {
            addCriterion("notice_toId <", value, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidLessThanOrEqualTo(String value) {
            addCriterion("notice_toId <=", value, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidLike(String value) {
            addCriterion("notice_toId like", value, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidNotLike(String value) {
            addCriterion("notice_toId not like", value, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidIn(List<String> values) {
            addCriterion("notice_toId in", values, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidNotIn(List<String> values) {
            addCriterion("notice_toId not in", values, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidBetween(String value1, String value2) {
            addCriterion("notice_toId between", value1, value2, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeToidNotBetween(String value1, String value2) {
            addCriterion("notice_toId not between", value1, value2, "noticeToid");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenIsNull() {
            addCriterion("notice_isSeen is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenIsNotNull() {
            addCriterion("notice_isSeen is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenEqualTo(Integer value) {
            addCriterion("notice_isSeen =", value, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenNotEqualTo(Integer value) {
            addCriterion("notice_isSeen <>", value, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenGreaterThan(Integer value) {
            addCriterion("notice_isSeen >", value, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_isSeen >=", value, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenLessThan(Integer value) {
            addCriterion("notice_isSeen <", value, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenLessThanOrEqualTo(Integer value) {
            addCriterion("notice_isSeen <=", value, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenIn(List<Integer> values) {
            addCriterion("notice_isSeen in", values, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenNotIn(List<Integer> values) {
            addCriterion("notice_isSeen not in", values, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenBetween(Integer value1, Integer value2) {
            addCriterion("notice_isSeen between", value1, value2, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeIsseenNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_isSeen not between", value1, value2, "noticeIsseen");
            return (Criteria) this;
        }

        public Criteria andNoticeKindIsNull() {
            addCriterion("notice_kind is null");
            return (Criteria) this;
        }

        public Criteria andNoticeKindIsNotNull() {
            addCriterion("notice_kind is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeKindEqualTo(String value) {
            addCriterion("notice_kind =", value, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindNotEqualTo(String value) {
            addCriterion("notice_kind <>", value, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindGreaterThan(String value) {
            addCriterion("notice_kind >", value, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindGreaterThanOrEqualTo(String value) {
            addCriterion("notice_kind >=", value, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindLessThan(String value) {
            addCriterion("notice_kind <", value, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindLessThanOrEqualTo(String value) {
            addCriterion("notice_kind <=", value, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindLike(String value) {
            addCriterion("notice_kind like", value, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindNotLike(String value) {
            addCriterion("notice_kind not like", value, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindIn(List<String> values) {
            addCriterion("notice_kind in", values, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindNotIn(List<String> values) {
            addCriterion("notice_kind not in", values, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindBetween(String value1, String value2) {
            addCriterion("notice_kind between", value1, value2, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticeKindNotBetween(String value1, String value2) {
            addCriterion("notice_kind not between", value1, value2, "noticeKind");
            return (Criteria) this;
        }

        public Criteria andNoticePidIsNull() {
            addCriterion("notice_pid is null");
            return (Criteria) this;
        }

        public Criteria andNoticePidIsNotNull() {
            addCriterion("notice_pid is not null");
            return (Criteria) this;
        }

        public Criteria andNoticePidEqualTo(String value) {
            addCriterion("notice_pid =", value, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidNotEqualTo(String value) {
            addCriterion("notice_pid <>", value, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidGreaterThan(String value) {
            addCriterion("notice_pid >", value, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidGreaterThanOrEqualTo(String value) {
            addCriterion("notice_pid >=", value, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidLessThan(String value) {
            addCriterion("notice_pid <", value, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidLessThanOrEqualTo(String value) {
            addCriterion("notice_pid <=", value, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidLike(String value) {
            addCriterion("notice_pid like", value, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidNotLike(String value) {
            addCriterion("notice_pid not like", value, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidIn(List<String> values) {
            addCriterion("notice_pid in", values, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidNotIn(List<String> values) {
            addCriterion("notice_pid not in", values, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidBetween(String value1, String value2) {
            addCriterion("notice_pid between", value1, value2, "noticePid");
            return (Criteria) this;
        }

        public Criteria andNoticePidNotBetween(String value1, String value2) {
            addCriterion("notice_pid not between", value1, value2, "noticePid");
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