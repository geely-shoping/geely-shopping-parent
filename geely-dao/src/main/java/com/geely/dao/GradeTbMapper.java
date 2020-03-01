package com.geely.dao;

import com.geely.entity.GradeTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户等级dao
 */
public interface GradeTbMapper {
    int deleteByPrimaryKey(Integer customerGradeId);

    int insert(GradeTb record);

    int insertSelective(GradeTb record);

    GradeTb selectByPrimaryKey(Integer customerGradeId);

    int updateByPrimaryKeySelective(GradeTb record);

    int updateByPrimaryKey(GradeTb record);

    int updateBatch(List<GradeTb> list);

    int batchInsert(@Param("list") List<GradeTb> list);

    //分页查询
    List<GradeTb> listGradeTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}