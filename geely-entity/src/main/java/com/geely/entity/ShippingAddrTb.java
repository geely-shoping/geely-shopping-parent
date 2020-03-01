package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.ShippingAddrTb")
@Data
public class ShippingAddrTb {
    /**
    * 收货地址id
    */
    @ApiModelProperty(value="收货地址id")
    private Integer customerAddrId;

    /**
    * 邮箱
    */
    @ApiModelProperty(value="邮箱")
    private Integer zip;

    /**
    * 省份
    */
    @ApiModelProperty(value="省份")
    private String province;

    /**
    * 城市
    */
    @ApiModelProperty(value="城市")
    private String city;

    /**
    * 地区
    */
    @ApiModelProperty(value="地区")
    private String district;

    /**
    * 具体的地址门牌号
    */
    @ApiModelProperty(value="具体的地址门牌号")
    private String address;

    /**
    * 是否默认
    */
    @ApiModelProperty(value="是否默认")
    private String isDefault;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}