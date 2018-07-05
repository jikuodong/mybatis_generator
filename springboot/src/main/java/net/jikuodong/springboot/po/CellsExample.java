package net.jikuodong.springboot.po;

import java.util.ArrayList;
import java.util.List;

public class CellsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CellsExample() {
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

        public Criteria andHospitalIdIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(String value) {
            addCriterion("hospital_id =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(String value) {
            addCriterion("hospital_id <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(String value) {
            addCriterion("hospital_id >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_id >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(String value) {
            addCriterion("hospital_id <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(String value) {
            addCriterion("hospital_id <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLike(String value) {
            addCriterion("hospital_id like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotLike(String value) {
            addCriterion("hospital_id not like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<String> values) {
            addCriterion("hospital_id in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<String> values) {
            addCriterion("hospital_id not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(String value1, String value2) {
            addCriterion("hospital_id between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(String value1, String value2) {
            addCriterion("hospital_id not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andLogicIdIsNull() {
            addCriterion("logic_id is null");
            return (Criteria) this;
        }

        public Criteria andLogicIdIsNotNull() {
            addCriterion("logic_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogicIdEqualTo(String value) {
            addCriterion("logic_id =", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotEqualTo(String value) {
            addCriterion("logic_id <>", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdGreaterThan(String value) {
            addCriterion("logic_id >", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdGreaterThanOrEqualTo(String value) {
            addCriterion("logic_id >=", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdLessThan(String value) {
            addCriterion("logic_id <", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdLessThanOrEqualTo(String value) {
            addCriterion("logic_id <=", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdLike(String value) {
            addCriterion("logic_id like", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotLike(String value) {
            addCriterion("logic_id not like", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdIn(List<String> values) {
            addCriterion("logic_id in", values, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotIn(List<String> values) {
            addCriterion("logic_id not in", values, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdBetween(String value1, String value2) {
            addCriterion("logic_id between", value1, value2, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotBetween(String value1, String value2) {
            addCriterion("logic_id not between", value1, value2, "logicId");
            return (Criteria) this;
        }

        public Criteria andCellTypeIsNull() {
            addCriterion("cell_type is null");
            return (Criteria) this;
        }

        public Criteria andCellTypeIsNotNull() {
            addCriterion("cell_type is not null");
            return (Criteria) this;
        }

        public Criteria andCellTypeEqualTo(Integer value) {
            addCriterion("cell_type =", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeNotEqualTo(Integer value) {
            addCriterion("cell_type <>", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeGreaterThan(Integer value) {
            addCriterion("cell_type >", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cell_type >=", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeLessThan(Integer value) {
            addCriterion("cell_type <", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cell_type <=", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeIn(List<Integer> values) {
            addCriterion("cell_type in", values, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeNotIn(List<Integer> values) {
            addCriterion("cell_type not in", values, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeBetween(Integer value1, Integer value2) {
            addCriterion("cell_type between", value1, value2, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cell_type not between", value1, value2, "cellType");
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

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXIsNull() {
            addCriterion("nucleus_start_x is null");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXIsNotNull() {
            addCriterion("nucleus_start_x is not null");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXEqualTo(Integer value) {
            addCriterion("nucleus_start_x =", value, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXNotEqualTo(Integer value) {
            addCriterion("nucleus_start_x <>", value, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXGreaterThan(Integer value) {
            addCriterion("nucleus_start_x >", value, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXGreaterThanOrEqualTo(Integer value) {
            addCriterion("nucleus_start_x >=", value, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXLessThan(Integer value) {
            addCriterion("nucleus_start_x <", value, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXLessThanOrEqualTo(Integer value) {
            addCriterion("nucleus_start_x <=", value, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXIn(List<Integer> values) {
            addCriterion("nucleus_start_x in", values, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXNotIn(List<Integer> values) {
            addCriterion("nucleus_start_x not in", values, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXBetween(Integer value1, Integer value2) {
            addCriterion("nucleus_start_x between", value1, value2, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartXNotBetween(Integer value1, Integer value2) {
            addCriterion("nucleus_start_x not between", value1, value2, "nucleusStartX");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYIsNull() {
            addCriterion("nucleus_start_y is null");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYIsNotNull() {
            addCriterion("nucleus_start_y is not null");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYEqualTo(Integer value) {
            addCriterion("nucleus_start_y =", value, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYNotEqualTo(Integer value) {
            addCriterion("nucleus_start_y <>", value, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYGreaterThan(Integer value) {
            addCriterion("nucleus_start_y >", value, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYGreaterThanOrEqualTo(Integer value) {
            addCriterion("nucleus_start_y >=", value, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYLessThan(Integer value) {
            addCriterion("nucleus_start_y <", value, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYLessThanOrEqualTo(Integer value) {
            addCriterion("nucleus_start_y <=", value, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYIn(List<Integer> values) {
            addCriterion("nucleus_start_y in", values, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYNotIn(List<Integer> values) {
            addCriterion("nucleus_start_y not in", values, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYBetween(Integer value1, Integer value2) {
            addCriterion("nucleus_start_y between", value1, value2, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartYNotBetween(Integer value1, Integer value2) {
            addCriterion("nucleus_start_y not between", value1, value2, "nucleusStartY");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthIsNull() {
            addCriterion("nucleus_start_width is null");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthIsNotNull() {
            addCriterion("nucleus_start_width is not null");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthEqualTo(Integer value) {
            addCriterion("nucleus_start_width =", value, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthNotEqualTo(Integer value) {
            addCriterion("nucleus_start_width <>", value, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthGreaterThan(Integer value) {
            addCriterion("nucleus_start_width >", value, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("nucleus_start_width >=", value, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthLessThan(Integer value) {
            addCriterion("nucleus_start_width <", value, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthLessThanOrEqualTo(Integer value) {
            addCriterion("nucleus_start_width <=", value, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthIn(List<Integer> values) {
            addCriterion("nucleus_start_width in", values, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthNotIn(List<Integer> values) {
            addCriterion("nucleus_start_width not in", values, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthBetween(Integer value1, Integer value2) {
            addCriterion("nucleus_start_width between", value1, value2, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("nucleus_start_width not between", value1, value2, "nucleusStartWidth");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightIsNull() {
            addCriterion("nucleus_start_height is null");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightIsNotNull() {
            addCriterion("nucleus_start_height is not null");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightEqualTo(Integer value) {
            addCriterion("nucleus_start_height =", value, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightNotEqualTo(Integer value) {
            addCriterion("nucleus_start_height <>", value, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightGreaterThan(Integer value) {
            addCriterion("nucleus_start_height >", value, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("nucleus_start_height >=", value, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightLessThan(Integer value) {
            addCriterion("nucleus_start_height <", value, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightLessThanOrEqualTo(Integer value) {
            addCriterion("nucleus_start_height <=", value, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightIn(List<Integer> values) {
            addCriterion("nucleus_start_height in", values, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightNotIn(List<Integer> values) {
            addCriterion("nucleus_start_height not in", values, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightBetween(Integer value1, Integer value2) {
            addCriterion("nucleus_start_height between", value1, value2, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andNucleusStartHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("nucleus_start_height not between", value1, value2, "nucleusStartHeight");
            return (Criteria) this;
        }

        public Criteria andDnaIndexIsNull() {
            addCriterion("dna_index is null");
            return (Criteria) this;
        }

        public Criteria andDnaIndexIsNotNull() {
            addCriterion("dna_index is not null");
            return (Criteria) this;
        }

        public Criteria andDnaIndexEqualTo(Double value) {
            addCriterion("dna_index =", value, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andDnaIndexNotEqualTo(Double value) {
            addCriterion("dna_index <>", value, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andDnaIndexGreaterThan(Double value) {
            addCriterion("dna_index >", value, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andDnaIndexGreaterThanOrEqualTo(Double value) {
            addCriterion("dna_index >=", value, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andDnaIndexLessThan(Double value) {
            addCriterion("dna_index <", value, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andDnaIndexLessThanOrEqualTo(Double value) {
            addCriterion("dna_index <=", value, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andDnaIndexIn(List<Double> values) {
            addCriterion("dna_index in", values, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andDnaIndexNotIn(List<Double> values) {
            addCriterion("dna_index not in", values, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andDnaIndexBetween(Double value1, Double value2) {
            addCriterion("dna_index between", value1, value2, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andDnaIndexNotBetween(Double value1, Double value2) {
            addCriterion("dna_index not between", value1, value2, "dnaIndex");
            return (Criteria) this;
        }

        public Criteria andNcRateIsNull() {
            addCriterion("nc_rate is null");
            return (Criteria) this;
        }

        public Criteria andNcRateIsNotNull() {
            addCriterion("nc_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNcRateEqualTo(Double value) {
            addCriterion("nc_rate =", value, "ncRate");
            return (Criteria) this;
        }

        public Criteria andNcRateNotEqualTo(Double value) {
            addCriterion("nc_rate <>", value, "ncRate");
            return (Criteria) this;
        }

        public Criteria andNcRateGreaterThan(Double value) {
            addCriterion("nc_rate >", value, "ncRate");
            return (Criteria) this;
        }

        public Criteria andNcRateGreaterThanOrEqualTo(Double value) {
            addCriterion("nc_rate >=", value, "ncRate");
            return (Criteria) this;
        }

        public Criteria andNcRateLessThan(Double value) {
            addCriterion("nc_rate <", value, "ncRate");
            return (Criteria) this;
        }

        public Criteria andNcRateLessThanOrEqualTo(Double value) {
            addCriterion("nc_rate <=", value, "ncRate");
            return (Criteria) this;
        }

        public Criteria andNcRateIn(List<Double> values) {
            addCriterion("nc_rate in", values, "ncRate");
            return (Criteria) this;
        }

        public Criteria andNcRateNotIn(List<Double> values) {
            addCriterion("nc_rate not in", values, "ncRate");
            return (Criteria) this;
        }

        public Criteria andNcRateBetween(Double value1, Double value2) {
            addCriterion("nc_rate between", value1, value2, "ncRate");
            return (Criteria) this;
        }

        public Criteria andNcRateNotBetween(Double value1, Double value2) {
            addCriterion("nc_rate not between", value1, value2, "ncRate");
            return (Criteria) this;
        }

        public Criteria andCcRateIsNull() {
            addCriterion("cc_rate is null");
            return (Criteria) this;
        }

        public Criteria andCcRateIsNotNull() {
            addCriterion("cc_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCcRateEqualTo(Double value) {
            addCriterion("cc_rate =", value, "ccRate");
            return (Criteria) this;
        }

        public Criteria andCcRateNotEqualTo(Double value) {
            addCriterion("cc_rate <>", value, "ccRate");
            return (Criteria) this;
        }

        public Criteria andCcRateGreaterThan(Double value) {
            addCriterion("cc_rate >", value, "ccRate");
            return (Criteria) this;
        }

        public Criteria andCcRateGreaterThanOrEqualTo(Double value) {
            addCriterion("cc_rate >=", value, "ccRate");
            return (Criteria) this;
        }

        public Criteria andCcRateLessThan(Double value) {
            addCriterion("cc_rate <", value, "ccRate");
            return (Criteria) this;
        }

        public Criteria andCcRateLessThanOrEqualTo(Double value) {
            addCriterion("cc_rate <=", value, "ccRate");
            return (Criteria) this;
        }

        public Criteria andCcRateIn(List<Double> values) {
            addCriterion("cc_rate in", values, "ccRate");
            return (Criteria) this;
        }

        public Criteria andCcRateNotIn(List<Double> values) {
            addCriterion("cc_rate not in", values, "ccRate");
            return (Criteria) this;
        }

        public Criteria andCcRateBetween(Double value1, Double value2) {
            addCriterion("cc_rate between", value1, value2, "ccRate");
            return (Criteria) this;
        }

        public Criteria andCcRateNotBetween(Double value1, Double value2) {
            addCriterion("cc_rate not between", value1, value2, "ccRate");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleIsNull() {
            addCriterion("nucleus_style is null");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleIsNotNull() {
            addCriterion("nucleus_style is not null");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleEqualTo(Double value) {
            addCriterion("nucleus_style =", value, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleNotEqualTo(Double value) {
            addCriterion("nucleus_style <>", value, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleGreaterThan(Double value) {
            addCriterion("nucleus_style >", value, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleGreaterThanOrEqualTo(Double value) {
            addCriterion("nucleus_style >=", value, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleLessThan(Double value) {
            addCriterion("nucleus_style <", value, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleLessThanOrEqualTo(Double value) {
            addCriterion("nucleus_style <=", value, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleIn(List<Double> values) {
            addCriterion("nucleus_style in", values, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleNotIn(List<Double> values) {
            addCriterion("nucleus_style not in", values, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleBetween(Double value1, Double value2) {
            addCriterion("nucleus_style between", value1, value2, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusStyleNotBetween(Double value1, Double value2) {
            addCriterion("nucleus_style not between", value1, value2, "nucleusStyle");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureIsNull() {
            addCriterion("nucleus_texture is null");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureIsNotNull() {
            addCriterion("nucleus_texture is not null");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureEqualTo(Double value) {
            addCriterion("nucleus_texture =", value, "nucleusTexture");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureNotEqualTo(Double value) {
            addCriterion("nucleus_texture <>", value, "nucleusTexture");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureGreaterThan(Double value) {
            addCriterion("nucleus_texture >", value, "nucleusTexture");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureGreaterThanOrEqualTo(Double value) {
            addCriterion("nucleus_texture >=", value, "nucleusTexture");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureLessThan(Double value) {
            addCriterion("nucleus_texture <", value, "nucleusTexture");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureLessThanOrEqualTo(Double value) {
            addCriterion("nucleus_texture <=", value, "nucleusTexture");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureIn(List<Double> values) {
            addCriterion("nucleus_texture in", values, "nucleusTexture");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureNotIn(List<Double> values) {
            addCriterion("nucleus_texture not in", values, "nucleusTexture");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureBetween(Double value1, Double value2) {
            addCriterion("nucleus_texture between", value1, value2, "nucleusTexture");
            return (Criteria) this;
        }

        public Criteria andNucleusTextureNotBetween(Double value1, Double value2) {
            addCriterion("nucleus_texture not between", value1, value2, "nucleusTexture");
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