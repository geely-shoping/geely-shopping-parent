package com.geely.dao;

import com.geely.entity.CustomerGradeTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户等级关联表
 */
public interface CustomerGradeTbMapper {
    int deleteByPrimaryKey(Integer customerGradeId);

    int insert(CustomerGradeTb record);

    int insertSelective(CustomerGradeTb record);

    CustomerGradeTb selectByPrimaryKey(Integer customerGradeId);

    int updateByPrimaryKeySelective(CustomerGradeTb record);

    int updateByPrimaryKey(CustomerGradeTb record);

    int updateBatch(List<CustomerGradeTb> list);

    int batchInsert(@Param("list") List<CustomerGradeTb> list);

    //分页查询
    List<CustomerGradeTb> listCustomerGradeTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}