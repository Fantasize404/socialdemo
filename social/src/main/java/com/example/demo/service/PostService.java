package com.example.demo.service;

import com.example.demo.dto.PostRequest;
import com.example.demo.model.Post;

import java.util.List;

public interface PostService {
    Integer createPost(PostRequest postRequest);
    List<Post> listAllPosts();
    void updatePost(Integer postId, PostRequest postRequest);
    void deletePost(Integer postId);
}