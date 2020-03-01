package com.geely.dao;

import com.geely.entity.MenuTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 菜单
 */
public interface MenuTbMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(MenuTb record);

    int insertSelective(MenuTb record);

    MenuTb selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(MenuTb record);

    int updateByPrimaryKey(MenuTb record);

    int updateBatch(List<MenuTb> list);

    int batchInsert(@Param("list") List<MenuTb> list);

    //分页查询
    List<MenuTb> listMenuTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}