package com.geely.dao;

import com.geely.entity.CustomerAddrTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAddrTbMapper {
    int deleteByPrimaryKey(Integer customerAddrId);

    int insert(CustomerAddrTb record);

    int insertSelective(CustomerAddrTb record);

    CustomerAddrTb selectByPrimaryKey(Integer customerAddrId);

    int updateByPrimaryKeySelective(CustomerAddrTb record);

    int updateByPrimaryKey(CustomerAddrTb record);

    int updateBatch(List<CustomerAddrTb> list);

    int batchInsert(@Param("list") List<CustomerAddrTb> list);
}