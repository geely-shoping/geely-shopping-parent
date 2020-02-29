package com.geely.dao;

import com.geely.entity.BalanceChangeTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceChangeTbMapper {
    int deleteByPrimaryKey(Integer balanceChangeId);

    int insert(BalanceChangeTb record);

    int insertSelective(BalanceChangeTb record);

    BalanceChangeTb selectByPrimaryKey(Integer balanceChangeId);

    int updateByPrimaryKeySelective(BalanceChangeTb record);

    int updateByPrimaryKey(BalanceChangeTb record);

    int updateBatch(List<BalanceChangeTb> list);

    int batchInsert(@Param("list") List<BalanceChangeTb> list);
}