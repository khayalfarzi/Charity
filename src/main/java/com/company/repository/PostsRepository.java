package com.company.repository;

import com.company.entity.PostsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends CrudRepository<PostsEntity, Long> {
}
