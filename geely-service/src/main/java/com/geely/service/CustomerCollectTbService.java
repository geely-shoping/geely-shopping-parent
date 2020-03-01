package com.geely.service;

import java.util.List;
import com.geely.entity.CustomerCollectTb;
public interface CustomerCollectTbService{


    int deleteByPrimaryKey(Integer customerCollectId);

    int insert(CustomerCollectTb record);

    int insertSelective(CustomerCollectTb record);

    CustomerCollectTb selectByPrimaryKey(Integer customerCollectId);

    int updateByPrimaryKeySelective(CustomerCollectTb record);

    int updateByPrimaryKey(CustomerCollectTb record);

    int updateBatch(List<CustomerCollectTb> list);

    int batchInsert(List<CustomerCollectTb> list);

}
