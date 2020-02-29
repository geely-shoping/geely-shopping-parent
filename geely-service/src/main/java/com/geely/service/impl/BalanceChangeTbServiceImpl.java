package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.entity.BalanceChangeTb;
import java.util.List;
import com.geely.dao.BalanceChangeTbMapper;
import com.geely.service.BalanceChangeTbService;
@Service
public class BalanceChangeTbServiceImpl implements BalanceChangeTbService{

    @Resource
    private BalanceChangeTbMapper balanceChangeTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer balanceChangeId) {
        return balanceChangeTbMapper.deleteByPrimaryKey(balanceChangeId);
    }

    @Override
    public int insert(BalanceChangeTb record) {
        return balanceChangeTbMapper.insert(record);
    }

    @Override
    public int insertSelective(BalanceChangeTb record) {
        return balanceChangeTbMapper.insertSelective(record);
    }

    @Override
    public BalanceChangeTb selectByPrimaryKey(Integer balanceChangeId) {
        return balanceChangeTbMapper.selectByPrimaryKey(balanceChangeId);
    }

    @Override
    public int updateByPrimaryKeySelective(BalanceChangeTb record) {
        return balanceChangeTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BalanceChangeTb record) {
        return balanceChangeTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<BalanceChangeTb> list) {
        return balanceChangeTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<BalanceChangeTb> list) {
        return balanceChangeTbMapper.batchInsert(list);
    }

}
