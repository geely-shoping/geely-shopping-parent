package com.geely.dao;

import com.geely.entity.EmployeeAccountRelationTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeAccountRelationTbMapper {
    int deleteByPrimaryKey(Integer empAccountId);

    int insert(EmployeeAccountRelationTb record);

    int insertSelective(EmployeeAccountRelationTb record);

    EmployeeAccountRelationTb selectByPrimaryKey(Integer empAccountId);

    int updateByPrimaryKeySelective(EmployeeAccountRelationTb record);

    int updateByPrimaryKey(EmployeeAccountRelationTb record);

    int updateBatch(List<EmployeeAccountRelationTb> list);

    int batchInsert(@Param("list") List<EmployeeAccountRelationTb> list);
}