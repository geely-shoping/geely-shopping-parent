package com.geely.dao;

import com.geely.entity.CouponTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponTbMapper {
    int deleteByPrimaryKey(Integer couponId);

    int insert(CouponTb record);

    int insertSelective(CouponTb record);

    CouponTb selectByPrimaryKey(Integer couponId);

    int updateByPrimaryKeySelective(CouponTb record);

    int updateByPrimaryKey(CouponTb record);

    int updateBatch(List<CouponTb> list);

    int batchInsert(@Param("list") List<CouponTb> list);
}