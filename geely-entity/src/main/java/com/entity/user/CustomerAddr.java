package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddr {

    private Integer customerAddrId;
    private Integer customerId;
    private Integer addrId;

}
