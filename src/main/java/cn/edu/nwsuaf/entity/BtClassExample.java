package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class BtClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BtClassExample() {
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

        public Criteria andMajoridIsNull() {
            addCriterion("majorid is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("majorid is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(Integer value) {
            addCriterion("majorid =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(Integer value) {
            addCriterion("majorid <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(Integer value) {
            addCriterion("majorid >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("majorid >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(Integer value) {
            addCriterion("majorid <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(Integer value) {
            addCriterion("majorid <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<Integer> values) {
            addCriterion("majorid in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<Integer> values) {
            addCriterion("majorid not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(Integer value1, Integer value2) {
            addCriterion("majorid between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(Integer value1, Integer value2) {
            addCriterion("majorid not between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridIsNull() {
            addCriterion("classteacherid is null");
            return (Criteria) this;
        }

        public Criteria andClassteacheridIsNotNull() {
            addCriterion("classteacherid is not null");
            return (Criteria) this;
        }

        public Criteria andClassteacheridEqualTo(Integer value) {
            addCriterion("classteacherid =", value, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridNotEqualTo(Integer value) {
            addCriterion("classteacherid <>", value, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridGreaterThan(Integer value) {
            addCriterion("classteacherid >", value, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("classteacherid >=", value, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridLessThan(Integer value) {
            addCriterion("classteacherid <", value, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridLessThanOrEqualTo(Integer value) {
            addCriterion("classteacherid <=", value, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridIn(List<Integer> values) {
            addCriterion("classteacherid in", values, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridNotIn(List<Integer> values) {
            addCriterion("classteacherid not in", values, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridBetween(Integer value1, Integer value2) {
            addCriterion("classteacherid between", value1, value2, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andClassteacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("classteacherid not between", value1, value2, "classteacherid");
            return (Criteria) this;
        }

        public Criteria andInstructoridIsNull() {
            addCriterion("instructorid is null");
            return (Criteria) this;
        }

        public Criteria andInstructoridIsNotNull() {
            addCriterion("instructorid is not null");
            return (Criteria) this;
        }

        public Criteria andInstructoridEqualTo(Integer value) {
            addCriterion("instructorid =", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridNotEqualTo(Integer value) {
            addCriterion("instructorid <>", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridGreaterThan(Integer value) {
            addCriterion("instructorid >", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("instructorid >=", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridLessThan(Integer value) {
            addCriterion("instructorid <", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridLessThanOrEqualTo(Integer value) {
            addCriterion("instructorid <=", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridIn(List<Integer> values) {
            addCriterion("instructorid in", values, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridNotIn(List<Integer> values) {
            addCriterion("instructorid not in", values, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridBetween(Integer value1, Integer value2) {
            addCriterion("instructorid between", value1, value2, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridNotBetween(Integer value1, Integer value2) {
            addCriterion("instructorid not between", value1, value2, "instructorid");
            return (Criteria) this;
        }

        public Criteria andClassnoIsNull() {
            addCriterion("classno is null");
            return (Criteria) this;
        }

        public Criteria andClassnoIsNotNull() {
            addCriterion("classno is not null");
            return (Criteria) this;
        }

        public Criteria andClassnoEqualTo(String value) {
            addCriterion("classno =", value, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoNotEqualTo(String value) {
            addCriterion("classno <>", value, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoGreaterThan(String value) {
            addCriterion("classno >", value, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoGreaterThanOrEqualTo(String value) {
            addCriterion("classno >=", value, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoLessThan(String value) {
            addCriterion("classno <", value, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoLessThanOrEqualTo(String value) {
            addCriterion("classno <=", value, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoLike(String value) {
            addCriterion("classno like", value, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoNotLike(String value) {
            addCriterion("classno not like", value, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoIn(List<String> values) {
            addCriterion("classno in", values, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoNotIn(List<String> values) {
            addCriterion("classno not in", values, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoBetween(String value1, String value2) {
            addCriterion("classno between", value1, value2, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnoNotBetween(String value1, String value2) {
            addCriterion("classno not between", value1, value2, "classno");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andMajorlengthIsNull() {
            addCriterion("majorlength is null");
            return (Criteria) this;
        }

        public Criteria andMajorlengthIsNotNull() {
            addCriterion("majorlength is not null");
            return (Criteria) this;
        }

        public Criteria andMajorlengthEqualTo(Integer value) {
            addCriterion("majorlength =", value, "majorlength");
            return (Criteria) this;
        }

        public Criteria andMajorlengthNotEqualTo(Integer value) {
            addCriterion("majorlength <>", value, "majorlength");
            return (Criteria) this;
        }

        public Criteria andMajorlengthGreaterThan(Integer value) {
            addCriterion("majorlength >", value, "majorlength");
            return (Criteria) this;
        }

        public Criteria andMajorlengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("majorlength >=", value, "majorlength");
            return (Criteria) this;
        }

        public Criteria andMajorlengthLessThan(Integer value) {
            addCriterion("majorlength <", value, "majorlength");
            return (Criteria) this;
        }

        public Criteria andMajorlengthLessThanOrEqualTo(Integer value) {
            addCriterion("majorlength <=", value, "majorlength");
            return (Criteria) this;
        }

        public Criteria andMajorlengthIn(List<Integer> values) {
            addCriterion("majorlength in", values, "majorlength");
            return (Criteria) this;
        }

        public Criteria andMajorlengthNotIn(List<Integer> values) {
            addCriterion("majorlength not in", values, "majorlength");
            return (Criteria) this;
        }

        public Criteria andMajorlengthBetween(Integer value1, Integer value2) {
            addCriterion("majorlength between", value1, value2, "majorlength");
            return (Criteria) this;
        }

        public Criteria andMajorlengthNotBetween(Integer value1, Integer value2) {
            addCriterion("majorlength not between", value1, value2, "majorlength");
            return (Criteria) this;
        }

        public Criteria andClasssizeIsNull() {
            addCriterion("classsize is null");
            return (Criteria) this;
        }

        public Criteria andClasssizeIsNotNull() {
            addCriterion("classsize is not null");
            return (Criteria) this;
        }

        public Criteria andClasssizeEqualTo(Integer value) {
            addCriterion("classsize =", value, "classsize");
            return (Criteria) this;
        }

        public Criteria andClasssizeNotEqualTo(Integer value) {
            addCriterion("classsize <>", value, "classsize");
            return (Criteria) this;
        }

        public Criteria andClasssizeGreaterThan(Integer value) {
            addCriterion("classsize >", value, "classsize");
            return (Criteria) this;
        }

        public Criteria andClasssizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("classsize >=", value, "classsize");
            return (Criteria) this;
        }

        public Criteria andClasssizeLessThan(Integer value) {
            addCriterion("classsize <", value, "classsize");
            return (Criteria) this;
        }

        public Criteria andClasssizeLessThanOrEqualTo(Integer value) {
            addCriterion("classsize <=", value, "classsize");
            return (Criteria) this;
        }

        public Criteria andClasssizeIn(List<Integer> values) {
            addCriterion("classsize in", values, "classsize");
            return (Criteria) this;
        }

        public Criteria andClasssizeNotIn(List<Integer> values) {
            addCriterion("classsize not in", values, "classsize");
            return (Criteria) this;
        }

        public Criteria andClasssizeBetween(Integer value1, Integer value2) {
            addCriterion("classsize between", value1, value2, "classsize");
            return (Criteria) this;
        }

        public Criteria andClasssizeNotBetween(Integer value1, Integer value2) {
            addCriterion("classsize not between", value1, value2, "classsize");
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