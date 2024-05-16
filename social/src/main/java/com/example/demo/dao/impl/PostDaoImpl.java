package com.example.demo.dao.impl;

import com.example.demo.dao.PostDao;
import com.example.demo.dto.PostRequest;
import com.example.demo.model.Post;
import com.example.demo.rowmapper.PostRowMapper;
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
public class PostDaoImpl implements PostDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Integer createPost(PostRequest postRequest) {
        String sql = "INSERT INTO post (user_id, content, image) VALUES (:userId, :content, :image)";
        Map<String, Object> map = new HashMap<>();
        map.put("userId", postRequest.getUserId());
        map.put("content", postRequest.getContent());
        map.put("image", postRequest.getImage());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);
        return keyHolder.getKey().intValue();
    }

    @Override
    public List<Post> listAllPosts() {
        String sql = "SELECT * FROM post";
        return namedParameterJdbcTemplate.query(sql, new PostRowMapper());
    }

    @Override
    public void updatePost(Integer postId, PostRequest postRequest) {
        String sql = "UPDATE post SET content = :content, image = :image WHERE post_id = :postId";
        Map<String, Object> map = new HashMap<>();
        map.put("postId", postId);
        map.put("content", postRequest.getContent());
        map.put("image", postRequest.getImage());
        namedParameterJdbcTemplate.update(sql, map);
    }

    @Override
    public void deletePost(Integer postId) {
        String sql = "DELETE FROM post WHERE post_id = :postId";
        Map<String, Object> map = new HashMap<>();
        map.put("postId", postId);
        namedParameterJdbcTemplate.update(sql, map);
    }
}