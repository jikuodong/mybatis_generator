package net.jikuodong.springboot.po;

import java.util.ArrayList;
import java.util.List;

public class ReportResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportResultExample() {
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

        public Criteria andFirstDiagDoctorIsNull() {
            addCriterion("first_diag_doctor is null");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorIsNotNull() {
            addCriterion("first_diag_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorEqualTo(String value) {
            addCriterion("first_diag_doctor =", value, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorNotEqualTo(String value) {
            addCriterion("first_diag_doctor <>", value, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorGreaterThan(String value) {
            addCriterion("first_diag_doctor >", value, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("first_diag_doctor >=", value, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorLessThan(String value) {
            addCriterion("first_diag_doctor <", value, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorLessThanOrEqualTo(String value) {
            addCriterion("first_diag_doctor <=", value, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorLike(String value) {
            addCriterion("first_diag_doctor like", value, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorNotLike(String value) {
            addCriterion("first_diag_doctor not like", value, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorIn(List<String> values) {
            addCriterion("first_diag_doctor in", values, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorNotIn(List<String> values) {
            addCriterion("first_diag_doctor not in", values, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorBetween(String value1, String value2) {
            addCriterion("first_diag_doctor between", value1, value2, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andFirstDiagDoctorNotBetween(String value1, String value2) {
            addCriterion("first_diag_doctor not between", value1, value2, "firstDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorIsNull() {
            addCriterion("return_diag_doctor is null");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorIsNotNull() {
            addCriterion("return_diag_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorEqualTo(String value) {
            addCriterion("return_diag_doctor =", value, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorNotEqualTo(String value) {
            addCriterion("return_diag_doctor <>", value, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorGreaterThan(String value) {
            addCriterion("return_diag_doctor >", value, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("return_diag_doctor >=", value, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorLessThan(String value) {
            addCriterion("return_diag_doctor <", value, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorLessThanOrEqualTo(String value) {
            addCriterion("return_diag_doctor <=", value, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorLike(String value) {
            addCriterion("return_diag_doctor like", value, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorNotLike(String value) {
            addCriterion("return_diag_doctor not like", value, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorIn(List<String> values) {
            addCriterion("return_diag_doctor in", values, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorNotIn(List<String> values) {
            addCriterion("return_diag_doctor not in", values, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorBetween(String value1, String value2) {
            addCriterion("return_diag_doctor between", value1, value2, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andReturnDiagDoctorNotBetween(String value1, String value2) {
            addCriterion("return_diag_doctor not between", value1, value2, "returnDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorIsNull() {
            addCriterion("group_diag_doctor is null");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorIsNotNull() {
            addCriterion("group_diag_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorEqualTo(String value) {
            addCriterion("group_diag_doctor =", value, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorNotEqualTo(String value) {
            addCriterion("group_diag_doctor <>", value, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorGreaterThan(String value) {
            addCriterion("group_diag_doctor >", value, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("group_diag_doctor >=", value, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorLessThan(String value) {
            addCriterion("group_diag_doctor <", value, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorLessThanOrEqualTo(String value) {
            addCriterion("group_diag_doctor <=", value, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorLike(String value) {
            addCriterion("group_diag_doctor like", value, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorNotLike(String value) {
            addCriterion("group_diag_doctor not like", value, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorIn(List<String> values) {
            addCriterion("group_diag_doctor in", values, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorNotIn(List<String> values) {
            addCriterion("group_diag_doctor not in", values, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorBetween(String value1, String value2) {
            addCriterion("group_diag_doctor between", value1, value2, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andGroupDiagDoctorNotBetween(String value1, String value2) {
            addCriterion("group_diag_doctor not between", value1, value2, "groupDiagDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultIsNull() {
            addCriterion("diagonse_result is null");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultIsNotNull() {
            addCriterion("diagonse_result is not null");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultEqualTo(String value) {
            addCriterion("diagonse_result =", value, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultNotEqualTo(String value) {
            addCriterion("diagonse_result <>", value, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultGreaterThan(String value) {
            addCriterion("diagonse_result >", value, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultGreaterThanOrEqualTo(String value) {
            addCriterion("diagonse_result >=", value, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultLessThan(String value) {
            addCriterion("diagonse_result <", value, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultLessThanOrEqualTo(String value) {
            addCriterion("diagonse_result <=", value, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultLike(String value) {
            addCriterion("diagonse_result like", value, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultNotLike(String value) {
            addCriterion("diagonse_result not like", value, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultIn(List<String> values) {
            addCriterion("diagonse_result in", values, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultNotIn(List<String> values) {
            addCriterion("diagonse_result not in", values, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultBetween(String value1, String value2) {
            addCriterion("diagonse_result between", value1, value2, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andDiagonseResultNotBetween(String value1, String value2) {
            addCriterion("diagonse_result not between", value1, value2, "diagonseResult");
            return (Criteria) this;
        }

        public Criteria andRecommendationIsNull() {
            addCriterion("recommendation is null");
            return (Criteria) this;
        }

        public Criteria andRecommendationIsNotNull() {
            addCriterion("recommendation is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendationEqualTo(String value) {
            addCriterion("recommendation =", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationNotEqualTo(String value) {
            addCriterion("recommendation <>", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationGreaterThan(String value) {
            addCriterion("recommendation >", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationGreaterThanOrEqualTo(String value) {
            addCriterion("recommendation >=", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationLessThan(String value) {
            addCriterion("recommendation <", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationLessThanOrEqualTo(String value) {
            addCriterion("recommendation <=", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationLike(String value) {
            addCriterion("recommendation like", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationNotLike(String value) {
            addCriterion("recommendation not like", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationIn(List<String> values) {
            addCriterion("recommendation in", values, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationNotIn(List<String> values) {
            addCriterion("recommendation not in", values, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationBetween(String value1, String value2) {
            addCriterion("recommendation between", value1, value2, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationNotBetween(String value1, String value2) {
            addCriterion("recommendation not between", value1, value2, "recommendation");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultIsNull() {
            addCriterion("cell_checked_result is null");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultIsNotNull() {
            addCriterion("cell_checked_result is not null");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultEqualTo(String value) {
            addCriterion("cell_checked_result =", value, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultNotEqualTo(String value) {
            addCriterion("cell_checked_result <>", value, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultGreaterThan(String value) {
            addCriterion("cell_checked_result >", value, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultGreaterThanOrEqualTo(String value) {
            addCriterion("cell_checked_result >=", value, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultLessThan(String value) {
            addCriterion("cell_checked_result <", value, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultLessThanOrEqualTo(String value) {
            addCriterion("cell_checked_result <=", value, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultLike(String value) {
            addCriterion("cell_checked_result like", value, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultNotLike(String value) {
            addCriterion("cell_checked_result not like", value, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultIn(List<String> values) {
            addCriterion("cell_checked_result in", values, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultNotIn(List<String> values) {
            addCriterion("cell_checked_result not in", values, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultBetween(String value1, String value2) {
            addCriterion("cell_checked_result between", value1, value2, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellCheckedResultNotBetween(String value1, String value2) {
            addCriterion("cell_checked_result not between", value1, value2, "cellCheckedResult");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescIsNull() {
            addCriterion("cell_diagonse_desc is null");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescIsNotNull() {
            addCriterion("cell_diagonse_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescEqualTo(String value) {
            addCriterion("cell_diagonse_desc =", value, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescNotEqualTo(String value) {
            addCriterion("cell_diagonse_desc <>", value, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescGreaterThan(String value) {
            addCriterion("cell_diagonse_desc >", value, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescGreaterThanOrEqualTo(String value) {
            addCriterion("cell_diagonse_desc >=", value, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescLessThan(String value) {
            addCriterion("cell_diagonse_desc <", value, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescLessThanOrEqualTo(String value) {
            addCriterion("cell_diagonse_desc <=", value, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescLike(String value) {
            addCriterion("cell_diagonse_desc like", value, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescNotLike(String value) {
            addCriterion("cell_diagonse_desc not like", value, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescIn(List<String> values) {
            addCriterion("cell_diagonse_desc in", values, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescNotIn(List<String> values) {
            addCriterion("cell_diagonse_desc not in", values, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescBetween(String value1, String value2) {
            addCriterion("cell_diagonse_desc between", value1, value2, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andCellDiagonseDescNotBetween(String value1, String value2) {
            addCriterion("cell_diagonse_desc not between", value1, value2, "cellDiagonseDesc");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagIsNull() {
            addCriterion("is_sync_flag is null");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagIsNotNull() {
            addCriterion("is_sync_flag is not null");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagEqualTo(Integer value) {
            addCriterion("is_sync_flag =", value, "isSyncFlag");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagNotEqualTo(Integer value) {
            addCriterion("is_sync_flag <>", value, "isSyncFlag");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagGreaterThan(Integer value) {
            addCriterion("is_sync_flag >", value, "isSyncFlag");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_sync_flag >=", value, "isSyncFlag");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagLessThan(Integer value) {
            addCriterion("is_sync_flag <", value, "isSyncFlag");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagLessThanOrEqualTo(Integer value) {
            addCriterion("is_sync_flag <=", value, "isSyncFlag");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagIn(List<Integer> values) {
            addCriterion("is_sync_flag in", values, "isSyncFlag");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagNotIn(List<Integer> values) {
            addCriterion("is_sync_flag not in", values, "isSyncFlag");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagBetween(Integer value1, Integer value2) {
            addCriterion("is_sync_flag between", value1, value2, "isSyncFlag");
            return (Criteria) this;
        }

        public Criteria andIsSyncFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("is_sync_flag not between", value1, value2, "isSyncFlag");
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