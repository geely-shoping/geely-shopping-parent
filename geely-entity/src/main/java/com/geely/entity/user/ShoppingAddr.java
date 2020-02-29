package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 收获地址
 */
public class ShoppingAddr {

    private Integer customerAddrId; //收货地址id
    private Integer zip; //邮编
    private String province; //省份
    private String city; //城市
    private String district; //地区
    private String address; //具体的地址门牌号
    private String isDefault; //是否默认
    private Date modifiedTime; //最后修改时间

}
