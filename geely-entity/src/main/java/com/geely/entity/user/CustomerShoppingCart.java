package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户购物车关联表
 */
public class CustomerShoppingCart {

    private Integer customerShoppingCartId; //用户购物车关联表编号
    private Integer customerId; //用户编号
    private Integer shoppingCartId; //购物车编号

}