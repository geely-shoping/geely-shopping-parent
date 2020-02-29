package com.geely.dao.admin;

import com.geely.entity.admin.ProductImage;

public interface ProductImageMapper {
    int deleteByPrimaryKey(Integer imageId);

    int insert(ProductImage record);

    int insertSelective(ProductImage record);

    ProductImage selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(ProductImage record);

    int updateByPrimaryKey(ProductImage record);
}