package com.geely.service;

import java.util.List;
import com.geely.entity.CommentTb;
public interface CommentTbService{


    int deleteByPrimaryKey(Integer commentId);

    int insert(CommentTb record);

    int insertSelective(CommentTb record);

    CommentTb selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(CommentTb record);

    int updateByPrimaryKey(CommentTb record);

    int updateBatch(List<CommentTb> list);

    int batchInsert(List<CommentTb> list);

    //分页查询
    List<CommentTb> listCommentTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> commentIds);
}
