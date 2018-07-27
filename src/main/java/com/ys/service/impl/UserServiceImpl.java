package com.ys.service.impl;

import com.ys.dao.ItemUserMapper;
import com.ys.entity.ItemUser;
import com.ys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private ItemUserMapper itemUserMapper;
    @Override
    public List<ItemUser> selectUserByParams(ItemUser record) throws Exception {
        return itemUserMapper.selectUserByParams(record);
    }
}
