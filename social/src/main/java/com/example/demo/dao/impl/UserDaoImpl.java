package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.UserRequest;
import com.example.demo.model.User;
import com.example.demo.rowmapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Integer createUser(UserRequest userRequest) {
        String sql = "INSERT INTO user (user_name, email, password, cover_image, biography) VALUES (:userName, :email, :password, :coverImage, :biography)";
        Map<String, Object> map = new HashMap<>();
        map.put("userName", userRequest.getUserName());
        map.put("email", userRequest.getEmail());
        map.put("password", userRequest.getPassword());
        map.put("coverImage", userRequest.getCoverImage());
        map.put("biography", userRequest.getBiography());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);
        return keyHolder.getKey().intValue();
    }

    @Override
    public User getUserByEmail(String email) {
        String sql = "SELECT * FROM user WHERE email = :email";
        Map<String, Object> map = new HashMap<>();
        map.put("email", email);
        List<User> userList = namedParameterJdbcTemplate.query(sql, map, new UserRowMapper());
        if (userList.size() > 0) {
            return userList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public User getUserById(Integer userId) {
        String sql = "SELECT * FROM user WHERE user_id = :userId";
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        List<User> userList = namedParameterJdbcTemplate.query(sql, map, new UserRowMapper());
        if (userList.size() > 0) {
            return userList.get(0);
        } else {
            return null;
        }
    }
}