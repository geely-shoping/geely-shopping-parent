package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerGrade {

    private Integer customerGradeId;
    private String gradeName;
    private Integer maxPoint;
    private Integer minPoint;
    private Date modifiedTime;

}
