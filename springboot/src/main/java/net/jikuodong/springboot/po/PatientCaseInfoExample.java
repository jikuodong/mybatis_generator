package net.jikuodong.springboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatientCaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientCaseInfoExample() {
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

        public Criteria andCaseNameIsNull() {
            addCriterion("case_name is null");
            return (Criteria) this;
        }

        public Criteria andCaseNameIsNotNull() {
            addCriterion("case_name is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNameEqualTo(String value) {
            addCriterion("case_name =", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotEqualTo(String value) {
            addCriterion("case_name <>", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThan(String value) {
            addCriterion("case_name >", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("case_name >=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThan(String value) {
            addCriterion("case_name <", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThanOrEqualTo(String value) {
            addCriterion("case_name <=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLike(String value) {
            addCriterion("case_name like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotLike(String value) {
            addCriterion("case_name not like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameIn(List<String> values) {
            addCriterion("case_name in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotIn(List<String> values) {
            addCriterion("case_name not in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameBetween(String value1, String value2) {
            addCriterion("case_name between", value1, value2, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotBetween(String value1, String value2) {
            addCriterion("case_name not between", value1, value2, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseDepartIsNull() {
            addCriterion("case_depart is null");
            return (Criteria) this;
        }

        public Criteria andCaseDepartIsNotNull() {
            addCriterion("case_depart is not null");
            return (Criteria) this;
        }

        public Criteria andCaseDepartEqualTo(String value) {
            addCriterion("case_depart =", value, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartNotEqualTo(String value) {
            addCriterion("case_depart <>", value, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartGreaterThan(String value) {
            addCriterion("case_depart >", value, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartGreaterThanOrEqualTo(String value) {
            addCriterion("case_depart >=", value, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartLessThan(String value) {
            addCriterion("case_depart <", value, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartLessThanOrEqualTo(String value) {
            addCriterion("case_depart <=", value, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartLike(String value) {
            addCriterion("case_depart like", value, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartNotLike(String value) {
            addCriterion("case_depart not like", value, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartIn(List<String> values) {
            addCriterion("case_depart in", values, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartNotIn(List<String> values) {
            addCriterion("case_depart not in", values, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartBetween(String value1, String value2) {
            addCriterion("case_depart between", value1, value2, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseDepartNotBetween(String value1, String value2) {
            addCriterion("case_depart not between", value1, value2, "caseDepart");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNull() {
            addCriterion("case_type is null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNotNull() {
            addCriterion("case_type is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeEqualTo(Integer value) {
            addCriterion("case_type =", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotEqualTo(Integer value) {
            addCriterion("case_type <>", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThan(Integer value) {
            addCriterion("case_type >", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_type >=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThan(Integer value) {
            addCriterion("case_type <", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("case_type <=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIn(List<Integer> values) {
            addCriterion("case_type in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotIn(List<Integer> values) {
            addCriterion("case_type not in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeBetween(Integer value1, Integer value2) {
            addCriterion("case_type between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("case_type not between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdIsNull() {
            addCriterion("pat_inhospital_id is null");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdIsNotNull() {
            addCriterion("pat_inhospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdEqualTo(String value) {
            addCriterion("pat_inhospital_id =", value, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdNotEqualTo(String value) {
            addCriterion("pat_inhospital_id <>", value, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdGreaterThan(String value) {
            addCriterion("pat_inhospital_id >", value, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdGreaterThanOrEqualTo(String value) {
            addCriterion("pat_inhospital_id >=", value, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdLessThan(String value) {
            addCriterion("pat_inhospital_id <", value, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdLessThanOrEqualTo(String value) {
            addCriterion("pat_inhospital_id <=", value, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdLike(String value) {
            addCriterion("pat_inhospital_id like", value, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdNotLike(String value) {
            addCriterion("pat_inhospital_id not like", value, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdIn(List<String> values) {
            addCriterion("pat_inhospital_id in", values, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdNotIn(List<String> values) {
            addCriterion("pat_inhospital_id not in", values, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdBetween(String value1, String value2) {
            addCriterion("pat_inhospital_id between", value1, value2, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatInhospitalIdNotBetween(String value1, String value2) {
            addCriterion("pat_inhospital_id not between", value1, value2, "patInhospitalId");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaIsNull() {
            addCriterion("pat_ward_area is null");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaIsNotNull() {
            addCriterion("pat_ward_area is not null");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaEqualTo(String value) {
            addCriterion("pat_ward_area =", value, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaNotEqualTo(String value) {
            addCriterion("pat_ward_area <>", value, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaGreaterThan(String value) {
            addCriterion("pat_ward_area >", value, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("pat_ward_area >=", value, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaLessThan(String value) {
            addCriterion("pat_ward_area <", value, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaLessThanOrEqualTo(String value) {
            addCriterion("pat_ward_area <=", value, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaLike(String value) {
            addCriterion("pat_ward_area like", value, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaNotLike(String value) {
            addCriterion("pat_ward_area not like", value, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaIn(List<String> values) {
            addCriterion("pat_ward_area in", values, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaNotIn(List<String> values) {
            addCriterion("pat_ward_area not in", values, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaBetween(String value1, String value2) {
            addCriterion("pat_ward_area between", value1, value2, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatWardAreaNotBetween(String value1, String value2) {
            addCriterion("pat_ward_area not between", value1, value2, "patWardArea");
            return (Criteria) this;
        }

        public Criteria andPatBedIdIsNull() {
            addCriterion("pat_bed_id is null");
            return (Criteria) this;
        }

        public Criteria andPatBedIdIsNotNull() {
            addCriterion("pat_bed_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatBedIdEqualTo(String value) {
            addCriterion("pat_bed_id =", value, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdNotEqualTo(String value) {
            addCriterion("pat_bed_id <>", value, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdGreaterThan(String value) {
            addCriterion("pat_bed_id >", value, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdGreaterThanOrEqualTo(String value) {
            addCriterion("pat_bed_id >=", value, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdLessThan(String value) {
            addCriterion("pat_bed_id <", value, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdLessThanOrEqualTo(String value) {
            addCriterion("pat_bed_id <=", value, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdLike(String value) {
            addCriterion("pat_bed_id like", value, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdNotLike(String value) {
            addCriterion("pat_bed_id not like", value, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdIn(List<String> values) {
            addCriterion("pat_bed_id in", values, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdNotIn(List<String> values) {
            addCriterion("pat_bed_id not in", values, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdBetween(String value1, String value2) {
            addCriterion("pat_bed_id between", value1, value2, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPatBedIdNotBetween(String value1, String value2) {
            addCriterion("pat_bed_id not between", value1, value2, "patBedId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdIsNull() {
            addCriterion("pathology_id is null");
            return (Criteria) this;
        }

        public Criteria andPathologyIdIsNotNull() {
            addCriterion("pathology_id is not null");
            return (Criteria) this;
        }

        public Criteria andPathologyIdEqualTo(String value) {
            addCriterion("pathology_id =", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdNotEqualTo(String value) {
            addCriterion("pathology_id <>", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdGreaterThan(String value) {
            addCriterion("pathology_id >", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdGreaterThanOrEqualTo(String value) {
            addCriterion("pathology_id >=", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdLessThan(String value) {
            addCriterion("pathology_id <", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdLessThanOrEqualTo(String value) {
            addCriterion("pathology_id <=", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdLike(String value) {
            addCriterion("pathology_id like", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdNotLike(String value) {
            addCriterion("pathology_id not like", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdIn(List<String> values) {
            addCriterion("pathology_id in", values, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdNotIn(List<String> values) {
            addCriterion("pathology_id not in", values, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdBetween(String value1, String value2) {
            addCriterion("pathology_id between", value1, value2, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdNotBetween(String value1, String value2) {
            addCriterion("pathology_id not between", value1, value2, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(Date value) {
            addCriterion("send_date =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(Date value) {
            addCriterion("send_date <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(Date value) {
            addCriterion("send_date >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(Date value) {
            addCriterion("send_date >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(Date value) {
            addCriterion("send_date <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(Date value) {
            addCriterion("send_date <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<Date> values) {
            addCriterion("send_date in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<Date> values) {
            addCriterion("send_date not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(Date value1, Date value2) {
            addCriterion("send_date between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(Date value1, Date value2) {
            addCriterion("send_date not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andSendDoctorIsNull() {
            addCriterion("send_doctor is null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorIsNotNull() {
            addCriterion("send_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorEqualTo(String value) {
            addCriterion("send_doctor =", value, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorNotEqualTo(String value) {
            addCriterion("send_doctor <>", value, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorGreaterThan(String value) {
            addCriterion("send_doctor >", value, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("send_doctor >=", value, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorLessThan(String value) {
            addCriterion("send_doctor <", value, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorLessThanOrEqualTo(String value) {
            addCriterion("send_doctor <=", value, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorLike(String value) {
            addCriterion("send_doctor like", value, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorNotLike(String value) {
            addCriterion("send_doctor not like", value, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorIn(List<String> values) {
            addCriterion("send_doctor in", values, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorNotIn(List<String> values) {
            addCriterion("send_doctor not in", values, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorBetween(String value1, String value2) {
            addCriterion("send_doctor between", value1, value2, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorNotBetween(String value1, String value2) {
            addCriterion("send_doctor not between", value1, value2, "sendDoctor");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneIsNull() {
            addCriterion("send_doctor_phone is null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneIsNotNull() {
            addCriterion("send_doctor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneEqualTo(String value) {
            addCriterion("send_doctor_phone =", value, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneNotEqualTo(String value) {
            addCriterion("send_doctor_phone <>", value, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneGreaterThan(String value) {
            addCriterion("send_doctor_phone >", value, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("send_doctor_phone >=", value, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneLessThan(String value) {
            addCriterion("send_doctor_phone <", value, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneLessThanOrEqualTo(String value) {
            addCriterion("send_doctor_phone <=", value, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneLike(String value) {
            addCriterion("send_doctor_phone like", value, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneNotLike(String value) {
            addCriterion("send_doctor_phone not like", value, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneIn(List<String> values) {
            addCriterion("send_doctor_phone in", values, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneNotIn(List<String> values) {
            addCriterion("send_doctor_phone not in", values, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneBetween(String value1, String value2) {
            addCriterion("send_doctor_phone between", value1, value2, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andSendDoctorPhoneNotBetween(String value1, String value2) {
            addCriterion("send_doctor_phone not between", value1, value2, "sendDoctorPhone");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseIsNull() {
            addCriterion("is_quick_case is null");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseIsNotNull() {
            addCriterion("is_quick_case is not null");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseEqualTo(Integer value) {
            addCriterion("is_quick_case =", value, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseNotEqualTo(Integer value) {
            addCriterion("is_quick_case <>", value, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseGreaterThan(Integer value) {
            addCriterion("is_quick_case >", value, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_quick_case >=", value, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseLessThan(Integer value) {
            addCriterion("is_quick_case <", value, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseLessThanOrEqualTo(Integer value) {
            addCriterion("is_quick_case <=", value, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseIn(List<Integer> values) {
            addCriterion("is_quick_case in", values, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseNotIn(List<Integer> values) {
            addCriterion("is_quick_case not in", values, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseBetween(Integer value1, Integer value2) {
            addCriterion("is_quick_case between", value1, value2, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsQuickCaseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_quick_case not between", value1, value2, "isQuickCase");
            return (Criteria) this;
        }

        public Criteria andIsPositiveIsNull() {
            addCriterion("is_positive is null");
            return (Criteria) this;
        }

        public Criteria andIsPositiveIsNotNull() {
            addCriterion("is_positive is not null");
            return (Criteria) this;
        }

        public Criteria andIsPositiveEqualTo(Integer value) {
            addCriterion("is_positive =", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveNotEqualTo(Integer value) {
            addCriterion("is_positive <>", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveGreaterThan(Integer value) {
            addCriterion("is_positive >", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_positive >=", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveLessThan(Integer value) {
            addCriterion("is_positive <", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveLessThanOrEqualTo(Integer value) {
            addCriterion("is_positive <=", value, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveIn(List<Integer> values) {
            addCriterion("is_positive in", values, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveNotIn(List<Integer> values) {
            addCriterion("is_positive not in", values, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveBetween(Integer value1, Integer value2) {
            addCriterion("is_positive between", value1, value2, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsPositiveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_positive not between", value1, value2, "isPositive");
            return (Criteria) this;
        }

        public Criteria andIsExpressIsNull() {
            addCriterion("is_express is null");
            return (Criteria) this;
        }

        public Criteria andIsExpressIsNotNull() {
            addCriterion("is_express is not null");
            return (Criteria) this;
        }

        public Criteria andIsExpressEqualTo(Integer value) {
            addCriterion("is_express =", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressNotEqualTo(Integer value) {
            addCriterion("is_express <>", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressGreaterThan(Integer value) {
            addCriterion("is_express >", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_express >=", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressLessThan(Integer value) {
            addCriterion("is_express <", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressLessThanOrEqualTo(Integer value) {
            addCriterion("is_express <=", value, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressIn(List<Integer> values) {
            addCriterion("is_express in", values, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressNotIn(List<Integer> values) {
            addCriterion("is_express not in", values, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressBetween(Integer value1, Integer value2) {
            addCriterion("is_express between", value1, value2, "isExpress");
            return (Criteria) this;
        }

        public Criteria andIsExpressNotBetween(Integer value1, Integer value2) {
            addCriterion("is_express not between", value1, value2, "isExpress");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisIsNull() {
            addCriterion("clinical_diagnosis is null");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisIsNotNull() {
            addCriterion("clinical_diagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisEqualTo(String value) {
            addCriterion("clinical_diagnosis =", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisNotEqualTo(String value) {
            addCriterion("clinical_diagnosis <>", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisGreaterThan(String value) {
            addCriterion("clinical_diagnosis >", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("clinical_diagnosis >=", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisLessThan(String value) {
            addCriterion("clinical_diagnosis <", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("clinical_diagnosis <=", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisLike(String value) {
            addCriterion("clinical_diagnosis like", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisNotLike(String value) {
            addCriterion("clinical_diagnosis not like", value, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisIn(List<String> values) {
            addCriterion("clinical_diagnosis in", values, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisNotIn(List<String> values) {
            addCriterion("clinical_diagnosis not in", values, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisBetween(String value1, String value2) {
            addCriterion("clinical_diagnosis between", value1, value2, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andClinicalDiagnosisNotBetween(String value1, String value2) {
            addCriterion("clinical_diagnosis not between", value1, value2, "clinicalDiagnosis");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIsNull() {
            addCriterion("medical_history is null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIsNotNull() {
            addCriterion("medical_history is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryEqualTo(String value) {
            addCriterion("medical_history =", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotEqualTo(String value) {
            addCriterion("medical_history <>", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryGreaterThan(String value) {
            addCriterion("medical_history >", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("medical_history >=", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLessThan(String value) {
            addCriterion("medical_history <", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLessThanOrEqualTo(String value) {
            addCriterion("medical_history <=", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLike(String value) {
            addCriterion("medical_history like", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotLike(String value) {
            addCriterion("medical_history not like", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIn(List<String> values) {
            addCriterion("medical_history in", values, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotIn(List<String> values) {
            addCriterion("medical_history not in", values, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryBetween(String value1, String value2) {
            addCriterion("medical_history between", value1, value2, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotBetween(String value1, String value2) {
            addCriterion("medical_history not between", value1, value2, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andCaseDescIsNull() {
            addCriterion("case_desc is null");
            return (Criteria) this;
        }

        public Criteria andCaseDescIsNotNull() {
            addCriterion("case_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCaseDescEqualTo(String value) {
            addCriterion("case_desc =", value, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescNotEqualTo(String value) {
            addCriterion("case_desc <>", value, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescGreaterThan(String value) {
            addCriterion("case_desc >", value, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescGreaterThanOrEqualTo(String value) {
            addCriterion("case_desc >=", value, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescLessThan(String value) {
            addCriterion("case_desc <", value, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescLessThanOrEqualTo(String value) {
            addCriterion("case_desc <=", value, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescLike(String value) {
            addCriterion("case_desc like", value, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescNotLike(String value) {
            addCriterion("case_desc not like", value, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescIn(List<String> values) {
            addCriterion("case_desc in", values, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescNotIn(List<String> values) {
            addCriterion("case_desc not in", values, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescBetween(String value1, String value2) {
            addCriterion("case_desc between", value1, value2, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andCaseDescNotBetween(String value1, String value2) {
            addCriterion("case_desc not between", value1, value2, "caseDesc");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("invoice_no like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("invoice_no not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNull() {
            addCriterion("invoice_date is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNotNull() {
            addCriterion("invoice_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateEqualTo(Date value) {
            addCriterion("invoice_date =", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotEqualTo(Date value) {
            addCriterion("invoice_date <>", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThan(Date value) {
            addCriterion("invoice_date >", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invoice_date >=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThan(Date value) {
            addCriterion("invoice_date <", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThanOrEqualTo(Date value) {
            addCriterion("invoice_date <=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIn(List<Date> values) {
            addCriterion("invoice_date in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotIn(List<Date> values) {
            addCriterion("invoice_date not in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateBetween(Date value1, Date value2) {
            addCriterion("invoice_date between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotBetween(Date value1, Date value2) {
            addCriterion("invoice_date not between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeIsNull() {
            addCriterion("last_transit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeIsNotNull() {
            addCriterion("last_transit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeEqualTo(Date value) {
            addCriterionForJDBCDate("last_transit_time =", value, "lastTransitTime");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_transit_time <>", value, "lastTransitTime");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("last_transit_time >", value, "lastTransitTime");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_transit_time >=", value, "lastTransitTime");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeLessThan(Date value) {
            addCriterionForJDBCDate("last_transit_time <", value, "lastTransitTime");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_transit_time <=", value, "lastTransitTime");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeIn(List<Date> values) {
            addCriterionForJDBCDate("last_transit_time in", values, "lastTransitTime");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_transit_time not in", values, "lastTransitTime");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_transit_time between", value1, value2, "lastTransitTime");
            return (Criteria) this;
        }

        public Criteria andLastTransitTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_transit_time not between", value1, value2, "lastTransitTime");
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