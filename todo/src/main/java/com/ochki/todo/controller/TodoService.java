package com.ochki.todo.controller;

import com.ochki.todo.entity.Todo;
import com.ochki.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> listAll() {
        return todoRepository.findAll();
    }

    public void saveTodo(Todo todo){
        todoRepository.save(todo);
    }

    public Todo getId(Integer todoId){
        return todoRepository.findById(todoId).get();
    }

    public void deleteTodo(Integer id) {
        todoRepository.deleteById(id);
    }

    public void editTodo(Todo todo){
        todoRepository.saveAndFlush(todo);
    }
}
