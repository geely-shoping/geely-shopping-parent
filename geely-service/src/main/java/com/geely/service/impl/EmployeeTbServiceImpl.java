package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.EmployeeTb;
import com.geely.dao.EmployeeTbMapper;
import com.geely.service.EmployeeTbService;
@Service
public class EmployeeTbServiceImpl implements EmployeeTbService{

    @Resource
    private EmployeeTbMapper employeeTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer employeeId) {
        return employeeTbMapper.deleteByPrimaryKey(employeeId);
    }

    @Override
    public int insert(EmployeeTb record) {
        return employeeTbMapper.insert(record);
    }

    @Override
    public int insertSelective(EmployeeTb record) {
        return employeeTbMapper.insertSelective(record);
    }

    @Override
    public EmployeeTb selectByPrimaryKey(Integer employeeId) {
        return employeeTbMapper.selectByPrimaryKey(employeeId);
    }

    @Override
    public int updateByPrimaryKeySelective(EmployeeTb record) {
        return employeeTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EmployeeTb record) {
        return employeeTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<EmployeeTb> list) {
        return employeeTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<EmployeeTb> list) {
        return employeeTbMapper.batchInsert(list);
    }

    @Override
    public List<EmployeeTb> listEmployeeTbByPage(int pageNum, int pageSize) {
        return employeeTbMapper.listEmployeeTb(pageNum, pageSize);
    }

    @Override
    public int batchDelete(List<Integer> employeeIds) {
        return employeeTbMapper.batchDelete(employeeIds);
    }

}
