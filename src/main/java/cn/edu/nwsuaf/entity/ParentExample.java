package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class ParentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParentExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andRelativetypeIsNull() {
            addCriterion("relativetype is null");
            return (Criteria) this;
        }

        public Criteria andRelativetypeIsNotNull() {
            addCriterion("relativetype is not null");
            return (Criteria) this;
        }

        public Criteria andRelativetypeEqualTo(String value) {
            addCriterion("relativetype =", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeNotEqualTo(String value) {
            addCriterion("relativetype <>", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeGreaterThan(String value) {
            addCriterion("relativetype >", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeGreaterThanOrEqualTo(String value) {
            addCriterion("relativetype >=", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeLessThan(String value) {
            addCriterion("relativetype <", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeLessThanOrEqualTo(String value) {
            addCriterion("relativetype <=", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeLike(String value) {
            addCriterion("relativetype like", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeNotLike(String value) {
            addCriterion("relativetype not like", value, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeIn(List<String> values) {
            addCriterion("relativetype in", values, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeNotIn(List<String> values) {
            addCriterion("relativetype not in", values, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeBetween(String value1, String value2) {
            addCriterion("relativetype between", value1, value2, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativetypeNotBetween(String value1, String value2) {
            addCriterion("relativetype not between", value1, value2, "relativetype");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationIsNull() {
            addCriterion("relativeappellation is null");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationIsNotNull() {
            addCriterion("relativeappellation is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationEqualTo(String value) {
            addCriterion("relativeappellation =", value, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationNotEqualTo(String value) {
            addCriterion("relativeappellation <>", value, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationGreaterThan(String value) {
            addCriterion("relativeappellation >", value, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationGreaterThanOrEqualTo(String value) {
            addCriterion("relativeappellation >=", value, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationLessThan(String value) {
            addCriterion("relativeappellation <", value, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationLessThanOrEqualTo(String value) {
            addCriterion("relativeappellation <=", value, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationLike(String value) {
            addCriterion("relativeappellation like", value, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationNotLike(String value) {
            addCriterion("relativeappellation not like", value, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationIn(List<String> values) {
            addCriterion("relativeappellation in", values, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationNotIn(List<String> values) {
            addCriterion("relativeappellation not in", values, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationBetween(String value1, String value2) {
            addCriterion("relativeappellation between", value1, value2, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativeappellationNotBetween(String value1, String value2) {
            addCriterion("relativeappellation not between", value1, value2, "relativeappellation");
            return (Criteria) this;
        }

        public Criteria andRelativenameIsNull() {
            addCriterion("relativename is null");
            return (Criteria) this;
        }

        public Criteria andRelativenameIsNotNull() {
            addCriterion("relativename is not null");
            return (Criteria) this;
        }

        public Criteria andRelativenameEqualTo(String value) {
            addCriterion("relativename =", value, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameNotEqualTo(String value) {
            addCriterion("relativename <>", value, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameGreaterThan(String value) {
            addCriterion("relativename >", value, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameGreaterThanOrEqualTo(String value) {
            addCriterion("relativename >=", value, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameLessThan(String value) {
            addCriterion("relativename <", value, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameLessThanOrEqualTo(String value) {
            addCriterion("relativename <=", value, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameLike(String value) {
            addCriterion("relativename like", value, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameNotLike(String value) {
            addCriterion("relativename not like", value, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameIn(List<String> values) {
            addCriterion("relativename in", values, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameNotIn(List<String> values) {
            addCriterion("relativename not in", values, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameBetween(String value1, String value2) {
            addCriterion("relativename between", value1, value2, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativenameNotBetween(String value1, String value2) {
            addCriterion("relativename not between", value1, value2, "relativename");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneIsNull() {
            addCriterion("relativetelephone is null");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneIsNotNull() {
            addCriterion("relativetelephone is not null");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneEqualTo(String value) {
            addCriterion("relativetelephone =", value, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneNotEqualTo(String value) {
            addCriterion("relativetelephone <>", value, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneGreaterThan(String value) {
            addCriterion("relativetelephone >", value, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("relativetelephone >=", value, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneLessThan(String value) {
            addCriterion("relativetelephone <", value, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneLessThanOrEqualTo(String value) {
            addCriterion("relativetelephone <=", value, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneLike(String value) {
            addCriterion("relativetelephone like", value, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneNotLike(String value) {
            addCriterion("relativetelephone not like", value, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneIn(List<String> values) {
            addCriterion("relativetelephone in", values, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneNotIn(List<String> values) {
            addCriterion("relativetelephone not in", values, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneBetween(String value1, String value2) {
            addCriterion("relativetelephone between", value1, value2, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andRelativetelephoneNotBetween(String value1, String value2) {
            addCriterion("relativetelephone not between", value1, value2, "relativetelephone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneIsNull() {
            addCriterion("fixedphone is null");
            return (Criteria) this;
        }

        public Criteria andFixedphoneIsNotNull() {
            addCriterion("fixedphone is not null");
            return (Criteria) this;
        }

        public Criteria andFixedphoneEqualTo(String value) {
            addCriterion("fixedphone =", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneNotEqualTo(String value) {
            addCriterion("fixedphone <>", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneGreaterThan(String value) {
            addCriterion("fixedphone >", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneGreaterThanOrEqualTo(String value) {
            addCriterion("fixedphone >=", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneLessThan(String value) {
            addCriterion("fixedphone <", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneLessThanOrEqualTo(String value) {
            addCriterion("fixedphone <=", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneLike(String value) {
            addCriterion("fixedphone like", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneNotLike(String value) {
            addCriterion("fixedphone not like", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneIn(List<String> values) {
            addCriterion("fixedphone in", values, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneNotIn(List<String> values) {
            addCriterion("fixedphone not in", values, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneBetween(String value1, String value2) {
            addCriterion("fixedphone between", value1, value2, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneNotBetween(String value1, String value2) {
            addCriterion("fixedphone not between", value1, value2, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
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