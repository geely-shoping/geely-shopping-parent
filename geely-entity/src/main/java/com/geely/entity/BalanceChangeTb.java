package com.geely.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.geely.entity.BalanceChangeTb")
@Data
public class BalanceChangeTb {
    /**
    * 余额变动编号
    */
    @ApiModelProperty(value="余额变动编号")
    private Integer balanceChangeId;

    /**
    * 记录来源
    */
    @ApiModelProperty(value="记录来源")
    private String source;

    /**
    * 相关单据id
    */
    @ApiModelProperty(value="相关单据id")
    private Integer sourceDetail;

    /**
    * 记录生成时间
    */
    @ApiModelProperty(value="记录生成时间")
    private Date createTime;

    /**
    * 变动金额
    */
    @ApiModelProperty(value="变动金额")
    private BigDecimal amount;
}