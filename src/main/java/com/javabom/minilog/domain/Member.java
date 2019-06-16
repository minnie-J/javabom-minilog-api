package com.javabom.minilog.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "members")
public class Member {
    private String id;
    private String name;
    private String pwd;
    private String email;
    private String profile;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno;

//    @OneToMany(mappedBy = "members")
//    @JoinColumn(name = "author")
//    private List<Article> articles = new ArrayList<Article>();

    public Member() {}

    public Member(String id, String name, String pwd, String email, String profile, int mno) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.email = email;
        this.profile = profile;
        this.mno = mno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getMno() {
        return mno;
    }

}


