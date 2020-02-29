package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户收货地址关联表
 */
public class CustomerAddr {

    private Integer customerAddrId; //用户收获地址关联表编号
    private Integer customerId; //用户编号
    private Integer addrId; //收货地址编号

}
