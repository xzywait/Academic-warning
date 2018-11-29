package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class BtOpencourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BtOpencourseExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidIsNull() {
            addCriterion("opentypeid is null");
            return (Criteria) this;
        }

        public Criteria andOpentypeidIsNotNull() {
            addCriterion("opentypeid is not null");
            return (Criteria) this;
        }

        public Criteria andOpentypeidEqualTo(Integer value) {
            addCriterion("opentypeid =", value, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidNotEqualTo(Integer value) {
            addCriterion("opentypeid <>", value, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidGreaterThan(Integer value) {
            addCriterion("opentypeid >", value, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("opentypeid >=", value, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidLessThan(Integer value) {
            addCriterion("opentypeid <", value, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidLessThanOrEqualTo(Integer value) {
            addCriterion("opentypeid <=", value, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidIn(List<Integer> values) {
            addCriterion("opentypeid in", values, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidNotIn(List<Integer> values) {
            addCriterion("opentypeid not in", values, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidBetween(Integer value1, Integer value2) {
            addCriterion("opentypeid between", value1, value2, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andOpentypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("opentypeid not between", value1, value2, "opentypeid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidIsNull() {
            addCriterion("coursenatureid is null");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidIsNotNull() {
            addCriterion("coursenatureid is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidEqualTo(Integer value) {
            addCriterion("coursenatureid =", value, "coursenatureid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidNotEqualTo(Integer value) {
            addCriterion("coursenatureid <>", value, "coursenatureid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidGreaterThan(Integer value) {
            addCriterion("coursenatureid >", value, "coursenatureid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursenatureid >=", value, "coursenatureid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidLessThan(Integer value) {
            addCriterion("coursenatureid <", value, "coursenatureid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidLessThanOrEqualTo(Integer value) {
            addCriterion("coursenatureid <=", value, "coursenatureid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidIn(List<Integer> values) {
            addCriterion("coursenatureid in", values, "coursenatureid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidNotIn(List<Integer> values) {
            addCriterion("coursenatureid not in", values, "coursenatureid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidBetween(Integer value1, Integer value2) {
            addCriterion("coursenatureid between", value1, value2, "coursenatureid");
            return (Criteria) this;
        }

        public Criteria andCoursenatureidNotBetween(Integer value1, Integer value2) {
            addCriterion("coursenatureid not between", value1, value2, "coursenatureid");
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

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherid is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Integer value) {
            addCriterion("teacherid =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Integer value) {
            addCriterion("teacherid <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Integer value) {
            addCriterion("teacherid >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherid >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Integer value) {
            addCriterion("teacherid <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Integer value) {
            addCriterion("teacherid <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Integer> values) {
            addCriterion("teacherid in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Integer> values) {
            addCriterion("teacherid not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Integer value1, Integer value2) {
            addCriterion("teacherid between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherid not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursIsNull() {
            addCriterion("practicalhours is null");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursIsNotNull() {
            addCriterion("practicalhours is not null");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursEqualTo(Float value) {
            addCriterion("practicalhours =", value, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursNotEqualTo(Float value) {
            addCriterion("practicalhours <>", value, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursGreaterThan(Float value) {
            addCriterion("practicalhours >", value, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursGreaterThanOrEqualTo(Float value) {
            addCriterion("practicalhours >=", value, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursLessThan(Float value) {
            addCriterion("practicalhours <", value, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursLessThanOrEqualTo(Float value) {
            addCriterion("practicalhours <=", value, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursIn(List<Float> values) {
            addCriterion("practicalhours in", values, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursNotIn(List<Float> values) {
            addCriterion("practicalhours not in", values, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursBetween(Float value1, Float value2) {
            addCriterion("practicalhours between", value1, value2, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andPracticalhoursNotBetween(Float value1, Float value2) {
            addCriterion("practicalhours not between", value1, value2, "practicalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursIsNull() {
            addCriterion("totalhours is null");
            return (Criteria) this;
        }

        public Criteria andTotalhoursIsNotNull() {
            addCriterion("totalhours is not null");
            return (Criteria) this;
        }

        public Criteria andTotalhoursEqualTo(Float value) {
            addCriterion("totalhours =", value, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursNotEqualTo(Float value) {
            addCriterion("totalhours <>", value, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursGreaterThan(Float value) {
            addCriterion("totalhours >", value, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursGreaterThanOrEqualTo(Float value) {
            addCriterion("totalhours >=", value, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursLessThan(Float value) {
            addCriterion("totalhours <", value, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursLessThanOrEqualTo(Float value) {
            addCriterion("totalhours <=", value, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursIn(List<Float> values) {
            addCriterion("totalhours in", values, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursNotIn(List<Float> values) {
            addCriterion("totalhours not in", values, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursBetween(Float value1, Float value2) {
            addCriterion("totalhours between", value1, value2, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTotalhoursNotBetween(Float value1, Float value2) {
            addCriterion("totalhours not between", value1, value2, "totalhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursIsNull() {
            addCriterion("theoryhours is null");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursIsNotNull() {
            addCriterion("theoryhours is not null");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursEqualTo(Float value) {
            addCriterion("theoryhours =", value, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursNotEqualTo(Float value) {
            addCriterion("theoryhours <>", value, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursGreaterThan(Float value) {
            addCriterion("theoryhours >", value, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursGreaterThanOrEqualTo(Float value) {
            addCriterion("theoryhours >=", value, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursLessThan(Float value) {
            addCriterion("theoryhours <", value, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursLessThanOrEqualTo(Float value) {
            addCriterion("theoryhours <=", value, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursIn(List<Float> values) {
            addCriterion("theoryhours in", values, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursNotIn(List<Float> values) {
            addCriterion("theoryhours not in", values, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursBetween(Float value1, Float value2) {
            addCriterion("theoryhours between", value1, value2, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andTheoryhoursNotBetween(Float value1, Float value2) {
            addCriterion("theoryhours not between", value1, value2, "theoryhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursIsNull() {
            addCriterion("experimentalhours is null");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursIsNotNull() {
            addCriterion("experimentalhours is not null");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursEqualTo(Float value) {
            addCriterion("experimentalhours =", value, "experimentalhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursNotEqualTo(Float value) {
            addCriterion("experimentalhours <>", value, "experimentalhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursGreaterThan(Float value) {
            addCriterion("experimentalhours >", value, "experimentalhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursGreaterThanOrEqualTo(Float value) {
            addCriterion("experimentalhours >=", value, "experimentalhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursLessThan(Float value) {
            addCriterion("experimentalhours <", value, "experimentalhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursLessThanOrEqualTo(Float value) {
            addCriterion("experimentalhours <=", value, "experimentalhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursIn(List<Float> values) {
            addCriterion("experimentalhours in", values, "experimentalhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursNotIn(List<Float> values) {
            addCriterion("experimentalhours not in", values, "experimentalhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursBetween(Float value1, Float value2) {
            addCriterion("experimentalhours between", value1, value2, "experimentalhours");
            return (Criteria) this;
        }

        public Criteria andExperimentalhoursNotBetween(Float value1, Float value2) {
            addCriterion("experimentalhours not between", value1, value2, "experimentalhours");
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