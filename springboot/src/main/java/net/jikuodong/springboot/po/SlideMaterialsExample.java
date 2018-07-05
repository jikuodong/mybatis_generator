package net.jikuodong.springboot.po;

import java.util.ArrayList;
import java.util.List;

public class SlideMaterialsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlideMaterialsExample() {
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

        public Criteria andPicNameIsNull() {
            addCriterion("pic_name is null");
            return (Criteria) this;
        }

        public Criteria andPicNameIsNotNull() {
            addCriterion("pic_name is not null");
            return (Criteria) this;
        }

        public Criteria andPicNameEqualTo(String value) {
            addCriterion("pic_name =", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotEqualTo(String value) {
            addCriterion("pic_name <>", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThan(String value) {
            addCriterion("pic_name >", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("pic_name >=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThan(String value) {
            addCriterion("pic_name <", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThanOrEqualTo(String value) {
            addCriterion("pic_name <=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLike(String value) {
            addCriterion("pic_name like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotLike(String value) {
            addCriterion("pic_name not like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameIn(List<String> values) {
            addCriterion("pic_name in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotIn(List<String> values) {
            addCriterion("pic_name not in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameBetween(String value1, String value2) {
            addCriterion("pic_name between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotBetween(String value1, String value2) {
            addCriterion("pic_name not between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andPicAddrIsNull() {
            addCriterion("pic_addr is null");
            return (Criteria) this;
        }

        public Criteria andPicAddrIsNotNull() {
            addCriterion("pic_addr is not null");
            return (Criteria) this;
        }

        public Criteria andPicAddrEqualTo(String value) {
            addCriterion("pic_addr =", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrNotEqualTo(String value) {
            addCriterion("pic_addr <>", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrGreaterThan(String value) {
            addCriterion("pic_addr >", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrGreaterThanOrEqualTo(String value) {
            addCriterion("pic_addr >=", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrLessThan(String value) {
            addCriterion("pic_addr <", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrLessThanOrEqualTo(String value) {
            addCriterion("pic_addr <=", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrLike(String value) {
            addCriterion("pic_addr like", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrNotLike(String value) {
            addCriterion("pic_addr not like", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrIn(List<String> values) {
            addCriterion("pic_addr in", values, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrNotIn(List<String> values) {
            addCriterion("pic_addr not in", values, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrBetween(String value1, String value2) {
            addCriterion("pic_addr between", value1, value2, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrNotBetween(String value1, String value2) {
            addCriterion("pic_addr not between", value1, value2, "picAddr");
            return (Criteria) this;
        }

        public Criteria andDrawnPathIsNull() {
            addCriterion("drawn_path is null");
            return (Criteria) this;
        }

        public Criteria andDrawnPathIsNotNull() {
            addCriterion("drawn_path is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnPathEqualTo(String value) {
            addCriterion("drawn_path =", value, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathNotEqualTo(String value) {
            addCriterion("drawn_path <>", value, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathGreaterThan(String value) {
            addCriterion("drawn_path >", value, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathGreaterThanOrEqualTo(String value) {
            addCriterion("drawn_path >=", value, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathLessThan(String value) {
            addCriterion("drawn_path <", value, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathLessThanOrEqualTo(String value) {
            addCriterion("drawn_path <=", value, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathLike(String value) {
            addCriterion("drawn_path like", value, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathNotLike(String value) {
            addCriterion("drawn_path not like", value, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathIn(List<String> values) {
            addCriterion("drawn_path in", values, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathNotIn(List<String> values) {
            addCriterion("drawn_path not in", values, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathBetween(String value1, String value2) {
            addCriterion("drawn_path between", value1, value2, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andDrawnPathNotBetween(String value1, String value2) {
            addCriterion("drawn_path not between", value1, value2, "drawnPath");
            return (Criteria) this;
        }

        public Criteria andMarkTypeIsNull() {
            addCriterion("mark_type is null");
            return (Criteria) this;
        }

        public Criteria andMarkTypeIsNotNull() {
            addCriterion("mark_type is not null");
            return (Criteria) this;
        }

        public Criteria andMarkTypeEqualTo(String value) {
            addCriterion("mark_type =", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotEqualTo(String value) {
            addCriterion("mark_type <>", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeGreaterThan(String value) {
            addCriterion("mark_type >", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mark_type >=", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeLessThan(String value) {
            addCriterion("mark_type <", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeLessThanOrEqualTo(String value) {
            addCriterion("mark_type <=", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeLike(String value) {
            addCriterion("mark_type like", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotLike(String value) {
            addCriterion("mark_type not like", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeIn(List<String> values) {
            addCriterion("mark_type in", values, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotIn(List<String> values) {
            addCriterion("mark_type not in", values, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeBetween(String value1, String value2) {
            addCriterion("mark_type between", value1, value2, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotBetween(String value1, String value2) {
            addCriterion("mark_type not between", value1, value2, "markType");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefIsNull() {
            addCriterion("is_express_brief is null");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefIsNotNull() {
            addCriterion("is_express_brief is not null");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefEqualTo(Integer value) {
            addCriterion("is_express_brief =", value, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefNotEqualTo(Integer value) {
            addCriterion("is_express_brief <>", value, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefGreaterThan(Integer value) {
            addCriterion("is_express_brief >", value, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_express_brief >=", value, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefLessThan(Integer value) {
            addCriterion("is_express_brief <", value, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefLessThanOrEqualTo(Integer value) {
            addCriterion("is_express_brief <=", value, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefIn(List<Integer> values) {
            addCriterion("is_express_brief in", values, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefNotIn(List<Integer> values) {
            addCriterion("is_express_brief not in", values, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefBetween(Integer value1, Integer value2) {
            addCriterion("is_express_brief between", value1, value2, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andIsExpressBriefNotBetween(Integer value1, Integer value2) {
            addCriterion("is_express_brief not between", value1, value2, "isExpressBrief");
            return (Criteria) this;
        }

        public Criteria andBriefPathIsNull() {
            addCriterion("brief_path is null");
            return (Criteria) this;
        }

        public Criteria andBriefPathIsNotNull() {
            addCriterion("brief_path is not null");
            return (Criteria) this;
        }

        public Criteria andBriefPathEqualTo(String value) {
            addCriterion("brief_path =", value, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathNotEqualTo(String value) {
            addCriterion("brief_path <>", value, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathGreaterThan(String value) {
            addCriterion("brief_path >", value, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathGreaterThanOrEqualTo(String value) {
            addCriterion("brief_path >=", value, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathLessThan(String value) {
            addCriterion("brief_path <", value, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathLessThanOrEqualTo(String value) {
            addCriterion("brief_path <=", value, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathLike(String value) {
            addCriterion("brief_path like", value, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathNotLike(String value) {
            addCriterion("brief_path not like", value, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathIn(List<String> values) {
            addCriterion("brief_path in", values, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathNotIn(List<String> values) {
            addCriterion("brief_path not in", values, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathBetween(String value1, String value2) {
            addCriterion("brief_path between", value1, value2, "briefPath");
            return (Criteria) this;
        }

        public Criteria andBriefPathNotBetween(String value1, String value2) {
            addCriterion("brief_path not between", value1, value2, "briefPath");
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