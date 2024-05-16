package com.example.demo.dao.impl;

import com.example.demo.dao.CommentDao;
import com.example.demo.dto.CommentRequest;
import com.example.demo.model.Comment;
import com.example.demo.rowmapper.CommentRowMapper;
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
public class CommentDaoImpl implements CommentDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Integer createComment(CommentRequest commentRequest) {
        String sql = "INSERT INTO comment (user_id, post_id, content) VALUES (:userId, :postId, :content)";
        Map<String, Object> map = new HashMap<>();
        map.put("userId", commentRequest.getUserId());
        map.put("postId", commentRequest.getPostId());
        map.put("content", commentRequest.getContent());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);
        return keyHolder.getKey().intValue();
    }

    @Override
    public List<Comment> getCommentsByPostId(Integer postId) {
        String sql = "SELECT * FROM comment WHERE post_id = :postId";
        Map<String, Object> map = new HashMap<>();
        map.put("postId", postId);
        return namedParameterJdbcTemplate.query(sql, map, new CommentRowMapper());
    }
}