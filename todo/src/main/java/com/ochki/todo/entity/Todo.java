package com.ochki.todo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    private Integer id;
    private String username;
    private String content;
    private String detail;
    private Boolean completed = Boolean.FALSE;


    public Todo() {
    }

    public Todo(Integer id, String username, String content, String detail, Boolean completed) {
        this.id = id;
        this.username = username;
        this.content = content;
        this.detail = detail;
        this.completed = completed;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
