package com.company.service;

import com.company.entity.CategoriesEntity;
import com.company.repository.CategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategorieService {

    private final CategoriesRepository categoriesRepository;

    public CategorieService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    public CategoriesRepository getCategoriesRepository() {
        return categoriesRepository;
    }

    public Optional<CategoriesEntity> findById(int id) {
        return categoriesRepository.findById(id);
    }
}
