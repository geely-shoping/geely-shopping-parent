package com.geely.dao;

import com.geely.entity.MyFootprintTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 我的足迹
 */
public interface MyFootprintTbMapper {
    int deleteByPrimaryKey(Integer footprintId);

    int insert(MyFootprintTb record);

    int insertSelective(MyFootprintTb record);

    MyFootprintTb selectByPrimaryKey(Integer footprintId);

    int updateByPrimaryKeySelective(MyFootprintTb record);

    int updateByPrimaryKey(MyFootprintTb record);

    int updateBatch(List<MyFootprintTb> list);

    int batchInsert(@Param("list") List<MyFootprintTb> list);

    //分页查询
    List<MyFootprintTb> listMyFootprintTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}