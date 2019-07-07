package com.javabom.minilog.controller;

import com.javabom.minilog.dto.ArticleData;
import com.javabom.minilog.dto.ArticleObject;
import com.javabom.minilog.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {
    Logger logger = LoggerFactory.getLogger("com.javabom.minilog.MiniLogApplication");

    @Autowired
    ArticleService articleService;

    @GetMapping(value = "/")
    public ResponseEntity<ArticleData> getAllArticles() {
        ArticleData articleData = articleService.findAll();

        return ResponseEntity.ok().body(articleData);
    }

    @GetMapping(value = "/{articleId}")
    public ResponseEntity<ArticleData> getAricle(@PathVariable(value = "articleId") int articleId) {
        ArticleData articleData = articleService.findById(articleId);

        return ResponseEntity.ok().body(articleData);
    }

    @PostMapping(value = "/")
    public ResponseEntity<ArticleData> save(@RequestBody ArticleData<ArticleObject> articleData) {

        ArticleData entity = articleService.create(articleData.getData());

//        return new ResponseEntity<ArticleData>(entity, HttpStatus.CREATED);
        return ResponseEntity.status(201).body(entity);
    }

    @PutMapping(value = "/{articleId}")
    public ResponseEntity<ArticleData> update(@PathVariable(value = "articleId") int articleId, @RequestBody ArticleData<ArticleObject> changeAttributes) {

        return ResponseEntity.ok().body(articleService.update(articleId, changeAttributes));
    }

    @DeleteMapping(value = "/{articleId}")
    public void delete(@PathVariable(value = "articleId") int articleId) {
        articleService.delete(articleId);
    }

}
