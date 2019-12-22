package com.company.controller;

import com.company.service.CategorieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/category")
public class CategoriesController {

    private final CategorieService categorieService;

    public CategoriesController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    public CategorieService getCategorieService() {
        return categorieService;
    }
}
