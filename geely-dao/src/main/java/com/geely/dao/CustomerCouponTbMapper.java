package com.geely.dao;

import com.geely.entity.CustomerCouponTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCouponTbMapper {
    int deleteByPrimaryKey(Integer customerCouponId);

    int insert(CustomerCouponTb record);

    int insertSelective(CustomerCouponTb record);

    CustomerCouponTb selectByPrimaryKey(Integer customerCouponId);

    int updateByPrimaryKeySelective(CustomerCouponTb record);

    int updateByPrimaryKey(CustomerCouponTb record);

    int updateBatch(List<CustomerCouponTb> list);

    int batchInsert(@Param("list") List<CustomerCouponTb> list);
}