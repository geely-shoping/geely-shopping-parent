package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.DeptTbMapper;
import com.geely.entity.DeptTb;
import com.geely.service.DeptTbService;
@Service
public class DeptTbServiceImpl implements DeptTbService{

    @Resource
    private DeptTbMapper deptTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer deptId) {
        return deptTbMapper.deleteByPrimaryKey(deptId);
    }

    @Override
    public int insert(DeptTb record) {
        return deptTbMapper.insert(record);
    }

    @Override
    public int insertSelective(DeptTb record) {
        return deptTbMapper.insertSelective(record);
    }

    @Override
    public DeptTb selectByPrimaryKey(Integer deptId) {
        return deptTbMapper.selectByPrimaryKey(deptId);
    }

    @Override
    public int updateByPrimaryKeySelective(DeptTb record) {
        return deptTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DeptTb record) {
        return deptTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<DeptTb> list) {
        return deptTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<DeptTb> list) {
        return deptTbMapper.batchInsert(list);
    }

    @Override
    public List<DeptTb> listDeptTbByPage(int pageNum, int pageSize) {
        return deptTbMapper.listDeptTb(pageNum, pageSize);
    }

    @Override
    public int batchDelete(List<Integer> deptIds) {
        return deptTbMapper.batchDelete(deptIds);
    }

}
