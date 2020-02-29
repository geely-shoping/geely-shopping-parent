package com.geely.dao;

import com.geely.entity.ProdcutModelRelationTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdcutModelRelationTbMapper {
    int deleteByPrimaryKey(Integer proColorId);

    int insert(ProdcutModelRelationTb record);

    int insertSelective(ProdcutModelRelationTb record);

    ProdcutModelRelationTb selectByPrimaryKey(Integer proColorId);

    int updateByPrimaryKeySelective(ProdcutModelRelationTb record);

    int updateByPrimaryKey(ProdcutModelRelationTb record);

    int updateBatch(List<ProdcutModelRelationTb> list);

    int batchInsert(@Param("list") List<ProdcutModelRelationTb> list);
}