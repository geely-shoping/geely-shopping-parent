package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.Dynamic.Parameter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBalanceChange {

    private Integer customerBalanceChangeId;
    private Integer customerId;
    private Integer balanceChangeId;

}
