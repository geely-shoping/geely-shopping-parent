package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerAccountTb")
@Data
public class CustomerAccountTb {
    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 账号
    */
    @ApiModelProperty(value="账号")
    private String username;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String password;

    /**
    * 用户状态
    */
    @ApiModelProperty(value="用户状态")
    private String customerStats;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}