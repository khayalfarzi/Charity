package com.company.service;

import com.company.repository.PostsRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostsRepository postsRepository;

    public PostService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    public PostsRepository getPostsRepository() {
        return postsRepository;
    }
}
