package com.geely.service;

import java.util.List;
import com.geely.entity.ProductModelTb;
public interface ProductModelTbService{


    int deleteByPrimaryKey(Integer modelId);

    int insert(ProductModelTb record);

    int insertSelective(ProductModelTb record);

    ProductModelTb selectByPrimaryKey(Integer modelId);

    int updateByPrimaryKeySelective(ProductModelTb record);

    int updateByPrimaryKey(ProductModelTb record);

    int updateBatch(List<ProductModelTb> list);

    int batchInsert(List<ProductModelTb> list);

    //分页查询
    List<ProductModelTb> listProductModelTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> modelIds);
}
