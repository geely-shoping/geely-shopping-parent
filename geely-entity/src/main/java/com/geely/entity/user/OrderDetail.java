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
 * 订单详情表
 */
public class OrderDetail {

   private Integer orderDetailId; //订单详情编号
   private Integer productId; //商品编号
   private String productName; //商品名称
   private Integer productAmount; //商品数量
   private BigDecimal productMoney; //商品单价
   private BigDecimal apportionMoney; //优惠分摊金额
   private Date modifiedTime; //最后修改时间

}
