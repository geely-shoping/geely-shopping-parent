package com.geely.service;

import java.util.List;
import com.geely.entity.CustomerInfoTb;
public interface CustomerInfoTbService{


    int deleteByPrimaryKey(Integer customerInfoId);

    int insert(CustomerInfoTb record);

    int insertSelective(CustomerInfoTb record);

    CustomerInfoTb selectByPrimaryKey(Integer customerInfoId);

    int updateByPrimaryKeySelective(CustomerInfoTb record);

    int updateByPrimaryKey(CustomerInfoTb record);

    int updateBatch(List<CustomerInfoTb> list);

    int batchInsert(List<CustomerInfoTb> list);

    //分页查询
    List<CustomerInfoTb> listCustomerInfoTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> customerInfoIds);
}
