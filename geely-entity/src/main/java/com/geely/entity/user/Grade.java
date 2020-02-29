package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户等级表
 */
public class Grade {

    private Integer customerGradeId; //会员等级编号
    private String gradeName; //会员等级名称
    private Integer maxPoint; //最大积分
    private Integer minPoint; //最小积分
    private Date modifiedTime; //最后修改时间

}
