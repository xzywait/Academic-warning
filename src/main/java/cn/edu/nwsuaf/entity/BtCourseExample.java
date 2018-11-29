package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class BtCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BtCourseExample() {
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

        public Criteria andScoretypeidIsNull() {
            addCriterion("scoretypeid is null");
            return (Criteria) this;
        }

        public Criteria andScoretypeidIsNotNull() {
            addCriterion("scoretypeid is not null");
            return (Criteria) this;
        }

        public Criteria andScoretypeidEqualTo(Integer value) {
            addCriterion("scoretypeid =", value, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andScoretypeidNotEqualTo(Integer value) {
            addCriterion("scoretypeid <>", value, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andScoretypeidGreaterThan(Integer value) {
            addCriterion("scoretypeid >", value, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andScoretypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scoretypeid >=", value, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andScoretypeidLessThan(Integer value) {
            addCriterion("scoretypeid <", value, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andScoretypeidLessThanOrEqualTo(Integer value) {
            addCriterion("scoretypeid <=", value, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andScoretypeidIn(List<Integer> values) {
            addCriterion("scoretypeid in", values, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andScoretypeidNotIn(List<Integer> values) {
            addCriterion("scoretypeid not in", values, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andScoretypeidBetween(Integer value1, Integer value2) {
            addCriterion("scoretypeid between", value1, value2, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andScoretypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("scoretypeid not between", value1, value2, "scoretypeid");
            return (Criteria) this;
        }

        public Criteria andCoursenoIsNull() {
            addCriterion("courseno is null");
            return (Criteria) this;
        }

        public Criteria andCoursenoIsNotNull() {
            addCriterion("courseno is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenoEqualTo(String value) {
            addCriterion("courseno =", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotEqualTo(String value) {
            addCriterion("courseno <>", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoGreaterThan(String value) {
            addCriterion("courseno >", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoGreaterThanOrEqualTo(String value) {
            addCriterion("courseno >=", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLessThan(String value) {
            addCriterion("courseno <", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLessThanOrEqualTo(String value) {
            addCriterion("courseno <=", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLike(String value) {
            addCriterion("courseno like", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotLike(String value) {
            addCriterion("courseno not like", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoIn(List<String> values) {
            addCriterion("courseno in", values, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotIn(List<String> values) {
            addCriterion("courseno not in", values, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoBetween(String value1, String value2) {
            addCriterion("courseno between", value1, value2, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotBetween(String value1, String value2) {
            addCriterion("courseno not between", value1, value2, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("coursename is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("coursename is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("coursename =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("coursename <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("coursename >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("coursename >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("coursename <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("coursename <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("coursename like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("coursename not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("coursename in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("coursename not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("coursename between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("coursename not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCourseshortIsNull() {
            addCriterion("courseshort is null");
            return (Criteria) this;
        }

        public Criteria andCourseshortIsNotNull() {
            addCriterion("courseshort is not null");
            return (Criteria) this;
        }

        public Criteria andCourseshortEqualTo(String value) {
            addCriterion("courseshort =", value, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortNotEqualTo(String value) {
            addCriterion("courseshort <>", value, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortGreaterThan(String value) {
            addCriterion("courseshort >", value, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortGreaterThanOrEqualTo(String value) {
            addCriterion("courseshort >=", value, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortLessThan(String value) {
            addCriterion("courseshort <", value, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortLessThanOrEqualTo(String value) {
            addCriterion("courseshort <=", value, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortLike(String value) {
            addCriterion("courseshort like", value, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortNotLike(String value) {
            addCriterion("courseshort not like", value, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortIn(List<String> values) {
            addCriterion("courseshort in", values, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortNotIn(List<String> values) {
            addCriterion("courseshort not in", values, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortBetween(String value1, String value2) {
            addCriterion("courseshort between", value1, value2, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCourseshortNotBetween(String value1, String value2) {
            addCriterion("courseshort not between", value1, value2, "courseshort");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Float value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Float value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Float value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Float value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Float value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Float> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Float> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Float value1, Float value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Float value1, Float value2) {
            addCriterion("credit not between", value1, value2, "credit");
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