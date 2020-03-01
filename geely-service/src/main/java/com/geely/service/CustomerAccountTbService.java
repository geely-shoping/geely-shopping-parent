package com.geely.service;

import java.util.List;
import com.geely.entity.CustomerAccountTb;
public interface CustomerAccountTbService{


    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerAccountTb record);

    int insertSelective(CustomerAccountTb record);

    CustomerAccountTb selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerAccountTb record);

    int updateByPrimaryKey(CustomerAccountTb record);

    int updateBatch(List<CustomerAccountTb> list);

    int batchInsert(List<CustomerAccountTb> list);

}
