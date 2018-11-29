package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class SysfunmodleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysfunmodleExample() {
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

        public Criteria andFunmodlecodeIsNull() {
            addCriterion("funmodlecode is null");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeIsNotNull() {
            addCriterion("funmodlecode is not null");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeEqualTo(String value) {
            addCriterion("funmodlecode =", value, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeNotEqualTo(String value) {
            addCriterion("funmodlecode <>", value, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeGreaterThan(String value) {
            addCriterion("funmodlecode >", value, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeGreaterThanOrEqualTo(String value) {
            addCriterion("funmodlecode >=", value, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeLessThan(String value) {
            addCriterion("funmodlecode <", value, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeLessThanOrEqualTo(String value) {
            addCriterion("funmodlecode <=", value, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeLike(String value) {
            addCriterion("funmodlecode like", value, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeNotLike(String value) {
            addCriterion("funmodlecode not like", value, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeIn(List<String> values) {
            addCriterion("funmodlecode in", values, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeNotIn(List<String> values) {
            addCriterion("funmodlecode not in", values, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeBetween(String value1, String value2) {
            addCriterion("funmodlecode between", value1, value2, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunmodlecodeNotBetween(String value1, String value2) {
            addCriterion("funmodlecode not between", value1, value2, "funmodlecode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeIsNull() {
            addCriterion("funparentcode is null");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeIsNotNull() {
            addCriterion("funparentcode is not null");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeEqualTo(String value) {
            addCriterion("funparentcode =", value, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeNotEqualTo(String value) {
            addCriterion("funparentcode <>", value, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeGreaterThan(String value) {
            addCriterion("funparentcode >", value, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("funparentcode >=", value, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeLessThan(String value) {
            addCriterion("funparentcode <", value, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeLessThanOrEqualTo(String value) {
            addCriterion("funparentcode <=", value, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeLike(String value) {
            addCriterion("funparentcode like", value, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeNotLike(String value) {
            addCriterion("funparentcode not like", value, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeIn(List<String> values) {
            addCriterion("funparentcode in", values, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeNotIn(List<String> values) {
            addCriterion("funparentcode not in", values, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeBetween(String value1, String value2) {
            addCriterion("funparentcode between", value1, value2, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunparentcodeNotBetween(String value1, String value2) {
            addCriterion("funparentcode not between", value1, value2, "funparentcode");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameIsNull() {
            addCriterion("funmodlename is null");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameIsNotNull() {
            addCriterion("funmodlename is not null");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameEqualTo(String value) {
            addCriterion("funmodlename =", value, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameNotEqualTo(String value) {
            addCriterion("funmodlename <>", value, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameGreaterThan(String value) {
            addCriterion("funmodlename >", value, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameGreaterThanOrEqualTo(String value) {
            addCriterion("funmodlename >=", value, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameLessThan(String value) {
            addCriterion("funmodlename <", value, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameLessThanOrEqualTo(String value) {
            addCriterion("funmodlename <=", value, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameLike(String value) {
            addCriterion("funmodlename like", value, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameNotLike(String value) {
            addCriterion("funmodlename not like", value, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameIn(List<String> values) {
            addCriterion("funmodlename in", values, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameNotIn(List<String> values) {
            addCriterion("funmodlename not in", values, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameBetween(String value1, String value2) {
            addCriterion("funmodlename between", value1, value2, "funmodlename");
            return (Criteria) this;
        }

        public Criteria andFunmodlenameNotBetween(String value1, String value2) {
            addCriterion("funmodlename not between", value1, value2, "funmodlename");
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