package com.geely.service;

import java.util.List;
import com.geely.entity.ProductImageTb;
public interface ProductImageTbService{


    int deleteByPrimaryKey(Integer imageId);

    int insert(ProductImageTb record);

    int insertSelective(ProductImageTb record);

    ProductImageTb selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(ProductImageTb record);

    int updateByPrimaryKey(ProductImageTb record);

    int updateBatch(List<ProductImageTb> list);

    int batchInsert(List<ProductImageTb> list);

}
