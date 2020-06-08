package com.document.demo.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFileNumberIsNull() {
            addCriterion("file_number is null");
            return (Criteria) this;
        }

        public Criteria andFileNumberIsNotNull() {
            addCriterion("file_number is not null");
            return (Criteria) this;
        }

        public Criteria andFileNumberEqualTo(String value) {
            addCriterion("file_number =", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotEqualTo(String value) {
            addCriterion("file_number <>", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberGreaterThan(String value) {
            addCriterion("file_number >", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("file_number >=", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberLessThan(String value) {
            addCriterion("file_number <", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberLessThanOrEqualTo(String value) {
            addCriterion("file_number <=", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberLike(String value) {
            addCriterion("file_number like", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotLike(String value) {
            addCriterion("file_number not like", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberIn(List<String> values) {
            addCriterion("file_number in", values, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotIn(List<String> values) {
            addCriterion("file_number not in", values, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberBetween(String value1, String value2) {
            addCriterion("file_number between", value1, value2, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotBetween(String value1, String value2) {
            addCriterion("file_number not between", value1, value2, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("`year` is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("`year` is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("`year` =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("`year` <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("`year` >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("`year` >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("`year` <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("`year` <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("`year` like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("`year` not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("`year` in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("`year` not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("`year` between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("`year` not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andBoxNumberIsNull() {
            addCriterion("box_number is null");
            return (Criteria) this;
        }

        public Criteria andBoxNumberIsNotNull() {
            addCriterion("box_number is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNumberEqualTo(String value) {
            addCriterion("box_number =", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotEqualTo(String value) {
            addCriterion("box_number <>", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberGreaterThan(String value) {
            addCriterion("box_number >", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("box_number >=", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberLessThan(String value) {
            addCriterion("box_number <", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberLessThanOrEqualTo(String value) {
            addCriterion("box_number <=", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberLike(String value) {
            addCriterion("box_number like", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotLike(String value) {
            addCriterion("box_number not like", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberIn(List<String> values) {
            addCriterion("box_number in", values, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotIn(List<String> values) {
            addCriterion("box_number not in", values, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberBetween(String value1, String value2) {
            addCriterion("box_number between", value1, value2, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotBetween(String value1, String value2) {
            addCriterion("box_number not between", value1, value2, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberIsNull() {
            addCriterion("folder_number is null");
            return (Criteria) this;
        }

        public Criteria andFolderNumberIsNotNull() {
            addCriterion("folder_number is not null");
            return (Criteria) this;
        }

        public Criteria andFolderNumberEqualTo(String value) {
            addCriterion("folder_number =", value, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberNotEqualTo(String value) {
            addCriterion("folder_number <>", value, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberGreaterThan(String value) {
            addCriterion("folder_number >", value, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("folder_number >=", value, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberLessThan(String value) {
            addCriterion("folder_number <", value, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberLessThanOrEqualTo(String value) {
            addCriterion("folder_number <=", value, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberLike(String value) {
            addCriterion("folder_number like", value, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberNotLike(String value) {
            addCriterion("folder_number not like", value, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberIn(List<String> values) {
            addCriterion("folder_number in", values, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberNotIn(List<String> values) {
            addCriterion("folder_number not in", values, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberBetween(String value1, String value2) {
            addCriterion("folder_number between", value1, value2, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andFolderNumberNotBetween(String value1, String value2) {
            addCriterion("folder_number not between", value1, value2, "folderNumber");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNull() {
            addCriterion("effective_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNotNull() {
            addCriterion("effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEqualTo(String value) {
            addCriterion("effective_time =", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotEqualTo(String value) {
            addCriterion("effective_time <>", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThan(String value) {
            addCriterion("effective_time >", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("effective_time >=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThan(String value) {
            addCriterion("effective_time <", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThanOrEqualTo(String value) {
            addCriterion("effective_time <=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLike(String value) {
            addCriterion("effective_time like", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotLike(String value) {
            addCriterion("effective_time not like", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIn(List<String> values) {
            addCriterion("effective_time in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotIn(List<String> values) {
            addCriterion("effective_time not in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeBetween(String value1, String value2) {
            addCriterion("effective_time between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotBetween(String value1, String value2) {
            addCriterion("effective_time not between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("`time` like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("`time` not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("`time` not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("page is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("page is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(String value) {
            addCriterion("page =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(String value) {
            addCriterion("page <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(String value) {
            addCriterion("page >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(String value) {
            addCriterion("page >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(String value) {
            addCriterion("page <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(String value) {
            addCriterion("page <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLike(String value) {
            addCriterion("page like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotLike(String value) {
            addCriterion("page not like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<String> values) {
            addCriterion("page in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<String> values) {
            addCriterion("page not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(String value1, String value2) {
            addCriterion("page between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(String value1, String value2) {
            addCriterion("page not between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelIsNull() {
            addCriterion("security_level is null");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelIsNotNull() {
            addCriterion("security_level is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelEqualTo(String value) {
            addCriterion("security_level =", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotEqualTo(String value) {
            addCriterion("security_level <>", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelGreaterThan(String value) {
            addCriterion("security_level >", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelGreaterThanOrEqualTo(String value) {
            addCriterion("security_level >=", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelLessThan(String value) {
            addCriterion("security_level <", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelLessThanOrEqualTo(String value) {
            addCriterion("security_level <=", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelLike(String value) {
            addCriterion("security_level like", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotLike(String value) {
            addCriterion("security_level not like", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelIn(List<String> values) {
            addCriterion("security_level in", values, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotIn(List<String> values) {
            addCriterion("security_level not in", values, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelBetween(String value1, String value2) {
            addCriterion("security_level between", value1, value2, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotBetween(String value1, String value2) {
            addCriterion("security_level not between", value1, value2, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andResponsibilityIsNull() {
            addCriterion("responsibility is null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityIsNotNull() {
            addCriterion("responsibility is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityEqualTo(String value) {
            addCriterion("responsibility =", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotEqualTo(String value) {
            addCriterion("responsibility <>", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityGreaterThan(String value) {
            addCriterion("responsibility >", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("responsibility >=", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityLessThan(String value) {
            addCriterion("responsibility <", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityLessThanOrEqualTo(String value) {
            addCriterion("responsibility <=", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityLike(String value) {
            addCriterion("responsibility like", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotLike(String value) {
            addCriterion("responsibility not like", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityIn(List<String> values) {
            addCriterion("responsibility in", values, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotIn(List<String> values) {
            addCriterion("responsibility not in", values, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityBetween(String value1, String value2) {
            addCriterion("responsibility between", value1, value2, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotBetween(String value1, String value2) {
            addCriterion("responsibility not between", value1, value2, "responsibility");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberIsNull() {
            addCriterion("document_number is null");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberIsNotNull() {
            addCriterion("document_number is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberEqualTo(String value) {
            addCriterion("document_number =", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberNotEqualTo(String value) {
            addCriterion("document_number <>", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberGreaterThan(String value) {
            addCriterion("document_number >", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("document_number >=", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberLessThan(String value) {
            addCriterion("document_number <", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("document_number <=", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberLike(String value) {
            addCriterion("document_number like", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberNotLike(String value) {
            addCriterion("document_number not like", value, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberIn(List<String> values) {
            addCriterion("document_number in", values, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberNotIn(List<String> values) {
            addCriterion("document_number not in", values, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberBetween(String value1, String value2) {
            addCriterion("document_number between", value1, value2, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("document_number not between", value1, value2, "documentNumber");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
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