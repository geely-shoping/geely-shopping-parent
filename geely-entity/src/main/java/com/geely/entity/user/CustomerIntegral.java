package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户积分关联表
 */
public class CustomerIntegral {

    private Integer customerAddrId; //用户积分关联表编号
    private Integer customerId; //用户编号
    private Integer integralId; //积分编号

}
