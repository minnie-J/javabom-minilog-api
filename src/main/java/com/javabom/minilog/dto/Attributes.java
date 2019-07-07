package com.javabom.minilog.dto;

import com.javabom.minilog.domain.Article;

import java.time.LocalDateTime;

public class Attributes {

    private String title;
    private String content;
//    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime regdate;

    public Attributes() {}

    public Attributes fromArticle(Article article) {
        Attributes attributes = new Attributes();
        attributes.setTitle(article.getTitle());
        attributes.setContent(article.getContent());
        attributes.setRegdate(article.getRegdate());

        return attributes;
    }

    public void toArticle(Attributes attributes) {
        Article article = new Article();
        article.setTitle(attributes.getTitle());
        article.setContent(attributes.getContent());
        article.setRegdate(LocalDateTime.now());
    }

//    public Attributes(String title, String content, LocalDateTime regdate) {
//        this.title = title;
//        this.content = content;
//        this.regdate = regdate;
//    }
//
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDateTime regdate) {
        this.regdate = regdate;
    }
}
