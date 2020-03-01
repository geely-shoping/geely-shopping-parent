package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.ProductDetailsRelationTbMapper;
import java.util.List;
import com.geely.entity.ProductDetailsRelationTb;
import com.geely.service.ProductDetailsRelationTbService;
@Service
public class ProductDetailsRelationTbServiceImpl implements ProductDetailsRelationTbService{

    @Resource
    private ProductDetailsRelationTbMapper productDetailsRelationTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer proDetailsId) {
        return productDetailsRelationTbMapper.deleteByPrimaryKey(proDetailsId);
    }

    @Override
    public int insert(ProductDetailsRelationTb record) {
        return productDetailsRelationTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductDetailsRelationTb record) {
        return productDetailsRelationTbMapper.insertSelective(record);
    }

    @Override
    public ProductDetailsRelationTb selectByPrimaryKey(Integer proDetailsId) {
        return productDetailsRelationTbMapper.selectByPrimaryKey(proDetailsId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductDetailsRelationTb record) {
        return productDetailsRelationTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductDetailsRelationTb record) {
        return productDetailsRelationTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProductDetailsRelationTb> list) {
        return productDetailsRelationTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProductDetailsRelationTb> list) {
        return productDetailsRelationTbMapper.batchInsert(list);
    }

}
