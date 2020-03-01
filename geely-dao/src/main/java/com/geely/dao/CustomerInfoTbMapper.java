package com.geely.dao;

import com.geely.entity.CustomerInfoTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 个人信息dao
 */
public interface CustomerInfoTbMapper {
    //根据主键删除
    int deleteByPrimaryKey(Integer customerInfoId);
    //添加（参数完整）
    int insert(CustomerInfoTb record);
    //添加（参数可选）
    int insertSelective(CustomerInfoTb record);
    //根据主键查询
    CustomerInfoTb selectByPrimaryKey(Integer customerInfoId);
    //修改（参数可选）
    int updateByPrimaryKeySelective(CustomerInfoTb record);
    //修改（参数完整）
    int updateByPrimaryKey(CustomerInfoTb record);
    //批量修改（参数完整）
    int updateBatch(List<CustomerInfoTb> list);
    //批量添加（参数完整）
    int batchInsert(@Param("list") List<CustomerInfoTb> list);

    //分页查询
    List<CustomerInfoTb> listCustomerInfoTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}