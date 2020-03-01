package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.ProdcutModelRelationTbMapper;
import java.util.List;
import com.geely.entity.ProdcutModelRelationTb;
import com.geely.service.ProdcutModelRelationTbService;
@Service
public class ProdcutModelRelationTbServiceImpl implements ProdcutModelRelationTbService{

    @Resource
    private ProdcutModelRelationTbMapper prodcutModelRelationTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer proColorId) {
        return prodcutModelRelationTbMapper.deleteByPrimaryKey(proColorId);
    }

    @Override
    public int insert(ProdcutModelRelationTb record) {
        return prodcutModelRelationTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ProdcutModelRelationTb record) {
        return prodcutModelRelationTbMapper.insertSelective(record);
    }

    @Override
    public ProdcutModelRelationTb selectByPrimaryKey(Integer proColorId) {
        return prodcutModelRelationTbMapper.selectByPrimaryKey(proColorId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProdcutModelRelationTb record) {
        return prodcutModelRelationTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProdcutModelRelationTb record) {
        return prodcutModelRelationTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ProdcutModelRelationTb> list) {
        return prodcutModelRelationTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ProdcutModelRelationTb> list) {
        return prodcutModelRelationTbMapper.batchInsert(list);
    }

}
