package com.geely.service;

import java.util.List;
import com.geely.entity.OrderMasterTb;
public interface OrderMasterTbService{


    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderMasterTb record);

    int insertSelective(OrderMasterTb record);

    OrderMasterTb selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderMasterTb record);

    int updateByPrimaryKey(OrderMasterTb record);

    int updateBatch(List<OrderMasterTb> list);

    int batchInsert(List<OrderMasterTb> list);

}
