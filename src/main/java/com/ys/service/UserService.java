package com.ys.service;

import com.ys.entity.ItemUser;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<ItemUser> selectUserByParams(ItemUser record) throws Exception;
    Map selectUserMap() throws Exception;
}
