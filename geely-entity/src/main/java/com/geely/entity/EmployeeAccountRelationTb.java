package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.EmployeeAccountRelationTb")
@Data
public class EmployeeAccountRelationTb {
    /**
    * 关联表ID
    */
    @ApiModelProperty(value="关联表ID")
    private Integer empAccountId;

    /**
    * 员工ID
    */
    @ApiModelProperty(value="员工ID")
    private Integer employeeId;

    /**
    * 账号ID
    */
    @ApiModelProperty(value="账号ID")
    private Integer accountId;
}