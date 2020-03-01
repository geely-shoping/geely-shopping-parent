package com.geely.service;

import java.util.List;
import com.geely.entity.CustomerCommentTb;
public interface CustomerCommentTbService{


    int deleteByPrimaryKey(Integer customerCommentId);

    int insert(CustomerCommentTb record);

    int insertSelective(CustomerCommentTb record);

    CustomerCommentTb selectByPrimaryKey(Integer customerCommentId);

    int updateByPrimaryKeySelective(CustomerCommentTb record);

    int updateByPrimaryKey(CustomerCommentTb record);

    int updateBatch(List<CustomerCommentTb> list);

    int batchInsert(List<CustomerCommentTb> list);

}
