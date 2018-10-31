package com.ys.service.impl;

import com.ys.dao.CityPriceMapper;
import com.ys.entity.CityPrice;
import com.ys.service.CityPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityPriceServiceImpl implements CityPriceService {
    @Autowired
    private CityPriceMapper cityPriceMapper;
    @Override
    public void insertSelective(CityPrice vo) {
        cityPriceMapper.insertSelective(vo);
    }
}
