package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.ProductDetailsTbMapper;
import com.geely.entity.ProductDetailsTb;
import com.geely.service.ProductDetailsTbService;
@Service
public class ProductDetailsTbServiceImpl implements ProductDetailsTbService{

    @Resource
    private ProductDetailsTbMapper productDetailsTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer detailsId) {
        return productDetailsTbMapper.deleteByPrimaryKey(detailsId);
    }

    @Override
    public int insert(ProductDetailsTb record) {
        return productDetailsTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductDetailsTb record) {
        return productDetailsTbMapper.insertSelective(record);
    }

    @Override
    public ProductDetailsTb selectByPrimaryKey(Integer detailsId) {
        return productDetailsTbMapper.selectByPrimaryKey(detailsId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductDetailsTb record) {
        return productDetailsTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductDetailsTb record) {
        return productDetailsTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProductDetailsTb> list) {
        return productDetailsTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProductDetailsTb> list) {
        return productDetailsTbMapper.batchInsert(list);
    }

    @Override
    public List<ProductDetailsTb> listProductDetailsTbByPage(int pageNum, int pageSize) {
        return productDetailsTbMapper.listProductDetailsTb(pageNum, pageSize);
    }

    @Override
    public int batchDelete(List<Integer> detailsIds) {
        return productDetailsTbMapper.batchDelete(detailsIds);
    }

}
