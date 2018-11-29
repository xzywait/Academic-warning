package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationExample() {
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

        public Criteria andYearidIsNull() {
            addCriterion("yearid is null");
            return (Criteria) this;
        }

        public Criteria andYearidIsNotNull() {
            addCriterion("yearid is not null");
            return (Criteria) this;
        }

        public Criteria andYearidEqualTo(Integer value) {
            addCriterion("yearid =", value, "yearid");
            return (Criteria) this;
        }

        public Criteria andYearidNotEqualTo(Integer value) {
            addCriterion("yearid <>", value, "yearid");
            return (Criteria) this;
        }

        public Criteria andYearidGreaterThan(Integer value) {
            addCriterion("yearid >", value, "yearid");
            return (Criteria) this;
        }

        public Criteria andYearidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yearid >=", value, "yearid");
            return (Criteria) this;
        }

        public Criteria andYearidLessThan(Integer value) {
            addCriterion("yearid <", value, "yearid");
            return (Criteria) this;
        }

        public Criteria andYearidLessThanOrEqualTo(Integer value) {
            addCriterion("yearid <=", value, "yearid");
            return (Criteria) this;
        }

        public Criteria andYearidIn(List<Integer> values) {
            addCriterion("yearid in", values, "yearid");
            return (Criteria) this;
        }

        public Criteria andYearidNotIn(List<Integer> values) {
            addCriterion("yearid not in", values, "yearid");
            return (Criteria) this;
        }

        public Criteria andYearidBetween(Integer value1, Integer value2) {
            addCriterion("yearid between", value1, value2, "yearid");
            return (Criteria) this;
        }

        public Criteria andYearidNotBetween(Integer value1, Integer value2) {
            addCriterion("yearid not between", value1, value2, "yearid");
            return (Criteria) this;
        }

        public Criteria andSemesteridIsNull() {
            addCriterion("semesterid is null");
            return (Criteria) this;
        }

        public Criteria andSemesteridIsNotNull() {
            addCriterion("semesterid is not null");
            return (Criteria) this;
        }

        public Criteria andSemesteridEqualTo(Integer value) {
            addCriterion("semesterid =", value, "semesterid");
            return (Criteria) this;
        }

        public Criteria andSemesteridNotEqualTo(Integer value) {
            addCriterion("semesterid <>", value, "semesterid");
            return (Criteria) this;
        }

        public Criteria andSemesteridGreaterThan(Integer value) {
            addCriterion("semesterid >", value, "semesterid");
            return (Criteria) this;
        }

        public Criteria andSemesteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("semesterid >=", value, "semesterid");
            return (Criteria) this;
        }

        public Criteria andSemesteridLessThan(Integer value) {
            addCriterion("semesterid <", value, "semesterid");
            return (Criteria) this;
        }

        public Criteria andSemesteridLessThanOrEqualTo(Integer value) {
            addCriterion("semesterid <=", value, "semesterid");
            return (Criteria) this;
        }

        public Criteria andSemesteridIn(List<Integer> values) {
            addCriterion("semesterid in", values, "semesterid");
            return (Criteria) this;
        }

        public Criteria andSemesteridNotIn(List<Integer> values) {
            addCriterion("semesterid not in", values, "semesterid");
            return (Criteria) this;
        }

        public Criteria andSemesteridBetween(Integer value1, Integer value2) {
            addCriterion("semesterid between", value1, value2, "semesterid");
            return (Criteria) this;
        }

        public Criteria andSemesteridNotBetween(Integer value1, Integer value2) {
            addCriterion("semesterid not between", value1, value2, "semesterid");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeIsNull() {
            addCriterion("statisticstime is null");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeIsNotNull() {
            addCriterion("statisticstime is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeEqualTo(Date value) {
            addCriterionForJDBCDate("statisticstime =", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("statisticstime <>", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("statisticstime >", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("statisticstime >=", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeLessThan(Date value) {
            addCriterionForJDBCDate("statisticstime <", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("statisticstime <=", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeIn(List<Date> values) {
            addCriterionForJDBCDate("statisticstime in", values, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("statisticstime not in", values, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("statisticstime between", value1, value2, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("statisticstime not between", value1, value2, "statisticstime");
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