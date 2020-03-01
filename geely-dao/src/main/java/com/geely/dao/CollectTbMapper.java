package com.geely.dao;

import com.geely.entity.CollectTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 收藏表
 */
public interface CollectTbMapper {
    int deleteByPrimaryKey(Integer collectId);

    int insert(CollectTb record);

    int insertSelective(CollectTb record);

    CollectTb selectByPrimaryKey(Integer collectId);

    int updateByPrimaryKeySelective(CollectTb record);

    int updateByPrimaryKey(CollectTb record);

    int updateBatch(List<CollectTb> list);

    int batchInsert(@Param("list") List<CollectTb> list);

    //分页查询
    List<CollectTb> listByCollectTb(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //批量删除
    int batchDelete(List<Integer> list);
}