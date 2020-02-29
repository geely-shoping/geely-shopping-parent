package com.geely.dao;

import com.geely.entity.ProductImageRelationTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductImageRelationTbMapper {
    int deleteByPrimaryKey(Integer proImageId);

    int insert(ProductImageRelationTb record);

    int insertSelective(ProductImageRelationTb record);

    ProductImageRelationTb selectByPrimaryKey(Integer proImageId);

    int updateByPrimaryKeySelective(ProductImageRelationTb record);

    int updateByPrimaryKey(ProductImageRelationTb record);

    int updateBatch(List<ProductImageRelationTb> list);

    int batchInsert(@Param("list") List<ProductImageRelationTb> list);
}