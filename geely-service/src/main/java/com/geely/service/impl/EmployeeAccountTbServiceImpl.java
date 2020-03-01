package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.EmployeeAccountTbMapper;
import com.geely.entity.EmployeeAccountTb;
import com.geely.service.EmployeeAccountTbService;
@Service
public class EmployeeAccountTbServiceImpl implements EmployeeAccountTbService{

    @Resource
    private EmployeeAccountTbMapper employeeAccountTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer accountId) {
        return employeeAccountTbMapper.deleteByPrimaryKey(accountId);
    }

    @Override
    public int insert(EmployeeAccountTb record) {
        return employeeAccountTbMapper.insert(record);
    }

    @Override
    public int insertSelective(EmployeeAccountTb record) {
        return employeeAccountTbMapper.insertSelective(record);
    }

    @Override
    public EmployeeAccountTb selectByPrimaryKey(Integer accountId) {
        return employeeAccountTbMapper.selectByPrimaryKey(accountId);
    }

    @Override
    public int updateByPrimaryKeySelective(EmployeeAccountTb record) {
        return employeeAccountTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EmployeeAccountTb record) {
        return employeeAccountTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<EmployeeAccountTb> list) {
        return employeeAccountTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<EmployeeAccountTb> list) {
        return employeeAccountTbMapper.batchInsert(list);
    }

}
