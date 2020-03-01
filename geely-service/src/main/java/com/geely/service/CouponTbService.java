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

    //分页查询
    List<CouponTb> listCouponTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> couponIds);
}
