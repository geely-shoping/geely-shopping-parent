package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.DeptTb")
@Data
public class DeptTb {
    /**
    * 部门ID
    */
    @ApiModelProperty(value="部门ID")
    private Integer deptId;

    /**
    * 部门名
    */
    @ApiModelProperty(value="部门名")
    private String deptName;

    /**
    * 部门描述
    */
    @ApiModelProperty(value="部门描述")
    private String deptDescribe;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date deptCreate;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date deptLast;
}