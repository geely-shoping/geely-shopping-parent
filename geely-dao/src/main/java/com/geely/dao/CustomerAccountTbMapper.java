package com.geely.dao;

import com.geely.entity.CustomerAccountTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * 用户账号dao
 */

public interface CustomerAccountTbMapper {
    //根据主键删除
    int deleteByPrimaryKey(Integer customerId);
    //添加（参数完整）
    int insert(CustomerAccountTb record);
    //添加（参数可选）
    int insertSelective(CustomerAccountTb record);
    //根据主键查询
    CustomerAccountTb selectByPrimaryKey(Integer customerId);
    //修改（参数可选）
    int updateByPrimaryKeySelective(CustomerAccountTb record);
    //修改（参数完整）
    int updateByPrimaryKey(CustomerAccountTb record);
    //批量修改（参数完整）
    int updateBatch(List<CustomerAccountTb> list);
    //批量添加（参数完整）
    int batchInsert(@Param("list") List<CustomerAccountTb> list);

    //分页查询
    List<CustomerAccountTb> listCustomerAccountTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}