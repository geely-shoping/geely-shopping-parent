package com.geely.dao.admin;

import com.geely.entity.admin.ProductDetails;

public interface ProductDetailsMapper {
    int deleteByPrimaryKey(Integer detailsId);

    int insert(ProductDetails record);

    int insertSelective(ProductDetails record);

    ProductDetails selectByPrimaryKey(Integer detailsId);

    int updateByPrimaryKeySelective(ProductDetails record);

    int updateByPrimaryKey(ProductDetails record);
}