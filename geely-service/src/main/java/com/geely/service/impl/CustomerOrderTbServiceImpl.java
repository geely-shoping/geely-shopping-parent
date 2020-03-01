package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.CustomerOrderTb;
import com.geely.dao.CustomerOrderTbMapper;
import com.geely.service.CustomerOrderTbService;
@Service
public class CustomerOrderTbServiceImpl implements CustomerOrderTbService{

    @Resource
    private CustomerOrderTbMapper customerOrderTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerOrderId) {
        return customerOrderTbMapper.deleteByPrimaryKey(customerOrderId);
    }

    @Override
    public int insert(CustomerOrderTb record) {
        return customerOrderTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerOrderTb record) {
        return customerOrderTbMapper.insertSelective(record);
    }

    @Override
    public CustomerOrderTb selectByPrimaryKey(Integer customerOrderId) {
        return customerOrderTbMapper.selectByPrimaryKey(customerOrderId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerOrderTb record) {
        return customerOrderTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerOrderTb record) {
        return customerOrderTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerOrderTb> list) {
        return customerOrderTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerOrderTb> list) {
        return customerOrderTbMapper.batchInsert(list);
    }

}
