package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 评论表
 */
public class Comment {

    private Integer commentId; //评论表编号
    private String commentContent; //评论内容
    private Integer commentProduct; //商品编号
    private Date modifiedTime; //最后修改时间

}
