package com.geely.dao;

import com.geely.entity.CustomerCommentTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCommentTbMapper {
    int deleteByPrimaryKey(Integer customerCommentId);

    int insert(CustomerCommentTb record);

    int insertSelective(CustomerCommentTb record);

    CustomerCommentTb selectByPrimaryKey(Integer customerCommentId);

    int updateByPrimaryKeySelective(CustomerCommentTb record);

    int updateByPrimaryKey(CustomerCommentTb record);

    int updateBatch(List<CustomerCommentTb> list);

    int batchInsert(@Param("list") List<CustomerCommentTb> list);
}