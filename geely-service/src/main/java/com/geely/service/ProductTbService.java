package com.geely.service;

import java.util.List;
import com.geely.entity.ProductTb;
public interface ProductTbService{


    int deleteByPrimaryKey(Integer productId);

    int insert(ProductTb record);

    int insertSelective(ProductTb record);

    ProductTb selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductTb record);

    int updateByPrimaryKey(ProductTb record);

    int updateBatch(List<ProductTb> list);

    int batchInsert(List<ProductTb> list);

}
