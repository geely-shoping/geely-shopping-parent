package com.geely.service;

import java.util.List;
import com.geely.entity.ProductImageRelationTb;
public interface ProductImageRelationTbService{


    int deleteByPrimaryKey(Integer proImageId);

    int insert(ProductImageRelationTb record);

    int insertSelective(ProductImageRelationTb record);

    ProductImageRelationTb selectByPrimaryKey(Integer proImageId);

    int updateByPrimaryKeySelective(ProductImageRelationTb record);

    int updateByPrimaryKey(ProductImageRelationTb record);

    int updateBatch(List<ProductImageRelationTb> list);

    int batchInsert(List<ProductImageRelationTb> list);

}
