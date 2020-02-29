package com.geely.service;

import java.util.List;
import com.geely.entity.EmployeeTb;
public interface EmployeeTbService{


    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeeTb record);

    int insertSelective(EmployeeTb record);

    EmployeeTb selectByPrimaryKey(Integer employeeId);

    int updateByPrimaryKeySelective(EmployeeTb record);

    int updateByPrimaryKey(EmployeeTb record);

    int updateBatch(List<EmployeeTb> list);

    int batchInsert(List<EmployeeTb> list);

}
