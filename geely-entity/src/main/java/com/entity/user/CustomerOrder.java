package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {

     private Integer customerOrderId;
     private Integer customerId;
     private Integer orderMasterId;

}
