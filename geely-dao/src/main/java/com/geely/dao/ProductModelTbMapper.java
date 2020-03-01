package com.geely.dao;

import com.geely.entity.ProductModelTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 商品型号
 */
public interface ProductModelTbMapper {
    int deleteByPrimaryKey(Integer modelId);

    int insert(ProductModelTb record);

    int insertSelective(ProductModelTb record);

    ProductModelTb selectByPrimaryKey(Integer modelId);

    int updateByPrimaryKeySelective(ProductModelTb record);

    int updateByPrimaryKey(ProductModelTb record);

    int updateBatch(List<ProductModelTb> list);

    int batchInsert(@Param("list") List<ProductModelTb> list);

    //分页查询
    List<ProductModelTb> listProductModelTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}