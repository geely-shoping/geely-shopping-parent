package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.CustomerCouponTb;
import com.geely.dao.CustomerCouponTbMapper;
import com.geely.service.CustomerCouponTbService;
@Service
public class CustomerCouponTbServiceImpl implements CustomerCouponTbService{

    @Resource
    private CustomerCouponTbMapper customerCouponTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerCouponId) {
        return customerCouponTbMapper.deleteByPrimaryKey(customerCouponId);
    }

    @Override
    public int insert(CustomerCouponTb record) {
        return customerCouponTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerCouponTb record) {
        return customerCouponTbMapper.insertSelective(record);
    }

    @Override
    public CustomerCouponTb selectByPrimaryKey(Integer customerCouponId) {
        return customerCouponTbMapper.selectByPrimaryKey(customerCouponId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerCouponTb record) {
        return customerCouponTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerCouponTb record) {
        return customerCouponTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerCouponTb> list) {
        return customerCouponTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerCouponTb> list) {
        return customerCouponTbMapper.batchInsert(list);
    }

}
