package com.geely.service;

import com.geely.entity.BalanceChangeTb;
import java.util.List;
public interface BalanceChangeTbService{


    int deleteByPrimaryKey(Integer balanceChangeId);

    int insert(BalanceChangeTb record);

    int insertSelective(BalanceChangeTb record);

    BalanceChangeTb selectByPrimaryKey(Integer balanceChangeId);

    int updateByPrimaryKeySelective(BalanceChangeTb record);

    int updateByPrimaryKey(BalanceChangeTb record);

    int updateBatch(List<BalanceChangeTb> list);

    int batchInsert(List<BalanceChangeTb> list);

    //分页查询
    List<BalanceChangeTb> listBalanceChangeTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> balanceChangeIds);

}
