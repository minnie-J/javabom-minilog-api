package com.javabom.minilog.controller;

import com.javabom.minilog.domain.Article;
import com.javabom.minilog.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    Logger logger = LoggerFactory.getLogger("com.javabom.minilog.controller");

    @Autowired
    ArticleService articleService;

    @GetMapping(value = "/api/v1/articles")
    // @GetMapping ==> @RequestMapping(method = RequestMethod.GET)의 축약
    public ResponseEntity<List<Article>> getAllArticles() {
        logger.info("getAllAricles");
        List<Article> articles = articleService.findAll();
        ResponseEntity<List<Article>> articlesEntity = new ResponseEntity<List<Article>>(articles, HttpStatus.OK);
        return articlesEntity;
    }

    @PostMapping(value = "/api/v1/articles")
    public ResponseEntity<Article> save(@RequestBody Article article) {
        Article newArticle = articleService.create(article);
        ResponseEntity<Article> articleEntity = new ResponseEntity<Article>(newArticle, HttpStatus.OK);
        return articleEntity;
    }

}
