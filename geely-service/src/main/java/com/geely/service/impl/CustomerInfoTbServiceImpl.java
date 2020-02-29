package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.CustomerInfoTb;
import com.geely.dao.CustomerInfoTbMapper;
import com.geely.service.CustomerInfoTbService;
@Service
public class CustomerInfoTbServiceImpl implements CustomerInfoTbService{

    @Resource
    private CustomerInfoTbMapper customerInfoTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerInfoId) {
        return customerInfoTbMapper.deleteByPrimaryKey(customerInfoId);
    }

    @Override
    public int insert(CustomerInfoTb record) {
        return customerInfoTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerInfoTb record) {
        return customerInfoTbMapper.insertSelective(record);
    }

    @Override
    public CustomerInfoTb selectByPrimaryKey(Integer customerInfoId) {
        return customerInfoTbMapper.selectByPrimaryKey(customerInfoId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerInfoTb record) {
        return customerInfoTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerInfoTb record) {
        return customerInfoTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerInfoTb> list) {
        return customerInfoTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerInfoTb> list) {
        return customerInfoTbMapper.batchInsert(list);
    }

}
