package com.geely.dao;

import com.geely.entity.CustomerOrderTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerOrderTbMapper {
    int deleteByPrimaryKey(Integer customerOrderId);

    int insert(CustomerOrderTb record);

    int insertSelective(CustomerOrderTb record);

    CustomerOrderTb selectByPrimaryKey(Integer customerOrderId);

    int updateByPrimaryKeySelective(CustomerOrderTb record);

    int updateByPrimaryKey(CustomerOrderTb record);

    int updateBatch(List<CustomerOrderTb> list);

    int batchInsert(@Param("list") List<CustomerOrderTb> list);
}