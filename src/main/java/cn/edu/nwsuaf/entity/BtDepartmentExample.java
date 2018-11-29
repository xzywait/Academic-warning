package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class BtDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BtDepartmentExample() {
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

        public Criteria andDepartmenttypeidIsNull() {
            addCriterion("departmenttypeid is null");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidIsNotNull() {
            addCriterion("departmenttypeid is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidEqualTo(Integer value) {
            addCriterion("departmenttypeid =", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidNotEqualTo(Integer value) {
            addCriterion("departmenttypeid <>", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidGreaterThan(Integer value) {
            addCriterion("departmenttypeid >", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmenttypeid >=", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidLessThan(Integer value) {
            addCriterion("departmenttypeid <", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("departmenttypeid <=", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidIn(List<Integer> values) {
            addCriterion("departmenttypeid in", values, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidNotIn(List<Integer> values) {
            addCriterion("departmenttypeid not in", values, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidBetween(Integer value1, Integer value2) {
            addCriterion("departmenttypeid between", value1, value2, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmenttypeid not between", value1, value2, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoIsNull() {
            addCriterion("departmentno is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoIsNotNull() {
            addCriterion("departmentno is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoEqualTo(String value) {
            addCriterion("departmentno =", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotEqualTo(String value) {
            addCriterion("departmentno <>", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoGreaterThan(String value) {
            addCriterion("departmentno >", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoGreaterThanOrEqualTo(String value) {
            addCriterion("departmentno >=", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoLessThan(String value) {
            addCriterion("departmentno <", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoLessThanOrEqualTo(String value) {
            addCriterion("departmentno <=", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoLike(String value) {
            addCriterion("departmentno like", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotLike(String value) {
            addCriterion("departmentno not like", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoIn(List<String> values) {
            addCriterion("departmentno in", values, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotIn(List<String> values) {
            addCriterion("departmentno not in", values, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoBetween(String value1, String value2) {
            addCriterion("departmentno between", value1, value2, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotBetween(String value1, String value2) {
            addCriterion("departmentno not between", value1, value2, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentname is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentname is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentname =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentname <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentname >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentname >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentname <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentname <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentname like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentname not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentname in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentname not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentname between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentname not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortIsNull() {
            addCriterion("departmentshort is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortIsNotNull() {
            addCriterion("departmentshort is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortEqualTo(String value) {
            addCriterion("departmentshort =", value, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortNotEqualTo(String value) {
            addCriterion("departmentshort <>", value, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortGreaterThan(String value) {
            addCriterion("departmentshort >", value, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortGreaterThanOrEqualTo(String value) {
            addCriterion("departmentshort >=", value, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortLessThan(String value) {
            addCriterion("departmentshort <", value, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortLessThanOrEqualTo(String value) {
            addCriterion("departmentshort <=", value, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortLike(String value) {
            addCriterion("departmentshort like", value, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortNotLike(String value) {
            addCriterion("departmentshort not like", value, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortIn(List<String> values) {
            addCriterion("departmentshort in", values, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortNotIn(List<String> values) {
            addCriterion("departmentshort not in", values, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortBetween(String value1, String value2) {
            addCriterion("departmentshort between", value1, value2, "departmentshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentshortNotBetween(String value1, String value2) {
            addCriterion("departmentshort not between", value1, value2, "departmentshort");
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