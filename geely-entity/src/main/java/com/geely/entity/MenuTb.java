package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.MenuTb")
@Data
public class MenuTb {
    /**
    * 菜单ID
    */
    @ApiModelProperty(value="菜单ID")
    private Integer menuId;

    /**
    * 菜单名
    */
    @ApiModelProperty(value="菜单名")
    private String menuName;

    /**
    * 是否父菜单
    */
    @ApiModelProperty(value="是否父菜单")
    private String menuParent;

    /**
    * 父菜单ID
    */
    @ApiModelProperty(value="父菜单ID")
    private Integer menuPid;

    /**
    * 菜单地址
    */
    @ApiModelProperty(value="菜单地址")
    private String menuUrl;
}