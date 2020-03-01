package com.geely.dao;

import com.geely.entity.ProductImageTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 商品图片
 */
public interface ProductImageTbMapper {
    int deleteByPrimaryKey(Integer imageId);

    int insert(ProductImageTb record);

    int insertSelective(ProductImageTb record);

    ProductImageTb selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(ProductImageTb record);

    int updateByPrimaryKey(ProductImageTb record);

    int updateBatch(List<ProductImageTb> list);

    int batchInsert(@Param("list") List<ProductImageTb> list);

    //分页查询
    List<ProductImageTb> listProductImageTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}