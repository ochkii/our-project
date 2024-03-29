package com.ochki.todo.entity;

import org.springframework.security.core.userdetails.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Users {
    @Id
    private Integer id;
    private String username;
    private String password;
    private Boolean enabled;

//    @OneToMany
//    private List<Todo>



    public Users() {

    }

    public Users(Integer id, String username, String password, Boolean enabled, List<Todo> todoList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
//        this.todoList = todoList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public List<Todo> getTodoList() {
//        return todoList;
//    }

//    public void setTodoList(List<Todo> todoList) {
//        this.todoList = todoList;
//    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
