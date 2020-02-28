package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCoupon {

    private Integer customerCouponId;
    private Integer customerId;
    private Integer couponId;

}
