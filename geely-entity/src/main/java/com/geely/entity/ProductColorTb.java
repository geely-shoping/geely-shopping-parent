package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProductColorTb")
@Data
public class ProductColorTb {
    /**
    * 颜色ID
    */
    @ApiModelProperty(value="颜色ID")
    private Integer colorId;

    /**
    * 颜色名字
    */
    @ApiModelProperty(value="颜色名字")
    private String colorName;

    /**
    * 颜色图片
    */
    @ApiModelProperty(value="颜色图片")
    private String colorImage;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date colorLast;
}