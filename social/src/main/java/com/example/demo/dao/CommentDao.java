package com.example.demo.dao;

import com.example.demo.dto.CommentRequest;
import com.example.demo.model.Comment;

import java.util.List;

public interface CommentDao {
    Integer createComment(CommentRequest commentRequest);
    List<Comment> getCommentsByPostId(Integer postId);
}