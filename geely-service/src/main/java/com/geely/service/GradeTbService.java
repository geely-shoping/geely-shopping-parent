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

    //分页查询
    List<GradeTb> listGradeTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> customerGradeIds);
}
