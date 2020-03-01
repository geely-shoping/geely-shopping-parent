package com.geely.service;

import com.geely.entity.CustomerFootpringTb;
import java.util.List;
public interface CustomerFootpringTbService{


    int deleteByPrimaryKey(Integer customerFootprintId);

    int insert(CustomerFootpringTb record);

    int insertSelective(CustomerFootpringTb record);

    CustomerFootpringTb selectByPrimaryKey(Integer customerFootprintId);

    int updateByPrimaryKeySelective(CustomerFootpringTb record);

    int updateByPrimaryKey(CustomerFootpringTb record);

    int updateBatch(List<CustomerFootpringTb> list);

    int batchInsert(List<CustomerFootpringTb> list);

}
