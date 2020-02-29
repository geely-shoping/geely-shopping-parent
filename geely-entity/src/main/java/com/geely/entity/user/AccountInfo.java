package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 账号信息关联表
 */
public class AccountInfo {

    private Integer accountInfoId;  //关联ID
    private Integer accountId;  //账号ID
    private Integer InfoId; //信息ID


}
