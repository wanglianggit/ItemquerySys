package com.ys.dao;

import com.ys.entity.ItemUser;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface ItemUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemUser record);

    int insertSelective(ItemUser record);

    ItemUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemUser record);

    int updateByPrimaryKey(ItemUser record);

    List<ItemUser> selectUserByParams(ItemUser record);
    @MapKey("userId")
    Map selectUserMap();
}