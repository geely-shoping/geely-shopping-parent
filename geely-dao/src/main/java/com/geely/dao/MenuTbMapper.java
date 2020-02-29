package com.geely.dao;

import com.geely.entity.MenuTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuTbMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(MenuTb record);

    int insertSelective(MenuTb record);

    MenuTb selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(MenuTb record);

    int updateByPrimaryKey(MenuTb record);

    int updateBatch(List<MenuTb> list);

    int batchInsert(@Param("list") List<MenuTb> list);
}