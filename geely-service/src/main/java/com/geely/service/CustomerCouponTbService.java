package com.geely.service;

import java.util.List;
import com.geely.entity.CustomerCouponTb;
public interface CustomerCouponTbService{


    int deleteByPrimaryKey(Integer customerCouponId);

    int insert(CustomerCouponTb record);

    int insertSelective(CustomerCouponTb record);

    CustomerCouponTb selectByPrimaryKey(Integer customerCouponId);

    int updateByPrimaryKeySelective(CustomerCouponTb record);

    int updateByPrimaryKey(CustomerCouponTb record);

    int updateBatch(List<CustomerCouponTb> list);

    int batchInsert(List<CustomerCouponTb> list);

}
