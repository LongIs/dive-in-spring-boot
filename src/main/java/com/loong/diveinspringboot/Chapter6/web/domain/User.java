package com.loong.diveinspringboot.Chapter6.web.domain;

public class User {

    private Long id;

    private String name;


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
