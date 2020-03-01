package com.geely.service;

import java.util.List;
import com.geely.entity.CustomerOrderTb;
public interface CustomerOrderTbService{


    int deleteByPrimaryKey(Integer customerOrderId);

    int insert(CustomerOrderTb record);

    int insertSelective(CustomerOrderTb record);

    CustomerOrderTb selectByPrimaryKey(Integer customerOrderId);

    int updateByPrimaryKeySelective(CustomerOrderTb record);

    int updateByPrimaryKey(CustomerOrderTb record);

    int updateBatch(List<CustomerOrderTb> list);

    int batchInsert(List<CustomerOrderTb> list);

}
