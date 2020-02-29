package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.AccountInfoTbMapper;
import java.util.List;
import com.geely.entity.AccountInfoTb;
import com.geely.service.AccountInfoTbService;
@Service
public class AccountInfoTbServiceImpl implements AccountInfoTbService{

    @Resource
    private AccountInfoTbMapper accountInfoTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer accountInfoId) {
        return accountInfoTbMapper.deleteByPrimaryKey(accountInfoId);
    }

    @Override
    public int insert(AccountInfoTb record) {
        return accountInfoTbMapper.insert(record);
    }

    @Override
    public int insertSelective(AccountInfoTb record) {
        return accountInfoTbMapper.insertSelective(record);
    }

    @Override
    public AccountInfoTb selectByPrimaryKey(Integer accountInfoId) {
        return accountInfoTbMapper.selectByPrimaryKey(accountInfoId);
    }

    @Override
    public int updateByPrimaryKeySelective(AccountInfoTb record) {
        return accountInfoTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AccountInfoTb record) {
        return accountInfoTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<AccountInfoTb> list) {
        return accountInfoTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<AccountInfoTb> list) {
        return accountInfoTbMapper.batchInsert(list);
    }

}
