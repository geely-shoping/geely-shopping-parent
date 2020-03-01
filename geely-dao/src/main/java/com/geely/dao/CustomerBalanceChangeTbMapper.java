package com.geely.dao;

import com.geely.entity.CustomerBalanceChangeTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerBalanceChangeTbMapper {
    int deleteByPrimaryKey(Integer customerBalanceChangeId);

    int insert(CustomerBalanceChangeTb record);

    int insertSelective(CustomerBalanceChangeTb record);

    CustomerBalanceChangeTb selectByPrimaryKey(Integer customerBalanceChangeId);

    int updateByPrimaryKeySelective(CustomerBalanceChangeTb record);

    int updateByPrimaryKey(CustomerBalanceChangeTb record);

    int updateBatch(List<CustomerBalanceChangeTb> list);

    int batchInsert(@Param("list") List<CustomerBalanceChangeTb> list);
}