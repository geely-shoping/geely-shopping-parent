package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.CommentTbMapper;
import java.util.List;
import com.geely.entity.CommentTb;
import com.geely.service.CommentTbService;
@Service
public class CommentTbServiceImpl implements CommentTbService{

    @Resource
    private CommentTbMapper commentTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer commentId) {
        return commentTbMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public int insert(CommentTb record) {
        return commentTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CommentTb record) {
        return commentTbMapper.insertSelective(record);
    }

    @Override
    public CommentTb selectByPrimaryKey(Integer commentId) {
        return commentTbMapper.selectByPrimaryKey(commentId);
    }

    @Override
    public int updateByPrimaryKeySelective(CommentTb record) {
        return commentTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CommentTb record) {
        return commentTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CommentTb> list) {
        return commentTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CommentTb> list) {
        return commentTbMapper.batchInsert(list);
    }

}
