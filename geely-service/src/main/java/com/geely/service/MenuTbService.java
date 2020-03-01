package com.geely.service;

import java.util.List;
import com.geely.entity.MenuTb;
public interface MenuTbService{


    int deleteByPrimaryKey(Integer menuId);

    int insert(MenuTb record);

    int insertSelective(MenuTb record);

    MenuTb selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(MenuTb record);

    int updateByPrimaryKey(MenuTb record);

    int updateBatch(List<MenuTb> list);

    int batchInsert(List<MenuTb> list);

}
