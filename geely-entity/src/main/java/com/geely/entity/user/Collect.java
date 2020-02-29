package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 收藏表
 */
public class Collect {

    private Integer collectId; //收藏表编号
    private Integer collectProduct; //商品编号
    private Date modifiedTime; //最后修改时间
}
