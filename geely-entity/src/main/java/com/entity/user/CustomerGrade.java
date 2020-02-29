package com.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerGrade{

   private Integer customerGradeId;
   private Integer customerId;
   private Integer gradeId;

}
