package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andOpencourseidIsNull() {
            addCriterion("opencourseid is null");
            return (Criteria) this;
        }

        public Criteria andOpencourseidIsNotNull() {
            addCriterion("opencourseid is not null");
            return (Criteria) this;
        }

        public Criteria andOpencourseidEqualTo(Integer value) {
            addCriterion("opencourseid =", value, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andOpencourseidNotEqualTo(Integer value) {
            addCriterion("opencourseid <>", value, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andOpencourseidGreaterThan(Integer value) {
            addCriterion("opencourseid >", value, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andOpencourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("opencourseid >=", value, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andOpencourseidLessThan(Integer value) {
            addCriterion("opencourseid <", value, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andOpencourseidLessThanOrEqualTo(Integer value) {
            addCriterion("opencourseid <=", value, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andOpencourseidIn(List<Integer> values) {
            addCriterion("opencourseid in", values, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andOpencourseidNotIn(List<Integer> values) {
            addCriterion("opencourseid not in", values, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andOpencourseidBetween(Integer value1, Integer value2) {
            addCriterion("opencourseid between", value1, value2, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andOpencourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("opencourseid not between", value1, value2, "opencourseid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidIsNull() {
            addCriterion("scoremarkid is null");
            return (Criteria) this;
        }

        public Criteria andScoremarkidIsNotNull() {
            addCriterion("scoremarkid is not null");
            return (Criteria) this;
        }

        public Criteria andScoremarkidEqualTo(Integer value) {
            addCriterion("scoremarkid =", value, "scoremarkid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidNotEqualTo(Integer value) {
            addCriterion("scoremarkid <>", value, "scoremarkid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidGreaterThan(Integer value) {
            addCriterion("scoremarkid >", value, "scoremarkid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scoremarkid >=", value, "scoremarkid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidLessThan(Integer value) {
            addCriterion("scoremarkid <", value, "scoremarkid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidLessThanOrEqualTo(Integer value) {
            addCriterion("scoremarkid <=", value, "scoremarkid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidIn(List<Integer> values) {
            addCriterion("scoremarkid in", values, "scoremarkid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidNotIn(List<Integer> values) {
            addCriterion("scoremarkid not in", values, "scoremarkid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidBetween(Integer value1, Integer value2) {
            addCriterion("scoremarkid between", value1, value2, "scoremarkid");
            return (Criteria) this;
        }

        public Criteria andScoremarkidNotBetween(Integer value1, Integer value2) {
            addCriterion("scoremarkid not between", value1, value2, "scoremarkid");
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

        public Criteria andTotalscoreIsNull() {
            addCriterion("totalscore is null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNotNull() {
            addCriterion("totalscore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreEqualTo(Float value) {
            addCriterion("totalscore =", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotEqualTo(Float value) {
            addCriterion("totalscore <>", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThan(Float value) {
            addCriterion("totalscore >", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("totalscore >=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThan(Float value) {
            addCriterion("totalscore <", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThanOrEqualTo(Float value) {
            addCriterion("totalscore <=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIn(List<Float> values) {
            addCriterion("totalscore in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotIn(List<Float> values) {
            addCriterion("totalscore not in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreBetween(Float value1, Float value2) {
            addCriterion("totalscore between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotBetween(Float value1, Float value2) {
            addCriterion("totalscore not between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreIsNull() {
            addCriterion("finalscore is null");
            return (Criteria) this;
        }

        public Criteria andFinalscoreIsNotNull() {
            addCriterion("finalscore is not null");
            return (Criteria) this;
        }

        public Criteria andFinalscoreEqualTo(Float value) {
            addCriterion("finalscore =", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreNotEqualTo(Float value) {
            addCriterion("finalscore <>", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreGreaterThan(Float value) {
            addCriterion("finalscore >", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("finalscore >=", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreLessThan(Float value) {
            addCriterion("finalscore <", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreLessThanOrEqualTo(Float value) {
            addCriterion("finalscore <=", value, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreIn(List<Float> values) {
            addCriterion("finalscore in", values, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreNotIn(List<Float> values) {
            addCriterion("finalscore not in", values, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreBetween(Float value1, Float value2) {
            addCriterion("finalscore between", value1, value2, "finalscore");
            return (Criteria) this;
        }

        public Criteria andFinalscoreNotBetween(Float value1, Float value2) {
            addCriterion("finalscore not between", value1, value2, "finalscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreIsNull() {
            addCriterion("dailyscore is null");
            return (Criteria) this;
        }

        public Criteria andDailyscoreIsNotNull() {
            addCriterion("dailyscore is not null");
            return (Criteria) this;
        }

        public Criteria andDailyscoreEqualTo(Float value) {
            addCriterion("dailyscore =", value, "dailyscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreNotEqualTo(Float value) {
            addCriterion("dailyscore <>", value, "dailyscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreGreaterThan(Float value) {
            addCriterion("dailyscore >", value, "dailyscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("dailyscore >=", value, "dailyscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreLessThan(Float value) {
            addCriterion("dailyscore <", value, "dailyscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreLessThanOrEqualTo(Float value) {
            addCriterion("dailyscore <=", value, "dailyscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreIn(List<Float> values) {
            addCriterion("dailyscore in", values, "dailyscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreNotIn(List<Float> values) {
            addCriterion("dailyscore not in", values, "dailyscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreBetween(Float value1, Float value2) {
            addCriterion("dailyscore between", value1, value2, "dailyscore");
            return (Criteria) this;
        }

        public Criteria andDailyscoreNotBetween(Float value1, Float value2) {
            addCriterion("dailyscore not between", value1, value2, "dailyscore");
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

        public Criteria andPassremarkIsNull() {
            addCriterion("passremark is null");
            return (Criteria) this;
        }

        public Criteria andPassremarkIsNotNull() {
            addCriterion("passremark is not null");
            return (Criteria) this;
        }

        public Criteria andPassremarkEqualTo(String value) {
            addCriterion("passremark =", value, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkNotEqualTo(String value) {
            addCriterion("passremark <>", value, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkGreaterThan(String value) {
            addCriterion("passremark >", value, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkGreaterThanOrEqualTo(String value) {
            addCriterion("passremark >=", value, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkLessThan(String value) {
            addCriterion("passremark <", value, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkLessThanOrEqualTo(String value) {
            addCriterion("passremark <=", value, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkLike(String value) {
            addCriterion("passremark like", value, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkNotLike(String value) {
            addCriterion("passremark not like", value, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkIn(List<String> values) {
            addCriterion("passremark in", values, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkNotIn(List<String> values) {
            addCriterion("passremark not in", values, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkBetween(String value1, String value2) {
            addCriterion("passremark between", value1, value2, "passremark");
            return (Criteria) this;
        }

        public Criteria andPassremarkNotBetween(String value1, String value2) {
            addCriterion("passremark not between", value1, value2, "passremark");
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