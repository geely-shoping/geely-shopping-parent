package com.geely.service;

import java.util.List;
import com.geely.entity.DeptTb;
public interface DeptTbService{


    int deleteByPrimaryKey(Integer deptId);

    int insert(DeptTb record);

    int insertSelective(DeptTb record);

    DeptTb selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(DeptTb record);

    int updateByPrimaryKey(DeptTb record);

    int updateBatch(List<DeptTb> list);

    int batchInsert(List<DeptTb> list);

}
