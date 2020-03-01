package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProductDetailsRelationTb")
@Data
public class ProductDetailsRelationTb {
    /**
    * 关联表ID
    */
    @ApiModelProperty(value="关联表ID")
    private Integer proDetailsId;

    /**
    * 商品ID
    */
    @ApiModelProperty(value="商品ID")
    private Integer productId;

    /**
    * 详情ID
    */
    @ApiModelProperty(value="详情ID")
    private Integer detailsId;
}