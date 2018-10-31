package com.ys.dao;

import com.ys.entity.CityPrice;

public interface CityPriceMapper {
    int deleteByPrimaryKey(Long fid);

    int insert(CityPrice record);

    int insertSelective(CityPrice record);

    CityPrice selectByPrimaryKey(Long fid);

    int updateByPrimaryKeySelective(CityPrice record);

    int updateByPrimaryKey(CityPrice record);
}