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

    //分页查询
    List<ProductDetailsTb> listProductDetailsTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}