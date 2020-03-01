package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.MyFootprintTb")
@Data
public class MyFootprintTb {
    /**
    * 足迹编号
    */
    @ApiModelProperty(value="足迹编号")
    private Integer footprintId;

    /**
    * 商品编号
    */
    @ApiModelProperty(value="商品编号")
    private Integer productId;

    /**
    * 浏览时间
    */
    @ApiModelProperty(value="浏览时间")
    private Date browseTime;
}