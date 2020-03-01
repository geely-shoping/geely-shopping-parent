package com.geely.dao;

import com.geely.entity.MenuDeptTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuDeptTbMapper {
    int deleteByPrimaryKey(Integer menuDeptId);

    int insert(MenuDeptTb record);

    int insertSelective(MenuDeptTb record);

    MenuDeptTb selectByPrimaryKey(Integer menuDeptId);

    int updateByPrimaryKeySelective(MenuDeptTb record);

    int updateByPrimaryKey(MenuDeptTb record);

    int updateBatch(List<MenuDeptTb> list);

    int batchInsert(@Param("list") List<MenuDeptTb> list);
}