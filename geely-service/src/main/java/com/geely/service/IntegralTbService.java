package com.geely.service;

import java.util.List;
import com.geely.entity.IntegralTb;
public interface IntegralTbService{


    int deleteByPrimaryKey(Integer customerIntegralId);

    int insert(IntegralTb record);

    int insertSelective(IntegralTb record);

    IntegralTb selectByPrimaryKey(Integer customerIntegralId);

    int updateByPrimaryKeySelective(IntegralTb record);

    int updateByPrimaryKey(IntegralTb record);

    int updateBatch(List<IntegralTb> list);

    int batchInsert(List<IntegralTb> list);

}
