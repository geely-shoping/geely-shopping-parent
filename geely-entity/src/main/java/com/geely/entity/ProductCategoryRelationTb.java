package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProductCategoryRelationTb")
@Data
public class ProductCategoryRelationTb {
    /**
    * 关联表ID
    */
    @ApiModelProperty(value="关联表ID")
    private Integer proCategoryId;

    /**
    * 商品ID
    */
    @ApiModelProperty(value="商品ID")
    private Integer productId;

    /**
    * 分类ID
    */
    @ApiModelProperty(value="分类ID")
    private Integer categoryId;
}