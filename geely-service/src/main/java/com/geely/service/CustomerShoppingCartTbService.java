package com.geely.service;

import com.geely.entity.CustomerShoppingCartTb;
import java.util.List;
public interface CustomerShoppingCartTbService{


    int deleteByPrimaryKey(Integer customerShoppingCartId);

    int insert(CustomerShoppingCartTb record);

    int insertSelective(CustomerShoppingCartTb record);

    CustomerShoppingCartTb selectByPrimaryKey(Integer customerShoppingCartId);

    int updateByPrimaryKeySelective(CustomerShoppingCartTb record);

    int updateByPrimaryKey(CustomerShoppingCartTb record);

    int updateBatch(List<CustomerShoppingCartTb> list);

    int batchInsert(List<CustomerShoppingCartTb> list);

}
