package com.geely.dao;

import com.geely.entity.CommentTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 评论表
 */
public interface CommentTbMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(CommentTb record);

    int insertSelective(CommentTb record);

    CommentTb selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(CommentTb record);

    int updateByPrimaryKey(CommentTb record);

    int updateBatch(List<CommentTb> list);

    int batchInsert(@Param("list") List<CommentTb> list);

    //分页查询
    List<CommentTb> listCommentTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}