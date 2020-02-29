package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.geely.dao.MenuDeptTbMapper;
import java.util.List;
import com.geely.entity.MenuDeptTb;
import com.geely.service.MenuDeptTbService;
@Service
public class MenuDeptTbServiceImpl implements MenuDeptTbService{

    @Resource
    private MenuDeptTbMapper menuDeptTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer menuDeptId) {
        return menuDeptTbMapper.deleteByPrimaryKey(menuDeptId);
    }

    @Override
    public int insert(MenuDeptTb record) {
        return menuDeptTbMapper.insert(record);
    }

    @Override
    public int insertSelective(MenuDeptTb record) {
        return menuDeptTbMapper.insertSelective(record);
    }

    @Override
    public MenuDeptTb selectByPrimaryKey(Integer menuDeptId) {
        return menuDeptTbMapper.selectByPrimaryKey(menuDeptId);
    }

    @Override
    public int updateByPrimaryKeySelective(MenuDeptTb record) {
        return menuDeptTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MenuDeptTb record) {
        return menuDeptTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<MenuDeptTb> list) {
        return menuDeptTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<MenuDeptTb> list) {
        return menuDeptTbMapper.batchInsert(list);
    }

}
