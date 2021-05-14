package com.jiman.first.service;


import com.jiman.first.domain.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TodoService {
    public List<Todo> findAll();
}