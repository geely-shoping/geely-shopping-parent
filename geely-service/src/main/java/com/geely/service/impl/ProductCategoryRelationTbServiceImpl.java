package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.ProductCategoryRelationTb;
import com.geely.dao.ProductCategoryRelationTbMapper;
import com.geely.service.ProductCategoryRelationTbService;
@Service
public class ProductCategoryRelationTbServiceImpl implements ProductCategoryRelationTbService{

    @Resource
    private ProductCategoryRelationTbMapper productCategoryRelationTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer proCategoryId) {
        return productCategoryRelationTbMapper.deleteByPrimaryKey(proCategoryId);
    }

    @Override
    public int insert(ProductCategoryRelationTb record) {
        return productCategoryRelationTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductCategoryRelationTb record) {
        return productCategoryRelationTbMapper.insertSelective(record);
    }

    @Override
    public ProductCategoryRelationTb selectByPrimaryKey(Integer proCategoryId) {
        return productCategoryRelationTbMapper.selectByPrimaryKey(proCategoryId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductCategoryRelationTb record) {
        return productCategoryRelationTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductCategoryRelationTb record) {
        return productCategoryRelationTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProductCategoryRelationTb> list) {
        return productCategoryRelationTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProductCategoryRelationTb> list) {
        return productCategoryRelationTbMapper.batchInsert(list);
    }

}
