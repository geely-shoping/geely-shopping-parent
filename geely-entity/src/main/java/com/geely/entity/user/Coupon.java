package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    private Integer couponId;
    private String couponTitle;
    private String couponImg;
    private String couponUsed;
    private String couponType;
    private BigDecimal couponMoney;
    private String couponValidity;
    private String couponState;
    private Date usedTime;
    private Date modifiedTime;

}
