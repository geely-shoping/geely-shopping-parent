package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

   private Integer orderDetailId;
   private Integer productId;
   private String productName;
   private Integer productAmount;
   private BigDecimal productMoney;
   private BigDecimal apportionMoney;
   private Date modifiedTime;
}
