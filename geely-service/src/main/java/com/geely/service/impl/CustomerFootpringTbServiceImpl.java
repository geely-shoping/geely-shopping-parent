package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.entity.CustomerFootpringTb;
import java.util.List;
import com.geely.dao.CustomerFootpringTbMapper;
import com.geely.service.CustomerFootpringTbService;
@Service
public class CustomerFootpringTbServiceImpl implements CustomerFootpringTbService{

    @Resource
    private CustomerFootpringTbMapper customerFootpringTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerFootprintId) {
        return customerFootpringTbMapper.deleteByPrimaryKey(customerFootprintId);
    }

    @Override
    public int insert(CustomerFootpringTb record) {
        return customerFootpringTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerFootpringTb record) {
        return customerFootpringTbMapper.insertSelective(record);
    }

    @Override
    public CustomerFootpringTb selectByPrimaryKey(Integer customerFootprintId) {
        return customerFootpringTbMapper.selectByPrimaryKey(customerFootprintId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerFootpringTb record) {
        return customerFootpringTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerFootpringTb record) {
        return customerFootpringTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerFootpringTb> list) {
        return customerFootpringTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerFootpringTb> list) {
        return customerFootpringTbMapper.batchInsert(list);
    }

}
