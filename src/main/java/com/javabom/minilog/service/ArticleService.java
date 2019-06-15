package com.javabom.minilog.service;

import com.javabom.minilog.domain.Article;

import java.util.List;

public interface ArticleService {
    Article findByAuthor(String author);
    Article findByAuthorAndCategory(String author, String category);
    Article save(Article article);
    Article delete(int ano);
}
