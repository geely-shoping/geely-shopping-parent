package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.EmployeeAccountRelationTb;
import com.geely.dao.EmployeeAccountRelationTbMapper;
import com.geely.service.EmployeeAccountRelationTbService;
@Service
public class EmployeeAccountRelationTbServiceImpl implements EmployeeAccountRelationTbService{

    @Resource
    private EmployeeAccountRelationTbMapper employeeAccountRelationTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer empAccountId) {
        return employeeAccountRelationTbMapper.deleteByPrimaryKey(empAccountId);
    }

    @Override
    public int insert(EmployeeAccountRelationTb record) {
        return employeeAccountRelationTbMapper.insert(record);
    }

    @Override
    public int insertSelective(EmployeeAccountRelationTb record) {
        return employeeAccountRelationTbMapper.insertSelective(record);
    }

    @Override
    public EmployeeAccountRelationTb selectByPrimaryKey(Integer empAccountId) {
        return employeeAccountRelationTbMapper.selectByPrimaryKey(empAccountId);
    }

    @Override
    public int updateByPrimaryKeySelective(EmployeeAccountRelationTb record) {
        return employeeAccountRelationTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EmployeeAccountRelationTb record) {
        return employeeAccountRelationTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<EmployeeAccountRelationTb> list) {
        return employeeAccountRelationTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<EmployeeAccountRelationTb> list) {
        return employeeAccountRelationTbMapper.batchInsert(list);
    }

}
