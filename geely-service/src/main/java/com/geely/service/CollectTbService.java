package com.geely.service;

import java.util.List;
import com.geely.entity.CollectTb;
public interface CollectTbService{


    int deleteByPrimaryKey(Integer collectId);

    int insert(CollectTb record);

    int insertSelective(CollectTb record);

    CollectTb selectByPrimaryKey(Integer collectId);

    int updateByPrimaryKeySelective(CollectTb record);

    int updateByPrimaryKey(CollectTb record);

    int updateBatch(List<CollectTb> list);

    int batchInsert(List<CollectTb> list);

}
