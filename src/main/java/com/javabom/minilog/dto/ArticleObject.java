package com.javabom.minilog.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class ArticleObject {
    private String type;
    private String id;
    private Attributes attributes;
//    @JsonProperty("links")
    private Map<String, String> links;

//    @JsonProperty("links")
//    private void links(Map<String, String> links) {
//        this.self = links.get("self");
//    }

    public ArticleObject() {
    }

    public ArticleObject(String type, String id, Attributes attributes, String self) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
//        this.self = self;
        Map<String, String> links = new HashMap<>();
        links.put("self", self);
        this.links = links;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

//    public String getSelf() {
//        return self;
//    }
//
//    public void setSelf(String self) {
//        this.self = self;
//    }


    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(String self) {
        Map<String, String> links = new HashMap<>();
        links.put("self", self);
        this.links = links;
    }
}
