package com.geely.service;

import java.util.List;
import com.geely.entity.EmployeeAccountRelationTb;
public interface EmployeeAccountRelationTbService{


    int deleteByPrimaryKey(Integer empAccountId);

    int insert(EmployeeAccountRelationTb record);

    int insertSelective(EmployeeAccountRelationTb record);

    EmployeeAccountRelationTb selectByPrimaryKey(Integer empAccountId);

    int updateByPrimaryKeySelective(EmployeeAccountRelationTb record);

    int updateByPrimaryKey(EmployeeAccountRelationTb record);

    int updateBatch(List<EmployeeAccountRelationTb> list);

    int batchInsert(List<EmployeeAccountRelationTb> list);

}
