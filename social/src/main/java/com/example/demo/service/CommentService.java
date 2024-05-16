package com.example.demo.service;

import com.example.demo.dto.CommentRequest;
import com.example.demo.model.Comment;

import java.util.List;

public interface CommentService {
    Integer createComment(CommentRequest commentRequest);
    List<Comment> getCommentsByPostId(Integer postId);
}