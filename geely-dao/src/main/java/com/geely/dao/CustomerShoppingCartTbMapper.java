package com.geely.dao;

import com.geely.entity.CustomerShoppingCartTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerShoppingCartTbMapper {
    int deleteByPrimaryKey(Integer customerShoppingCartId);

    int insert(CustomerShoppingCartTb record);

    int insertSelective(CustomerShoppingCartTb record);

    CustomerShoppingCartTb selectByPrimaryKey(Integer customerShoppingCartId);

    int updateByPrimaryKeySelective(CustomerShoppingCartTb record);

    int updateByPrimaryKey(CustomerShoppingCartTb record);

    int updateBatch(List<CustomerShoppingCartTb> list);

    int batchInsert(@Param("list") List<CustomerShoppingCartTb> list);
}