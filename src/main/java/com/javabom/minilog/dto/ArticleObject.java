package com.javabom.minilog.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class ArticleObject {
    private String type;
    private String id;
    private Attributes attributes;
    private String self;

    @JsonProperty("links")
    private void links(Map<String, String> links) {
        this.self = links.get("self");
    }

    public ArticleObject(){}

    public ArticleObject(String type, String id, Attributes attributes, String self) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.self = self;
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

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
