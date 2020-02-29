package com.geely.dao;

import com.geely.entity.IntegralTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralTbMapper {
    int deleteByPrimaryKey(Integer customerIntegralId);

    int insert(IntegralTb record);

    int insertSelective(IntegralTb record);

    IntegralTb selectByPrimaryKey(Integer customerIntegralId);

    int updateByPrimaryKeySelective(IntegralTb record);

    int updateByPrimaryKey(IntegralTb record);

    int updateBatch(List<IntegralTb> list);

    int batchInsert(@Param("list") List<IntegralTb> list);
}