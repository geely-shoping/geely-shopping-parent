package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBalanceChange {

    private Integer customerBalanceChangeId;
    private Integer customerId;
    private Integer balanceChangeId;

}
