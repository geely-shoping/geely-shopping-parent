package com.geely.service;

import java.util.List;
import com.geely.entity.ProductCategoryRelationTb;
public interface ProductCategoryRelationTbService{


    int deleteByPrimaryKey(Integer proCategoryId);

    int insert(ProductCategoryRelationTb record);

    int insertSelective(ProductCategoryRelationTb record);

    ProductCategoryRelationTb selectByPrimaryKey(Integer proCategoryId);

    int updateByPrimaryKeySelective(ProductCategoryRelationTb record);

    int updateByPrimaryKey(ProductCategoryRelationTb record);

    int updateBatch(List<ProductCategoryRelationTb> list);

    int batchInsert(List<ProductCategoryRelationTb> list);

}
