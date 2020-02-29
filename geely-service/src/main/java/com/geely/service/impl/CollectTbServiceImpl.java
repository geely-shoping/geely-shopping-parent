package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.CollectTb;
import com.geely.dao.CollectTbMapper;
import com.geely.service.CollectTbService;
@Service
public class CollectTbServiceImpl implements CollectTbService{

    @Resource
    private CollectTbMapper collectTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer collectId) {
        return collectTbMapper.deleteByPrimaryKey(collectId);
    }

    @Override
    public int insert(CollectTb record) {
        return collectTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CollectTb record) {
        return collectTbMapper.insertSelective(record);
    }

    @Override
    public CollectTb selectByPrimaryKey(Integer collectId) {
        return collectTbMapper.selectByPrimaryKey(collectId);
    }

    @Override
    public int updateByPrimaryKeySelective(CollectTb record) {
        return collectTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CollectTb record) {
        return collectTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CollectTb> list) {
        return collectTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CollectTb> list) {
        return collectTbMapper.batchInsert(list);
    }

}
