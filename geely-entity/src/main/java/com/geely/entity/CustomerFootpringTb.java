package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerFootpringTb")
@Data
public class CustomerFootpringTb {
    /**
    * 用户足迹关联表编号
    */
    @ApiModelProperty(value="用户足迹关联表编号")
    private Integer customerFootprintId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 足迹编号
    */
    @ApiModelProperty(value="足迹编号")
    private Integer footpringId;
}