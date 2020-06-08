package com.document.demo.page;

/**
 * @author Nexus
 * @title: Pageable
 * @projectName demo
 * @description:
 * @date 2020/6/8 13:50
 */
public class Pageable {

    private Integer pageNumber = new Integer(1);

    private Integer limit = new Integer(10);

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
