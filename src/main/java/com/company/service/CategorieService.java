package com.company.service;

import com.company.repository.CategoriesRepository;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

    private final CategoriesRepository categoriesRepository;

    public CategorieService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    public CategoriesRepository getCategoriesRepository() {
        return categoriesRepository;
    }
}
