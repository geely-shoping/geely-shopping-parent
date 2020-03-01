package com.geely.dao;

import com.geely.entity.CouponTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 购物卷表
 */
public interface CouponTbMapper {
    int deleteByPrimaryKey(Integer couponId);

    int insert(CouponTb record);

    int insertSelective(CouponTb record);

    CouponTb selectByPrimaryKey(Integer couponId);

    int updateByPrimaryKeySelective(CouponTb record);

    int updateByPrimaryKey(CouponTb record);

    int updateBatch(List<CouponTb> list);

    int batchInsert(@Param("list") List<CouponTb> list);

    //分页查询
    List<CouponTb> listCouponTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}