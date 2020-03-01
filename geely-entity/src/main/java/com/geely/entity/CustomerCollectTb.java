package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerCollectTb")
@Data
public class CustomerCollectTb {
    /**
    * 用户收藏关联表编号
    */
    @ApiModelProperty(value="用户收藏关联表编号")
    private Integer customerCollectId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 收藏编号
    */
    @ApiModelProperty(value="收藏编号")
    private Integer collectId;
}