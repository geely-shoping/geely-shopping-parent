package com.geely.dao;

import com.geely.entity.AccountDeptTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountDeptTbMapper {
    int deleteByPrimaryKey(Integer accountDeptId);

    int insert(AccountDeptTb record);

    int insertSelective(AccountDeptTb record);

    AccountDeptTb selectByPrimaryKey(Integer accountDeptId);

    int updateByPrimaryKeySelective(AccountDeptTb record);

    int updateByPrimaryKey(AccountDeptTb record);

    int updateBatch(List<AccountDeptTb> list);

    int batchInsert(@Param("list") List<AccountDeptTb> list);
}