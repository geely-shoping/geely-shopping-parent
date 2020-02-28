package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class shippingAddr {

    private Integer customerAddrId;
    private Integer zip;
    private String province;
    private String city;
    private String district;
    private String address;
    private String isDefault;
    private Date modifiedTime;


}
