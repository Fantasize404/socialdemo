package com.example.demo.controller;

import com.example.demo.dto.PostRequest;
import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public Integer createPost(@RequestBody PostRequest postRequest) {
        return postService.createPost(postRequest);
    }

    @GetMapping
    public List<Post> listAllPosts() {
        return postService.listAllPosts();
    }

    @PutMapping("/{postId}")
    public void updatePost(@PathVariable Integer postId, @RequestBody PostRequest postRequest) {
        postService.updatePost(postId, postRequest);
    }

    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable Integer postId) {
        postService.deletePost(postId);
    }
}