package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户订单关联表
 */
public class CustomerOrder {

     private Integer customerOrderId; //用户订单关联表编号
     private Integer customerId; //用户编号
     private Integer orderMasterId; //订单编号

}
