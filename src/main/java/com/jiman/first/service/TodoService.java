package com.jiman.first.service;


import com.jiman.first.domain.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    public List<Todo> findAll();
    public Optional<Todo> findTodoById(int id);
    public void createTodo(Todo todo);
}