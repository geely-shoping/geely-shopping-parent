package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.EmployeeAccountTb")
@Data
public class EmployeeAccountTb {
    /**
    * 账号ID
    */
    @ApiModelProperty(value="账号ID")
    private Integer accountId;

    /**
    * 帐户名
    */
    @ApiModelProperty(value="帐户名")
    private String accountName;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String accountPassword;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date accountCreate;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date accountLast;
}