package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerOrderTb")
@Data
public class CustomerOrderTb {
    /**
    * 用户订单关联表编号
    */
    @ApiModelProperty(value="用户订单关联表编号")
    private Integer customerOrderId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer cusotemrId;

    /**
    * 订单编号
    */
    @ApiModelProperty(value="订单编号")
    private Integer orderMasterId;
}