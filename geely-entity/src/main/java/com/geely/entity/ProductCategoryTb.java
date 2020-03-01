package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProductCategoryTb")
@Data
public class ProductCategoryTb {
    /**
    * 分类ID
    */
    @ApiModelProperty(value="分类ID")
    private Integer categoryId;

    /**
    * 分类名称
    */
    @ApiModelProperty(value="分类名称")
    private String categoryName;

    /**
    * 父分类ID
    */
    @ApiModelProperty(value="父分类ID")
    private Integer categoryParent;

    /**
    * 分类状态(禁用，启用)
    */
    @ApiModelProperty(value="分类状态(禁用，启用)")
    private String categoryStatus;

    /**
    * 分类描述
    */
    @ApiModelProperty(value="分类描述")
    private String categoryDescribe;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date categoryLast;
}