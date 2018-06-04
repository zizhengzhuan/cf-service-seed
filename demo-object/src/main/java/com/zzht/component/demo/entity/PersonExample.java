package com.zzht.component.demo.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * 类的描述
 * @author : kunhour
 * @version :1.0
 * @since : 2018/6/4 10:38
*/
public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<CriteriaBase> oredCriteria;

    public PersonExample() {
        oredCriteria = new ArrayList<CriteriaBase>();
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

    public List<CriteriaBase> getOredCriteria() {
        return oredCriteria;
    }

    public void or(CriteriaBase criteria) {
        oredCriteria.add(criteria);
    }

    public CriteriaBase or() {
        CriteriaBase criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public CriteriaBase createCriteria() {
        CriteriaBase criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected CriteriaBase createCriteriaInternal() {
        CriteriaBase criteria = new CriteriaBase();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class BaseGeneratedCriteria {
        protected List<Criterion> criteria;

        protected BaseGeneratedCriteria() {
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

        public CriteriaBase andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdEqualTo(Long value) {
            addCriterion("person_id =", value, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdNotEqualTo(Long value) {
            addCriterion("person_id <>", value, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdGreaterThan(Long value) {
            addCriterion("person_id >", value, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("person_id >=", value, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdLessThan(Long value) {
            addCriterion("person_id <", value, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdLessThanOrEqualTo(Long value) {
            addCriterion("person_id <=", value, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdIn(List<Long> values) {
            addCriterion("person_id in", values, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdNotIn(List<Long> values) {
            addCriterion("person_id not in", values, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdBetween(Long value1, Long value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andPersonIdNotBetween(Long value1, Long value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameIsNull() {
            addCriterion("user_name is null");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeIsNull() {
            addCriterion("age is null");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeIsNotNull() {
            addCriterion("age is not null");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexIsNull() {
            addCriterion("sex is null");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexIsNotNull() {
            addCriterion("sex is not null");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (CriteriaBase) this;
        }

        public CriteriaBase andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (CriteriaBase) this;
        }
    }

    public static class CriteriaBase extends BaseGeneratedCriteria {

        protected CriteriaBase() {
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