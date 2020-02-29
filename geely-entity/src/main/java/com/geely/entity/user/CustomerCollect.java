package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户收藏关联表
 */
public class CustomerCollect {

    private Integer customerCollectId; //用户收藏关联表编号
    private Integer customerId; //用户编号
    private Integer collectId; //收藏编号

}
