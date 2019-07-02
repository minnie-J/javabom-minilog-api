package com.javabom.minilog.dto;

public class ArticleDTO<Wrapper> {
    private Wrapper data;

    public ArticleDTO(){}

    public ArticleDTO(Wrapper data) {
        this.data = data;
    }

    public Wrapper getData() {
        return data;
    }

    public void setData(Wrapper data) {
        this.data = data;
    }
}
