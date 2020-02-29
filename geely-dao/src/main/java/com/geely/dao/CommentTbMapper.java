package com.geely.dao;

import com.geely.entity.CommentTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentTbMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(CommentTb record);

    int insertSelective(CommentTb record);

    CommentTb selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(CommentTb record);

    int updateByPrimaryKey(CommentTb record);

    int updateBatch(List<CommentTb> list);

    int batchInsert(@Param("list") List<CommentTb> list);
}