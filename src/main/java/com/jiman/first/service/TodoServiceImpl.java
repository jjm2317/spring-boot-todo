package com.jiman.first.service;

import com.jiman.first.domain.Todo;
import com.jiman.first.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Optional<Todo> findTodoById(int id) {
        return todoRepository.findTodoById(id);
    }

    public void createTodo(Todo todo) {
        todoRepository.save(todo);
    }
}
