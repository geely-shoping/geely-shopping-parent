package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 订单主从关联表
 */
public class OrderMasterDetail {

   private Integer orderMasterDetailId; //订单主从关联表编号
   private Integer orderMasterId; //订单主表编号
   private Integer orderDetailId; //订单从表编号

}
