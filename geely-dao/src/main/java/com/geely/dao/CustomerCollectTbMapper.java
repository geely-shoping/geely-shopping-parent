package com.geely.dao;

import com.geely.entity.CustomerCollectTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCollectTbMapper {
    int deleteByPrimaryKey(Integer customerCollectId);

    int insert(CustomerCollectTb record);

    int insertSelective(CustomerCollectTb record);

    CustomerCollectTb selectByPrimaryKey(Integer customerCollectId);

    int updateByPrimaryKeySelective(CustomerCollectTb record);

    int updateByPrimaryKey(CustomerCollectTb record);

    int updateBatch(List<CustomerCollectTb> list);

    int batchInsert(@Param("list") List<CustomerCollectTb> list);
}