package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerShoppingCartTb")
@Data
public class CustomerShoppingCartTb {
    /**
    * 用户购物车关联表编号
    */
    @ApiModelProperty(value="用户购物车关联表编号")
    private Integer customerShoppingCartId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 购物车编号
    */
    @ApiModelProperty(value="购物车编号")
    private Integer shoppingCartId;
}