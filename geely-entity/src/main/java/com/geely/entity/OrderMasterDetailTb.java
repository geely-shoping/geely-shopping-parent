package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.OrderMasterDetailTb")
@Data
public class OrderMasterDetailTb {
    /**
    * 订单主从关联表编号
    */
    @ApiModelProperty(value="订单主从关联表编号")
    private Integer orderMasterDetailId;

    /**
    * 订单主表编号
    */
    @ApiModelProperty(value="订单主表编号")
    private Integer orderMasterId;

    /**
    * 订单从表编号
    */
    @ApiModelProperty(value="订单从表编号")
    private Integer orderDetailId;
}