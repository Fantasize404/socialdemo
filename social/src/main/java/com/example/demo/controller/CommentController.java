package com.example.demo.controller;

import com.example.demo.dto.CommentRequest;
import com.example.demo.model.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public Integer createComment(@RequestBody CommentRequest commentRequest) {
        return commentService.createComment(commentRequest);
    }

    @GetMapping("/post/{postId}")
    public List<Comment> getCommentsByPostId(@PathVariable Integer postId) {
        return commentService.getCommentsByPostId(postId);
    }
}