package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.ProductImageTbMapper;
import com.geely.entity.ProductImageTb;
import com.geely.service.ProductImageTbService;
@Service
public class ProductImageTbServiceImpl implements ProductImageTbService{

    @Resource
    private ProductImageTbMapper productImageTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer imageId) {
        return productImageTbMapper.deleteByPrimaryKey(imageId);
    }

    @Override
    public int insert(ProductImageTb record) {
        return productImageTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductImageTb record) {
        return productImageTbMapper.insertSelective(record);
    }

    @Override
    public ProductImageTb selectByPrimaryKey(Integer imageId) {
        return productImageTbMapper.selectByPrimaryKey(imageId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductImageTb record) {
        return productImageTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductImageTb record) {
        return productImageTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProductImageTb> list) {
        return productImageTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProductImageTb> list) {
        return productImageTbMapper.batchInsert(list);
    }

}
