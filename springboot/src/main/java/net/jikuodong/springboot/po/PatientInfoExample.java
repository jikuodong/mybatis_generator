package net.jikuodong.springboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatientInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientInfoExample() {
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

        public Criteria andPatNoTypeIsNull() {
            addCriterion("pat_no_type is null");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeIsNotNull() {
            addCriterion("pat_no_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeEqualTo(Integer value) {
            addCriterion("pat_no_type =", value, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeNotEqualTo(Integer value) {
            addCriterion("pat_no_type <>", value, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeGreaterThan(Integer value) {
            addCriterion("pat_no_type >", value, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pat_no_type >=", value, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeLessThan(Integer value) {
            addCriterion("pat_no_type <", value, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pat_no_type <=", value, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeIn(List<Integer> values) {
            addCriterion("pat_no_type in", values, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeNotIn(List<Integer> values) {
            addCriterion("pat_no_type not in", values, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeBetween(Integer value1, Integer value2) {
            addCriterion("pat_no_type between", value1, value2, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pat_no_type not between", value1, value2, "patNoType");
            return (Criteria) this;
        }

        public Criteria andPatNoIsNull() {
            addCriterion("pat_no is null");
            return (Criteria) this;
        }

        public Criteria andPatNoIsNotNull() {
            addCriterion("pat_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatNoEqualTo(String value) {
            addCriterion("pat_no =", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoNotEqualTo(String value) {
            addCriterion("pat_no <>", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoGreaterThan(String value) {
            addCriterion("pat_no >", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoGreaterThanOrEqualTo(String value) {
            addCriterion("pat_no >=", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoLessThan(String value) {
            addCriterion("pat_no <", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoLessThanOrEqualTo(String value) {
            addCriterion("pat_no <=", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoLike(String value) {
            addCriterion("pat_no like", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoNotLike(String value) {
            addCriterion("pat_no not like", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoIn(List<String> values) {
            addCriterion("pat_no in", values, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoNotIn(List<String> values) {
            addCriterion("pat_no not in", values, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoBetween(String value1, String value2) {
            addCriterion("pat_no between", value1, value2, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoNotBetween(String value1, String value2) {
            addCriterion("pat_no not between", value1, value2, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNameIsNull() {
            addCriterion("pat_name is null");
            return (Criteria) this;
        }

        public Criteria andPatNameIsNotNull() {
            addCriterion("pat_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatNameEqualTo(String value) {
            addCriterion("pat_name =", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameNotEqualTo(String value) {
            addCriterion("pat_name <>", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameGreaterThan(String value) {
            addCriterion("pat_name >", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameGreaterThanOrEqualTo(String value) {
            addCriterion("pat_name >=", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameLessThan(String value) {
            addCriterion("pat_name <", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameLessThanOrEqualTo(String value) {
            addCriterion("pat_name <=", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameLike(String value) {
            addCriterion("pat_name like", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameNotLike(String value) {
            addCriterion("pat_name not like", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameIn(List<String> values) {
            addCriterion("pat_name in", values, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameNotIn(List<String> values) {
            addCriterion("pat_name not in", values, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameBetween(String value1, String value2) {
            addCriterion("pat_name between", value1, value2, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameNotBetween(String value1, String value2) {
            addCriterion("pat_name not between", value1, value2, "patName");
            return (Criteria) this;
        }

        public Criteria andPatSexIsNull() {
            addCriterion("pat_sex is null");
            return (Criteria) this;
        }

        public Criteria andPatSexIsNotNull() {
            addCriterion("pat_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPatSexEqualTo(Boolean value) {
            addCriterion("pat_sex =", value, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatSexNotEqualTo(Boolean value) {
            addCriterion("pat_sex <>", value, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatSexGreaterThan(Boolean value) {
            addCriterion("pat_sex >", value, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pat_sex >=", value, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatSexLessThan(Boolean value) {
            addCriterion("pat_sex <", value, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatSexLessThanOrEqualTo(Boolean value) {
            addCriterion("pat_sex <=", value, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatSexIn(List<Boolean> values) {
            addCriterion("pat_sex in", values, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatSexNotIn(List<Boolean> values) {
            addCriterion("pat_sex not in", values, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatSexBetween(Boolean value1, Boolean value2) {
            addCriterion("pat_sex between", value1, value2, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pat_sex not between", value1, value2, "patSex");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayIsNull() {
            addCriterion("pat_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayIsNotNull() {
            addCriterion("pat_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("pat_birthday =", value, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("pat_birthday <>", value, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("pat_birthday >", value, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pat_birthday >=", value, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("pat_birthday <", value, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pat_birthday <=", value, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("pat_birthday in", values, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("pat_birthday not in", values, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pat_birthday between", value1, value2, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pat_birthday not between", value1, value2, "patBirthday");
            return (Criteria) this;
        }

        public Criteria andPatAgeIsNull() {
            addCriterion("pat_age is null");
            return (Criteria) this;
        }

        public Criteria andPatAgeIsNotNull() {
            addCriterion("pat_age is not null");
            return (Criteria) this;
        }

        public Criteria andPatAgeEqualTo(Integer value) {
            addCriterion("pat_age =", value, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatAgeNotEqualTo(Integer value) {
            addCriterion("pat_age <>", value, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatAgeGreaterThan(Integer value) {
            addCriterion("pat_age >", value, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pat_age >=", value, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatAgeLessThan(Integer value) {
            addCriterion("pat_age <", value, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatAgeLessThanOrEqualTo(Integer value) {
            addCriterion("pat_age <=", value, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatAgeIn(List<Integer> values) {
            addCriterion("pat_age in", values, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatAgeNotIn(List<Integer> values) {
            addCriterion("pat_age not in", values, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatAgeBetween(Integer value1, Integer value2) {
            addCriterion("pat_age between", value1, value2, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("pat_age not between", value1, value2, "patAge");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneIsNull() {
            addCriterion("pat_tellphone is null");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneIsNotNull() {
            addCriterion("pat_tellphone is not null");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneEqualTo(String value) {
            addCriterion("pat_tellphone =", value, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneNotEqualTo(String value) {
            addCriterion("pat_tellphone <>", value, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneGreaterThan(String value) {
            addCriterion("pat_tellphone >", value, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("pat_tellphone >=", value, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneLessThan(String value) {
            addCriterion("pat_tellphone <", value, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneLessThanOrEqualTo(String value) {
            addCriterion("pat_tellphone <=", value, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneLike(String value) {
            addCriterion("pat_tellphone like", value, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneNotLike(String value) {
            addCriterion("pat_tellphone not like", value, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneIn(List<String> values) {
            addCriterion("pat_tellphone in", values, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneNotIn(List<String> values) {
            addCriterion("pat_tellphone not in", values, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneBetween(String value1, String value2) {
            addCriterion("pat_tellphone between", value1, value2, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatTellphoneNotBetween(String value1, String value2) {
            addCriterion("pat_tellphone not between", value1, value2, "patTellphone");
            return (Criteria) this;
        }

        public Criteria andPatAddressIsNull() {
            addCriterion("pat_address is null");
            return (Criteria) this;
        }

        public Criteria andPatAddressIsNotNull() {
            addCriterion("pat_address is not null");
            return (Criteria) this;
        }

        public Criteria andPatAddressEqualTo(String value) {
            addCriterion("pat_address =", value, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressNotEqualTo(String value) {
            addCriterion("pat_address <>", value, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressGreaterThan(String value) {
            addCriterion("pat_address >", value, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pat_address >=", value, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressLessThan(String value) {
            addCriterion("pat_address <", value, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressLessThanOrEqualTo(String value) {
            addCriterion("pat_address <=", value, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressLike(String value) {
            addCriterion("pat_address like", value, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressNotLike(String value) {
            addCriterion("pat_address not like", value, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressIn(List<String> values) {
            addCriterion("pat_address in", values, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressNotIn(List<String> values) {
            addCriterion("pat_address not in", values, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressBetween(String value1, String value2) {
            addCriterion("pat_address between", value1, value2, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatAddressNotBetween(String value1, String value2) {
            addCriterion("pat_address not between", value1, value2, "patAddress");
            return (Criteria) this;
        }

        public Criteria andPatNoteIsNull() {
            addCriterion("pat_note is null");
            return (Criteria) this;
        }

        public Criteria andPatNoteIsNotNull() {
            addCriterion("pat_note is not null");
            return (Criteria) this;
        }

        public Criteria andPatNoteEqualTo(String value) {
            addCriterion("pat_note =", value, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteNotEqualTo(String value) {
            addCriterion("pat_note <>", value, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteGreaterThan(String value) {
            addCriterion("pat_note >", value, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteGreaterThanOrEqualTo(String value) {
            addCriterion("pat_note >=", value, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteLessThan(String value) {
            addCriterion("pat_note <", value, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteLessThanOrEqualTo(String value) {
            addCriterion("pat_note <=", value, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteLike(String value) {
            addCriterion("pat_note like", value, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteNotLike(String value) {
            addCriterion("pat_note not like", value, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteIn(List<String> values) {
            addCriterion("pat_note in", values, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteNotIn(List<String> values) {
            addCriterion("pat_note not in", values, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteBetween(String value1, String value2) {
            addCriterion("pat_note between", value1, value2, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatNoteNotBetween(String value1, String value2) {
            addCriterion("pat_note not between", value1, value2, "patNote");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeIsNull() {
            addCriterion("pat_mi_type is null");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeIsNotNull() {
            addCriterion("pat_mi_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeEqualTo(String value) {
            addCriterion("pat_mi_type =", value, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeNotEqualTo(String value) {
            addCriterion("pat_mi_type <>", value, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeGreaterThan(String value) {
            addCriterion("pat_mi_type >", value, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pat_mi_type >=", value, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeLessThan(String value) {
            addCriterion("pat_mi_type <", value, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeLessThanOrEqualTo(String value) {
            addCriterion("pat_mi_type <=", value, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeLike(String value) {
            addCriterion("pat_mi_type like", value, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeNotLike(String value) {
            addCriterion("pat_mi_type not like", value, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeIn(List<String> values) {
            addCriterion("pat_mi_type in", values, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeNotIn(List<String> values) {
            addCriterion("pat_mi_type not in", values, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeBetween(String value1, String value2) {
            addCriterion("pat_mi_type between", value1, value2, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiTypeNotBetween(String value1, String value2) {
            addCriterion("pat_mi_type not between", value1, value2, "patMiType");
            return (Criteria) this;
        }

        public Criteria andPatMiidIsNull() {
            addCriterion("pat_miid is null");
            return (Criteria) this;
        }

        public Criteria andPatMiidIsNotNull() {
            addCriterion("pat_miid is not null");
            return (Criteria) this;
        }

        public Criteria andPatMiidEqualTo(String value) {
            addCriterion("pat_miid =", value, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidNotEqualTo(String value) {
            addCriterion("pat_miid <>", value, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidGreaterThan(String value) {
            addCriterion("pat_miid >", value, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidGreaterThanOrEqualTo(String value) {
            addCriterion("pat_miid >=", value, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidLessThan(String value) {
            addCriterion("pat_miid <", value, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidLessThanOrEqualTo(String value) {
            addCriterion("pat_miid <=", value, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidLike(String value) {
            addCriterion("pat_miid like", value, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidNotLike(String value) {
            addCriterion("pat_miid not like", value, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidIn(List<String> values) {
            addCriterion("pat_miid in", values, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidNotIn(List<String> values) {
            addCriterion("pat_miid not in", values, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidBetween(String value1, String value2) {
            addCriterion("pat_miid between", value1, value2, "patMiid");
            return (Criteria) this;
        }

        public Criteria andPatMiidNotBetween(String value1, String value2) {
            addCriterion("pat_miid not between", value1, value2, "patMiid");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNull() {
            addCriterion("update_flag is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNotNull() {
            addCriterion("update_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagEqualTo(Integer value) {
            addCriterion("update_flag =", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotEqualTo(Integer value) {
            addCriterion("update_flag <>", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThan(Integer value) {
            addCriterion("update_flag >", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_flag >=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThan(Integer value) {
            addCriterion("update_flag <", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThanOrEqualTo(Integer value) {
            addCriterion("update_flag <=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIn(List<Integer> values) {
            addCriterion("update_flag in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotIn(List<Integer> values) {
            addCriterion("update_flag not in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagBetween(Integer value1, Integer value2) {
            addCriterion("update_flag between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("update_flag not between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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