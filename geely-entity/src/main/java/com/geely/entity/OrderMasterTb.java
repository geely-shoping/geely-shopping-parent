package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.OrderMasterTb")
@Data
public class OrderMasterTb {
    /**
    * 订单编号
    */
    @ApiModelProperty(value="订单编号")
    private Integer orderId;

    /**
    * 订单uuid
    */
    @ApiModelProperty(value="订单uuid")
    private String orderUuid;

    /**
    * 支付方式
    */
    @ApiModelProperty(value="支付方式")
    private String paymentMethod;

    /**
    * 订单金额
    */
    @ApiModelProperty(value="订单金额")
    private BigDecimal orderMoney;

    /**
    * 优惠金额
    */
    @ApiModelProperty(value="优惠金额")
    private BigDecimal districtMoney;

    /**
    * 支付金额
    */
    @ApiModelProperty(value="支付金额")
    private BigDecimal paymentMoney;

    /**
    * 下单时间
    */
    @ApiModelProperty(value="下单时间")
    private Date overbookingTime;

    /**
    * 支付时间
    */
    @ApiModelProperty(value="支付时间")
    private Date paymentTime;

    /**
    * 发货时间
    */
    @ApiModelProperty(value="发货时间")
    private Date shipmentsTime;

    /**
    * 收货时间
    */
    @ApiModelProperty(value="收货时间")
    private Date receivingTime;

    /**
    * 订单状态
    */
    @ApiModelProperty(value="订单状态")
    private String orderState;

    /**
    * 订单积分
    */
    @ApiModelProperty(value="订单积分")
    private Integer orderPoint;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}