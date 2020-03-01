package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.OrderDetailTb")
@Data
public class OrderDetailTb {
    /**
    * 订单详情编号
    */
    @ApiModelProperty(value="订单详情编号")
    private Integer orderDetailId;

    /**
    * 商品编号
    */
    @ApiModelProperty(value="商品编号")
    private Integer productId;

    /**
    * 商品名称
    */
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
    * 商品数量
    */
    @ApiModelProperty(value="商品数量")
    private Integer productAmount;

    /**
    * 商品单价
    */
    @ApiModelProperty(value="商品单价")
    private BigDecimal productMoney;

    /**
    * 优惠分摊金额
    */
    @ApiModelProperty(value="优惠分摊金额")
    private BigDecimal apportionMoney;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}