package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.GradeTbMapper;
import com.geely.entity.GradeTb;
import com.geely.service.GradeTbService;
@Service
public class GradeTbServiceImpl implements GradeTbService{

    @Resource
    private GradeTbMapper gradeTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerGradeId) {
        return gradeTbMapper.deleteByPrimaryKey(customerGradeId);
    }

    @Override
    public int insert(GradeTb record) {
        return gradeTbMapper.insert(record);
    }

    @Override
    public int insertSelective(GradeTb record) {
        return gradeTbMapper.insertSelective(record);
    }

    @Override
    public GradeTb selectByPrimaryKey(Integer customerGradeId) {
        return gradeTbMapper.selectByPrimaryKey(customerGradeId);
    }

    @Override
    public int updateByPrimaryKeySelective(GradeTb record) {
        return gradeTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GradeTb record) {
        return gradeTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<GradeTb> list) {
        return gradeTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<GradeTb> list) {
        return gradeTbMapper.batchInsert(list);
    }

}
