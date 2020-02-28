package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCollect {

    private Integer customerCollectId;
    private Integer customerId;
    private Integer collectId;

}
