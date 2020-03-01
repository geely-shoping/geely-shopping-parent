package com.geely.dao;

import com.geely.entity.OrderMasterTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 订单主表
 */
public interface OrderMasterTbMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderMasterTb record);

    int insertSelective(OrderMasterTb record);

    OrderMasterTb selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderMasterTb record);

    int updateByPrimaryKey(OrderMasterTb record);

    int updateBatch(List<OrderMasterTb> list);

    int batchInsert(@Param("list") List<OrderMasterTb> list);

    //分页查询
    List<OrderMasterTb> listOrderMasterTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}