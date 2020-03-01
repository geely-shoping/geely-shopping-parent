package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.AccountInfoTb")
@Data
public class AccountInfoTb {
    /**
    * 账号个人信息表编号
    */
    @ApiModelProperty(value="账号个人信息表编号")
    private Integer accountInfoId;

    /**
    * 账号编号
    */
    @ApiModelProperty(value="账号编号")
    private Integer accountId;

    /**
    * 个人信息编号
    */
    @ApiModelProperty(value="个人信息编号")
    private Integer infoId;
}