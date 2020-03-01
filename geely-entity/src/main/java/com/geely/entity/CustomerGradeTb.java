package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.geely.entity.CustomerGradeTb")
@Data
public class CustomerGradeTb {
    /**
    * 用户等级关联表编号
    */
    @ApiModelProperty(value="用户等级关联表编号")
    private Integer customerGradeId;

    /**
    * 用户编号
    */
    @ApiModelProperty(value="用户编号")
    private Integer customerId;

    /**
    * 等级编号
    */
    @ApiModelProperty(value="等级编号")
    private Integer gradeId;
}