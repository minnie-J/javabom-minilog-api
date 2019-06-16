package com.javabom.minilog.domain;

import javax.persistence.*;
import java.util.Date;

@Entity // (=Model)
@Table(name="articles") // table name
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment DB에 위임
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ano")
    private int articleId;

    private String title;
    private String content;
    private String symbol;

    @Temporal(TemporalType.TIMESTAMP)
    private Date regdate;

    @Column(name = "class")
    private String category;

    private String subclass;
    private double stars;
    private String reldate;
    private String relplace;
    private String relperson;
    private String tags;
    private int author;

//    @ManyToOne
//    @JoinColumn(name = "mno")
//    private Member member;

    public Article() {}

    public Article(int articleId, String title, String content, String symbol, Date regdate, String category, String subclass, double stars, String reldate, String relplace, String relperson, String tags, int author) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.symbol = symbol;
        this.regdate = regdate;
        this.category = category;
        this.subclass = subclass;
        this.stars = stars;
        this.reldate = reldate;
        this.relplace = relplace;
        this.relperson = relperson;
        this.tags = tags;
        this.author = author;
    }

    public int getArticleId() {
        return articleId;
    }

//    public void setAno(int articleId) {
//        this.articleId = articleId;
//    }

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String getReldate() {
        return reldate;
    }

    public void setReldate(String reldate) {
        this.reldate = reldate;
    }

    public String getRelplace() {
        return relplace;
    }

    public void setRelplace(String relplace) {
        this.relplace = relplace;
    }

    public String getRelperson() {
        return relperson;
    }

    public void setRelperson(String relperson) {
        this.relperson = relperson;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }
}
