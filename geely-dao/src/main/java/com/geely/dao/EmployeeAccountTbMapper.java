package com.geely.dao;

import com.geely.entity.EmployeeAccountTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeAccountTbMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(EmployeeAccountTb record);

    int insertSelective(EmployeeAccountTb record);

    EmployeeAccountTb selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(EmployeeAccountTb record);

    int updateByPrimaryKey(EmployeeAccountTb record);

    int updateBatch(List<EmployeeAccountTb> list);

    int batchInsert(@Param("list") List<EmployeeAccountTb> list);
}