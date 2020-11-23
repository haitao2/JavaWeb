package com.lht.studay.domain;

import java.util.List;

/**
 * 一对一查询
 */
public class User {
    private Integer UId;
    private String name;
    private List<Test> test;

    public List<Test> getList() {
        return test;
    }

    public void setList(List<Test> test) {
        this.test = test;
    }

    public Integer getUId() {
        return UId;
    }

    public void setUId(Integer UId) {
        this.UId = UId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "UId=" + UId +
                ", name='" + name +
                '}';
    }
}
