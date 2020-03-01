package com.geely.dao;

import com.geely.entity.ProductCategoryTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 商品分类
 */
public interface ProductCategoryTbMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(ProductCategoryTb record);

    int insertSelective(ProductCategoryTb record);

    ProductCategoryTb selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(ProductCategoryTb record);

    int updateByPrimaryKey(ProductCategoryTb record);

    int updateBatch(List<ProductCategoryTb> list);

    int batchInsert(@Param("list") List<ProductCategoryTb> list);

    //分页查询
    List<ProductCategoryTb> listProductCategoryTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}