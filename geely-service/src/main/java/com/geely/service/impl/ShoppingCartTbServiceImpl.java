package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.dao.ShoppingCartTbMapper;
import com.geely.entity.ShoppingCartTb;
import com.geely.service.ShoppingCartTbService;
@Service
public class ShoppingCartTbServiceImpl implements ShoppingCartTbService{

    @Resource
    private ShoppingCartTbMapper shoppingCartTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer shoppingCartId) {
        return shoppingCartTbMapper.deleteByPrimaryKey(shoppingCartId);
    }

    @Override
    public int insert(ShoppingCartTb record) {
        return shoppingCartTbMapper.insert(record);
    }

    @Override
    public int insertSelective(ShoppingCartTb record) {
        return shoppingCartTbMapper.insertSelective(record);
    }

    @Override
    public ShoppingCartTb selectByPrimaryKey(Integer shoppingCartId) {
        return shoppingCartTbMapper.selectByPrimaryKey(shoppingCartId);
    }

    @Override
    public int updateByPrimaryKeySelective(ShoppingCartTb record) {
        return shoppingCartTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShoppingCartTb record) {
        return shoppingCartTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ShoppingCartTb> list) {
        return shoppingCartTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ShoppingCartTb> list) {
        return shoppingCartTbMapper.batchInsert(list);
    }

    @Override
    public List<ShoppingCartTb> listShoppingCartTbByPage(int pageNum, int pageSize) {
        return shoppingCartTbMapper.listShoppingCartTb(pageNum, pageSize);
    }

    @Override
    public int batchDelete(List<Integer> shoppingCartIds) {
        return shoppingCartTbMapper.batchDelete(shoppingCartIds);
    }

}
