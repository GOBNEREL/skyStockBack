package com.blackfield.SkyStock.service;

import com.blackfield.SkyStock.model.Article;
import com.blackfield.SkyStock.model.Category;
import com.blackfield.SkyStock.repository.ArticleRepository;
import com.blackfield.SkyStock.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {

        categoryRepository.deleteById(id);
    }
}
