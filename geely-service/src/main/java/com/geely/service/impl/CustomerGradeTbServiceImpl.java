package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.entity.CustomerGradeTb;
import java.util.List;
import com.geely.dao.CustomerGradeTbMapper;
import com.geely.service.CustomerGradeTbService;
@Service
public class CustomerGradeTbServiceImpl implements CustomerGradeTbService{

    @Resource
    private CustomerGradeTbMapper customerGradeTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerGradeId) {
        return customerGradeTbMapper.deleteByPrimaryKey(customerGradeId);
    }

    @Override
    public int insert(CustomerGradeTb record) {
        return customerGradeTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerGradeTb record) {
        return customerGradeTbMapper.insertSelective(record);
    }

    @Override
    public CustomerGradeTb selectByPrimaryKey(Integer customerGradeId) {
        return customerGradeTbMapper.selectByPrimaryKey(customerGradeId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerGradeTb record) {
        return customerGradeTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerGradeTb record) {
        return customerGradeTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerGradeTb> list) {
        return customerGradeTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerGradeTb> list) {
        return customerGradeTbMapper.batchInsert(list);
    }

}
