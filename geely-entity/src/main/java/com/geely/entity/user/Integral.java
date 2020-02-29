package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Integral {

    private Integer customerIntegralId;
    private Integer userPoint;
    private Date registerTime;
    private Date birthday;
    private Date modifiedTime;

}
