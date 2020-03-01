package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.CustomerAddrTbMapper;
import java.util.List;
import com.geely.entity.CustomerAddrTb;
import com.geely.service.CustomerAddrTbService;
@Service
public class CustomerAddrTbServiceImpl implements CustomerAddrTbService{

    @Resource
    private CustomerAddrTbMapper customerAddrTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerAddrId) {
        return customerAddrTbMapper.deleteByPrimaryKey(customerAddrId);
    }

    @Override
    public int insert(CustomerAddrTb record) {
        return customerAddrTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerAddrTb record) {
        return customerAddrTbMapper.insertSelective(record);
    }

    @Override
    public CustomerAddrTb selectByPrimaryKey(Integer customerAddrId) {
        return customerAddrTbMapper.selectByPrimaryKey(customerAddrId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerAddrTb record) {
        return customerAddrTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerAddrTb record) {
        return customerAddrTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerAddrTb> list) {
        return customerAddrTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerAddrTb> list) {
        return customerAddrTbMapper.batchInsert(list);
    }

}
