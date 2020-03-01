package com.geely.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.entity.AccountDeptTb;
import java.util.List;
import com.geely.dao.AccountDeptTbMapper;
import com.geely.service.AccountDeptTbService;
@Service
public class AccountDeptTbServiceImpl implements AccountDeptTbService{

    @Resource
    private AccountDeptTbMapper accountDeptTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer accountDeptId) {
        return accountDeptTbMapper.deleteByPrimaryKey(accountDeptId);
    }

    @Override
    public int insert(AccountDeptTb record) {
        return accountDeptTbMapper.insert(record);
    }

    @Override
    public int insertSelective(AccountDeptTb record) {
        return accountDeptTbMapper.insertSelective(record);
    }

    @Override
    public AccountDeptTb selectByPrimaryKey(Integer accountDeptId) {
        return accountDeptTbMapper.selectByPrimaryKey(accountDeptId);
    }

    @Override
    public int updateByPrimaryKeySelective(AccountDeptTb record) {
        return accountDeptTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AccountDeptTb record) {
        return accountDeptTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<AccountDeptTb> list) {
        return accountDeptTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<AccountDeptTb> list) {
        return accountDeptTbMapper.batchInsert(list);
    }

}
