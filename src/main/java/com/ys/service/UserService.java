package com.ys.service;

import com.ys.entity.ItemUser;

import java.util.List;

public interface UserService {
    List<ItemUser> selectUserByParams(ItemUser record) throws Exception;
}
