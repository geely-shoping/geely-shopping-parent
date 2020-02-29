package com.geely.dao;

import com.geely.entity.ProductDetailsTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDetailsTbMapper {
    int deleteByPrimaryKey(Integer detailsId);

    int insert(ProductDetailsTb record);

    int insertSelective(ProductDetailsTb record);

    ProductDetailsTb selectByPrimaryKey(Integer detailsId);

    int updateByPrimaryKeySelective(ProductDetailsTb record);

    int updateByPrimaryKey(ProductDetailsTb record);

    int updateBatch(List<ProductDetailsTb> list);

    int batchInsert(@Param("list") List<ProductDetailsTb> list);
}