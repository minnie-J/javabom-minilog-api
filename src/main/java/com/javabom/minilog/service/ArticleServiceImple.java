package com.javabom.minilog.service;

import com.javabom.minilog.domain.Article;
import com.javabom.minilog.persistence.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImple implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public List<Article> findAllByCategory(String category) {
        return articleRepository.findAllByCategory(category);
    }

    @Override
    // Optional - Java 8부터 들어간 기능. NullPointException 방지
    public Optional<Article> findById(int articleId) {
        return articleRepository.findById(articleId);
    }

    @Override
    public Article create(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public void update(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void delete(int articleId) {
        articleRepository.deleteById(articleId);
    }
}
