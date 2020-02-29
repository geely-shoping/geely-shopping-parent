package com.geely.dao.admin;

import com.geely.entity.admin.MenuDept;

public interface MenuDeptMapper {
    int deleteByPrimaryKey(Integer menuDeptId);

    int insert(MenuDept record);

    int insertSelective(MenuDept record);

    MenuDept selectByPrimaryKey(Integer menuDeptId);

    int updateByPrimaryKeySelective(MenuDept record);

    int updateByPrimaryKey(MenuDept record);
}