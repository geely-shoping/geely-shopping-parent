package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户评论关联
 */
public class CustomerComment {

    private Integer CustomerCommentId; //用户评论关联表编号
    private Integer customerId; //用户编号
    private Integer commentId; //评论编号

}
