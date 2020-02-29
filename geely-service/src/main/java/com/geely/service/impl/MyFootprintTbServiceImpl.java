package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.MyFootprintTbMapper;
import java.util.List;
import com.geely.entity.MyFootprintTb;
import com.geely.service.MyFootprintTbService;
@Service
public class MyFootprintTbServiceImpl implements MyFootprintTbService{

    @Resource
    private MyFootprintTbMapper myFootprintTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer footprintId) {
        return myFootprintTbMapper.deleteByPrimaryKey(footprintId);
    }

    @Override
    public int insert(MyFootprintTb record) {
        return myFootprintTbMapper.insert(record);
    }

    @Override
    public int insertSelective(MyFootprintTb record) {
        return myFootprintTbMapper.insertSelective(record);
    }

    @Override
    public MyFootprintTb selectByPrimaryKey(Integer footprintId) {
        return myFootprintTbMapper.selectByPrimaryKey(footprintId);
    }

    @Override
    public int updateByPrimaryKeySelective(MyFootprintTb record) {
        return myFootprintTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MyFootprintTb record) {
        return myFootprintTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<MyFootprintTb> list) {
        return myFootprintTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<MyFootprintTb> list) {
        return myFootprintTbMapper.batchInsert(list);
    }

}
