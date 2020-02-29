package com.geely.service;

import com.geely.entity.ProductCategoryTb;
import java.util.List;
public interface ProductCategoryTbService{


    int deleteByPrimaryKey(Integer categoryId);

    int insert(ProductCategoryTb record);

    int insertSelective(ProductCategoryTb record);

    ProductCategoryTb selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(ProductCategoryTb record);

    int updateByPrimaryKey(ProductCategoryTb record);

    int updateBatch(List<ProductCategoryTb> list);

    int batchInsert(List<ProductCategoryTb> list);

}
