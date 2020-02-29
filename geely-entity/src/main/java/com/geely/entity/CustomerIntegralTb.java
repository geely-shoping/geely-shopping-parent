package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerIntegralTb")
@Data
public class CustomerIntegralTb {
    /**
    * 用户积分关联表编号
    */
    @ApiModelProperty(value="用户积分关联表编号")
    private Integer customerAddrId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 积分编号
    */
    @ApiModelProperty(value="积分编号")
    private Integer integralId;
}