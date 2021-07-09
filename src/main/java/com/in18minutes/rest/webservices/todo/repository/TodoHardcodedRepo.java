package com.in18minutes.rest.webservices.todo.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.in18minutes.rest.webservices.todo.models.Todo;

@Repository
public class TodoHardcodedRepo {

	private static List<Todo> todos = new ArrayList<>();
	
	private static long idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter,"Saurabh","Learn FS",new Date(), false));
		todos.add(new Todo(++idCounter,"Saurabh","Learn Angular 2",new Date(), false));
		todos.add(new Todo(++idCounter,"Saurabh","Learn Microservices",new Date(), false));
		todos.add(new Todo(++idCounter,"abc","Learn Microservices",new Date(), false));
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}	
		else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId() == id)
				return todo;
		}
		return null;
	}
	
	public Todo deleteById(long id){
		Todo todo = findById(id);
		if(todo == null) 
			return null;
		if(todos.remove(todo))
			return todo;
		return null;
	}
}
