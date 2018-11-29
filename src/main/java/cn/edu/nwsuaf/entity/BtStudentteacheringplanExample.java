package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class BtStudentteacheringplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BtStudentteacheringplanExample() {
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

        public Criteria andCoursegroupidIsNull() {
            addCriterion("coursegroupid is null");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidIsNotNull() {
            addCriterion("coursegroupid is not null");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidEqualTo(Integer value) {
            addCriterion("coursegroupid =", value, "coursegroupid");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidNotEqualTo(Integer value) {
            addCriterion("coursegroupid <>", value, "coursegroupid");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidGreaterThan(Integer value) {
            addCriterion("coursegroupid >", value, "coursegroupid");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursegroupid >=", value, "coursegroupid");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidLessThan(Integer value) {
            addCriterion("coursegroupid <", value, "coursegroupid");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidLessThanOrEqualTo(Integer value) {
            addCriterion("coursegroupid <=", value, "coursegroupid");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidIn(List<Integer> values) {
            addCriterion("coursegroupid in", values, "coursegroupid");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidNotIn(List<Integer> values) {
            addCriterion("coursegroupid not in", values, "coursegroupid");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidBetween(Integer value1, Integer value2) {
            addCriterion("coursegroupid between", value1, value2, "coursegroupid");
            return (Criteria) this;
        }

        public Criteria andCoursegroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("coursegroupid not between", value1, value2, "coursegroupid");
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

        public Criteria andScorerequireIsNull() {
            addCriterion("scorerequire is null");
            return (Criteria) this;
        }

        public Criteria andScorerequireIsNotNull() {
            addCriterion("scorerequire is not null");
            return (Criteria) this;
        }

        public Criteria andScorerequireEqualTo(Float value) {
            addCriterion("scorerequire =", value, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andScorerequireNotEqualTo(Float value) {
            addCriterion("scorerequire <>", value, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andScorerequireGreaterThan(Float value) {
            addCriterion("scorerequire >", value, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andScorerequireGreaterThanOrEqualTo(Float value) {
            addCriterion("scorerequire >=", value, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andScorerequireLessThan(Float value) {
            addCriterion("scorerequire <", value, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andScorerequireLessThanOrEqualTo(Float value) {
            addCriterion("scorerequire <=", value, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andScorerequireIn(List<Float> values) {
            addCriterion("scorerequire in", values, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andScorerequireNotIn(List<Float> values) {
            addCriterion("scorerequire not in", values, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andScorerequireBetween(Float value1, Float value2) {
            addCriterion("scorerequire between", value1, value2, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andScorerequireNotBetween(Float value1, Float value2) {
            addCriterion("scorerequire not between", value1, value2, "scorerequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireIsNull() {
            addCriterion("numberrequire is null");
            return (Criteria) this;
        }

        public Criteria andNumberrequireIsNotNull() {
            addCriterion("numberrequire is not null");
            return (Criteria) this;
        }

        public Criteria andNumberrequireEqualTo(Integer value) {
            addCriterion("numberrequire =", value, "numberrequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireNotEqualTo(Integer value) {
            addCriterion("numberrequire <>", value, "numberrequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireGreaterThan(Integer value) {
            addCriterion("numberrequire >", value, "numberrequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberrequire >=", value, "numberrequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireLessThan(Integer value) {
            addCriterion("numberrequire <", value, "numberrequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireLessThanOrEqualTo(Integer value) {
            addCriterion("numberrequire <=", value, "numberrequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireIn(List<Integer> values) {
            addCriterion("numberrequire in", values, "numberrequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireNotIn(List<Integer> values) {
            addCriterion("numberrequire not in", values, "numberrequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireBetween(Integer value1, Integer value2) {
            addCriterion("numberrequire between", value1, value2, "numberrequire");
            return (Criteria) this;
        }

        public Criteria andNumberrequireNotBetween(Integer value1, Integer value2) {
            addCriterion("numberrequire not between", value1, value2, "numberrequire");
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

        public Criteria andExammethodIsNull() {
            addCriterion("exammethod is null");
            return (Criteria) this;
        }

        public Criteria andExammethodIsNotNull() {
            addCriterion("exammethod is not null");
            return (Criteria) this;
        }

        public Criteria andExammethodEqualTo(String value) {
            addCriterion("exammethod =", value, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodNotEqualTo(String value) {
            addCriterion("exammethod <>", value, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodGreaterThan(String value) {
            addCriterion("exammethod >", value, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodGreaterThanOrEqualTo(String value) {
            addCriterion("exammethod >=", value, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodLessThan(String value) {
            addCriterion("exammethod <", value, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodLessThanOrEqualTo(String value) {
            addCriterion("exammethod <=", value, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodLike(String value) {
            addCriterion("exammethod like", value, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodNotLike(String value) {
            addCriterion("exammethod not like", value, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodIn(List<String> values) {
            addCriterion("exammethod in", values, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodNotIn(List<String> values) {
            addCriterion("exammethod not in", values, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodBetween(String value1, String value2) {
            addCriterion("exammethod between", value1, value2, "exammethod");
            return (Criteria) this;
        }

        public Criteria andExammethodNotBetween(String value1, String value2) {
            addCriterion("exammethod not between", value1, value2, "exammethod");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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