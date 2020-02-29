package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.CollectTb")
@Data
public class CollectTb {
    /**
    * 收藏表编号
    */
    @ApiModelProperty(value="收藏表编号")
    private Integer collectId;

    /**
    * 商品编号
    */
    @ApiModelProperty(value="商品编号")
    private Integer collectProduct;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}