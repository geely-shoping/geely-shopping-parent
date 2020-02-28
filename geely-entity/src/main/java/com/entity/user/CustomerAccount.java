package com.entity.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAccount {

    private Integer customerId;
    private String username;
    private String password;
    private String customerStats;
    private Date modifedTime;
}
