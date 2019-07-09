package com.lc.service.impl;

import com.lc.mapper.UserMapper;
import com.lc.pojo.User;
import com.lc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        this.userMapper.insertUser(user);
    }
}
