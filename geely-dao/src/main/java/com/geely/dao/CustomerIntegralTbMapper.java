package com.geely.dao;

import com.geely.entity.CustomerIntegralTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerIntegralTbMapper {
    int deleteByPrimaryKey(Integer customerAddrId);

    int insert(CustomerIntegralTb record);

    int insertSelective(CustomerIntegralTb record);

    CustomerIntegralTb selectByPrimaryKey(Integer customerAddrId);

    int updateByPrimaryKeySelective(CustomerIntegralTb record);

    int updateByPrimaryKey(CustomerIntegralTb record);

    int updateBatch(List<CustomerIntegralTb> list);

    int batchInsert(@Param("list") List<CustomerIntegralTb> list);
}