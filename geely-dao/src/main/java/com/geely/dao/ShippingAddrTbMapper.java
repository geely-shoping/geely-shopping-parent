package com.geely.dao;

import com.geely.entity.ShippingAddrTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 收货地址dao
 */
public interface ShippingAddrTbMapper {
    //根据主键删除
    int deleteByPrimaryKey(Integer customerAddrId);
    //添加（参数完整）
    int insert(ShippingAddrTb record);
    //添加（参数可选）
    int insertSelective(ShippingAddrTb record);
    //根据主键查询
    ShippingAddrTb selectByPrimaryKey(Integer customerAddrId);
    //修改（参数可选
    int updateByPrimaryKeySelective(ShippingAddrTb record);
    //修改（参数完整）
    int updateByPrimaryKey(ShippingAddrTb record);
    //批量修改（参数完整）
    int updateBatch(List<ShippingAddrTb> list);
    //批量添加（参数完整）
    int batchInsert(@Param("list") List<ShippingAddrTb> list);

    //分页查询
    List<ShippingAddrTb> listShippingAddrTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}