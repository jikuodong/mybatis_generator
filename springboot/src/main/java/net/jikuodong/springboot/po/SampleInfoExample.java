package net.jikuodong.springboot.po;

import java.util.ArrayList;
import java.util.List;

public class SampleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SampleInfoExample() {
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

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(String value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(String value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(String value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(String value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(String value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLike(String value) {
            addCriterion("case_id like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotLike(String value) {
            addCriterion("case_id not like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<String> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<String> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(String value1, String value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(String value1, String value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andSampleCodeIsNull() {
            addCriterion("sample_code is null");
            return (Criteria) this;
        }

        public Criteria andSampleCodeIsNotNull() {
            addCriterion("sample_code is not null");
            return (Criteria) this;
        }

        public Criteria andSampleCodeEqualTo(String value) {
            addCriterion("sample_code =", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotEqualTo(String value) {
            addCriterion("sample_code <>", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeGreaterThan(String value) {
            addCriterion("sample_code >", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sample_code >=", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeLessThan(String value) {
            addCriterion("sample_code <", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeLessThanOrEqualTo(String value) {
            addCriterion("sample_code <=", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeLike(String value) {
            addCriterion("sample_code like", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotLike(String value) {
            addCriterion("sample_code not like", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeIn(List<String> values) {
            addCriterion("sample_code in", values, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotIn(List<String> values) {
            addCriterion("sample_code not in", values, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeBetween(String value1, String value2) {
            addCriterion("sample_code between", value1, value2, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotBetween(String value1, String value2) {
            addCriterion("sample_code not between", value1, value2, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleTypesIsNull() {
            addCriterion("sample_types is null");
            return (Criteria) this;
        }

        public Criteria andSampleTypesIsNotNull() {
            addCriterion("sample_types is not null");
            return (Criteria) this;
        }

        public Criteria andSampleTypesEqualTo(String value) {
            addCriterion("sample_types =", value, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesNotEqualTo(String value) {
            addCriterion("sample_types <>", value, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesGreaterThan(String value) {
            addCriterion("sample_types >", value, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesGreaterThanOrEqualTo(String value) {
            addCriterion("sample_types >=", value, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesLessThan(String value) {
            addCriterion("sample_types <", value, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesLessThanOrEqualTo(String value) {
            addCriterion("sample_types <=", value, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesLike(String value) {
            addCriterion("sample_types like", value, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesNotLike(String value) {
            addCriterion("sample_types not like", value, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesIn(List<String> values) {
            addCriterion("sample_types in", values, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesNotIn(List<String> values) {
            addCriterion("sample_types not in", values, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesBetween(String value1, String value2) {
            addCriterion("sample_types between", value1, value2, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleTypesNotBetween(String value1, String value2) {
            addCriterion("sample_types not between", value1, value2, "sampleTypes");
            return (Criteria) this;
        }

        public Criteria andSampleDescIsNull() {
            addCriterion("sample_desc is null");
            return (Criteria) this;
        }

        public Criteria andSampleDescIsNotNull() {
            addCriterion("sample_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSampleDescEqualTo(String value) {
            addCriterion("sample_desc =", value, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescNotEqualTo(String value) {
            addCriterion("sample_desc <>", value, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescGreaterThan(String value) {
            addCriterion("sample_desc >", value, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescGreaterThanOrEqualTo(String value) {
            addCriterion("sample_desc >=", value, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescLessThan(String value) {
            addCriterion("sample_desc <", value, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescLessThanOrEqualTo(String value) {
            addCriterion("sample_desc <=", value, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescLike(String value) {
            addCriterion("sample_desc like", value, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescNotLike(String value) {
            addCriterion("sample_desc not like", value, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescIn(List<String> values) {
            addCriterion("sample_desc in", values, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescNotIn(List<String> values) {
            addCriterion("sample_desc not in", values, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescBetween(String value1, String value2) {
            addCriterion("sample_desc between", value1, value2, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleDescNotBetween(String value1, String value2) {
            addCriterion("sample_desc not between", value1, value2, "sampleDesc");
            return (Criteria) this;
        }

        public Criteria andSampleStateIsNull() {
            addCriterion("sample_state is null");
            return (Criteria) this;
        }

        public Criteria andSampleStateIsNotNull() {
            addCriterion("sample_state is not null");
            return (Criteria) this;
        }

        public Criteria andSampleStateEqualTo(Integer value) {
            addCriterion("sample_state =", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotEqualTo(Integer value) {
            addCriterion("sample_state <>", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateGreaterThan(Integer value) {
            addCriterion("sample_state >", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sample_state >=", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLessThan(Integer value) {
            addCriterion("sample_state <", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLessThanOrEqualTo(Integer value) {
            addCriterion("sample_state <=", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateIn(List<Integer> values) {
            addCriterion("sample_state in", values, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotIn(List<Integer> values) {
            addCriterion("sample_state not in", values, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateBetween(Integer value1, Integer value2) {
            addCriterion("sample_state between", value1, value2, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sample_state not between", value1, value2, "sampleState");
            return (Criteria) this;
        }

        public Criteria andCreatePartIsNull() {
            addCriterion("create_part is null");
            return (Criteria) this;
        }

        public Criteria andCreatePartIsNotNull() {
            addCriterion("create_part is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePartEqualTo(String value) {
            addCriterion("create_part =", value, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartNotEqualTo(String value) {
            addCriterion("create_part <>", value, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartGreaterThan(String value) {
            addCriterion("create_part >", value, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartGreaterThanOrEqualTo(String value) {
            addCriterion("create_part >=", value, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartLessThan(String value) {
            addCriterion("create_part <", value, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartLessThanOrEqualTo(String value) {
            addCriterion("create_part <=", value, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartLike(String value) {
            addCriterion("create_part like", value, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartNotLike(String value) {
            addCriterion("create_part not like", value, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartIn(List<String> values) {
            addCriterion("create_part in", values, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartNotIn(List<String> values) {
            addCriterion("create_part not in", values, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartBetween(String value1, String value2) {
            addCriterion("create_part between", value1, value2, "createPart");
            return (Criteria) this;
        }

        public Criteria andCreatePartNotBetween(String value1, String value2) {
            addCriterion("create_part not between", value1, value2, "createPart");
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