package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.entity.CustomerShoppingCartTb;
import java.util.List;
import com.geely.dao.CustomerShoppingCartTbMapper;
import com.geely.service.CustomerShoppingCartTbService;
@Service
public class CustomerShoppingCartTbServiceImpl implements CustomerShoppingCartTbService{

    @Resource
    private CustomerShoppingCartTbMapper customerShoppingCartTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerShoppingCartId) {
        return customerShoppingCartTbMapper.deleteByPrimaryKey(customerShoppingCartId);
    }

    @Override
    public int insert(CustomerShoppingCartTb record) {
        return customerShoppingCartTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerShoppingCartTb record) {
        return customerShoppingCartTbMapper.insertSelective(record);
    }

    @Override
    public CustomerShoppingCartTb selectByPrimaryKey(Integer customerShoppingCartId) {
        return customerShoppingCartTbMapper.selectByPrimaryKey(customerShoppingCartId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerShoppingCartTb record) {
        return customerShoppingCartTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerShoppingCartTb record) {
        return customerShoppingCartTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerShoppingCartTb> list) {
        return customerShoppingCartTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerShoppingCartTb> list) {
        return customerShoppingCartTbMapper.batchInsert(list);
    }

}
