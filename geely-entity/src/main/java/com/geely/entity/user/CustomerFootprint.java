package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerFootprint {

    private Integer customerFootprintId;
    private Integer customerId;
    private Integer footprintId;

}
