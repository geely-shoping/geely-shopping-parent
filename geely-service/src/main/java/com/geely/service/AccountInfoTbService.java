package com.geely.service;

import java.util.List;
import com.geely.entity.AccountInfoTb;
public interface AccountInfoTbService{


    int deleteByPrimaryKey(Integer accountInfoId);

    int insert(AccountInfoTb record);

    int insertSelective(AccountInfoTb record);

    AccountInfoTb selectByPrimaryKey(Integer accountInfoId);

    int updateByPrimaryKeySelective(AccountInfoTb record);

    int updateByPrimaryKey(AccountInfoTb record);

    int updateBatch(List<AccountInfoTb> list);

    int batchInsert(List<AccountInfoTb> list);

}
