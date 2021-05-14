package com.jiman.first.repository;

import com.jiman.first.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> findAll();
    Optional<Todo> findTodoById(int id);
}
