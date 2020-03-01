package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.CommentTb")
@Data
public class CommentTb {
    /**
    * 评论表编号
    */
    @ApiModelProperty(value="评论表编号")
    private Integer commentId;

    /**
    * 评论内容
    */
    @ApiModelProperty(value="评论内容")
    private String commentContent;

    /**
    * 商品编号
    */
    @ApiModelProperty(value="商品编号")
    private Integer commentProduct;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}