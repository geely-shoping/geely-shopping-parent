package com.geely.dao;

import com.geely.entity.ShoppingCartTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 购物车dao
 */
public interface ShoppingCartTbMapper {
    int deleteByPrimaryKey(Integer shoppingCartId);

    int insert(ShoppingCartTb record);

    int insertSelective(ShoppingCartTb record);

    ShoppingCartTb selectByPrimaryKey(Integer shoppingCartId);

    int updateByPrimaryKeySelective(ShoppingCartTb record);

    int updateByPrimaryKey(ShoppingCartTb record);

    int updateBatch(List<ShoppingCartTb> list);

    int batchInsert(@Param("list") List<ShoppingCartTb> list);

    //分页查询
    List<ShoppingCartTb> listShoppingCartTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}