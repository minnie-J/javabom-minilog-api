package com.javabom.minilog.domain;

import java.util.List;

public class ResponseWrapper {
    private List<JSONResponse> data;
//    List<Object> data;

    public ResponseWrapper() {}
    public ResponseWrapper(List<JSONResponse> data) {
        this.data = data;
    }

    public List<JSONResponse> getData() {
        return data;
    }

    public void setData(List<JSONResponse> data) {
        this.data = data;
    }
}
