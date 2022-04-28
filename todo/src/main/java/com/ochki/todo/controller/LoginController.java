package com.ochki.todo.controller;

import com.ochki.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/login")
    public String index() {

        return "login";

    }
}
