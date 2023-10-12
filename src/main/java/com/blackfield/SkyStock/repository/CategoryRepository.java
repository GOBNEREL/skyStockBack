package com.blackfield.SkyStock.repository;

import com.blackfield.SkyStock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
