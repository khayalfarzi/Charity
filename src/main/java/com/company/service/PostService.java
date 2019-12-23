package com.company.service;

import com.company.entity.PostsEntity;
import com.company.repository.PostsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    private final PostsRepository postsRepository;

    public PostService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    public PostsRepository getPostsRepository() {
        return postsRepository;
    }

    public Optional<PostsEntity> findById(Long id) {
        return postsRepository.findById(id);
    }
}
