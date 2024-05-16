package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.model.User;

public interface UserService {
    Integer registerUser(UserRequest userRequest);
    User authenticateUser(String email, String password);
    User getUserById(Integer userId);
}