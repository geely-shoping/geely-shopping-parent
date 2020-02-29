package com.geely.dao.admin;

import com.geely.entity.admin.ProductModel;

public interface ProductModelMapper {
    int deleteByPrimaryKey(Integer modelId);

    int insert(ProductModel record);

    int insertSelective(ProductModel record);

    ProductModel selectByPrimaryKey(Integer modelId);

    int updateByPrimaryKeySelective(ProductModel record);

    int updateByPrimaryKey(ProductModel record);
}