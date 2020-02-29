package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 积分表
 */
public class Integral {

    private Integer customerIntegralId; //用户积分编号
    private Integer userPoint; //用户积分
    private Date registerTime; //用户注册时间
    private Date birthday; //会员生日
    private Date modifiedTime; //最后修改时间

}
