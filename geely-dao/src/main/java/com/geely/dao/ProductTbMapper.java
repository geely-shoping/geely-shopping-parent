package com.geely.dao;

import com.geely.entity.ProductTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 商品信息
 */
public interface ProductTbMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductTb record);

    int insertSelective(ProductTb record);

    ProductTb selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductTb record);

    int updateByPrimaryKey(ProductTb record);

    int updateBatch(List<ProductTb> list);

    int batchInsert(@Param("list") List<ProductTb> list);

    //分页查询
    List<ProductTb> listProductTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}