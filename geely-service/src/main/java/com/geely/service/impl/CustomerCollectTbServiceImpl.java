package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.CustomerCollectTbMapper;
import java.util.List;
import com.geely.entity.CustomerCollectTb;
import com.geely.service.CustomerCollectTbService;
@Service
public class CustomerCollectTbServiceImpl implements CustomerCollectTbService{

    @Resource
    private CustomerCollectTbMapper customerCollectTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerCollectId) {
        return customerCollectTbMapper.deleteByPrimaryKey(customerCollectId);
    }

    @Override
    public int insert(CustomerCollectTb record) {
        return customerCollectTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerCollectTb record) {
        return customerCollectTbMapper.insertSelective(record);
    }

    @Override
    public CustomerCollectTb selectByPrimaryKey(Integer customerCollectId) {
        return customerCollectTbMapper.selectByPrimaryKey(customerCollectId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerCollectTb record) {
        return customerCollectTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerCollectTb record) {
        return customerCollectTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerCollectTb> list) {
        return customerCollectTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerCollectTb> list) {
        return customerCollectTbMapper.batchInsert(list);
    }

}
