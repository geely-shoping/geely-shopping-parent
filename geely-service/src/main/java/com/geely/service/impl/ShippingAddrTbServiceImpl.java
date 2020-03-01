package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.ShippingAddrTb;
import com.geely.dao.ShippingAddrTbMapper;
import com.geely.service.ShippingAddrTbService;
@Service
public class ShippingAddrTbServiceImpl implements ShippingAddrTbService{

    @Resource
    private ShippingAddrTbMapper shippingAddrTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerAddrId) {
        return shippingAddrTbMapper.deleteByPrimaryKey(customerAddrId);
    }

    @Override
    public int insert(ShippingAddrTb record) {
        return shippingAddrTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ShippingAddrTb record) {
        return shippingAddrTbMapper.insertSelective(record);
    }

    @Override
    public ShippingAddrTb selectByPrimaryKey(Integer customerAddrId) {
        return shippingAddrTbMapper.selectByPrimaryKey(customerAddrId);
    }

    @Override
    public int updateByPrimaryKeySelective(ShippingAddrTb record) {
        return shippingAddrTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShippingAddrTb record) {
        return shippingAddrTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ShippingAddrTb> list) {
        return shippingAddrTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ShippingAddrTb> list) {
        return shippingAddrTbMapper.batchInsert(list);
    }

    @Override
    public List<ShippingAddrTb> listShippingAddrTbByPage(int pageNum, int pageSize) {
        return shippingAddrTbMapper.listShippingAddrTb(pageNum, pageSize);
    }

    @Override
    public int batchDelete(List<Integer> customerAddrIds) {
        return shippingAddrTbMapper.batchDelete(customerAddrIds);
    }

}
