package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.ProductImageRelationTbMapper;
import com.geely.entity.ProductImageRelationTb;
import com.geely.service.ProductImageRelationTbService;
@Service
public class ProductImageRelationTbServiceImpl implements ProductImageRelationTbService{

    @Resource
    private ProductImageRelationTbMapper productImageRelationTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer proImageId) {
        return productImageRelationTbMapper.deleteByPrimaryKey(proImageId);
    }

    @Override
    public int insert(ProductImageRelationTb record) {
        return productImageRelationTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductImageRelationTb record) {
        return productImageRelationTbMapper.insertSelective(record);
    }

    @Override
    public ProductImageRelationTb selectByPrimaryKey(Integer proImageId) {
        return productImageRelationTbMapper.selectByPrimaryKey(proImageId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductImageRelationTb record) {
        return productImageRelationTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductImageRelationTb record) {
        return productImageRelationTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProductImageRelationTb> list) {
        return productImageRelationTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProductImageRelationTb> list) {
        return productImageRelationTbMapper.batchInsert(list);
    }

}
