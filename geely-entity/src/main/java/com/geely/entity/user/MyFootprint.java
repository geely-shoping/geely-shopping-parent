package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 我的足迹表
 */
public class MyFootprint {

    private Integer footprintId; //足迹编号
    private Integer collectProduct; //商品编号
    private Date browseTime; //浏览时间

}
