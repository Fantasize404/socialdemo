package com.example.demo.service.impl;

import com.example.demo.dao.PostDao;
import com.example.demo.dto.PostRequest;
import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;

    @Override
    public Integer createPost(PostRequest postRequest) {
        return postDao.createPost(postRequest);
    }

    @Override
    public List<Post> listAllPosts() {
        return postDao.listAllPosts();
    }

    @Override
    public void updatePost(Integer postId, PostRequest postRequest) {
        postDao.updatePost(postId, postRequest);
    }

    @Override
    public void deletePost(Integer postId) {
        postDao.deletePost(postId);
    }
}