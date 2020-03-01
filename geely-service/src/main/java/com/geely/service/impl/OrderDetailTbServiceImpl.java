package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.OrderDetailTbMapper;
import com.geely.entity.OrderDetailTb;
import com.geely.service.OrderDetailTbService;
@Service
public class OrderDetailTbServiceImpl implements OrderDetailTbService{

    @Resource
    private OrderDetailTbMapper orderDetailTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderDetailId) {
        return orderDetailTbMapper.deleteByPrimaryKey(orderDetailId);
    }

    @Override
    public int insert(OrderDetailTb record) {
        return orderDetailTbMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderDetailTb record) {
        return orderDetailTbMapper.insertSelective(record);
    }

    @Override
    public OrderDetailTb selectByPrimaryKey(Integer orderDetailId) {
        return orderDetailTbMapper.selectByPrimaryKey(orderDetailId);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderDetailTb record) {
        return orderDetailTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderDetailTb record) {
        return orderDetailTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OrderDetailTb> list) {
        return orderDetailTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OrderDetailTb> list) {
        return orderDetailTbMapper.batchInsert(list);
    }

    @Override
    public List<OrderDetailTb> listOrderDetailTbByPage(int pageNum, int pageSize) {
        return orderDetailTbMapper.listOrderDetailTb(pageNum,pageSize);
    }

    @Override
    public int batchDelete(List<Integer> orderDetailIds) {
        return orderDetailTbMapper.batchDelete(orderDetailIds);
    }

}
