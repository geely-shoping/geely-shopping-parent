package com.geely.dao;

import com.geely.entity.IntegralTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 积分dao
 */
public interface IntegralTbMapper {
    int deleteByPrimaryKey(Integer customerIntegralId);

    int insert(IntegralTb record);

    int insertSelective(IntegralTb record);

    IntegralTb selectByPrimaryKey(Integer customerIntegralId);

    int updateByPrimaryKeySelective(IntegralTb record);

    int updateByPrimaryKey(IntegralTb record);

    int updateBatch(List<IntegralTb> list);

    int batchInsert(@Param("list") List<IntegralTb> list);

    //分页查询
    List<IntegralTb> listIntegralTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}