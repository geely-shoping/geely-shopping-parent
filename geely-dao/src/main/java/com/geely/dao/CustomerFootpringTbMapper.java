package com.geely.dao;

import com.geely.entity.CustomerFootpringTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerFootpringTbMapper {
    int deleteByPrimaryKey(Integer customerFootprintId);

    int insert(CustomerFootpringTb record);

    int insertSelective(CustomerFootpringTb record);

    CustomerFootpringTb selectByPrimaryKey(Integer customerFootprintId);

    int updateByPrimaryKeySelective(CustomerFootpringTb record);

    int updateByPrimaryKey(CustomerFootpringTb record);

    int updateBatch(List<CustomerFootpringTb> list);

    int batchInsert(@Param("list") List<CustomerFootpringTb> list);
}