package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户余额变动关联表
 */
public class CustomerBalanceChange {

    private Integer customerBalanceChangeId; //用户余额变动关联表编号
    private Integer customerId; //用户编号
    private Integer balanceChangeId; //余额变动编号

}
