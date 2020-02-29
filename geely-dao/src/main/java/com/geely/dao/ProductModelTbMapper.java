package com.geely.dao;

import com.geely.entity.ProductModelTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductModelTbMapper {
    int deleteByPrimaryKey(Integer modelId);

    int insert(ProductModelTb record);

    int insertSelective(ProductModelTb record);

    ProductModelTb selectByPrimaryKey(Integer modelId);

    int updateByPrimaryKeySelective(ProductModelTb record);

    int updateByPrimaryKey(ProductModelTb record);

    int updateBatch(List<ProductModelTb> list);

    int batchInsert(@Param("list") List<ProductModelTb> list);
}