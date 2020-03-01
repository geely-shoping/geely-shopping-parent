package com.geely.service;

import java.util.List;
import com.geely.entity.OrderMasterDetailTb;
public interface OrderMasterDetailTbService{


    int deleteByPrimaryKey(Integer orderMasterDetailId);

    int insert(OrderMasterDetailTb record);

    int insertSelective(OrderMasterDetailTb record);

    OrderMasterDetailTb selectByPrimaryKey(Integer orderMasterDetailId);

    int updateByPrimaryKeySelective(OrderMasterDetailTb record);

    int updateByPrimaryKey(OrderMasterDetailTb record);

    int updateBatch(List<OrderMasterDetailTb> list);

    int batchInsert(List<OrderMasterDetailTb> list);

}
