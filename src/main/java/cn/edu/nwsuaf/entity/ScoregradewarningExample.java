package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.List;

public class ScoregradewarningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoregradewarningExample() {
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

        public Criteria andLowstandardIsNull() {
            addCriterion("lowstandard is null");
            return (Criteria) this;
        }

        public Criteria andLowstandardIsNotNull() {
            addCriterion("lowstandard is not null");
            return (Criteria) this;
        }

        public Criteria andLowstandardEqualTo(Float value) {
            addCriterion("lowstandard =", value, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andLowstandardNotEqualTo(Float value) {
            addCriterion("lowstandard <>", value, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andLowstandardGreaterThan(Float value) {
            addCriterion("lowstandard >", value, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andLowstandardGreaterThanOrEqualTo(Float value) {
            addCriterion("lowstandard >=", value, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andLowstandardLessThan(Float value) {
            addCriterion("lowstandard <", value, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andLowstandardLessThanOrEqualTo(Float value) {
            addCriterion("lowstandard <=", value, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andLowstandardIn(List<Float> values) {
            addCriterion("lowstandard in", values, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andLowstandardNotIn(List<Float> values) {
            addCriterion("lowstandard not in", values, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andLowstandardBetween(Float value1, Float value2) {
            addCriterion("lowstandard between", value1, value2, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andLowstandardNotBetween(Float value1, Float value2) {
            addCriterion("lowstandard not between", value1, value2, "lowstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardIsNull() {
            addCriterion("highstandard is null");
            return (Criteria) this;
        }

        public Criteria andHighstandardIsNotNull() {
            addCriterion("highstandard is not null");
            return (Criteria) this;
        }

        public Criteria andHighstandardEqualTo(Float value) {
            addCriterion("highstandard =", value, "highstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardNotEqualTo(Float value) {
            addCriterion("highstandard <>", value, "highstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardGreaterThan(Float value) {
            addCriterion("highstandard >", value, "highstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardGreaterThanOrEqualTo(Float value) {
            addCriterion("highstandard >=", value, "highstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardLessThan(Float value) {
            addCriterion("highstandard <", value, "highstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardLessThanOrEqualTo(Float value) {
            addCriterion("highstandard <=", value, "highstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardIn(List<Float> values) {
            addCriterion("highstandard in", values, "highstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardNotIn(List<Float> values) {
            addCriterion("highstandard not in", values, "highstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardBetween(Float value1, Float value2) {
            addCriterion("highstandard between", value1, value2, "highstandard");
            return (Criteria) this;
        }

        public Criteria andHighstandardNotBetween(Float value1, Float value2) {
            addCriterion("highstandard not between", value1, value2, "highstandard");
            return (Criteria) this;
        }

        public Criteria andDatelineIsNull() {
            addCriterion("dateline is null");
            return (Criteria) this;
        }

        public Criteria andDatelineIsNotNull() {
            addCriterion("dateline is not null");
            return (Criteria) this;
        }

        public Criteria andDatelineEqualTo(String value) {
            addCriterion("dateline =", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotEqualTo(String value) {
            addCriterion("dateline <>", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineGreaterThan(String value) {
            addCriterion("dateline >", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineGreaterThanOrEqualTo(String value) {
            addCriterion("dateline >=", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineLessThan(String value) {
            addCriterion("dateline <", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineLessThanOrEqualTo(String value) {
            addCriterion("dateline <=", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineLike(String value) {
            addCriterion("dateline like", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotLike(String value) {
            addCriterion("dateline not like", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineIn(List<String> values) {
            addCriterion("dateline in", values, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotIn(List<String> values) {
            addCriterion("dateline not in", values, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineBetween(String value1, String value2) {
            addCriterion("dateline between", value1, value2, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotBetween(String value1, String value2) {
            addCriterion("dateline not between", value1, value2, "dateline");
            return (Criteria) this;
        }

        public Criteria andScoretypeIsNull() {
            addCriterion("scoretype is null");
            return (Criteria) this;
        }

        public Criteria andScoretypeIsNotNull() {
            addCriterion("scoretype is not null");
            return (Criteria) this;
        }

        public Criteria andScoretypeEqualTo(String value) {
            addCriterion("scoretype =", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeNotEqualTo(String value) {
            addCriterion("scoretype <>", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeGreaterThan(String value) {
            addCriterion("scoretype >", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeGreaterThanOrEqualTo(String value) {
            addCriterion("scoretype >=", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeLessThan(String value) {
            addCriterion("scoretype <", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeLessThanOrEqualTo(String value) {
            addCriterion("scoretype <=", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeLike(String value) {
            addCriterion("scoretype like", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeNotLike(String value) {
            addCriterion("scoretype not like", value, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeIn(List<String> values) {
            addCriterion("scoretype in", values, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeNotIn(List<String> values) {
            addCriterion("scoretype not in", values, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeBetween(String value1, String value2) {
            addCriterion("scoretype between", value1, value2, "scoretype");
            return (Criteria) this;
        }

        public Criteria andScoretypeNotBetween(String value1, String value2) {
            addCriterion("scoretype not between", value1, value2, "scoretype");
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