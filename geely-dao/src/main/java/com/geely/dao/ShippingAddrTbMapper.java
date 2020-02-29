package com.geely.dao;

import com.geely.entity.ShippingAddrTb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingAddrTbMapper {
    int deleteByPrimaryKey(Integer customerAddrId);

    int insert(ShippingAddrTb record);

    int insertSelective(ShippingAddrTb record);

    ShippingAddrTb selectByPrimaryKey(Integer customerAddrId);

    int updateByPrimaryKeySelective(ShippingAddrTb record);

    int updateByPrimaryKey(ShippingAddrTb record);

    int updateBatch(List<ShippingAddrTb> list);

    int batchInsert(@Param("list") List<ShippingAddrTb> list);
}