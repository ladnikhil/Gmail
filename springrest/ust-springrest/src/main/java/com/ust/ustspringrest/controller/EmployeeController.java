package com.ust.ustspringrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.ustspringrest.dto.Employee;
import com.ust.ustspringrest.dto.EmployeeResponse;
import com.ust.ustspringrest.service.EmployeeService;

@Controller
@RestController                   // now every return type is a restcontrller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	
	
	
	@GetMapping(path = "/get",produces = MediaType.APPLICATION_JSON_VALUE) // creates return type employee object to jason values
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {         //@responseody tells spring its not view page
		
		Employee employee = service.getEmployee(id);
		EmployeeResponse response = new EmployeeResponse();
		
		if(employee==null) {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not added");
			
		}else {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data addded successfully");
			response.setEmployees(Arrays.asList(employee)); // we are returning list here
		}
		return response;
	}
	
	
	
	
	
	@GetMapping(path = "/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployees(){
		
		List<Employee> employees = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		
		if(employees==null) {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("no data found");
			
		}else {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data found successfully");
			response.setEmployees(employees); // we are returning list here
		}
		return response;
		
	}
	
	
	
	
	@PostMapping(path = "/add",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {          // @RequestBody convert json or xml data to java object
		
		EmployeeResponse response = new EmployeeResponse();
		
		if (service.addEmployeee(employee)) {
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
	public EmployeeResponse modifyEmployee(@RequestBody Employee employee) {          // @RequestBody convert json or xml data to java object
		
		EmployeeResponse response = new EmployeeResponse();
		
		if(service.modifyEmployeee(employee)){
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
	 public EmployeeResponse removeEmployee(@PathVariable("id")int id) {
		 
		EmployeeResponse response = new EmployeeResponse();
		
		if(service.removeEmployeee(id)) {
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
