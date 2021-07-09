package com.in18minutes.rest.webservices.todo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in18minutes.rest.webservices.todo.models.Todo;
import com.in18minutes.rest.webservices.todo.service.TodoJwtService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoJwtController {

	@Autowired
	TodoJwtService service;
	
	@PostMapping("jpa/users/{username}/todo")
	public ResponseEntity<Todo> addTodo(@PathVariable String username, @RequestBody Todo todo) {
		todo.setId(-1L);
		todo.setUsername(username);
		Todo createdTodo = service.save(todo);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
					.path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping("jpa/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username){
		System.out.println("No. of todos: "+service.findAllTodos(username).size());
		return service.findAllTodos(username);
	}
	
	@GetMapping("jpa/users/{username}/todo/{id}")
	public Todo findById(@PathVariable long id, @PathVariable String username) {
		return service.findById(id);
	}
	
	@PutMapping("jpa/users/{username}/todo/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable long id, @PathVariable String username, @RequestBody Todo todo) {
		todo.setUsername(username);
		Todo updatedTodo = service.update(todo);
		System.out.println("UPDATED TODO: "+updatedTodo.getTask());
		return new ResponseEntity<Todo>(updatedTodo, HttpStatus.OK);
	}
	
	@DeleteMapping("jpa/users/{username}/todo/{id}")
	public void deleteTodo(@PathVariable String username, @PathVariable long id){
		service.deleteById(id);
	}
}
