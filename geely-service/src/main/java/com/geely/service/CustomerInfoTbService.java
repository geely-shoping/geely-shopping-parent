package com.geely.service;

import java.util.List;
import com.geely.entity.CustomerInfoTb;
public interface CustomerInfoTbService{


    int deleteByPrimaryKey(Integer customerInfoId);

    int insert(CustomerInfoTb record);

    int insertSelective(CustomerInfoTb record);

    CustomerInfoTb selectByPrimaryKey(Integer customerInfoId);

    int updateByPrimaryKeySelective(CustomerInfoTb record);

    int updateByPrimaryKey(CustomerInfoTb record);

    int updateBatch(List<CustomerInfoTb> list);

    int batchInsert(List<CustomerInfoTb> list);

}
