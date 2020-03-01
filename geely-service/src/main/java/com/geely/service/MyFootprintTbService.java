package com.geely.service;

import java.util.List;
import com.geely.entity.MyFootprintTb;
public interface MyFootprintTbService{


    int deleteByPrimaryKey(Integer footprintId);

    int insert(MyFootprintTb record);

    int insertSelective(MyFootprintTb record);

    MyFootprintTb selectByPrimaryKey(Integer footprintId);

    int updateByPrimaryKeySelective(MyFootprintTb record);

    int updateByPrimaryKey(MyFootprintTb record);

    int updateBatch(List<MyFootprintTb> list);

    int batchInsert(List<MyFootprintTb> list);

}
