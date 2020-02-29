package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProductImageRelationTb")
@Data
public class ProductImageRelationTb {
    /**
    * 关联表ID
    */
    @ApiModelProperty(value="关联表ID")
    private Integer proImageId;

    /**
    * 商品ID
    */
    @ApiModelProperty(value="商品ID")
    private Integer productId;

    /**
    * 图片ID
    */
    @ApiModelProperty(value="图片ID")
    private Integer imageId;
}