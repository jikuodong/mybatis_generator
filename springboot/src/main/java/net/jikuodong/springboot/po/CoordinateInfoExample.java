package net.jikuodong.springboot.po;

import java.util.ArrayList;
import java.util.List;

public class CoordinateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoordinateInfoExample() {
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

        public Criteria andCoordinateIdIsNull() {
            addCriterion("coordinate_id is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdIsNotNull() {
            addCriterion("coordinate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdEqualTo(String value) {
            addCriterion("coordinate_id =", value, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdNotEqualTo(String value) {
            addCriterion("coordinate_id <>", value, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdGreaterThan(String value) {
            addCriterion("coordinate_id >", value, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdGreaterThanOrEqualTo(String value) {
            addCriterion("coordinate_id >=", value, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdLessThan(String value) {
            addCriterion("coordinate_id <", value, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdLessThanOrEqualTo(String value) {
            addCriterion("coordinate_id <=", value, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdLike(String value) {
            addCriterion("coordinate_id like", value, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdNotLike(String value) {
            addCriterion("coordinate_id not like", value, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdIn(List<String> values) {
            addCriterion("coordinate_id in", values, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdNotIn(List<String> values) {
            addCriterion("coordinate_id not in", values, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdBetween(String value1, String value2) {
            addCriterion("coordinate_id between", value1, value2, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIdNotBetween(String value1, String value2) {
            addCriterion("coordinate_id not between", value1, value2, "coordinateId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdIsNull() {
            addCriterion("slide_material_id is null");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdIsNotNull() {
            addCriterion("slide_material_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdEqualTo(String value) {
            addCriterion("slide_material_id =", value, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdNotEqualTo(String value) {
            addCriterion("slide_material_id <>", value, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdGreaterThan(String value) {
            addCriterion("slide_material_id >", value, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdGreaterThanOrEqualTo(String value) {
            addCriterion("slide_material_id >=", value, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdLessThan(String value) {
            addCriterion("slide_material_id <", value, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdLessThanOrEqualTo(String value) {
            addCriterion("slide_material_id <=", value, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdLike(String value) {
            addCriterion("slide_material_id like", value, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdNotLike(String value) {
            addCriterion("slide_material_id not like", value, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdIn(List<String> values) {
            addCriterion("slide_material_id in", values, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdNotIn(List<String> values) {
            addCriterion("slide_material_id not in", values, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdBetween(String value1, String value2) {
            addCriterion("slide_material_id between", value1, value2, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andSlideMaterialIdNotBetween(String value1, String value2) {
            addCriterion("slide_material_id not between", value1, value2, "slideMaterialId");
            return (Criteria) this;
        }

        public Criteria andStartXIsNull() {
            addCriterion("start_x is null");
            return (Criteria) this;
        }

        public Criteria andStartXIsNotNull() {
            addCriterion("start_x is not null");
            return (Criteria) this;
        }

        public Criteria andStartXEqualTo(Integer value) {
            addCriterion("start_x =", value, "startX");
            return (Criteria) this;
        }

        public Criteria andStartXNotEqualTo(Integer value) {
            addCriterion("start_x <>", value, "startX");
            return (Criteria) this;
        }

        public Criteria andStartXGreaterThan(Integer value) {
            addCriterion("start_x >", value, "startX");
            return (Criteria) this;
        }

        public Criteria andStartXGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_x >=", value, "startX");
            return (Criteria) this;
        }

        public Criteria andStartXLessThan(Integer value) {
            addCriterion("start_x <", value, "startX");
            return (Criteria) this;
        }

        public Criteria andStartXLessThanOrEqualTo(Integer value) {
            addCriterion("start_x <=", value, "startX");
            return (Criteria) this;
        }

        public Criteria andStartXIn(List<Integer> values) {
            addCriterion("start_x in", values, "startX");
            return (Criteria) this;
        }

        public Criteria andStartXNotIn(List<Integer> values) {
            addCriterion("start_x not in", values, "startX");
            return (Criteria) this;
        }

        public Criteria andStartXBetween(Integer value1, Integer value2) {
            addCriterion("start_x between", value1, value2, "startX");
            return (Criteria) this;
        }

        public Criteria andStartXNotBetween(Integer value1, Integer value2) {
            addCriterion("start_x not between", value1, value2, "startX");
            return (Criteria) this;
        }

        public Criteria andStartYIsNull() {
            addCriterion("start_y is null");
            return (Criteria) this;
        }

        public Criteria andStartYIsNotNull() {
            addCriterion("start_y is not null");
            return (Criteria) this;
        }

        public Criteria andStartYEqualTo(Integer value) {
            addCriterion("start_y =", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYNotEqualTo(Integer value) {
            addCriterion("start_y <>", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYGreaterThan(Integer value) {
            addCriterion("start_y >", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_y >=", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYLessThan(Integer value) {
            addCriterion("start_y <", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYLessThanOrEqualTo(Integer value) {
            addCriterion("start_y <=", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYIn(List<Integer> values) {
            addCriterion("start_y in", values, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYNotIn(List<Integer> values) {
            addCriterion("start_y not in", values, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYBetween(Integer value1, Integer value2) {
            addCriterion("start_y between", value1, value2, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYNotBetween(Integer value1, Integer value2) {
            addCriterion("start_y not between", value1, value2, "startY");
            return (Criteria) this;
        }

        public Criteria andEndXIsNull() {
            addCriterion("end_x is null");
            return (Criteria) this;
        }

        public Criteria andEndXIsNotNull() {
            addCriterion("end_x is not null");
            return (Criteria) this;
        }

        public Criteria andEndXEqualTo(Integer value) {
            addCriterion("end_x =", value, "endX");
            return (Criteria) this;
        }

        public Criteria andEndXNotEqualTo(Integer value) {
            addCriterion("end_x <>", value, "endX");
            return (Criteria) this;
        }

        public Criteria andEndXGreaterThan(Integer value) {
            addCriterion("end_x >", value, "endX");
            return (Criteria) this;
        }

        public Criteria andEndXGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_x >=", value, "endX");
            return (Criteria) this;
        }

        public Criteria andEndXLessThan(Integer value) {
            addCriterion("end_x <", value, "endX");
            return (Criteria) this;
        }

        public Criteria andEndXLessThanOrEqualTo(Integer value) {
            addCriterion("end_x <=", value, "endX");
            return (Criteria) this;
        }

        public Criteria andEndXIn(List<Integer> values) {
            addCriterion("end_x in", values, "endX");
            return (Criteria) this;
        }

        public Criteria andEndXNotIn(List<Integer> values) {
            addCriterion("end_x not in", values, "endX");
            return (Criteria) this;
        }

        public Criteria andEndXBetween(Integer value1, Integer value2) {
            addCriterion("end_x between", value1, value2, "endX");
            return (Criteria) this;
        }

        public Criteria andEndXNotBetween(Integer value1, Integer value2) {
            addCriterion("end_x not between", value1, value2, "endX");
            return (Criteria) this;
        }

        public Criteria andEndYIsNull() {
            addCriterion("end_y is null");
            return (Criteria) this;
        }

        public Criteria andEndYIsNotNull() {
            addCriterion("end_y is not null");
            return (Criteria) this;
        }

        public Criteria andEndYEqualTo(Integer value) {
            addCriterion("end_y =", value, "endY");
            return (Criteria) this;
        }

        public Criteria andEndYNotEqualTo(Integer value) {
            addCriterion("end_y <>", value, "endY");
            return (Criteria) this;
        }

        public Criteria andEndYGreaterThan(Integer value) {
            addCriterion("end_y >", value, "endY");
            return (Criteria) this;
        }

        public Criteria andEndYGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_y >=", value, "endY");
            return (Criteria) this;
        }

        public Criteria andEndYLessThan(Integer value) {
            addCriterion("end_y <", value, "endY");
            return (Criteria) this;
        }

        public Criteria andEndYLessThanOrEqualTo(Integer value) {
            addCriterion("end_y <=", value, "endY");
            return (Criteria) this;
        }

        public Criteria andEndYIn(List<Integer> values) {
            addCriterion("end_y in", values, "endY");
            return (Criteria) this;
        }

        public Criteria andEndYNotIn(List<Integer> values) {
            addCriterion("end_y not in", values, "endY");
            return (Criteria) this;
        }

        public Criteria andEndYBetween(Integer value1, Integer value2) {
            addCriterion("end_y between", value1, value2, "endY");
            return (Criteria) this;
        }

        public Criteria andEndYNotBetween(Integer value1, Integer value2) {
            addCriterion("end_y not between", value1, value2, "endY");
            return (Criteria) this;
        }

        public Criteria andDef1IsNull() {
            addCriterion("def1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("def1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(Integer value) {
            addCriterion("def1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(Integer value) {
            addCriterion("def1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(Integer value) {
            addCriterion("def1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(Integer value) {
            addCriterion("def1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(Integer value) {
            addCriterion("def1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(Integer value) {
            addCriterion("def1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<Integer> values) {
            addCriterion("def1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<Integer> values) {
            addCriterion("def1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(Integer value1, Integer value2) {
            addCriterion("def1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(Integer value1, Integer value2) {
            addCriterion("def1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("def2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("def2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(Integer value) {
            addCriterion("def2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(Integer value) {
            addCriterion("def2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(Integer value) {
            addCriterion("def2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(Integer value) {
            addCriterion("def2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(Integer value) {
            addCriterion("def2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(Integer value) {
            addCriterion("def2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<Integer> values) {
            addCriterion("def2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<Integer> values) {
            addCriterion("def2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(Integer value1, Integer value2) {
            addCriterion("def2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(Integer value1, Integer value2) {
            addCriterion("def2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("def3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("def3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("def3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("def3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("def3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("def3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("def3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("def3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("def3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("def3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("def3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("def3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("def3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("def3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef4IsNull() {
            addCriterion("def4 is null");
            return (Criteria) this;
        }

        public Criteria andDef4IsNotNull() {
            addCriterion("def4 is not null");
            return (Criteria) this;
        }

        public Criteria andDef4EqualTo(String value) {
            addCriterion("def4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(String value) {
            addCriterion("def4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(String value) {
            addCriterion("def4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(String value) {
            addCriterion("def4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(String value) {
            addCriterion("def4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(String value) {
            addCriterion("def4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Like(String value) {
            addCriterion("def4 like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotLike(String value) {
            addCriterion("def4 not like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<String> values) {
            addCriterion("def4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<String> values) {
            addCriterion("def4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(String value1, String value2) {
            addCriterion("def4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(String value1, String value2) {
            addCriterion("def4 not between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef5IsNull() {
            addCriterion("def5 is null");
            return (Criteria) this;
        }

        public Criteria andDef5IsNotNull() {
            addCriterion("def5 is not null");
            return (Criteria) this;
        }

        public Criteria andDef5EqualTo(String value) {
            addCriterion("def5 =", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotEqualTo(String value) {
            addCriterion("def5 <>", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThan(String value) {
            addCriterion("def5 >", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThanOrEqualTo(String value) {
            addCriterion("def5 >=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThan(String value) {
            addCriterion("def5 <", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThanOrEqualTo(String value) {
            addCriterion("def5 <=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Like(String value) {
            addCriterion("def5 like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotLike(String value) {
            addCriterion("def5 not like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5In(List<String> values) {
            addCriterion("def5 in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotIn(List<String> values) {
            addCriterion("def5 not in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Between(String value1, String value2) {
            addCriterion("def5 between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotBetween(String value1, String value2) {
            addCriterion("def5 not between", value1, value2, "def5");
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