package com.geely.service;

import java.util.List;
import com.geely.entity.CustomerIntegralTb;
public interface CustomerIntegralTbService{


    int deleteByPrimaryKey(Integer customerAddrId);

    int insert(CustomerIntegralTb record);

    int insertSelective(CustomerIntegralTb record);

    CustomerIntegralTb selectByPrimaryKey(Integer customerAddrId);

    int updateByPrimaryKeySelective(CustomerIntegralTb record);

    int updateByPrimaryKey(CustomerIntegralTb record);

    int updateBatch(List<CustomerIntegralTb> list);

    int batchInsert(List<CustomerIntegralTb> list);

}
