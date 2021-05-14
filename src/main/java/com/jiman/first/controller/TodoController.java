package com.jiman.first.controller;


import com.jiman.first.domain.Todo;
import com.jiman.first.response.ApiResponse;
import com.jiman.first.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping
    public ResponseEntity getTodos() {
        return ResponseEntity.ok(todoService.findAll());
    }

    @GetMapping(value="/{id}", produces = "application/json")
    public ResponseEntity getTodoById (@PathVariable("id") int id) {
        return ResponseEntity.ok(todoService.findTodoById(id));
    }

    @PostMapping(produces = "application/json")
    public ResponseEntity createTodo(@RequestBody Todo todo) {
        todoService.createTodo(todo);
        return ResponseEntity<>(new ApiResponse)
    }
}
