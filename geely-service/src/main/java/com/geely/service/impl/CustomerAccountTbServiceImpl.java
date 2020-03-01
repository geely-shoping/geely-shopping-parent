package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.CustomerAccountTbMapper;
import com.geely.entity.CustomerAccountTb;
import com.geely.service.CustomerAccountTbService;
@Service
public class CustomerAccountTbServiceImpl implements CustomerAccountTbService{

    @Resource
    private CustomerAccountTbMapper customerAccountTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerId) {
        return customerAccountTbMapper.deleteByPrimaryKey(customerId);
    }

    @Override
    public int insert(CustomerAccountTb record) {
        return customerAccountTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerAccountTb record) {
        return customerAccountTbMapper.insertSelective(record);
    }

    @Override
    public CustomerAccountTb selectByPrimaryKey(Integer customerId) {
        return customerAccountTbMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerAccountTb record) {
        return customerAccountTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerAccountTb record) {
        return customerAccountTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerAccountTb> list) {
        return customerAccountTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerAccountTb> list) {
        return customerAccountTbMapper.batchInsert(list);
    }

    @Override
    public List<CustomerAccountTb> listCustomerAccountTbByPage(int pageNum, int pageSize) {
        return customerAccountTbMapper.listCustomerAccountTb(pageNum, pageSize);
    }

    @Override
    public int batchDelete(List<Integer> customerIds) {
        return customerAccountTbMapper.batchDelete(customerIds);
    }

}
