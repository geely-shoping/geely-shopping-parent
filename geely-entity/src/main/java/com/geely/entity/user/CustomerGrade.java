package com.geely.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 用户等级关联表
 */
public class CustomerGrade{

   private Integer customerGradeId; //用户等级关联表编号
   private Integer customerId; //用户编号
   private Integer gradeId; //等级编号

}
