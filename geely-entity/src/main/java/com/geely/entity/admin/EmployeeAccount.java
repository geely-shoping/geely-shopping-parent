package com.geely.entity.admin;

import java.util.Date;

public class EmployeeAccount {
    private Integer accountId;

    private String accountName;

    private String accountPassword;

    private Date accountCreate;

    private Date accountLast;

    public EmployeeAccount(Integer accountId, String accountName, String accountPassword, Date accountCreate, Date accountLast) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.accountCreate = accountCreate;
        this.accountLast = accountLast;
    }

    public EmployeeAccount() {
        super();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    public Date getAccountCreate() {
        return accountCreate;
    }

    public void setAccountCreate(Date accountCreate) {
        this.accountCreate = accountCreate;
    }

    public Date getAccountLast() {
        return accountLast;
    }

    public void setAccountLast(Date accountLast) {
        this.accountLast = accountLast;
    }
}