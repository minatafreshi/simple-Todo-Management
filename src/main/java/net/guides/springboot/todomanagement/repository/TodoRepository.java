package net.guides.springboot.todomanagement.repository;

import net.guides.springboot.todomanagement.model.Todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

    public interface TodoRepository extends JpaRepository <Todo, Long> {
        List <Todo> findByUserName(String user);
    }
