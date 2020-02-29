package com.geely.dao;

import com.geely.entity.ProductTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTbMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductTb record);

    int insertSelective(ProductTb record);

    ProductTb selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductTb record);

    int updateByPrimaryKey(ProductTb record);

    int updateBatch(List<ProductTb> list);

    int batchInsert(@Param("list") List<ProductTb> list);
}