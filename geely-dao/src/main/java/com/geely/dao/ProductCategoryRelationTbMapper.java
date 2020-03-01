package com.geely.dao;

import com.geely.entity.ProductCategoryRelationTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryRelationTbMapper {
    int deleteByPrimaryKey(Integer proCategoryId);

    int insert(ProductCategoryRelationTb record);

    int insertSelective(ProductCategoryRelationTb record);

    ProductCategoryRelationTb selectByPrimaryKey(Integer proCategoryId);

    int updateByPrimaryKeySelective(ProductCategoryRelationTb record);

    int updateByPrimaryKey(ProductCategoryRelationTb record);

    int updateBatch(List<ProductCategoryRelationTb> list);

    int batchInsert(@Param("list") List<ProductCategoryRelationTb> list);
}