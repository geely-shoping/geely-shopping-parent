package com.geely.dao.admin;

import com.geely.entity.admin.AccountDept;

public interface AccountDeptMapper {
    int deleteByPrimaryKey(Integer accountDeptId);

    int insert(AccountDept record);

    int insertSelective(AccountDept record);

    AccountDept selectByPrimaryKey(Integer accountDeptId);

    int updateByPrimaryKeySelective(AccountDept record);

    int updateByPrimaryKey(AccountDept record);
}