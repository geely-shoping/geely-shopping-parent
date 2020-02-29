package com.geely.dao;

import com.geely.entity.CustomerGradeTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerGradeTbMapper {
    int deleteByPrimaryKey(Integer customerGradeId);

    int insert(CustomerGradeTb record);

    int insertSelective(CustomerGradeTb record);

    CustomerGradeTb selectByPrimaryKey(Integer customerGradeId);

    int updateByPrimaryKeySelective(CustomerGradeTb record);

    int updateByPrimaryKey(CustomerGradeTb record);

    int updateBatch(List<CustomerGradeTb> list);

    int batchInsert(@Param("list") List<CustomerGradeTb> list);
}