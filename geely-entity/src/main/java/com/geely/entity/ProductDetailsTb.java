package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProductDetailsTb")
@Data
public class ProductDetailsTb {
    /**
    * 商品详情ID
    */
    @ApiModelProperty(value="商品详情ID")
    private Integer detailsId;

    /**
    * 详情描述
    */
    @ApiModelProperty(value="详情描述")
    private String detailsName;

    /**
    * 第一张图片
    */
    @ApiModelProperty(value="第一张图片")
    private String detailsImageOne;

    /**
    * 第二张图片
    */
    @ApiModelProperty(value="第二张图片")
    private String detailsImageTwo;

    /**
    * 第三张图片
    */
    @ApiModelProperty(value="第三张图片")
    private String detailsImageThree;

    /**
    * 第四张图片
    */
    @ApiModelProperty(value="第四张图片")
    private String detailsImageFour;

    /**
    * 第五张图片
    */
    @ApiModelProperty(value="第五张图片")
    private String detailsImageFive;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date detailsLast;
}