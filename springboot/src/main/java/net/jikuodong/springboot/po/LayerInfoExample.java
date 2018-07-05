package net.jikuodong.springboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LayerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LayerInfoExample() {
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

        public Criteria andLayerLogicIdIsNull() {
            addCriterion("layer_logic_id is null");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdIsNotNull() {
            addCriterion("layer_logic_id is not null");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdEqualTo(String value) {
            addCriterion("layer_logic_id =", value, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdNotEqualTo(String value) {
            addCriterion("layer_logic_id <>", value, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdGreaterThan(String value) {
            addCriterion("layer_logic_id >", value, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdGreaterThanOrEqualTo(String value) {
            addCriterion("layer_logic_id >=", value, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdLessThan(String value) {
            addCriterion("layer_logic_id <", value, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdLessThanOrEqualTo(String value) {
            addCriterion("layer_logic_id <=", value, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdLike(String value) {
            addCriterion("layer_logic_id like", value, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdNotLike(String value) {
            addCriterion("layer_logic_id not like", value, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdIn(List<String> values) {
            addCriterion("layer_logic_id in", values, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdNotIn(List<String> values) {
            addCriterion("layer_logic_id not in", values, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdBetween(String value1, String value2) {
            addCriterion("layer_logic_id between", value1, value2, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andLayerLogicIdNotBetween(String value1, String value2) {
            addCriterion("layer_logic_id not between", value1, value2, "layerLogicId");
            return (Criteria) this;
        }

        public Criteria andPatIdIsNull() {
            addCriterion("pat_id is null");
            return (Criteria) this;
        }

        public Criteria andPatIdIsNotNull() {
            addCriterion("pat_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatIdEqualTo(String value) {
            addCriterion("pat_id =", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotEqualTo(String value) {
            addCriterion("pat_id <>", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThan(String value) {
            addCriterion("pat_id >", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThanOrEqualTo(String value) {
            addCriterion("pat_id >=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThan(String value) {
            addCriterion("pat_id <", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThanOrEqualTo(String value) {
            addCriterion("pat_id <=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLike(String value) {
            addCriterion("pat_id like", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotLike(String value) {
            addCriterion("pat_id not like", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdIn(List<String> values) {
            addCriterion("pat_id in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotIn(List<String> values) {
            addCriterion("pat_id not in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdBetween(String value1, String value2) {
            addCriterion("pat_id between", value1, value2, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotBetween(String value1, String value2) {
            addCriterion("pat_id not between", value1, value2, "patId");
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

        public Criteria andLayerIdIsNull() {
            addCriterion("layer_id is null");
            return (Criteria) this;
        }

        public Criteria andLayerIdIsNotNull() {
            addCriterion("layer_id is not null");
            return (Criteria) this;
        }

        public Criteria andLayerIdEqualTo(String value) {
            addCriterion("layer_id =", value, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdNotEqualTo(String value) {
            addCriterion("layer_id <>", value, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdGreaterThan(String value) {
            addCriterion("layer_id >", value, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdGreaterThanOrEqualTo(String value) {
            addCriterion("layer_id >=", value, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdLessThan(String value) {
            addCriterion("layer_id <", value, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdLessThanOrEqualTo(String value) {
            addCriterion("layer_id <=", value, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdLike(String value) {
            addCriterion("layer_id like", value, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdNotLike(String value) {
            addCriterion("layer_id not like", value, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdIn(List<String> values) {
            addCriterion("layer_id in", values, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdNotIn(List<String> values) {
            addCriterion("layer_id not in", values, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdBetween(String value1, String value2) {
            addCriterion("layer_id between", value1, value2, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIdNotBetween(String value1, String value2) {
            addCriterion("layer_id not between", value1, value2, "layerId");
            return (Criteria) this;
        }

        public Criteria andLayerIndexIsNull() {
            addCriterion("layer_index is null");
            return (Criteria) this;
        }

        public Criteria andLayerIndexIsNotNull() {
            addCriterion("layer_index is not null");
            return (Criteria) this;
        }

        public Criteria andLayerIndexEqualTo(Integer value) {
            addCriterion("layer_index =", value, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerIndexNotEqualTo(Integer value) {
            addCriterion("layer_index <>", value, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerIndexGreaterThan(Integer value) {
            addCriterion("layer_index >", value, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("layer_index >=", value, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerIndexLessThan(Integer value) {
            addCriterion("layer_index <", value, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerIndexLessThanOrEqualTo(Integer value) {
            addCriterion("layer_index <=", value, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerIndexIn(List<Integer> values) {
            addCriterion("layer_index in", values, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerIndexNotIn(List<Integer> values) {
            addCriterion("layer_index not in", values, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerIndexBetween(Integer value1, Integer value2) {
            addCriterion("layer_index between", value1, value2, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("layer_index not between", value1, value2, "layerIndex");
            return (Criteria) this;
        }

        public Criteria andLayerTypeIsNull() {
            addCriterion("layer_type is null");
            return (Criteria) this;
        }

        public Criteria andLayerTypeIsNotNull() {
            addCriterion("layer_type is not null");
            return (Criteria) this;
        }

        public Criteria andLayerTypeEqualTo(String value) {
            addCriterion("layer_type =", value, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeNotEqualTo(String value) {
            addCriterion("layer_type <>", value, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeGreaterThan(String value) {
            addCriterion("layer_type >", value, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("layer_type >=", value, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeLessThan(String value) {
            addCriterion("layer_type <", value, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeLessThanOrEqualTo(String value) {
            addCriterion("layer_type <=", value, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeLike(String value) {
            addCriterion("layer_type like", value, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeNotLike(String value) {
            addCriterion("layer_type not like", value, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeIn(List<String> values) {
            addCriterion("layer_type in", values, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeNotIn(List<String> values) {
            addCriterion("layer_type not in", values, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeBetween(String value1, String value2) {
            addCriterion("layer_type between", value1, value2, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerTypeNotBetween(String value1, String value2) {
            addCriterion("layer_type not between", value1, value2, "layerType");
            return (Criteria) this;
        }

        public Criteria andLayerUrlIsNull() {
            addCriterion("layer_url is null");
            return (Criteria) this;
        }

        public Criteria andLayerUrlIsNotNull() {
            addCriterion("layer_url is not null");
            return (Criteria) this;
        }

        public Criteria andLayerUrlEqualTo(String value) {
            addCriterion("layer_url =", value, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlNotEqualTo(String value) {
            addCriterion("layer_url <>", value, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlGreaterThan(String value) {
            addCriterion("layer_url >", value, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("layer_url >=", value, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlLessThan(String value) {
            addCriterion("layer_url <", value, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlLessThanOrEqualTo(String value) {
            addCriterion("layer_url <=", value, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlLike(String value) {
            addCriterion("layer_url like", value, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlNotLike(String value) {
            addCriterion("layer_url not like", value, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlIn(List<String> values) {
            addCriterion("layer_url in", values, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlNotIn(List<String> values) {
            addCriterion("layer_url not in", values, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlBetween(String value1, String value2) {
            addCriterion("layer_url between", value1, value2, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andLayerUrlNotBetween(String value1, String value2) {
            addCriterion("layer_url not between", value1, value2, "layerUrl");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdIsNull() {
            addCriterion("microscope_id is null");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdIsNotNull() {
            addCriterion("microscope_id is not null");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdEqualTo(String value) {
            addCriterion("microscope_id =", value, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdNotEqualTo(String value) {
            addCriterion("microscope_id <>", value, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdGreaterThan(String value) {
            addCriterion("microscope_id >", value, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdGreaterThanOrEqualTo(String value) {
            addCriterion("microscope_id >=", value, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdLessThan(String value) {
            addCriterion("microscope_id <", value, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdLessThanOrEqualTo(String value) {
            addCriterion("microscope_id <=", value, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdLike(String value) {
            addCriterion("microscope_id like", value, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdNotLike(String value) {
            addCriterion("microscope_id not like", value, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdIn(List<String> values) {
            addCriterion("microscope_id in", values, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdNotIn(List<String> values) {
            addCriterion("microscope_id not in", values, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdBetween(String value1, String value2) {
            addCriterion("microscope_id between", value1, value2, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andMicroscopeIdNotBetween(String value1, String value2) {
            addCriterion("microscope_id not between", value1, value2, "microscopeId");
            return (Criteria) this;
        }

        public Criteria andXPixelsIsNull() {
            addCriterion("x_pixels is null");
            return (Criteria) this;
        }

        public Criteria andXPixelsIsNotNull() {
            addCriterion("x_pixels is not null");
            return (Criteria) this;
        }

        public Criteria andXPixelsEqualTo(Integer value) {
            addCriterion("x_pixels =", value, "xPixels");
            return (Criteria) this;
        }

        public Criteria andXPixelsNotEqualTo(Integer value) {
            addCriterion("x_pixels <>", value, "xPixels");
            return (Criteria) this;
        }

        public Criteria andXPixelsGreaterThan(Integer value) {
            addCriterion("x_pixels >", value, "xPixels");
            return (Criteria) this;
        }

        public Criteria andXPixelsGreaterThanOrEqualTo(Integer value) {
            addCriterion("x_pixels >=", value, "xPixels");
            return (Criteria) this;
        }

        public Criteria andXPixelsLessThan(Integer value) {
            addCriterion("x_pixels <", value, "xPixels");
            return (Criteria) this;
        }

        public Criteria andXPixelsLessThanOrEqualTo(Integer value) {
            addCriterion("x_pixels <=", value, "xPixels");
            return (Criteria) this;
        }

        public Criteria andXPixelsIn(List<Integer> values) {
            addCriterion("x_pixels in", values, "xPixels");
            return (Criteria) this;
        }

        public Criteria andXPixelsNotIn(List<Integer> values) {
            addCriterion("x_pixels not in", values, "xPixels");
            return (Criteria) this;
        }

        public Criteria andXPixelsBetween(Integer value1, Integer value2) {
            addCriterion("x_pixels between", value1, value2, "xPixels");
            return (Criteria) this;
        }

        public Criteria andXPixelsNotBetween(Integer value1, Integer value2) {
            addCriterion("x_pixels not between", value1, value2, "xPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsIsNull() {
            addCriterion("y_pixels is null");
            return (Criteria) this;
        }

        public Criteria andYPixelsIsNotNull() {
            addCriterion("y_pixels is not null");
            return (Criteria) this;
        }

        public Criteria andYPixelsEqualTo(Integer value) {
            addCriterion("y_pixels =", value, "yPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsNotEqualTo(Integer value) {
            addCriterion("y_pixels <>", value, "yPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsGreaterThan(Integer value) {
            addCriterion("y_pixels >", value, "yPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsGreaterThanOrEqualTo(Integer value) {
            addCriterion("y_pixels >=", value, "yPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsLessThan(Integer value) {
            addCriterion("y_pixels <", value, "yPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsLessThanOrEqualTo(Integer value) {
            addCriterion("y_pixels <=", value, "yPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsIn(List<Integer> values) {
            addCriterion("y_pixels in", values, "yPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsNotIn(List<Integer> values) {
            addCriterion("y_pixels not in", values, "yPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsBetween(Integer value1, Integer value2) {
            addCriterion("y_pixels between", value1, value2, "yPixels");
            return (Criteria) this;
        }

        public Criteria andYPixelsNotBetween(Integer value1, Integer value2) {
            addCriterion("y_pixels not between", value1, value2, "yPixels");
            return (Criteria) this;
        }

        public Criteria andXCountIsNull() {
            addCriterion("x_count is null");
            return (Criteria) this;
        }

        public Criteria andXCountIsNotNull() {
            addCriterion("x_count is not null");
            return (Criteria) this;
        }

        public Criteria andXCountEqualTo(Integer value) {
            addCriterion("x_count =", value, "xCount");
            return (Criteria) this;
        }

        public Criteria andXCountNotEqualTo(Integer value) {
            addCriterion("x_count <>", value, "xCount");
            return (Criteria) this;
        }

        public Criteria andXCountGreaterThan(Integer value) {
            addCriterion("x_count >", value, "xCount");
            return (Criteria) this;
        }

        public Criteria andXCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("x_count >=", value, "xCount");
            return (Criteria) this;
        }

        public Criteria andXCountLessThan(Integer value) {
            addCriterion("x_count <", value, "xCount");
            return (Criteria) this;
        }

        public Criteria andXCountLessThanOrEqualTo(Integer value) {
            addCriterion("x_count <=", value, "xCount");
            return (Criteria) this;
        }

        public Criteria andXCountIn(List<Integer> values) {
            addCriterion("x_count in", values, "xCount");
            return (Criteria) this;
        }

        public Criteria andXCountNotIn(List<Integer> values) {
            addCriterion("x_count not in", values, "xCount");
            return (Criteria) this;
        }

        public Criteria andXCountBetween(Integer value1, Integer value2) {
            addCriterion("x_count between", value1, value2, "xCount");
            return (Criteria) this;
        }

        public Criteria andXCountNotBetween(Integer value1, Integer value2) {
            addCriterion("x_count not between", value1, value2, "xCount");
            return (Criteria) this;
        }

        public Criteria andYCountIsNull() {
            addCriterion("y_count is null");
            return (Criteria) this;
        }

        public Criteria andYCountIsNotNull() {
            addCriterion("y_count is not null");
            return (Criteria) this;
        }

        public Criteria andYCountEqualTo(Integer value) {
            addCriterion("y_count =", value, "yCount");
            return (Criteria) this;
        }

        public Criteria andYCountNotEqualTo(Integer value) {
            addCriterion("y_count <>", value, "yCount");
            return (Criteria) this;
        }

        public Criteria andYCountGreaterThan(Integer value) {
            addCriterion("y_count >", value, "yCount");
            return (Criteria) this;
        }

        public Criteria andYCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("y_count >=", value, "yCount");
            return (Criteria) this;
        }

        public Criteria andYCountLessThan(Integer value) {
            addCriterion("y_count <", value, "yCount");
            return (Criteria) this;
        }

        public Criteria andYCountLessThanOrEqualTo(Integer value) {
            addCriterion("y_count <=", value, "yCount");
            return (Criteria) this;
        }

        public Criteria andYCountIn(List<Integer> values) {
            addCriterion("y_count in", values, "yCount");
            return (Criteria) this;
        }

        public Criteria andYCountNotIn(List<Integer> values) {
            addCriterion("y_count not in", values, "yCount");
            return (Criteria) this;
        }

        public Criteria andYCountBetween(Integer value1, Integer value2) {
            addCriterion("y_count between", value1, value2, "yCount");
            return (Criteria) this;
        }

        public Criteria andYCountNotBetween(Integer value1, Integer value2) {
            addCriterion("y_count not between", value1, value2, "yCount");
            return (Criteria) this;
        }

        public Criteria andIsUploadIsNull() {
            addCriterion("is_upload is null");
            return (Criteria) this;
        }

        public Criteria andIsUploadIsNotNull() {
            addCriterion("is_upload is not null");
            return (Criteria) this;
        }

        public Criteria andIsUploadEqualTo(Integer value) {
            addCriterion("is_upload =", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadNotEqualTo(Integer value) {
            addCriterion("is_upload <>", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadGreaterThan(Integer value) {
            addCriterion("is_upload >", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_upload >=", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadLessThan(Integer value) {
            addCriterion("is_upload <", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadLessThanOrEqualTo(Integer value) {
            addCriterion("is_upload <=", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadIn(List<Integer> values) {
            addCriterion("is_upload in", values, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadNotIn(List<Integer> values) {
            addCriterion("is_upload not in", values, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadBetween(Integer value1, Integer value2) {
            addCriterion("is_upload between", value1, value2, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadNotBetween(Integer value1, Integer value2) {
            addCriterion("is_upload not between", value1, value2, "isUpload");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNull() {
            addCriterion("create_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNotNull() {
            addCriterion("create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDtEqualTo(Date value) {
            addCriterion("create_dt =", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotEqualTo(Date value) {
            addCriterion("create_dt <>", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThan(Date value) {
            addCriterion("create_dt >", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_dt >=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThan(Date value) {
            addCriterion("create_dt <", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("create_dt <=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtIn(List<Date> values) {
            addCriterion("create_dt in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotIn(List<Date> values) {
            addCriterion("create_dt not in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtBetween(Date value1, Date value2) {
            addCriterion("create_dt between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("create_dt not between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andUploadUrlIsNull() {
            addCriterion("upload_url is null");
            return (Criteria) this;
        }

        public Criteria andUploadUrlIsNotNull() {
            addCriterion("upload_url is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUrlEqualTo(String value) {
            addCriterion("upload_url =", value, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlNotEqualTo(String value) {
            addCriterion("upload_url <>", value, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlGreaterThan(String value) {
            addCriterion("upload_url >", value, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("upload_url >=", value, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlLessThan(String value) {
            addCriterion("upload_url <", value, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlLessThanOrEqualTo(String value) {
            addCriterion("upload_url <=", value, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlLike(String value) {
            addCriterion("upload_url like", value, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlNotLike(String value) {
            addCriterion("upload_url not like", value, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlIn(List<String> values) {
            addCriterion("upload_url in", values, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlNotIn(List<String> values) {
            addCriterion("upload_url not in", values, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlBetween(String value1, String value2) {
            addCriterion("upload_url between", value1, value2, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andUploadUrlNotBetween(String value1, String value2) {
            addCriterion("upload_url not between", value1, value2, "uploadUrl");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountIsNull() {
            addCriterion("total_cell_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountIsNotNull() {
            addCriterion("total_cell_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountEqualTo(Integer value) {
            addCriterion("total_cell_count =", value, "totalCellCount");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountNotEqualTo(Integer value) {
            addCriterion("total_cell_count <>", value, "totalCellCount");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountGreaterThan(Integer value) {
            addCriterion("total_cell_count >", value, "totalCellCount");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_cell_count >=", value, "totalCellCount");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountLessThan(Integer value) {
            addCriterion("total_cell_count <", value, "totalCellCount");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_cell_count <=", value, "totalCellCount");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountIn(List<Integer> values) {
            addCriterion("total_cell_count in", values, "totalCellCount");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountNotIn(List<Integer> values) {
            addCriterion("total_cell_count not in", values, "totalCellCount");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountBetween(Integer value1, Integer value2) {
            addCriterion("total_cell_count between", value1, value2, "totalCellCount");
            return (Criteria) this;
        }

        public Criteria andTotalCellCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_cell_count not between", value1, value2, "totalCellCount");
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