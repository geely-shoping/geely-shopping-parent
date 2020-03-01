package com.geely.service;

import com.geely.entity.CustomerGradeTb;
import java.util.List;
public interface CustomerGradeTbService{


    int deleteByPrimaryKey(Integer customerGradeId);

    int insert(CustomerGradeTb record);

    int insertSelective(CustomerGradeTb record);

    CustomerGradeTb selectByPrimaryKey(Integer customerGradeId);

    int updateByPrimaryKeySelective(CustomerGradeTb record);

    int updateByPrimaryKey(CustomerGradeTb record);

    int updateBatch(List<CustomerGradeTb> list);

    int batchInsert(List<CustomerGradeTb> list);

}
