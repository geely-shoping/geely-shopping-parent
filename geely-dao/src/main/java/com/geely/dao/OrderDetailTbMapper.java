package com.geely.dao;

import com.geely.entity.OrderDetailTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 订单详情表
 */
public interface OrderDetailTbMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OrderDetailTb record);

    int insertSelective(OrderDetailTb record);

    OrderDetailTb selectByPrimaryKey(Integer orderDetailId);

    int updateByPrimaryKeySelective(OrderDetailTb record);

    int updateByPrimaryKey(OrderDetailTb record);

    int updateBatch(List<OrderDetailTb> list);

    int batchInsert(@Param("list") List<OrderDetailTb> list);

    //分页查询
    List<OrderDetailTb> listOrderDetailTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}