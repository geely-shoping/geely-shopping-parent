package com.geely.dao;

import com.geely.entity.OrderMasterDetailTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMasterDetailTbMapper {
    int deleteByPrimaryKey(Integer orderMasterDetailId);

    int insert(OrderMasterDetailTb record);

    int insertSelective(OrderMasterDetailTb record);

    OrderMasterDetailTb selectByPrimaryKey(Integer orderMasterDetailId);

    int updateByPrimaryKeySelective(OrderMasterDetailTb record);

    int updateByPrimaryKey(OrderMasterDetailTb record);

    int updateBatch(List<OrderMasterDetailTb> list);

    int batchInsert(@Param("list") List<OrderMasterDetailTb> list);
}