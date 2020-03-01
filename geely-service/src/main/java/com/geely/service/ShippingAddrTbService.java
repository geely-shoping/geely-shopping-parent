package com.geely.service;

import java.util.List;
import com.geely.entity.ShippingAddrTb;
public interface ShippingAddrTbService{


    int deleteByPrimaryKey(Integer customerAddrId);

    int insert(ShippingAddrTb record);

    int insertSelective(ShippingAddrTb record);

    ShippingAddrTb selectByPrimaryKey(Integer customerAddrId);

    int updateByPrimaryKeySelective(ShippingAddrTb record);

    int updateByPrimaryKey(ShippingAddrTb record);

    int updateBatch(List<ShippingAddrTb> list);

    int batchInsert(List<ShippingAddrTb> list);

    //分页查询
    List<ShippingAddrTb> listShippingAddrTbByPage(int pageNum,int pageSize);

    //批量删除
    int batchDelete(List<Integer> customerAddrIds);
}
