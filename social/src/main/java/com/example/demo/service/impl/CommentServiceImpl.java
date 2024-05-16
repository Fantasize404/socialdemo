package com.example.demo.service.impl;

import com.example.demo.dao.CommentDao;
import com.example.demo.dto.CommentRequest;
import com.example.demo.model.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public Integer createComment(CommentRequest commentRequest) {
        return commentDao.createComment(commentRequest);
    }

    @Override
    public List<Comment> getCommentsByPostId(Integer postId) {
        return commentDao.getCommentsByPostId(postId);
    }
}