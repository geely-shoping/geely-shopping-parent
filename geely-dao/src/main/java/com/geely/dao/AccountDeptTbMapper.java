package com.geely.dao;

import com.geely.entity.AccountDeptTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 账号部门关联
 */
public interface AccountDeptTbMapper {
    //根据主键删除
    int deleteByPrimaryKey(Integer accountDeptId);
    //添加
    int insert(AccountDeptTb record);
    //添加信息，参数是可选的，不完整信息也可以
    int insertSelective(AccountDeptTb record);
    //根据主键查询
    AccountDeptTb selectByPrimaryKey(Integer accountDeptId);
    //根据主键修改（可以不是完整的参数，例如只修改一个名字，但性别不修改）
    int updateByPrimaryKeySelective(AccountDeptTb record);
    //根据主键修改，必须是完整的参数。
    int updateByPrimaryKey(AccountDeptTb record);
    //批量修改（参数完整）
    int updateBatch(List<AccountDeptTb> list);
    //批量添加（参数完整）
    int batchInsert(@Param("list") List<AccountDeptTb> list);
}