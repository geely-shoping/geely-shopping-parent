package com.geely.dao;

import com.geely.entity.EmployeeTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeTbMapper {
    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeeTb record);

    int insertSelective(EmployeeTb record);

    EmployeeTb selectByPrimaryKey(Integer employeeId);

    int updateByPrimaryKeySelective(EmployeeTb record);

    int updateByPrimaryKey(EmployeeTb record);

    int updateBatch(List<EmployeeTb> list);

    int batchInsert(@Param("list") List<EmployeeTb> list);
}