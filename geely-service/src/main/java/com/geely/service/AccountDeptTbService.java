package com.geely.service;

import com.geely.entity.AccountDeptTb;
import java.util.List;
public interface AccountDeptTbService{


    int deleteByPrimaryKey(Integer accountDeptId);

    int insert(AccountDeptTb record);

    int insertSelective(AccountDeptTb record);

    AccountDeptTb selectByPrimaryKey(Integer accountDeptId);

    int updateByPrimaryKeySelective(AccountDeptTb record);

    int updateByPrimaryKey(AccountDeptTb record);

    int updateBatch(List<AccountDeptTb> list);

    int batchInsert(List<AccountDeptTb> list);

}
