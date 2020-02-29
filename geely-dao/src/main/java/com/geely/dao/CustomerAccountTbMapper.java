package com.geely.dao;

import com.geely.entity.CustomerAccountTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAccountTbMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerAccountTb record);

    int insertSelective(CustomerAccountTb record);

    CustomerAccountTb selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerAccountTb record);

    int updateByPrimaryKey(CustomerAccountTb record);

    int updateBatch(List<CustomerAccountTb> list);

    int batchInsert(@Param("list") List<CustomerAccountTb> list);
}