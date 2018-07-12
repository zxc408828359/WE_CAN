package com.cxw.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andImage1IsNull() {
            addCriterion("image1 is null");
            return (Criteria) this;
        }

        public Criteria andImage1IsNotNull() {
            addCriterion("image1 is not null");
            return (Criteria) this;
        }

        public Criteria andImage1EqualTo(String value) {
            addCriterion("image1 =", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotEqualTo(String value) {
            addCriterion("image1 <>", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThan(String value) {
            addCriterion("image1 >", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThanOrEqualTo(String value) {
            addCriterion("image1 >=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThan(String value) {
            addCriterion("image1 <", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThanOrEqualTo(String value) {
            addCriterion("image1 <=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Like(String value) {
            addCriterion("image1 like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotLike(String value) {
            addCriterion("image1 not like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1In(List<String> values) {
            addCriterion("image1 in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotIn(List<String> values) {
            addCriterion("image1 not in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Between(String value1, String value2) {
            addCriterion("image1 between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotBetween(String value1, String value2) {
            addCriterion("image1 not between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage2IsNull() {
            addCriterion("image2 is null");
            return (Criteria) this;
        }

        public Criteria andImage2IsNotNull() {
            addCriterion("image2 is not null");
            return (Criteria) this;
        }

        public Criteria andImage2EqualTo(String value) {
            addCriterion("image2 =", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotEqualTo(String value) {
            addCriterion("image2 <>", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThan(String value) {
            addCriterion("image2 >", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThanOrEqualTo(String value) {
            addCriterion("image2 >=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThan(String value) {
            addCriterion("image2 <", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThanOrEqualTo(String value) {
            addCriterion("image2 <=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Like(String value) {
            addCriterion("image2 like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotLike(String value) {
            addCriterion("image2 not like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2In(List<String> values) {
            addCriterion("image2 in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotIn(List<String> values) {
            addCriterion("image2 not in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Between(String value1, String value2) {
            addCriterion("image2 between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotBetween(String value1, String value2) {
            addCriterion("image2 not between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemInfoIsNull() {
            addCriterion("item_info is null");
            return (Criteria) this;
        }

        public Criteria andItemInfoIsNotNull() {
            addCriterion("item_info is not null");
            return (Criteria) this;
        }

        public Criteria andItemInfoEqualTo(String value) {
            addCriterion("item_info =", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotEqualTo(String value) {
            addCriterion("item_info <>", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoGreaterThan(String value) {
            addCriterion("item_info >", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoGreaterThanOrEqualTo(String value) {
            addCriterion("item_info >=", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoLessThan(String value) {
            addCriterion("item_info <", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoLessThanOrEqualTo(String value) {
            addCriterion("item_info <=", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoLike(String value) {
            addCriterion("item_info like", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotLike(String value) {
            addCriterion("item_info not like", value, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoIn(List<String> values) {
            addCriterion("item_info in", values, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotIn(List<String> values) {
            addCriterion("item_info not in", values, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoBetween(String value1, String value2) {
            addCriterion("item_info between", value1, value2, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotBetween(String value1, String value2) {
            addCriterion("item_info not between", value1, value2, "itemInfo");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
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