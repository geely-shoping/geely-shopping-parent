package com.geely.service;

import java.util.List;
import com.geely.entity.ProductDetailsTb;
public interface ProductDetailsTbService{


    int deleteByPrimaryKey(Integer detailsId);

    int insert(ProductDetailsTb record);

    int insertSelective(ProductDetailsTb record);

    ProductDetailsTb selectByPrimaryKey(Integer detailsId);

    int updateByPrimaryKeySelective(ProductDetailsTb record);

    int updateByPrimaryKey(ProductDetailsTb record);

    int updateBatch(List<ProductDetailsTb> list);

    int batchInsert(List<ProductDetailsTb> list);

    //分页查询
    List<ProductDetailsTb> listProductDetailsTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> detailsIds);
}
