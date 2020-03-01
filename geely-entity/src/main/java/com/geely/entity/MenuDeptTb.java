package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.MenuDeptTb")
@Data
public class MenuDeptTb {
    /**
    * 菜单部门关联表编号
    */
    @ApiModelProperty(value="菜单部门关联表编号")
    private Integer menuDeptId;

    /**
    * 菜单ID
    */
    @ApiModelProperty(value="菜单ID")
    private Integer menuId;

    /**
    * 部门ID
    */
    @ApiModelProperty(value="部门ID")
    private Integer deptId;
}