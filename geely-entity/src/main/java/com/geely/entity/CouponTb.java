package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.CouponTb")
@Data
public class CouponTb {
    /**
    * 优惠券编号
    */
    @ApiModelProperty(value="优惠券编号")
    private Integer couponId;

    /**
    * 优惠券标题
    */
    @ApiModelProperty(value="优惠券标题")
    private String couponTitle;

    /**
    * 优惠券图片
    */
    @ApiModelProperty(value="优惠券图片")
    private String couponImg;

    /**
    * 优惠券用于(生鲜,水果)
    */
    @ApiModelProperty(value="优惠券用于(生鲜,水果)")
    private String couponUsed;

    /**
    * 优惠券类型(满减，无门槛)
    */
    @ApiModelProperty(value="优惠券类型(满减，无门槛)")
    private String couponType;

    /**
    * 优惠价钱
    */
    @ApiModelProperty(value="优惠价钱")
    private BigDecimal couponMoney;

    /**
    * 有效时间(2020-3-3~
    */
    @ApiModelProperty(value="有效时间(2020-3-3~")
    private String couponValidity;

    /**
    * 状态(未使用,已使用,已失效)
    */
    @ApiModelProperty(value="状态(未使用,已使用,已失效)")
    private String couponState;

    /**
    * 使用时间
    */
    @ApiModelProperty(value="使用时间")
    private Date usedTime;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}