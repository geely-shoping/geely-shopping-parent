package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户足迹关联表
 */
public class CustomerFootprint {

    private Integer customerFootprintId; //用户足迹关联表编号
    private Integer customerId; // 用户编号
    private Integer footprintId; //足迹编号

}
