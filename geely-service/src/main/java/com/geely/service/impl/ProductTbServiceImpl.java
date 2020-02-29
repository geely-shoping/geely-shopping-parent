package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.ProductTbMapper;
import com.geely.entity.ProductTb;
import com.geely.service.ProductTbService;
@Service
public class ProductTbServiceImpl implements ProductTbService{

    @Resource
    private ProductTbMapper productTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer productId) {
        return productTbMapper.deleteByPrimaryKey(productId);
    }

    @Override
    public int insert(ProductTb record) {
        return productTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductTb record) {
        return productTbMapper.insertSelective(record);
    }

    @Override
    public ProductTb selectByPrimaryKey(Integer productId) {
        return productTbMapper.selectByPrimaryKey(productId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductTb record) {
        return productTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductTb record) {
        return productTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProductTb> list) {
        return productTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProductTb> list) {
        return productTbMapper.batchInsert(list);
    }

}
