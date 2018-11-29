package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HelpsummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HelpsummaryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHelpidIsNull() {
            addCriterion("helpid is null");
            return (Criteria) this;
        }

        public Criteria andHelpidIsNotNull() {
            addCriterion("helpid is not null");
            return (Criteria) this;
        }

        public Criteria andHelpidEqualTo(Integer value) {
            addCriterion("helpid =", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidNotEqualTo(Integer value) {
            addCriterion("helpid <>", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidGreaterThan(Integer value) {
            addCriterion("helpid >", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("helpid >=", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidLessThan(Integer value) {
            addCriterion("helpid <", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidLessThanOrEqualTo(Integer value) {
            addCriterion("helpid <=", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidIn(List<Integer> values) {
            addCriterion("helpid in", values, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidNotIn(List<Integer> values) {
            addCriterion("helpid not in", values, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidBetween(Integer value1, Integer value2) {
            addCriterion("helpid between", value1, value2, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidNotBetween(Integer value1, Integer value2) {
            addCriterion("helpid not between", value1, value2, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpresultIsNull() {
            addCriterion("helpresult is null");
            return (Criteria) this;
        }

        public Criteria andHelpresultIsNotNull() {
            addCriterion("helpresult is not null");
            return (Criteria) this;
        }

        public Criteria andHelpresultEqualTo(String value) {
            addCriterion("helpresult =", value, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultNotEqualTo(String value) {
            addCriterion("helpresult <>", value, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultGreaterThan(String value) {
            addCriterion("helpresult >", value, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultGreaterThanOrEqualTo(String value) {
            addCriterion("helpresult >=", value, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultLessThan(String value) {
            addCriterion("helpresult <", value, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultLessThanOrEqualTo(String value) {
            addCriterion("helpresult <=", value, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultLike(String value) {
            addCriterion("helpresult like", value, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultNotLike(String value) {
            addCriterion("helpresult not like", value, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultIn(List<String> values) {
            addCriterion("helpresult in", values, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultNotIn(List<String> values) {
            addCriterion("helpresult not in", values, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultBetween(String value1, String value2) {
            addCriterion("helpresult between", value1, value2, "helpresult");
            return (Criteria) this;
        }

        public Criteria andHelpresultNotBetween(String value1, String value2) {
            addCriterion("helpresult not between", value1, value2, "helpresult");
            return (Criteria) this;
        }

        public Criteria andSummarydateIsNull() {
            addCriterion("summarydate is null");
            return (Criteria) this;
        }

        public Criteria andSummarydateIsNotNull() {
            addCriterion("summarydate is not null");
            return (Criteria) this;
        }

        public Criteria andSummarydateEqualTo(Date value) {
            addCriterionForJDBCDate("summarydate =", value, "summarydate");
            return (Criteria) this;
        }

        public Criteria andSummarydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("summarydate <>", value, "summarydate");
            return (Criteria) this;
        }

        public Criteria andSummarydateGreaterThan(Date value) {
            addCriterionForJDBCDate("summarydate >", value, "summarydate");
            return (Criteria) this;
        }

        public Criteria andSummarydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("summarydate >=", value, "summarydate");
            return (Criteria) this;
        }

        public Criteria andSummarydateLessThan(Date value) {
            addCriterionForJDBCDate("summarydate <", value, "summarydate");
            return (Criteria) this;
        }

        public Criteria andSummarydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("summarydate <=", value, "summarydate");
            return (Criteria) this;
        }

        public Criteria andSummarydateIn(List<Date> values) {
            addCriterionForJDBCDate("summarydate in", values, "summarydate");
            return (Criteria) this;
        }

        public Criteria andSummarydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("summarydate not in", values, "summarydate");
            return (Criteria) this;
        }

        public Criteria andSummarydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("summarydate between", value1, value2, "summarydate");
            return (Criteria) this;
        }

        public Criteria andSummarydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("summarydate not between", value1, value2, "summarydate");
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