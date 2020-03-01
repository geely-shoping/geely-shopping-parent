package com.geely.dao;

import com.geely.entity.AccountInfoTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 账号信息关联
 */
public interface AccountInfoTbMapper {
    int deleteByPrimaryKey(Integer accountInfoId);

    int insert(AccountInfoTb record);

    int insertSelective(AccountInfoTb record);

    AccountInfoTb selectByPrimaryKey(Integer accountInfoId);

    int updateByPrimaryKeySelective(AccountInfoTb record);

    int updateByPrimaryKey(AccountInfoTb record);

    int updateBatch(List<AccountInfoTb> list);

    int batchInsert(@Param("list") List<AccountInfoTb> list);

}