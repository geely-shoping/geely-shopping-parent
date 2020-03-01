package com.geely.service;

import java.util.List;
import com.geely.entity.ProdcutModelRelationTb;
public interface ProdcutModelRelationTbService{


    int deleteByPrimaryKey(Integer proColorId);

    int insert(ProdcutModelRelationTb record);

    int insertSelective(ProdcutModelRelationTb record);

    ProdcutModelRelationTb selectByPrimaryKey(Integer proColorId);

    int updateByPrimaryKeySelective(ProdcutModelRelationTb record);

    int updateByPrimaryKey(ProdcutModelRelationTb record);

    int updateBatch(List<ProdcutModelRelationTb> list);

    int batchInsert(List<ProdcutModelRelationTb> list);

}
