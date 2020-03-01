package com.geely.service;

import java.util.List;
import com.geely.entity.CustomerAddrTb;
public interface CustomerAddrTbService{


    int deleteByPrimaryKey(Integer customerAddrId);

    int insert(CustomerAddrTb record);

    int insertSelective(CustomerAddrTb record);

    CustomerAddrTb selectByPrimaryKey(Integer customerAddrId);

    int updateByPrimaryKeySelective(CustomerAddrTb record);

    int updateByPrimaryKey(CustomerAddrTb record);

    int updateBatch(List<CustomerAddrTb> list);

    int batchInsert(List<CustomerAddrTb> list);

}
