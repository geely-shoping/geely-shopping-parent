package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerAddrTb")
@Data
public class CustomerAddrTb {
    /**
    * 用户收货地址关联表编号
    */
    @ApiModelProperty(value="用户收货地址关联表编号")
    private Integer customerAddrId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 收货地址编号
    */
    @ApiModelProperty(value="收货地址编号")
    private Integer addrId;
}