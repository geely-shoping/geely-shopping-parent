package com.geely.dao;

import com.geely.entity.BalanceChangeTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 余额变动
 */
public interface BalanceChangeTbMapper {
    //根据主键删除
    int deleteByPrimaryKey(Integer balanceChangeId);
    //添加（参数完整）
    int insert(BalanceChangeTb record);
    //添加（参数可选）
    int insertSelective(BalanceChangeTb record);
    //根据主键查询
    BalanceChangeTb selectByPrimaryKey(Integer balanceChangeId);
    //修改（参数可选）
    int updateByPrimaryKeySelective(BalanceChangeTb record);
    //修改（参数完整）
    int updateByPrimaryKey(BalanceChangeTb record);
    //批量修改（参数完整）
    int updateBatch(List<BalanceChangeTb> list);
    //批量添加（参数完整）
    int batchInsert(@Param("list") List<BalanceChangeTb> list);
    //分页查询
    List<BalanceChangeTb> listBalanceChangeTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}