package com.blackfield.SkyStock.repository;

import com.blackfield.SkyStock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
