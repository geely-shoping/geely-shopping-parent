package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderMaster {

   private Integer orderId;
   private String orderUuid;
   private String  paymentMethod;
   private BigDecimal orderMoney;
   private BigDecimal districtMoney;
   private BigDecimal paymentMoney;
   private Date OverbookingTime;
   private Date paymentTime;
   private Date shipmentsTime;
   private Date receivingTime;
   private String orderState;
   private Integer orderPoint;

}
