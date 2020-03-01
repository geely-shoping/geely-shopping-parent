package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.IntegralTb")
@Data
public class IntegralTb {
    /**
    * 用户积分编号
    */
    @ApiModelProperty(value="用户积分编号")
    private Integer customerIntegralId;

    /**
    * 用户积分
    */
    @ApiModelProperty(value="用户积分")
    private Integer userPoint;

    /**
    * 用户注册时间
    */
    @ApiModelProperty(value="用户注册时间")
    private Date registerTime;

    /**
    * 会员生日
    */
    @ApiModelProperty(value="会员生日")
    private Date birthday;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}