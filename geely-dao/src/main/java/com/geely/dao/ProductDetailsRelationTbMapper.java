package com.geely.dao;

import com.geely.entity.ProductDetailsRelationTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDetailsRelationTbMapper {
    int deleteByPrimaryKey(Integer proDetailsId);

    int insert(ProductDetailsRelationTb record);

    int insertSelective(ProductDetailsRelationTb record);

    ProductDetailsRelationTb selectByPrimaryKey(Integer proDetailsId);

    int updateByPrimaryKeySelective(ProductDetailsRelationTb record);

    int updateByPrimaryKey(ProductDetailsRelationTb record);

    int updateBatch(List<ProductDetailsRelationTb> list);

    int batchInsert(@Param("list") List<ProductDetailsRelationTb> list);
}