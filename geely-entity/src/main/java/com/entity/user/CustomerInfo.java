package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo {

    private Integer customerInfId;
    private String customerName;
    private String customerGender;
    private String identityCardType;
    private String  identityCardNo;
    private String customerPhone;
    private String customerEmail;
    private BigDecimal balance;
    private String nickname;
    private String icon;
    private Date modifiedTime;

}
