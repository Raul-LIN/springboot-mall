package com.Tank.springbootmall.dao;

import com.Tank.springbootmall.dto.UserRegisterRequest;
import com.Tank.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
