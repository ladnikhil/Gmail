package com.ust.practiceustspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ust.practiceustspringmvc.dto.Student;
import com.ust.practiceustspringmvc.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// here we need to have service because all data is in service
	
	@Autowired
	private StudentService service;
	
	
	

	@InitBinder                                                        // FOR DATE
	public void initBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	
	}
	
	
	
	
	
	@GetMapping("/login")
	public String loginPage() {
		
		return "login";
	}
	
	
	@PostMapping("/login")
	public String login(String email,String password,ModelMap map,HttpServletRequest req) {
		
		Student student = service.authenticate(email, password);
		
		if(student==null) {
			map.addAttribute("msg", "invalid credentials");
			return "login";
		}
		
		req.getSession().setAttribute("std", student);
		return "home";
	}
	
	

	@GetMapping("/register")      
	public String registerpage(HttpServletRequest req) {
		return "register";
	}
	
	
	

	@PostMapping("/register")      
	public String register(HttpServletRequest req,ModelMap map,Student student) {
		
		if(service.registerStudent(student)) {
			map.addAttribute("msg", "registration successful");
		}else {
			map.addAttribute("msg", "registration unsuccessful");
			return "register";
		}
		return "login";
	}
	
	
	
	
	
	@GetMapping("/home")      
	public String homepage(HttpServletRequest req) {
		return "home";
	}
	
	
	
	
	
	
	
	
	
	

}
