package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BalanceChange {

   private Integer balanceChangeId;
   private String source;
   private Integer sourceDetail;
   private Date createTime;
   private BigDecimal amount;

}
