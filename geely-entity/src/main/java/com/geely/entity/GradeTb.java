package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.GradeTb")
@Data
public class GradeTb {
    /**
    * 会员等级编号
    */
    @ApiModelProperty(value="会员等级编号")
    private Integer customerGradeId;

    /**
    * 会员等级名称
    */
    @ApiModelProperty(value="会员等级名称")
    private String gradeName;

    /**
    * 最大积分
    */
    @ApiModelProperty(value="最大积分")
    private Integer maxPoint;

    /**
    * 最小积分
    */
    @ApiModelProperty(value="最小积分")
    private Integer minPoint;

    /**
    * 最后修改时间
    */
    @ApiModelProperty(value="最后修改时间")
    private Date modifiedTime;
}