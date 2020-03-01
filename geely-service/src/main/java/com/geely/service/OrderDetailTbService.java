package com.geely.service;

import java.util.List;
import com.geely.entity.OrderDetailTb;
public interface OrderDetailTbService{


    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OrderDetailTb record);

    int insertSelective(OrderDetailTb record);

    OrderDetailTb selectByPrimaryKey(Integer orderDetailId);

    int updateByPrimaryKeySelective(OrderDetailTb record);

    int updateByPrimaryKey(OrderDetailTb record);

    int updateBatch(List<OrderDetailTb> list);

    int batchInsert(List<OrderDetailTb> list);

}
