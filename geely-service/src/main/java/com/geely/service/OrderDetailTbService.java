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

    //分页查询
    List<OrderDetailTb> listOrderDetailTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> orderDetailIds);
}
