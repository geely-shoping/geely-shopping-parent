package com.geely.dao;

import com.geely.entity.ProductCategoryTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryTbMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(ProductCategoryTb record);

    int insertSelective(ProductCategoryTb record);

    ProductCategoryTb selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(ProductCategoryTb record);

    int updateByPrimaryKey(ProductCategoryTb record);

    int updateBatch(List<ProductCategoryTb> list);

    int batchInsert(@Param("list") List<ProductCategoryTb> list);
}