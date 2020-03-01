package com.geely.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.geely.entity.CouponTb;
import com.geely.dao.CouponTbMapper;
import com.geely.service.CouponTbService;
@Service
public class CouponTbServiceImpl implements CouponTbService{

    @Resource
    private CouponTbMapper couponTbMapper;

    @Override
    public int deleteByPrimaryKey(Integer couponId) {
        return couponTbMapper.deleteByPrimaryKey(couponId);
    }

    @Override
    public int insert(CouponTb record) {
        return couponTbMapper.insert(record);
    }

    @Override
    public int insertSelective(CouponTb record) {
        return couponTbMapper.insertSelective(record);
    }

    @Override
    public CouponTb selectByPrimaryKey(Integer couponId) {
        return couponTbMapper.selectByPrimaryKey(couponId);
    }

    @Override
    public int updateByPrimaryKeySelective(CouponTb record) {
        return couponTbMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CouponTb record) {
        return couponTbMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CouponTb> list) {
        return couponTbMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CouponTb> list) {
        return couponTbMapper.batchInsert(list);
    }

    @Override
    public List<CouponTb> listCouponTbByPage(int pageNum, int pageSize) {
        return couponTbMapper.listCouponTb(pageNum, pageSize);
    }

    @Override
    public int batchDelete(List<Integer> couponIds) {
        return couponTbMapper.batchDelete(couponIds);
    }

}
