package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {

    private Integer shoppingCardId;
    private Integer productId;
    private Integer productAmount;
    private BigDecimal ProductPrice;
    private Date addTime;
    private Date modifiedTime;

}