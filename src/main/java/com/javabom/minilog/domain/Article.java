package com.javabom.minilog.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.javabom.minilog.dto.Attributes;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity // (=Model)
@Table(name="articles") // table name
//public class Article extends ResourceSupport {
public class Article {

//    @Transient
//    @JsonProperty("type")
//    private String type;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment DB에 위임
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ano")
    private int id;

    private String title;
    private String content;

//    @Transient
//    @JsonProperty("attributes")
//    private Attributes attributes;

//    @Transient
//    @JsonProperty("attributes")

//    private Map<String, Object> attributes;
//    @Transient
//    @JsonProperty("self")

//    private String self;

    private String symbol;

//    @Temporal(TemporalType.TIMESTAMP)
//    private Date regdate;
    private LocalDateTime regdate;

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


//    public void setSelf(String self) {
//        this.self = self;

//    }

//    @JsonProperty("attributes")
//    public void setAttribute(Map<String, Object> attributes) {
//        this.title = (String) attributes.get("title");
//        this.content = (String) attributes.get("content");
//    }
//    @JsonProperty("links")
//    private void setLink(Map<String, Object> links) {
//        this.self = (String) links.get("self");
//    }

    public Article() {}

    public Article(Attributes attributes) {
        this.title = attributes.getTitle();
        this.content = attributes.getContent();
        this.regdate = attributes.getRegdate();
    }

    public Article(int id, String title, String content, String symbol, LocalDateTime regdate, String category, String subclass, double stars, String reldate, String relplace, String relperson, String tags, int author) {
        this.id = id;
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

//    public Article(String type, int id, Attribute attributes) {
//        this.type = type;
//        this.id = id;
//        this.attributes = attributes;
//    }

//    public void setType(String type) {
//        this.type = type;
//    }

    public int getId() {
        return id;
    }
//    public void setAno(int id) {
//        this.id = id;
//    }

//    public Attribute getAttributes() {return attributes;}
//
//    public void setAttributes(Attribute attributes) {
//        this.attributes = attributes;
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

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDateTime regdate) {
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

//    public Attributes getAttributes() {
//        attributes.setContent(this.content);
//        attributes.setTitle(this.title);
//        attributes.setRegdate(this.regdate);
//        return attributes;
//    }
//
//    public void setAttributes(Attributes attributes) {
//        this.attributes = attributes;
//        this.title = attributes.getTitle();
//        this.content = attributes.getContent();
//        this.regdate = attributes.getRegdate();
//    }
}
