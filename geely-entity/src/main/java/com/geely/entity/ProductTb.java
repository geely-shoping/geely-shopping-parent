package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProductTb")
@Data
public class ProductTb {
    /**
    * 商品ID
    */
    @ApiModelProperty(value="商品ID")
    private Integer productId;

    /**
    * 商品名称
    */
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
    * 商品价格
    */
    @ApiModelProperty(value="商品价格")
    private Long productPrice;

    /**
    * 商品主图
    */
    @ApiModelProperty(value="商品主图")
    private String productImage;

    /**
    * 商品描述
    */
    @ApiModelProperty(value="商品描述")
    private String productDescribe;

    /**
    * 商品状态（是，否）
    */
    @ApiModelProperty(value="商品状态（是，否）")
    private String productStatus;

    /**
    * 商品创建时间
    */
    @ApiModelProperty(value="商品创建时间")
    private Date productCreate;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date productLast;
}