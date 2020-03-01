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

    //分页查询
    List<MenuTb> listMenuTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> menuIds);
}
