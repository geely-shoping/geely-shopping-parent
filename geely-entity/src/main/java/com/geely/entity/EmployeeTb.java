package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.EmployeeTb")
@Data
public class EmployeeTb {
    /**
    * 员工ID
    */
    @ApiModelProperty(value="员工ID")
    private Integer employeeId;

    /**
    * 员工名字
    */
    @ApiModelProperty(value="员工名字")
    private String employeeName;

    /**
    * 性别
    */
    @ApiModelProperty(value="性别")
    private String employeeSex;

    /**
    * 电话号码
    */
    @ApiModelProperty(value="电话号码")
    private String employeePhone;

    /**
    * 身份证
    */
    @ApiModelProperty(value="身份证")
    private String employeeCard;

    /**
    * 毕业学校
    */
    @ApiModelProperty(value="毕业学校")
    private String employeeSchool;

    /**
    * 入职时间
    */
    @ApiModelProperty(value="入职时间")
    private Date employeeEntry;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date employeeLast;
}