package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.ShoppingCartTb")
@Data
public class ShoppingCartTb {
    /**
    * 购物车编号
    */
    @ApiModelProperty(value="购物车编号")
    private Integer shoppingCartId;

    /**
    * 商品编号
    */
    @ApiModelProperty(value="商品编号")
    private Integer productId;

    /**
    * 商品数量
    */
    @ApiModelProperty(value="商品数量")
    private Integer productAmount;

    /**
    * 商品价钱
    */
    @ApiModelProperty(value="商品价钱")
    private BigDecimal productPrice;

    /**
    * 加入购物车时间
    */
    @ApiModelProperty(value="加入购物车时间")
    private Date addTime;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}