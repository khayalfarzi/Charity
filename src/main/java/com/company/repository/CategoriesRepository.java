package com.company.repository;

import com.company.entity.CategoriesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends CrudRepository<CategoriesEntity, Integer> {
}
