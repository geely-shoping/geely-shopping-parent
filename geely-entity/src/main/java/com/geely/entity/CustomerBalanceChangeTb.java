package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerBalanceChangeTb")
@Data
public class CustomerBalanceChangeTb {
    /**
    * 用户余额变动关联表编号
    */
    @ApiModelProperty(value="用户余额变动关联表编号")
    private Integer customerBalanceChangeId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 余额变动编号
    */
    @ApiModelProperty(value="余额变动编号")
    private Integer balanceChangeId;
}