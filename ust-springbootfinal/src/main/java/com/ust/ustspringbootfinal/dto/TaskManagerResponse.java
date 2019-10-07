package com.ust.ustspringbootfinal.dto;

import java.util.List;



public class TaskManagerResponse {

	private int statuscode;
	
	private String message;
	
	private String description;
	
	private List<TaskManager> tasks;

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TaskManager> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskManager> tasks) {
		this.tasks = tasks;
	}
	
	
	
	
}
