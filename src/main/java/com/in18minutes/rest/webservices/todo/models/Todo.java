package com.in18minutes.rest.webservices.todo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String task;
	@Column(nullable = false)
	private Date targetDate;
	@Column(nullable = false)
	private boolean isDone;

	public long getId() {
		return this.id;
	}

	public void setId(Long i) {
		this.id = i;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public Todo(Long id, String username, String task, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.task = task;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	
	public Todo() {
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		
		if (id != other.id)
			return false;
		
		return true;
	}
	
	
}
