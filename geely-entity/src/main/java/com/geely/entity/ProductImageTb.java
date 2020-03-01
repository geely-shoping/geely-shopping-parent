package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.ProductImageTb")
@Data
public class ProductImageTb {
    /**
    * 图片ID
    */
    @ApiModelProperty(value="图片ID")
    private Integer imageId;

    /**
    * 图片地址
    */
    @ApiModelProperty(value="图片地址")
    private String imageName;

    /**
    * 是否主图（是，否）
    */
    @ApiModelProperty(value="是否主图（是，否）")
    private String imageMaster;

    /**
    * 是否有效（有效，无效）
    */
    @ApiModelProperty(value="是否有效（有效，无效）")
    private String imageStatus;

    /**
    * 图片描述
    */
    @ApiModelProperty(value="图片描述")
    private String imageDescribe;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date imageLast;
}