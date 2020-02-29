package com.geely.service;

import java.util.List;
import com.geely.entity.ShoppingCartTb;
public interface ShoppingCartTbService{


    int deleteByPrimaryKey(Integer shoppingCartId);

    int insert(ShoppingCartTb record);

    int insertSelective(ShoppingCartTb record);

    ShoppingCartTb selectByPrimaryKey(Integer shoppingCartId);

    int updateByPrimaryKeySelective(ShoppingCartTb record);

    int updateByPrimaryKey(ShoppingCartTb record);

    int updateBatch(List<ShoppingCartTb> list);

    int batchInsert(List<ShoppingCartTb> list);

}
