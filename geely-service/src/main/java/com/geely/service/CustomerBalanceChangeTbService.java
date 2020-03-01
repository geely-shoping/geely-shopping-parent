package com.geely.service;

import com.geely.entity.CustomerBalanceChangeTb;
import java.util.List;
public interface CustomerBalanceChangeTbService{


    int deleteByPrimaryKey(Integer customerBalanceChangeId);

    int insert(CustomerBalanceChangeTb record);

    int insertSelective(CustomerBalanceChangeTb record);

    CustomerBalanceChangeTb selectByPrimaryKey(Integer customerBalanceChangeId);

    int updateByPrimaryKeySelective(CustomerBalanceChangeTb record);

    int updateByPrimaryKey(CustomerBalanceChangeTb record);

    int updateBatch(List<CustomerBalanceChangeTb> list);

    int batchInsert(List<CustomerBalanceChangeTb> list);

}
