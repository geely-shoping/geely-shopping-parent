package com.geely.service;

import java.util.List;
import com.geely.entity.EmployeeAccountTb;
public interface EmployeeAccountTbService{


    int deleteByPrimaryKey(Integer accountId);

    int insert(EmployeeAccountTb record);

    int insertSelective(EmployeeAccountTb record);

    EmployeeAccountTb selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(EmployeeAccountTb record);

    int updateByPrimaryKey(EmployeeAccountTb record);

    int updateBatch(List<EmployeeAccountTb> list);

    int batchInsert(List<EmployeeAccountTb> list);

    //分页查询
    List<EmployeeAccountTb> listEmployeeAccountTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> accountIds);
}
