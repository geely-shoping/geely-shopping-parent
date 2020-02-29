package com.geely.dao;

import com.geely.entity.CustomerInfoTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoTbMapper {
    int deleteByPrimaryKey(Integer customerInfoId);

    int insert(CustomerInfoTb record);

    int insertSelective(CustomerInfoTb record);

    CustomerInfoTb selectByPrimaryKey(Integer customerInfoId);

    int updateByPrimaryKeySelective(CustomerInfoTb record);

    int updateByPrimaryKey(CustomerInfoTb record);

    int updateBatch(List<CustomerInfoTb> list);

    int batchInsert(@Param("list") List<CustomerInfoTb> list);
}