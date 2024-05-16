package com.example.demo.dao;

import com.example.demo.dto.UserRequest;
import com.example.demo.model.User;

public interface UserDao {
    Integer createUser(UserRequest userRequest);
    User getUserByEmail(String email);
    User getUserById(Integer userId);
}