package com.geely.entity.admin;

import java.util.Date;

public class Dept {
    private Integer deptId;

    private String deptName;

    private String deptDescribe;

    private Date deptCreate;

    private Date deptLast;

    public Dept(Integer deptId, String deptName, String deptDescribe, Date deptCreate, Date deptLast) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptDescribe = deptDescribe;
        this.deptCreate = deptCreate;
        this.deptLast = deptLast;
    }

    public Dept() {
        super();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptDescribe() {
        return deptDescribe;
    }

    public void setDeptDescribe(String deptDescribe) {
        this.deptDescribe = deptDescribe == null ? null : deptDescribe.trim();
    }

    public Date getDeptCreate() {
        return deptCreate;
    }

    public void setDeptCreate(Date deptCreate) {
        this.deptCreate = deptCreate;
    }

    public Date getDeptLast() {
        return deptLast;
    }

    public void setDeptLast(Date deptLast) {
        this.deptLast = deptLast;
    }
}