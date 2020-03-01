package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerInfoTb")
@Data
public class CustomerInfoTb {
    /**
    * 个人信息编号
    */
    @ApiModelProperty(value="个人信息编号")
    private Integer customerInfoId;

    /**
    * 用户真实姓名
    */
    @ApiModelProperty(value="用户真实姓名")
    private String customerName;

    /**
    * 用户性别
    */
    @ApiModelProperty(value="用户性别")
    private String customerGender;

    /**
    * 证件类型
    */
    @ApiModelProperty(value="证件类型")
    private String identityCardType;

    /**
    * 证件号码
    */
    @ApiModelProperty(value="证件号码")
    private String identityCardNo;

    /**
    * 手机号
    */
    @ApiModelProperty(value="手机号")
    private String custoemrPhone;

    /**
    * 邮箱
    */
    @ApiModelProperty(value="邮箱")
    private String customerEmail;

    /**
    * 余额
    */
    @ApiModelProperty(value="余额")
    private BigDecimal balance;

    /**
    * 昵称
    */
    @ApiModelProperty(value="昵称")
    private String nickname;

    /**
    * 头像
    */
    @ApiModelProperty(value="头像")
    private String icon;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}