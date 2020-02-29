package com.geely.dao;

import com.geely.entity.MyFootprintTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyFootprintTbMapper {
    int deleteByPrimaryKey(Integer footprintId);

    int insert(MyFootprintTb record);

    int insertSelective(MyFootprintTb record);

    MyFootprintTb selectByPrimaryKey(Integer footprintId);

    int updateByPrimaryKeySelective(MyFootprintTb record);

    int updateByPrimaryKey(MyFootprintTb record);

    int updateBatch(List<MyFootprintTb> list);

    int batchInsert(@Param("list") List<MyFootprintTb> list);
}