package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderMasterDetail {

   private Integer orderMasterDetailId;
   private Integer orderMasterId;
   private Integer orderDetailId;

}
