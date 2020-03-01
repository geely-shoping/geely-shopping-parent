package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.CustomerCommentTbMapper;
import com.geely.entity.CustomerCommentTb;
import com.geely.service.CustomerCommentTbService;
@Service
public class CustomerCommentTbServiceImpl implements CustomerCommentTbService{

    @Resource
    private CustomerCommentTbMapper customerCommentTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerCommentId) {
        return customerCommentTbMapper.deleteByPrimaryKey(customerCommentId);
    }

    @Override
    public int insert(CustomerCommentTb record) {
        return customerCommentTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerCommentTb record) {
        return customerCommentTbMapper.insertSelective(record);
    }

    @Override
    public CustomerCommentTb selectByPrimaryKey(Integer customerCommentId) {
        return customerCommentTbMapper.selectByPrimaryKey(customerCommentId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerCommentTb record) {
        return customerCommentTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerCommentTb record) {
        return customerCommentTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerCommentTb> list) {
        return customerCommentTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerCommentTb> list) {
        return customerCommentTbMapper.batchInsert(list);
    }

}
