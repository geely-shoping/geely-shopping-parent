package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerCouponTb")
@Data
public class CustomerCouponTb {
    /**
    * 用户优惠券关联表编号
    */
    @ApiModelProperty(value="用户优惠券关联表编号")
    private Integer customerCouponId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 优惠券编号
    */
    @ApiModelProperty(value="优惠券编号")
    private Integer couponId;
}