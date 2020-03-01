package com.geely.dao;

import com.geely.entity.EmployeeTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 员工信息
 */
public interface EmployeeTbMapper {
    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeeTb record);

    int insertSelective(EmployeeTb record);

    EmployeeTb selectByPrimaryKey(Integer employeeId);

    int updateByPrimaryKeySelective(EmployeeTb record);

    int updateByPrimaryKey(EmployeeTb record);

    int updateBatch(List<EmployeeTb> list);

    int batchInsert(@Param("list") List<EmployeeTb> list);

    //分页查询
    List<EmployeeTb> listEmployeeTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}