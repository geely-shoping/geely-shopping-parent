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
 * 购物车表
 */
public class ShoppingCart {

    private Integer shoppingCardId; //购物车编号
    private Integer productId; //商品编号
    private Integer productAmount; //商品数量
    private BigDecimal ProductPrice; //商品价钱
    private Date addTime; //加入购物车时间
    private Date modifiedTime; //最后修改时间


}
