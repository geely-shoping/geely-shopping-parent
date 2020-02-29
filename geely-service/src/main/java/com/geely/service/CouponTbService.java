package com.geely.service;

import java.util.List;
import com.geely.entity.CouponTb;
public interface CouponTbService{


    int deleteByPrimaryKey(Integer couponId);

    int insert(CouponTb record);

    int insertSelective(CouponTb record);

    CouponTb selectByPrimaryKey(Integer couponId);

    int updateByPrimaryKeySelective(CouponTb record);

    int updateByPrimaryKey(CouponTb record);

    int updateBatch(List<CouponTb> list);

    int batchInsert(List<CouponTb> list);

}
