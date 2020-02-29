package com.geely.dao;

import com.geely.entity.ProductColorTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductColorTbMapper {
    int deleteByPrimaryKey(Integer colorId);

    int insert(ProductColorTb record);

    int insertSelective(ProductColorTb record);

    ProductColorTb selectByPrimaryKey(Integer colorId);

    int updateByPrimaryKeySelective(ProductColorTb record);

    int updateByPrimaryKey(ProductColorTb record);

    int updateBatch(List<ProductColorTb> list);

    int batchInsert(@Param("list") List<ProductColorTb> list);
}