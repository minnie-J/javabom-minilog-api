package com.javabom.minilog.dto;

public class ArticleData<Wrapper> {
    private Wrapper data;

    public ArticleData(){}

    public ArticleData(Wrapper data) {
        this.data = data;
    }

    public Wrapper getData() {
        return data;
    }

    public void setData(Wrapper data) {
        this.data = data;
    }
}
