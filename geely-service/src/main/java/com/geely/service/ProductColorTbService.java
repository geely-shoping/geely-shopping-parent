package com.geely.service;

import java.util.List;
import com.geely.entity.ProductColorTb;
public interface ProductColorTbService{


    int deleteByPrimaryKey(Integer colorId);

    int insert(ProductColorTb record);

    int insertSelective(ProductColorTb record);

    ProductColorTb selectByPrimaryKey(Integer colorId);

    int updateByPrimaryKeySelective(ProductColorTb record);

    int updateByPrimaryKey(ProductColorTb record);

    int updateBatch(List<ProductColorTb> list);

    int batchInsert(List<ProductColorTb> list);

}
