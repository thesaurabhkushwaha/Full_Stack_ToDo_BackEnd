package com.in18minutes.rest.webservices.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in18minutes.rest.webservices.todo.models.Todo;
import com.in18minutes.rest.webservices.todo.repository.TodoJpaRepository;

@Service
public class TodoJwtService {

	@Autowired
	TodoJpaRepository repo;
	
	public Todo save(Todo todo) {
		return repo.save(todo);
	}
	
	public Todo update(Todo todo) {
		return repo.save(todo);
	}
	
	public List<Todo> findAllTodos(String username){
		
		return repo.findByUsername(username);
	}
	
	public Todo findById(long id) {
		return repo.findById(id).get();
	}
	
	public void deleteById(long id) {
		repo.deleteById(id);
	}
}
