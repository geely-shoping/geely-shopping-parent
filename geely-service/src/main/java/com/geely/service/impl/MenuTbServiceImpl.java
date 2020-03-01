package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.MenuTbMapper;
import java.util.List;
import com.geely.entity.MenuTb;
import com.geely.service.MenuTbService;
@Service
public class MenuTbServiceImpl implements MenuTbService{

    @Resource
    private MenuTbMapper menuTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer menuId) {
        return menuTbMapper.deleteByPrimaryKey(menuId);
    }

    @Override
    public int insert(MenuTb record) {
        return menuTbMapper.insert(record);
    }

    @Override
    public int insertSelective(MenuTb record) {
        return menuTbMapper.insertSelective(record);
    }

    @Override
    public MenuTb selectByPrimaryKey(Integer menuId) {
        return menuTbMapper.selectByPrimaryKey(menuId);
    }

    @Override
    public int updateByPrimaryKeySelective(MenuTb record) {
        return menuTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MenuTb record) {
        return menuTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<MenuTb> list) {
        return menuTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<MenuTb> list) {
        return menuTbMapper.batchInsert(list);
    }

}
