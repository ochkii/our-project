package com.ochki.todo.controller;

import com.ochki.todo.entity.Todo;
import com.ochki.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    TodoRepository todoRepository;
    @Autowired
    TodoService todoService = new TodoService();




    @GetMapping("/")
    public String viewList(Model model) {
        List <Todo> listTodo = todoService.listAll();
        model.addAttribute("listTodo", listTodo);
        return "index";
    }

    @GetMapping("/editTodo/{id}")
    public String showEditList(@PathVariable("id") Integer todoId, Model model){
        Todo todoEdit = todoService.getId(todoId);
        model.addAttribute("todoEdit", todoEdit);
        return "editTodo";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editTodo(@ModelAttribute("todoEdit") Todo todo){
        todoService.editTodo(todo);
        return "redirect:/";
    }

    @GetMapping("/newTodow")
    public String addList(Model model) {
        Todo addContent = new Todo();
        model.addAttribute("addContent", addContent);
        return "newTodo";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTodo(@ModelAttribute("addContent") Todo todo){
        todoService.saveTodo(todo);
        return "redirect:/";
    }

   @GetMapping("/deleteTodo/{id}")
   public String deleteTodo(@PathVariable("id") Integer id){
        todoService.deleteTodo(id);
        return "redirect:/";
    }
}

