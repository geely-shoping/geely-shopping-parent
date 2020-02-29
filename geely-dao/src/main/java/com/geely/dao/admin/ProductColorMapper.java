package com.geely.dao.admin;

import com.geely.entity.admin.ProductColor;

public interface ProductColorMapper {
    int deleteByPrimaryKey(Integer colorId);

    int insert(ProductColor record);

    int insertSelective(ProductColor record);

    ProductColor selectByPrimaryKey(Integer colorId);

    int updateByPrimaryKeySelective(ProductColor record);

    int updateByPrimaryKey(ProductColor record);
}