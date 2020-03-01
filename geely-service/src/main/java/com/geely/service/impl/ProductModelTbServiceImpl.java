package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.ProductModelTbMapper;
import com.geely.entity.ProductModelTb;
import com.geely.service.ProductModelTbService;
@Service
public class ProductModelTbServiceImpl implements ProductModelTbService{

    @Resource
    private ProductModelTbMapper productModelTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer modelId) {
        return productModelTbMapper.deleteByPrimaryKey(modelId);
    }

    @Override
    public int insert(ProductModelTb record) {
        return productModelTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductModelTb record) {
        return productModelTbMapper.insertSelective(record);
    }

    @Override
    public ProductModelTb selectByPrimaryKey(Integer modelId) {
        return productModelTbMapper.selectByPrimaryKey(modelId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductModelTb record) {
        return productModelTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductModelTb record) {
        return productModelTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProductModelTb> list) {
        return productModelTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProductModelTb> list) {
        return productModelTbMapper.batchInsert(list);
    }

}
