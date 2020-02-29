package com.geely.entity.admin;

import java.util.Date;

public class Employee {
    private Integer employeeId;

    private String employeeName;

    private String employeeSex;

    private String employeePhone;

    private String employeeCard;

    private String employeeSchool;

    private Date employeeEntry;

    private Date employeeLast;

    public Employee(Integer employeeId, String employeeName, String employeeSex, String employeePhone, String employeeCard, String employeeSchool, Date employeeEntry, Date employeeLast) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.employeePhone = employeePhone;
        this.employeeCard = employeeCard;
        this.employeeSchool = employeeSchool;
        this.employeeEntry = employeeEntry;
        this.employeeLast = employeeLast;
    }

    public Employee() {
        super();
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex == null ? null : employeeSex.trim();
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    public String getEmployeeCard() {
        return employeeCard;
    }

    public void setEmployeeCard(String employeeCard) {
        this.employeeCard = employeeCard == null ? null : employeeCard.trim();
    }

    public String getEmployeeSchool() {
        return employeeSchool;
    }

    public void setEmployeeSchool(String employeeSchool) {
        this.employeeSchool = employeeSchool == null ? null : employeeSchool.trim();
    }

    public Date getEmployeeEntry() {
        return employeeEntry;
    }

    public void setEmployeeEntry(Date employeeEntry) {
        this.employeeEntry = employeeEntry;
    }

    public Date getEmployeeLast() {
        return employeeLast;
    }

    public void setEmployeeLast(Date employeeLast) {
        this.employeeLast = employeeLast;
    }
}