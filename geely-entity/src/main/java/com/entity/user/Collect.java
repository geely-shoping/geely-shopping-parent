package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collect {

    private Integer collectId;
    private Integer coolletProduct;
    private Date modifiedTime;
}
