package com.Tank.springbootmall.service.impl;

import com.Tank.springbootmall.dao.UserDao;
import com.Tank.springbootmall.dto.UserRegisterRequest;
import com.Tank.springbootmall.model.User;
import com.Tank.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
