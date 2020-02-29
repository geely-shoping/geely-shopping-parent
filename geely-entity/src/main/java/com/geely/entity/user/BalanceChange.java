package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 余额变动表
 */
public class BalanceChange {

   private Integer balanceChangeId; //余额变动编号
   private String source; // 记录来源
   private Integer sourceDetail; //相关单据id
   private Date createTime;  //记录生成时间
   private BigDecimal amount; //变动金额
}
