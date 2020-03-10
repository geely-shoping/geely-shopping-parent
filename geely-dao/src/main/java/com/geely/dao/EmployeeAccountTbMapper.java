package com.geely.dao;

import com.geely.entity.EmployeeAccountTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 员工账号
 */
public interface EmployeeAccountTbMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(EmployeeAccountTb record);

    int insertSelective(EmployeeAccountTb record);

    EmployeeAccountTb selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(EmployeeAccountTb record);

    int updateByPrimaryKey(EmployeeAccountTb record);

    int updateBatch(List<EmployeeAccountTb> list);

    int batchInsert(@Param("list") List<EmployeeAccountTb> list);

    //分页查询
    List<EmployeeAccountTb> listEmployeeAccountTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
    //账号密码查询
    EmployeeAccountTb selectByUserNameAndPassword(String accountName,String accountPassword);
}