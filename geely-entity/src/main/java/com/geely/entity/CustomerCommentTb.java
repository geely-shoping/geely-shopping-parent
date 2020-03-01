package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerCommentTb")
@Data
public class CustomerCommentTb {
    /**
    * 用户评论关联表编号
    */
    @ApiModelProperty(value="用户评论关联表编号")
    private Integer customerCommentId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 评论编号
    */
    @ApiModelProperty(value="评论编号")
    private Integer commentId;
}