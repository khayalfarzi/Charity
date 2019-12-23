package com.company.controller;

import com.company.entity.PostsEntity;
import com.company.service.PostService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostsController {

    private final PostService postService;

    public PostsController(PostService postService) {
        this.postService = postService;
    }

    public PostService getPostService() {
        return postService;
    }

    public void insertPosts(PostsEntity entity) {
        postService.insertPost(entity);
    }
}
