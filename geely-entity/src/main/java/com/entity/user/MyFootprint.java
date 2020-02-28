package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyFootprint {

    private Integer footprintId;
    private Integer coolletProduct;
    private Date browseTime;

}
