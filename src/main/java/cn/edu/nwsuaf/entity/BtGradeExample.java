package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class BtGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BtGradeExample() {
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

        public Criteria andGradenoIsNull() {
            addCriterion("gradeno is null");
            return (Criteria) this;
        }

        public Criteria andGradenoIsNotNull() {
            addCriterion("gradeno is not null");
            return (Criteria) this;
        }

        public Criteria andGradenoEqualTo(String value) {
            addCriterion("gradeno =", value, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoNotEqualTo(String value) {
            addCriterion("gradeno <>", value, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoGreaterThan(String value) {
            addCriterion("gradeno >", value, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoGreaterThanOrEqualTo(String value) {
            addCriterion("gradeno >=", value, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoLessThan(String value) {
            addCriterion("gradeno <", value, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoLessThanOrEqualTo(String value) {
            addCriterion("gradeno <=", value, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoLike(String value) {
            addCriterion("gradeno like", value, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoNotLike(String value) {
            addCriterion("gradeno not like", value, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoIn(List<String> values) {
            addCriterion("gradeno in", values, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoNotIn(List<String> values) {
            addCriterion("gradeno not in", values, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoBetween(String value1, String value2) {
            addCriterion("gradeno between", value1, value2, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenoNotBetween(String value1, String value2) {
            addCriterion("gradeno not between", value1, value2, "gradeno");
            return (Criteria) this;
        }

        public Criteria andGradenameIsNull() {
            addCriterion("gradename is null");
            return (Criteria) this;
        }

        public Criteria andGradenameIsNotNull() {
            addCriterion("gradename is not null");
            return (Criteria) this;
        }

        public Criteria andGradenameEqualTo(String value) {
            addCriterion("gradename =", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotEqualTo(String value) {
            addCriterion("gradename <>", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameGreaterThan(String value) {
            addCriterion("gradename >", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameGreaterThanOrEqualTo(String value) {
            addCriterion("gradename >=", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLessThan(String value) {
            addCriterion("gradename <", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLessThanOrEqualTo(String value) {
            addCriterion("gradename <=", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLike(String value) {
            addCriterion("gradename like", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotLike(String value) {
            addCriterion("gradename not like", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameIn(List<String> values) {
            addCriterion("gradename in", values, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotIn(List<String> values) {
            addCriterion("gradename not in", values, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameBetween(String value1, String value2) {
            addCriterion("gradename between", value1, value2, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotBetween(String value1, String value2) {
            addCriterion("gradename not between", value1, value2, "gradename");
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