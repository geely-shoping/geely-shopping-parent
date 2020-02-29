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
 * 订单主表
 */
public class OrderMaster {

   private Integer orderId; //订单编号
   private String orderUuid; //订单uuid
   private String  paymentMethod; //支付方式
   private BigDecimal orderMoney; //订单金额
   private BigDecimal districtMoney; //优惠金额
   private BigDecimal paymentMoney; //支付金额
   private Date OverbookingTime; //下单时间
   private Date paymentTime; //支付时间
   private Date shipmentsTime; //发货时间
   private Date receivingTime; //收货时间
   private String orderState; //订单状态
   private Integer orderPoint; //最后修改时间

}
