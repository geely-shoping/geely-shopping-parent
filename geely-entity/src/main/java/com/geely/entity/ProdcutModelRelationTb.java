package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProdcutModelRelationTb")
@Data
public class ProdcutModelRelationTb {
    /**
    * 关联表ID
    */
    @ApiModelProperty(value="关联表ID")
    private Integer proColorId;

    /**
    * 商品ID
    */
    @ApiModelProperty(value="商品ID")
    private Integer productId;

    /**
    * 颜色ID
    */
    @ApiModelProperty(value="颜色ID")
    private Integer colorId;
}