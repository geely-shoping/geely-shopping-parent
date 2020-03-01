package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.ProductColorTbMapper;
import java.util.List;
import com.geely.entity.ProductColorTb;
import com.geely.service.ProductColorTbService;
@Service
public class ProductColorTbServiceImpl implements ProductColorTbService{

    @Resource
    private ProductColorTbMapper productColorTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer colorId) {
        return productColorTbMapper.deleteByPrimaryKey(colorId);
    }

    @Override
    public int insert(ProductColorTb record) {
        return productColorTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductColorTb record) {
        return productColorTbMapper.insertSelective(record);
    }

    @Override
    public ProductColorTb selectByPrimaryKey(Integer colorId) {
        return productColorTbMapper.selectByPrimaryKey(colorId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductColorTb record) {
        return productColorTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductColorTb record) {
        return productColorTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProductColorTb> list) {
        return productColorTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProductColorTb> list) {
        return productColorTbMapper.batchInsert(list);
    }

    @Override
    public List<ProductColorTb> listProductColorTbByPage(int pageNum, int pageSize) {
        return productColorTbMapper.listProductColorTb(pageNum, pageSize);
    }

    @Override
    public int batchDelete(List<Integer> colorIds) {
        return productColorTbMapper.batchDelete(colorIds);
    }

}
