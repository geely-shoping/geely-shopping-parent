package com.geely.entity.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户账号表
 */
public class CustomerAccount {

    private Integer customerId; //用户编号
    private String username; //账号
    private String password; //密码
    private String customerStats; //用户状态
    private Date modifiedTime; //最后修改时间
}
