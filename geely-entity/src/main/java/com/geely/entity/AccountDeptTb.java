package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.AccountDeptTb")
@Data
public class AccountDeptTb {
    /**
    * 部门账号关联表编号
    */
    @ApiModelProperty(value="部门账号关联表编号")
    private Integer accountDeptId;

    /**
    * 账号ID
    */
    @ApiModelProperty(value="账号ID")
    private Integer accountId;

    /**
    * 部门ID
    */
    @ApiModelProperty(value="部门ID")
    private Integer deptId;
}