package com.geely.dao.admin;

import com.geely.entity.admin.EmployeeAccount;

public interface EmployeeAccountMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(EmployeeAccount record);

    int insertSelective(EmployeeAccount record);

    EmployeeAccount selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(EmployeeAccount record);

    int updateByPrimaryKey(EmployeeAccount record);
}