package com.geely.entity.admin;

public class AccountDept {
    private Integer accountDeptId;

    private Integer accountId;

    private Integer deptId;

    public AccountDept(Integer accountDeptId, Integer accountId, Integer deptId) {
        this.accountDeptId = accountDeptId;
        this.accountId = accountId;
        this.deptId = deptId;
    }

    public AccountDept() {
        super();
    }

    public Integer getAccountDeptId() {
        return accountDeptId;
    }

    public void setAccountDeptId(Integer accountDeptId) {
        this.accountDeptId = accountDeptId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}