package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class OtherwarninglevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OtherwarninglevelExample() {
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

        public Criteria andWarningtypeidIsNull() {
            addCriterion("warningtypeid is null");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidIsNotNull() {
            addCriterion("warningtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidEqualTo(Integer value) {
            addCriterion("warningtypeid =", value, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidNotEqualTo(Integer value) {
            addCriterion("warningtypeid <>", value, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidGreaterThan(Integer value) {
            addCriterion("warningtypeid >", value, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("warningtypeid >=", value, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidLessThan(Integer value) {
            addCriterion("warningtypeid <", value, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("warningtypeid <=", value, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidIn(List<Integer> values) {
            addCriterion("warningtypeid in", values, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidNotIn(List<Integer> values) {
            addCriterion("warningtypeid not in", values, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidBetween(Integer value1, Integer value2) {
            addCriterion("warningtypeid between", value1, value2, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarningtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("warningtypeid not between", value1, value2, "warningtypeid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidIsNull() {
            addCriterion("warninglevelid is null");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidIsNotNull() {
            addCriterion("warninglevelid is not null");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidEqualTo(Integer value) {
            addCriterion("warninglevelid =", value, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidNotEqualTo(Integer value) {
            addCriterion("warninglevelid <>", value, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidGreaterThan(Integer value) {
            addCriterion("warninglevelid >", value, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("warninglevelid >=", value, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidLessThan(Integer value) {
            addCriterion("warninglevelid <", value, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidLessThanOrEqualTo(Integer value) {
            addCriterion("warninglevelid <=", value, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidIn(List<Integer> values) {
            addCriterion("warninglevelid in", values, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidNotIn(List<Integer> values) {
            addCriterion("warninglevelid not in", values, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidBetween(Integer value1, Integer value2) {
            addCriterion("warninglevelid between", value1, value2, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andWarninglevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("warninglevelid not between", value1, value2, "warninglevelid");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
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