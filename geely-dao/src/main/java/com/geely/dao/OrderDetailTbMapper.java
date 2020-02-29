package com.geely.dao;

import com.geely.entity.OrderDetailTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailTbMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OrderDetailTb record);

    int insertSelective(OrderDetailTb record);

    OrderDetailTb selectByPrimaryKey(Integer orderDetailId);

    int updateByPrimaryKeySelective(OrderDetailTb record);

    int updateByPrimaryKey(OrderDetailTb record);

    int updateBatch(List<OrderDetailTb> list);

    int batchInsert(@Param("list") List<OrderDetailTb> list);
}