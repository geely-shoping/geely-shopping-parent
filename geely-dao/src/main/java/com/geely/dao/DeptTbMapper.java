package com.geely.dao;

import com.geely.entity.DeptTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptTbMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(DeptTb record);

    int insertSelective(DeptTb record);

    DeptTb selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(DeptTb record);

    int updateByPrimaryKey(DeptTb record);

    int updateBatch(List<DeptTb> list);

    int batchInsert(@Param("list") List<DeptTb> list);
}