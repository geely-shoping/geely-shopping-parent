package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.IntegralTbMapper;
import java.util.List;
import com.geely.entity.IntegralTb;
import com.geely.service.IntegralTbService;
@Service
public class IntegralTbServiceImpl implements IntegralTbService{

    @Resource
    private IntegralTbMapper integralTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerIntegralId) {
        return integralTbMapper.deleteByPrimaryKey(customerIntegralId);
    }

    @Override
    public int insert(IntegralTb record) {
        return integralTbMapper.insert(record);
    }

    @Override
    public int insertSelective(IntegralTb record) {
        return integralTbMapper.insertSelective(record);
    }

    @Override
    public IntegralTb selectByPrimaryKey(Integer customerIntegralId) {
        return integralTbMapper.selectByPrimaryKey(customerIntegralId);
    }

    @Override
    public int updateByPrimaryKeySelective(IntegralTb record) {
        return integralTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IntegralTb record) {
        return integralTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<IntegralTb> list) {
        return integralTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<IntegralTb> list) {
        return integralTbMapper.batchInsert(list);
    }

}
