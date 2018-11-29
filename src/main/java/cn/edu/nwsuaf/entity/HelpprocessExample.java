package cn.edu.nwsuaf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HelpprocessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HelpprocessExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andHelpidIsNull() {
            addCriterion("helpid is null");
            return (Criteria) this;
        }

        public Criteria andHelpidIsNotNull() {
            addCriterion("helpid is not null");
            return (Criteria) this;
        }

        public Criteria andHelpidEqualTo(Integer value) {
            addCriterion("helpid =", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidNotEqualTo(Integer value) {
            addCriterion("helpid <>", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidGreaterThan(Integer value) {
            addCriterion("helpid >", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("helpid >=", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidLessThan(Integer value) {
            addCriterion("helpid <", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidLessThanOrEqualTo(Integer value) {
            addCriterion("helpid <=", value, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidIn(List<Integer> values) {
            addCriterion("helpid in", values, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidNotIn(List<Integer> values) {
            addCriterion("helpid not in", values, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidBetween(Integer value1, Integer value2) {
            addCriterion("helpid between", value1, value2, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpidNotBetween(Integer value1, Integer value2) {
            addCriterion("helpid not between", value1, value2, "helpid");
            return (Criteria) this;
        }

        public Criteria andHelpformidIsNull() {
            addCriterion("helpformid is null");
            return (Criteria) this;
        }

        public Criteria andHelpformidIsNotNull() {
            addCriterion("helpformid is not null");
            return (Criteria) this;
        }

        public Criteria andHelpformidEqualTo(Integer value) {
            addCriterion("helpformid =", value, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpformidNotEqualTo(Integer value) {
            addCriterion("helpformid <>", value, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpformidGreaterThan(Integer value) {
            addCriterion("helpformid >", value, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpformidGreaterThanOrEqualTo(Integer value) {
            addCriterion("helpformid >=", value, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpformidLessThan(Integer value) {
            addCriterion("helpformid <", value, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpformidLessThanOrEqualTo(Integer value) {
            addCriterion("helpformid <=", value, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpformidIn(List<Integer> values) {
            addCriterion("helpformid in", values, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpformidNotIn(List<Integer> values) {
            addCriterion("helpformid not in", values, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpformidBetween(Integer value1, Integer value2) {
            addCriterion("helpformid between", value1, value2, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpformidNotBetween(Integer value1, Integer value2) {
            addCriterion("helpformid not between", value1, value2, "helpformid");
            return (Criteria) this;
        }

        public Criteria andHelpdateIsNull() {
            addCriterion("helpdate is null");
            return (Criteria) this;
        }

        public Criteria andHelpdateIsNotNull() {
            addCriterion("helpdate is not null");
            return (Criteria) this;
        }

        public Criteria andHelpdateEqualTo(Date value) {
            addCriterionForJDBCDate("helpdate =", value, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("helpdate <>", value, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("helpdate >", value, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("helpdate >=", value, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpdateLessThan(Date value) {
            addCriterionForJDBCDate("helpdate <", value, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("helpdate <=", value, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpdateIn(List<Date> values) {
            addCriterionForJDBCDate("helpdate in", values, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("helpdate not in", values, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("helpdate between", value1, value2, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("helpdate not between", value1, value2, "helpdate");
            return (Criteria) this;
        }

        public Criteria andHelpplaceIsNull() {
            addCriterion("helpplace is null");
            return (Criteria) this;
        }

        public Criteria andHelpplaceIsNotNull() {
            addCriterion("helpplace is not null");
            return (Criteria) this;
        }

        public Criteria andHelpplaceEqualTo(String value) {
            addCriterion("helpplace =", value, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceNotEqualTo(String value) {
            addCriterion("helpplace <>", value, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceGreaterThan(String value) {
            addCriterion("helpplace >", value, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceGreaterThanOrEqualTo(String value) {
            addCriterion("helpplace >=", value, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceLessThan(String value) {
            addCriterion("helpplace <", value, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceLessThanOrEqualTo(String value) {
            addCriterion("helpplace <=", value, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceLike(String value) {
            addCriterion("helpplace like", value, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceNotLike(String value) {
            addCriterion("helpplace not like", value, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceIn(List<String> values) {
            addCriterion("helpplace in", values, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceNotIn(List<String> values) {
            addCriterion("helpplace not in", values, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceBetween(String value1, String value2) {
            addCriterion("helpplace between", value1, value2, "helpplace");
            return (Criteria) this;
        }

        public Criteria andHelpplaceNotBetween(String value1, String value2) {
            addCriterion("helpplace not between", value1, value2, "helpplace");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseIsNull() {
            addCriterion("problemanalyse is null");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseIsNotNull() {
            addCriterion("problemanalyse is not null");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseEqualTo(String value) {
            addCriterion("problemanalyse =", value, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseNotEqualTo(String value) {
            addCriterion("problemanalyse <>", value, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseGreaterThan(String value) {
            addCriterion("problemanalyse >", value, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseGreaterThanOrEqualTo(String value) {
            addCriterion("problemanalyse >=", value, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseLessThan(String value) {
            addCriterion("problemanalyse <", value, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseLessThanOrEqualTo(String value) {
            addCriterion("problemanalyse <=", value, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseLike(String value) {
            addCriterion("problemanalyse like", value, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseNotLike(String value) {
            addCriterion("problemanalyse not like", value, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseIn(List<String> values) {
            addCriterion("problemanalyse in", values, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseNotIn(List<String> values) {
            addCriterion("problemanalyse not in", values, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseBetween(String value1, String value2) {
            addCriterion("problemanalyse between", value1, value2, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andProblemanalyseNotBetween(String value1, String value2) {
            addCriterion("problemanalyse not between", value1, value2, "problemanalyse");
            return (Criteria) this;
        }

        public Criteria andStageresultIsNull() {
            addCriterion("stageresult is null");
            return (Criteria) this;
        }

        public Criteria andStageresultIsNotNull() {
            addCriterion("stageresult is not null");
            return (Criteria) this;
        }

        public Criteria andStageresultEqualTo(String value) {
            addCriterion("stageresult =", value, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultNotEqualTo(String value) {
            addCriterion("stageresult <>", value, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultGreaterThan(String value) {
            addCriterion("stageresult >", value, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultGreaterThanOrEqualTo(String value) {
            addCriterion("stageresult >=", value, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultLessThan(String value) {
            addCriterion("stageresult <", value, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultLessThanOrEqualTo(String value) {
            addCriterion("stageresult <=", value, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultLike(String value) {
            addCriterion("stageresult like", value, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultNotLike(String value) {
            addCriterion("stageresult not like", value, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultIn(List<String> values) {
            addCriterion("stageresult in", values, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultNotIn(List<String> values) {
            addCriterion("stageresult not in", values, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultBetween(String value1, String value2) {
            addCriterion("stageresult between", value1, value2, "stageresult");
            return (Criteria) this;
        }

        public Criteria andStageresultNotBetween(String value1, String value2) {
            addCriterion("stageresult not between", value1, value2, "stageresult");
            return (Criteria) this;
        }

        public Criteria andEffectIsNull() {
            addCriterion("effect is null");
            return (Criteria) this;
        }

        public Criteria andEffectIsNotNull() {
            addCriterion("effect is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEqualTo(String value) {
            addCriterion("effect =", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotEqualTo(String value) {
            addCriterion("effect <>", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThan(String value) {
            addCriterion("effect >", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThanOrEqualTo(String value) {
            addCriterion("effect >=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThan(String value) {
            addCriterion("effect <", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThanOrEqualTo(String value) {
            addCriterion("effect <=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLike(String value) {
            addCriterion("effect like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotLike(String value) {
            addCriterion("effect not like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectIn(List<String> values) {
            addCriterion("effect in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotIn(List<String> values) {
            addCriterion("effect not in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectBetween(String value1, String value2) {
            addCriterion("effect between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotBetween(String value1, String value2) {
            addCriterion("effect not between", value1, value2, "effect");
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