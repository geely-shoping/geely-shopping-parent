package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProductModelTb")
@Data
public class ProductModelTb {
    /**
    * 型号Id
    */
    @ApiModelProperty(value="型号Id")
    private Integer modelId;

    /**
    * 型号名字
    */
    @ApiModelProperty(value="型号名字")
    private String modelName;

    /**
    * 价钱
    */
    @ApiModelProperty(value="价钱")
    private Long modelPrice;

    /**
    * 型号描述
    */
    @ApiModelProperty(value="型号描述")
    private String modelDescribe;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modelLast;
}