package com.javabom.minilog.service;

import com.javabom.minilog.domain.Article;
import com.javabom.minilog.dto.ArticleData;
import com.javabom.minilog.dto.ArticleObject;

import java.util.List;

public interface ArticleService {
//    public Article findByAuthor(String author);
//    public Article findByAuthorAndCategory(String author, String category);

    // Read
//    List<Article> findAll();
    List<Article> findAllByCategory(String category);
//    Optional<Article> findById(int articleId);

    ArticleData findAll();

    ArticleData findById(int articleId);


    // Create
//    Article create(ArticleData articleDTO);
    ArticleData create(ArticleObject articleObject);

    // Update
    ArticleData update(int articleId, ArticleData<ArticleObject> articleData);

    // Delete
    void delete(int articleId);
}
