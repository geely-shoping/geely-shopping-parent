package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户优惠券关联表
 */
public class CustomerCoupon {

    private Integer customerCouponId; //用户优惠券关联表编号
    private Integer customerId; //用户编号
    private Integer couponId; //优惠券编号

}
