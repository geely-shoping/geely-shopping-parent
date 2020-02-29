package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 优惠卷表
 */
public class Coupon {

    private Integer couponId; //优惠券编号
    private String couponTitle; //优惠券标题
    private String couponImg; //优惠券图片
    private String couponUsed; //优惠券用于(生鲜、学习用品)
    private String couponType; //优惠券类型(满减、无门槛)
    private BigDecimal couponMoney; //优惠价钱
    private String couponValidity; //有效时间(2011-02-01~200…)
    private String couponState; //状态(未使用、已使用、过期)
    private Date usedTime; // 使用时间(可以为空)
    private Date modifiedTime; // 最后修改时间

}
