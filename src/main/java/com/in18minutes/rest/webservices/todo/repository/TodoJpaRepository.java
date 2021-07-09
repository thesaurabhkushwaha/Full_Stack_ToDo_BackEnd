package com.in18minutes.rest.webservices.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in18minutes.rest.webservices.todo.models.Todo;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo,Long>{
	
	//Write name correctly
	List<Todo> findByUsername(String username);
		
	
}
