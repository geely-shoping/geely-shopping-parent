package com.geely.valid;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 校验员工账号密码数据类
 */
@Data
public class AccountValid {
    @NotEmpty(message = "用户不能为空")
    private String username;
    @NotEmpty(message = "密码不能为空")
    private String password;
}
