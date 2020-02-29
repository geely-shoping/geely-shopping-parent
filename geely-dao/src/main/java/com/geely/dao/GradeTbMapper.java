package com.geely.dao;

import com.geely.entity.GradeTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeTbMapper {
    int deleteByPrimaryKey(Integer customerGradeId);

    int insert(GradeTb record);

    int insertSelective(GradeTb record);

    GradeTb selectByPrimaryKey(Integer customerGradeId);

    int updateByPrimaryKeySelective(GradeTb record);

    int updateByPrimaryKey(GradeTb record);

    int updateBatch(List<GradeTb> list);

    int batchInsert(@Param("list") List<GradeTb> list);
}