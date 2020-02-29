package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerComment {

    private Integer CustomerCommentId;
    private Integer customerId;
    private Integer commentId;

}
