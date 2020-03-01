package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.entity.CustomerBalanceChangeTb;
import java.util.List;
import com.geely.dao.CustomerBalanceChangeTbMapper;
import com.geely.service.CustomerBalanceChangeTbService;
@Service
public class CustomerBalanceChangeTbServiceImpl implements CustomerBalanceChangeTbService{

    @Resource
    private CustomerBalanceChangeTbMapper customerBalanceChangeTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerBalanceChangeId) {
        return customerBalanceChangeTbMapper.deleteByPrimaryKey(customerBalanceChangeId);
    }

    @Override
    public int insert(CustomerBalanceChangeTb record) {
        return customerBalanceChangeTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerBalanceChangeTb record) {
        return customerBalanceChangeTbMapper.insertSelective(record);
    }

    @Override
    public CustomerBalanceChangeTb selectByPrimaryKey(Integer customerBalanceChangeId) {
        return customerBalanceChangeTbMapper.selectByPrimaryKey(customerBalanceChangeId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerBalanceChangeTb record) {
        return customerBalanceChangeTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerBalanceChangeTb record) {
        return customerBalanceChangeTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerBalanceChangeTb> list) {
        return customerBalanceChangeTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerBalanceChangeTb> list) {
        return customerBalanceChangeTbMapper.batchInsert(list);
    }

}
