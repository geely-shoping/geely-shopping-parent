package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.entity.ProductCategoryTb;
import java.util.List;
import com.geely.dao.ProductCategoryTbMapper;
import com.geely.service.ProductCategoryTbService;
@Service
public class ProductCategoryTbServiceImpl implements ProductCategoryTbService{

    @Resource
    private ProductCategoryTbMapper productCategoryTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer categoryId) {
        return productCategoryTbMapper.deleteByPrimaryKey(categoryId);
    }

    @Override
    public int insert(ProductCategoryTb record) {
        return productCategoryTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductCategoryTb record) {
        return productCategoryTbMapper.insertSelective(record);
    }

    @Override
    public ProductCategoryTb selectByPrimaryKey(Integer categoryId) {
        return productCategoryTbMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductCategoryTb record) {
        return productCategoryTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductCategoryTb record) {
        return productCategoryTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProductCategoryTb> list) {
        return productCategoryTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProductCategoryTb> list) {
        return productCategoryTbMapper.batchInsert(list);
    }

}
