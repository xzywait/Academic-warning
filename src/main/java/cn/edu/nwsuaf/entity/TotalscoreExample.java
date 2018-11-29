package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TotalscoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalscoreExample() {
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

        public Criteria andStudentidIsNull() {
            addCriterion("studentid is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentid is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentid =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentid <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentid >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentid >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentid <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentid <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentid in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentid not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentid between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentid not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreIsNull() {
            addCriterion("totalcreditscore is null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreIsNotNull() {
            addCriterion("totalcreditscore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreEqualTo(Float value) {
            addCriterion("totalcreditscore =", value, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreNotEqualTo(Float value) {
            addCriterion("totalcreditscore <>", value, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreGreaterThan(Float value) {
            addCriterion("totalcreditscore >", value, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("totalcreditscore >=", value, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreLessThan(Float value) {
            addCriterion("totalcreditscore <", value, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreLessThanOrEqualTo(Float value) {
            addCriterion("totalcreditscore <=", value, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreIn(List<Float> values) {
            addCriterion("totalcreditscore in", values, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreNotIn(List<Float> values) {
            addCriterion("totalcreditscore not in", values, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreBetween(Float value1, Float value2) {
            addCriterion("totalcreditscore between", value1, value2, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andTotalcreditscoreNotBetween(Float value1, Float value2) {
            addCriterion("totalcreditscore not between", value1, value2, "totalcreditscore");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateIsNull() {
            addCriterion("statisticsdate is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateIsNotNull() {
            addCriterion("statisticsdate is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateEqualTo(Date value) {
            addCriterionForJDBCDate("statisticsdate =", value, "statisticsdate");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("statisticsdate <>", value, "statisticsdate");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateGreaterThan(Date value) {
            addCriterionForJDBCDate("statisticsdate >", value, "statisticsdate");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("statisticsdate >=", value, "statisticsdate");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateLessThan(Date value) {
            addCriterionForJDBCDate("statisticsdate <", value, "statisticsdate");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("statisticsdate <=", value, "statisticsdate");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateIn(List<Date> values) {
            addCriterionForJDBCDate("statisticsdate in", values, "statisticsdate");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("statisticsdate not in", values, "statisticsdate");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("statisticsdate between", value1, value2, "statisticsdate");
            return (Criteria) this;
        }

        public Criteria andStatisticsdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("statisticsdate not between", value1, value2, "statisticsdate");
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