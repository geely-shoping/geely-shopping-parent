package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.OrderMasterDetailTb;
import com.geely.dao.OrderMasterDetailTbMapper;
import com.geely.service.OrderMasterDetailTbService;
@Service
public class OrderMasterDetailTbServiceImpl implements OrderMasterDetailTbService{

    @Resource
    private OrderMasterDetailTbMapper orderMasterDetailTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderMasterDetailId) {
        return orderMasterDetailTbMapper.deleteByPrimaryKey(orderMasterDetailId);
    }

    @Override
    public int insert(OrderMasterDetailTb record) {
        return orderMasterDetailTbMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderMasterDetailTb record) {
        return orderMasterDetailTbMapper.insertSelective(record);
    }

    @Override
    public OrderMasterDetailTb selectByPrimaryKey(Integer orderMasterDetailId) {
        return orderMasterDetailTbMapper.selectByPrimaryKey(orderMasterDetailId);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderMasterDetailTb record) {
        return orderMasterDetailTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderMasterDetailTb record) {
        return orderMasterDetailTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OrderMasterDetailTb> list) {
        return orderMasterDetailTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OrderMasterDetailTb> list) {
        return orderMasterDetailTbMapper.batchInsert(list);
    }

}
