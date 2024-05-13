package com.Tank.springbootmall.service;

import com.Tank.springbootmall.dto.UserLoginRequest;
import com.Tank.springbootmall.dto.UserRegisterRequest;
import com.Tank.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
