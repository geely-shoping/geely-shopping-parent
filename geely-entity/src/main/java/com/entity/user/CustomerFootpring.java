package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerFootpring {

    private Integer customerFootprintId;
    private Integer customerId;
    private Integer footpringId;

}
