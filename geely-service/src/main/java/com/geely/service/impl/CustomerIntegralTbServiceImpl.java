package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.CustomerIntegralTb;
import com.geely.dao.CustomerIntegralTbMapper;
import com.geely.service.CustomerIntegralTbService;
@Service
public class CustomerIntegralTbServiceImpl implements CustomerIntegralTbService{

    @Resource
    private CustomerIntegralTbMapper customerIntegralTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerAddrId) {
        return customerIntegralTbMapper.deleteByPrimaryKey(customerAddrId);
    }

    @Override
    public int insert(CustomerIntegralTb record) {
        return customerIntegralTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerIntegralTb record) {
        return customerIntegralTbMapper.insertSelective(record);
    }

    @Override
    public CustomerIntegralTb selectByPrimaryKey(Integer customerAddrId) {
        return customerIntegralTbMapper.selectByPrimaryKey(customerAddrId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerIntegralTb record) {
        return customerIntegralTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerIntegralTb record) {
        return customerIntegralTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerIntegralTb> list) {
        return customerIntegralTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerIntegralTb> list) {
        return customerIntegralTbMapper.batchInsert(list);
    }

}
