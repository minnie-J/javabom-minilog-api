package com.javabom.minilog.domain;

import java.util.Map;

public class JSONResponse {
    private String type;
    private int id;
    Map<Object, Object> attributes;
    Map<Object, Object> links;

    public JSONResponse(){}

    public JSONResponse(String type, int id, Map<Object, Object> attributes, Map<Object, Object> links) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.links = links;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Object, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<Object, Object> attributes) {
        this.attributes = attributes;
    }

    public Map<Object, Object> getLinks() {
        return links;
    }

    public void setLinks(Map<Object, Object> links) {
        this.links = links;
    }
}
