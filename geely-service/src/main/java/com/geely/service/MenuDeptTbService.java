package com.geely.service;

import java.util.List;
import com.geely.entity.MenuDeptTb;
public interface MenuDeptTbService{


    int deleteByPrimaryKey(Integer menuDeptId);

    int insert(MenuDeptTb record);

    int insertSelective(MenuDeptTb record);

    MenuDeptTb selectByPrimaryKey(Integer menuDeptId);

    int updateByPrimaryKeySelective(MenuDeptTb record);

    int updateByPrimaryKey(MenuDeptTb record);

    int updateBatch(List<MenuDeptTb> list);

    int batchInsert(List<MenuDeptTb> list);

}
