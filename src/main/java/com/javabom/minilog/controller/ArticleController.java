package com.javabom.minilog.controller;

import com.javabom.minilog.domain.Article;
import com.javabom.minilog.domain.JSONResponse;
import com.javabom.minilog.domain.ResponseWrapper;
import com.javabom.minilog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping(value = "/api/v1/articles")
    // @GetMapping ==> @RequestMapping(method = RequestMethod.GET)의 축약
    public ResponseEntity<ResponseWrapper> getAllArticles() {
        List<Article> articles = articleService.findAll();

        List<JSONResponse> jsonResponses = new ArrayList<JSONResponse>();
        for (Article article : articles) {
            JSONResponse jsonResponse = new JSONResponse();
            Map<Object, Object> attribute = new HashMap<Object, Object>();
            Map<Object, Object> links = new HashMap<Object, Object>();
            jsonResponse.setType("articles");
                jsonResponse.setId(article.getId());
                attribute.put("title", article.getTitle());
                attribute.put("content", article.getContent());
                jsonResponse.setAttributes(attribute);
                links.put("self", "/api/vi/article/" + article.getId());
                jsonResponse.setLinks(links);

                jsonResponses.add(jsonResponse);
            }

        ResponseWrapper responseWrapper = new ResponseWrapper(jsonResponses);
        ResponseEntity<ResponseWrapper> articlesEntity = new ResponseEntity<ResponseWrapper>(responseWrapper, HttpStatus.OK);
        return articlesEntity;
    }

    @PostMapping(value = "/api/v1/articles")
    public ResponseEntity<Article> save(Article article) {
        Article newArticle = articleService.create(article);
        ResponseEntity<Article> articleEntity = new ResponseEntity<Article>(newArticle, HttpStatus.OK);
        return articleEntity;
    }

}
