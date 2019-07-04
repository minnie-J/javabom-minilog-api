package com.javabom.minilog.dto;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;
import java.util.Date;

public class Attributes {

    private String title;
    private String content;
//    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime regdate;

    public Attributes() {}

    public Attributes(String title, String content, LocalDateTime regdate) {
        this.title = title;
        this.content = content;
        this.regdate = regdate;
    }

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
