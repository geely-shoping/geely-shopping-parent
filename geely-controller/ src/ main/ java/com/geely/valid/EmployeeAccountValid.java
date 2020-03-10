package com.geely.valid;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 校验员工账号密码数据类
 */
@Data
public class EmployeeAccountValid {
    @NotEmpty(message = "账号名不能为空")
    private String accountName;
    @NotEmpty(message = "密码不能为空")
    private String accountPassword;
}
