package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerShoppingCart {

    private Integer customerShoppingCartId;
    private Integer customerId;
    private Integer shoppingCartId;

}
