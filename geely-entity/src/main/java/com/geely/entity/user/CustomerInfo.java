package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 个人信息表
 */
public class CustomerInfo {

    private Integer customerInfId;  //个人信息编号
    private String customerName; //用户真实姓名
    private String customerGender; //用户性别
    private String identityCardType; //证件类型
    private String  identityCardNo; //证件号码
    private String customerPhone; //手机号
    private String customerEmail; //邮箱
    private BigDecimal balance; //余额
    private String nickname; //昵称
    private String icon; //头像
    private Date modifiedTime; //最后修改时间

}
