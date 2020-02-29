package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.OrderMasterTbMapper;
import java.util.List;
import com.geely.entity.OrderMasterTb;
import com.geely.service.OrderMasterTbService;
@Service
public class OrderMasterTbServiceImpl implements OrderMasterTbService{

    @Resource
    private OrderMasterTbMapper orderMasterTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return orderMasterTbMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insert(OrderMasterTb record) {
        return orderMasterTbMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderMasterTb record) {
        return orderMasterTbMapper.insertSelective(record);
    }

    @Override
    public OrderMasterTb selectByPrimaryKey(Integer orderId) {
        return orderMasterTbMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderMasterTb record) {
        return orderMasterTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderMasterTb record) {
        return orderMasterTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OrderMasterTb> list) {
        return orderMasterTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OrderMasterTb> list) {
        return orderMasterTbMapper.batchInsert(list);
    }

}
