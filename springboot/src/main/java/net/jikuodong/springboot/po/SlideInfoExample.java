package net.jikuodong.springboot.po;

import java.util.ArrayList;
import java.util.List;

public class SlideInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlideInfoExample() {
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

        public Criteria andSlideIdIsNull() {
            addCriterion("slide_id is null");
            return (Criteria) this;
        }

        public Criteria andSlideIdIsNotNull() {
            addCriterion("slide_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlideIdEqualTo(String value) {
            addCriterion("slide_id =", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotEqualTo(String value) {
            addCriterion("slide_id <>", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdGreaterThan(String value) {
            addCriterion("slide_id >", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdGreaterThanOrEqualTo(String value) {
            addCriterion("slide_id >=", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdLessThan(String value) {
            addCriterion("slide_id <", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdLessThanOrEqualTo(String value) {
            addCriterion("slide_id <=", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdLike(String value) {
            addCriterion("slide_id like", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotLike(String value) {
            addCriterion("slide_id not like", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdIn(List<String> values) {
            addCriterion("slide_id in", values, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotIn(List<String> values) {
            addCriterion("slide_id not in", values, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdBetween(String value1, String value2) {
            addCriterion("slide_id between", value1, value2, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotBetween(String value1, String value2) {
            addCriterion("slide_id not between", value1, value2, "slideId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNull() {
            addCriterion("sample_id is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("sample_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(String value) {
            addCriterion("sample_id =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(String value) {
            addCriterion("sample_id <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(String value) {
            addCriterion("sample_id >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(String value) {
            addCriterion("sample_id >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(String value) {
            addCriterion("sample_id <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(String value) {
            addCriterion("sample_id <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLike(String value) {
            addCriterion("sample_id like", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotLike(String value) {
            addCriterion("sample_id not like", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<String> values) {
            addCriterion("sample_id in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<String> values) {
            addCriterion("sample_id not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(String value1, String value2) {
            addCriterion("sample_id between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(String value1, String value2) {
            addCriterion("sample_id not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSlideCodeIsNull() {
            addCriterion("slide_code is null");
            return (Criteria) this;
        }

        public Criteria andSlideCodeIsNotNull() {
            addCriterion("slide_code is not null");
            return (Criteria) this;
        }

        public Criteria andSlideCodeEqualTo(String value) {
            addCriterion("slide_code =", value, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeNotEqualTo(String value) {
            addCriterion("slide_code <>", value, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeGreaterThan(String value) {
            addCriterion("slide_code >", value, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeGreaterThanOrEqualTo(String value) {
            addCriterion("slide_code >=", value, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeLessThan(String value) {
            addCriterion("slide_code <", value, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeLessThanOrEqualTo(String value) {
            addCriterion("slide_code <=", value, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeLike(String value) {
            addCriterion("slide_code like", value, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeNotLike(String value) {
            addCriterion("slide_code not like", value, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeIn(List<String> values) {
            addCriterion("slide_code in", values, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeNotIn(List<String> values) {
            addCriterion("slide_code not in", values, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeBetween(String value1, String value2) {
            addCriterion("slide_code between", value1, value2, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideCodeNotBetween(String value1, String value2) {
            addCriterion("slide_code not between", value1, value2, "slideCode");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeIsNull() {
            addCriterion("slide_dye_type is null");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeIsNotNull() {
            addCriterion("slide_dye_type is not null");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeEqualTo(Integer value) {
            addCriterion("slide_dye_type =", value, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeNotEqualTo(Integer value) {
            addCriterion("slide_dye_type <>", value, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeGreaterThan(Integer value) {
            addCriterion("slide_dye_type >", value, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("slide_dye_type >=", value, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeLessThan(Integer value) {
            addCriterion("slide_dye_type <", value, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("slide_dye_type <=", value, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeIn(List<Integer> values) {
            addCriterion("slide_dye_type in", values, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeNotIn(List<Integer> values) {
            addCriterion("slide_dye_type not in", values, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeBetween(Integer value1, Integer value2) {
            addCriterion("slide_dye_type between", value1, value2, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andSlideDyeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("slide_dye_type not between", value1, value2, "slideDyeType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeIsNull() {
            addCriterion("pathology_type is null");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeIsNotNull() {
            addCriterion("pathology_type is not null");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeEqualTo(Integer value) {
            addCriterion("pathology_type =", value, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeNotEqualTo(Integer value) {
            addCriterion("pathology_type <>", value, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeGreaterThan(Integer value) {
            addCriterion("pathology_type >", value, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathology_type >=", value, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeLessThan(Integer value) {
            addCriterion("pathology_type <", value, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pathology_type <=", value, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeIn(List<Integer> values) {
            addCriterion("pathology_type in", values, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeNotIn(List<Integer> values) {
            addCriterion("pathology_type not in", values, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeBetween(Integer value1, Integer value2) {
            addCriterion("pathology_type between", value1, value2, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andPathologyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pathology_type not between", value1, value2, "pathologyType");
            return (Criteria) this;
        }

        public Criteria andSlideStateIsNull() {
            addCriterion("slide_state is null");
            return (Criteria) this;
        }

        public Criteria andSlideStateIsNotNull() {
            addCriterion("slide_state is not null");
            return (Criteria) this;
        }

        public Criteria andSlideStateEqualTo(Integer value) {
            addCriterion("slide_state =", value, "slideState");
            return (Criteria) this;
        }

        public Criteria andSlideStateNotEqualTo(Integer value) {
            addCriterion("slide_state <>", value, "slideState");
            return (Criteria) this;
        }

        public Criteria andSlideStateGreaterThan(Integer value) {
            addCriterion("slide_state >", value, "slideState");
            return (Criteria) this;
        }

        public Criteria andSlideStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("slide_state >=", value, "slideState");
            return (Criteria) this;
        }

        public Criteria andSlideStateLessThan(Integer value) {
            addCriterion("slide_state <", value, "slideState");
            return (Criteria) this;
        }

        public Criteria andSlideStateLessThanOrEqualTo(Integer value) {
            addCriterion("slide_state <=", value, "slideState");
            return (Criteria) this;
        }

        public Criteria andSlideStateIn(List<Integer> values) {
            addCriterion("slide_state in", values, "slideState");
            return (Criteria) this;
        }

        public Criteria andSlideStateNotIn(List<Integer> values) {
            addCriterion("slide_state not in", values, "slideState");
            return (Criteria) this;
        }

        public Criteria andSlideStateBetween(Integer value1, Integer value2) {
            addCriterion("slide_state between", value1, value2, "slideState");
            return (Criteria) this;
        }

        public Criteria andSlideStateNotBetween(Integer value1, Integer value2) {
            addCriterion("slide_state not between", value1, value2, "slideState");
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