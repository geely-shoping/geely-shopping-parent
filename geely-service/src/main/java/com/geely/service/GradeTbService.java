package com.geely.service;

import java.util.List;
import com.geely.entity.GradeTb;
public interface GradeTbService{


    int deleteByPrimaryKey(Integer customerGradeId);

    int insert(GradeTb record);

    int insertSelective(GradeTb record);

    GradeTb selectByPrimaryKey(Integer customerGradeId);

    int updateByPrimaryKeySelective(GradeTb record);

    int updateByPrimaryKey(GradeTb record);

    int updateBatch(List<GradeTb> list);

    int batchInsert(List<GradeTb> list);

}
