package com.jiman.first.controller;


import com.jiman.first.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping
    public ResponseEntity getTodos() {
        return ResponseEntity.ok(todoService.findAll());
    }
}
