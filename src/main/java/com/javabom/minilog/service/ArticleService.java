package com.javabom.minilog.service;

import com.javabom.minilog.domain.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
//    public Article findByAuthor(String author);
//    public Article findByAuthorAndCategory(String author, String category);

    // Read
    List<Article> findAll();
    List<Article> findAllByCategory(String category);
    Optional<Article> findById(int articleId);

    // Create
    Article create(Article article);

    // Update
    void update(Article article);

    // Delete
    void delete(int articleId);
}
