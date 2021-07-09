package com.in18minutes.rest.webservices.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in18minutes.rest.webservices.todo.models.Todo;
import com.in18minutes.rest.webservices.todo.repository.TodoHardcodedRepo;

@Service
public class TodoService {

	@Autowired
	TodoHardcodedRepo repo;
	
	public Todo save(Todo todo) {
		return repo.save(todo);
	}
	
	public Todo update(Todo todo) {
		return repo.save(todo);
	}
	
	public List<Todo> findAllTodos(String username){
		
		return repo.findAll();
	}
	
	public Todo findById(long id) {
		return repo.findById(id);
	}
	
	public Todo deleteById(long id) {
		return repo.deleteById(id);
	}
}
