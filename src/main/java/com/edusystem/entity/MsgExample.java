package com.edusystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(String value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(String value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(String value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(String value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(String value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLike(String value) {
            addCriterion("msg_id like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotLike(String value) {
            addCriterion("msg_id not like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<String> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<String> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(String value1, String value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(String value1, String value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
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

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNull() {
            addCriterion("msg_title is null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNotNull() {
            addCriterion("msg_title is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleEqualTo(String value) {
            addCriterion("msg_title =", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotEqualTo(String value) {
            addCriterion("msg_title <>", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThan(String value) {
            addCriterion("msg_title >", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("msg_title >=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThan(String value) {
            addCriterion("msg_title <", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThanOrEqualTo(String value) {
            addCriterion("msg_title <=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLike(String value) {
            addCriterion("msg_title like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotLike(String value) {
            addCriterion("msg_title not like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIn(List<String> values) {
            addCriterion("msg_title in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotIn(List<String> values) {
            addCriterion("msg_title not in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleBetween(String value1, String value2) {
            addCriterion("msg_title between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotBetween(String value1, String value2) {
            addCriterion("msg_title not between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNull() {
            addCriterion("msg_content is null");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNotNull() {
            addCriterion("msg_content is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContentEqualTo(String value) {
            addCriterion("msg_content =", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotEqualTo(String value) {
            addCriterion("msg_content <>", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThan(String value) {
            addCriterion("msg_content >", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("msg_content >=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThan(String value) {
            addCriterion("msg_content <", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThanOrEqualTo(String value) {
            addCriterion("msg_content <=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLike(String value) {
            addCriterion("msg_content like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotLike(String value) {
            addCriterion("msg_content not like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentIn(List<String> values) {
            addCriterion("msg_content in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotIn(List<String> values) {
            addCriterion("msg_content not in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentBetween(String value1, String value2) {
            addCriterion("msg_content between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotBetween(String value1, String value2) {
            addCriterion("msg_content not between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeIsNull() {
            addCriterion("msg_createTime is null");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeIsNotNull() {
            addCriterion("msg_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("msg_createTime =", value, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("msg_createTime <>", value, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("msg_createTime >", value, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("msg_createTime >=", value, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("msg_createTime <", value, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("msg_createTime <=", value, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("msg_createTime in", values, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("msg_createTime not in", values, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("msg_createTime between", value1, value2, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("msg_createTime not between", value1, value2, "msgCreatetime");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyIsNull() {
            addCriterion("msg_isReply is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyIsNotNull() {
            addCriterion("msg_isReply is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyEqualTo(String value) {
            addCriterion("msg_isReply =", value, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyNotEqualTo(String value) {
            addCriterion("msg_isReply <>", value, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyGreaterThan(String value) {
            addCriterion("msg_isReply >", value, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyGreaterThanOrEqualTo(String value) {
            addCriterion("msg_isReply >=", value, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyLessThan(String value) {
            addCriterion("msg_isReply <", value, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyLessThanOrEqualTo(String value) {
            addCriterion("msg_isReply <=", value, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyLike(String value) {
            addCriterion("msg_isReply like", value, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyNotLike(String value) {
            addCriterion("msg_isReply not like", value, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyIn(List<String> values) {
            addCriterion("msg_isReply in", values, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyNotIn(List<String> values) {
            addCriterion("msg_isReply not in", values, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyBetween(String value1, String value2) {
            addCriterion("msg_isReply between", value1, value2, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgIsreplyNotBetween(String value1, String value2) {
            addCriterion("msg_isReply not between", value1, value2, "msgIsreply");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentIsNull() {
            addCriterion("msg_replyContent is null");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentIsNotNull() {
            addCriterion("msg_replyContent is not null");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentEqualTo(String value) {
            addCriterion("msg_replyContent =", value, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentNotEqualTo(String value) {
            addCriterion("msg_replyContent <>", value, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentGreaterThan(String value) {
            addCriterion("msg_replyContent >", value, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("msg_replyContent >=", value, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentLessThan(String value) {
            addCriterion("msg_replyContent <", value, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentLessThanOrEqualTo(String value) {
            addCriterion("msg_replyContent <=", value, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentLike(String value) {
            addCriterion("msg_replyContent like", value, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentNotLike(String value) {
            addCriterion("msg_replyContent not like", value, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentIn(List<String> values) {
            addCriterion("msg_replyContent in", values, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentNotIn(List<String> values) {
            addCriterion("msg_replyContent not in", values, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentBetween(String value1, String value2) {
            addCriterion("msg_replyContent between", value1, value2, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplycontentNotBetween(String value1, String value2) {
            addCriterion("msg_replyContent not between", value1, value2, "msgReplycontent");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeIsNull() {
            addCriterion("msg_replyTime is null");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeIsNotNull() {
            addCriterion("msg_replyTime is not null");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeEqualTo(Date value) {
            addCriterionForJDBCDate("msg_replyTime =", value, "msgReplytime");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("msg_replyTime <>", value, "msgReplytime");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("msg_replyTime >", value, "msgReplytime");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("msg_replyTime >=", value, "msgReplytime");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeLessThan(Date value) {
            addCriterionForJDBCDate("msg_replyTime <", value, "msgReplytime");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("msg_replyTime <=", value, "msgReplytime");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeIn(List<Date> values) {
            addCriterionForJDBCDate("msg_replyTime in", values, "msgReplytime");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("msg_replyTime not in", values, "msgReplytime");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("msg_replyTime between", value1, value2, "msgReplytime");
            return (Criteria) this;
        }

        public Criteria andMsgReplytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("msg_replyTime not between", value1, value2, "msgReplytime");
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