package com.ust.ustspringbootfinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.ust.ustspringbootfinal.dto.TaskManager;
import com.ust.ustspringbootfinal.dto.TaskManagerResponse;
import com.ust.ustspringbootfinal.service.TaskManagerService;

@Controller
@RestController                   
@RequestMapping("/task")
@CrossOrigin(origins = "*",allowedHeaders = "*" ,allowCredentials = "true")

public class TaskManagerController {
	
	@Autowired
	@Qualifier("jpa")          
	private TaskManagerService service;
	

	@GetMapping(path = "/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskManagerResponse getAllTask(){
		
		List<TaskManager> tasks = service.getAllTask();
		TaskManagerResponse response = new TaskManagerResponse();
		
		if(tasks==null) {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("no data found");
			
		}else {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data found successfully");
			response.setTasks(tasks);
		}
		return response;
		
	}
	
	
	@PostMapping(path = "/add",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskManagerResponse addTask(@RequestBody TaskManager taskManager) {         
		
		TaskManagerResponse response = new TaskManagerResponse();
		
		if (service.addTask(taskManager)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data addded successfully");
			
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not added");
			
		}
		return response;
	}
	
	
	
	@PutMapping(path = "/modify",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskManagerResponse modifyTask(@RequestBody TaskManager taskManager) {          
		
		TaskManagerResponse response = new TaskManagerResponse();
		
		if(service.modifyTask(taskManager)){
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data modified successfully");
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data modification failed");
			
		}
		return response;
		
	}
	
	
	
	@DeleteMapping(path = "/remove/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public TaskManagerResponse removeTask(@PathVariable("id")int taskid) {
		 
		TaskManagerResponse response = new TaskManagerResponse();
		
		if(service.removeTask(taskid)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data removed successfully");
		 }else {
			 	response.setStatuscode(401);
				response.setMessage("failure");
				response.setDescription("data modification failed");
		 }
		 return response;
		 
		 
	 }
	
	
	
	
	
	
	

}
