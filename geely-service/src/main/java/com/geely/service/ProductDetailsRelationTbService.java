package com.geely.service;

import java.util.List;
import com.geely.entity.ProductDetailsRelationTb;
public interface ProductDetailsRelationTbService{


    int deleteByPrimaryKey(Integer proDetailsId);

    int insert(ProductDetailsRelationTb record);

    int insertSelective(ProductDetailsRelationTb record);

    ProductDetailsRelationTb selectByPrimaryKey(Integer proDetailsId);

    int updateByPrimaryKeySelective(ProductDetailsRelationTb record);

    int updateByPrimaryKey(ProductDetailsRelationTb record);

    int updateBatch(List<ProductDetailsRelationTb> list);

    int batchInsert(List<ProductDetailsRelationTb> list);

}
