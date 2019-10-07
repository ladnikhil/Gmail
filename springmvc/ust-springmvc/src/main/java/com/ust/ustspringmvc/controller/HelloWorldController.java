package com.ust.ustspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.ustspringmvc.dto.Employee;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	
	// for date of birth
	
	@InitBinder                                                        // FOR DATE
	public void initBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);// we use it for custom editor it can be any editor
		binder.registerCustomEditor(Date.class, editor);
	
	}
	
	
	@RequestMapping(path="/world",method = RequestMethod.GET)
	public String hello(ModelMap map) {
		
		map.addAttribute("msg", "Hello nikhil.......");
		return "index";
	}
	
	
	
	// this method is for query string
	
	@RequestMapping(path="/query",method = RequestMethod.GET)
	public String getInfo(@RequestParam("id")int id,@RequestParam("name")String name , ModelMap map) {        // for query string we use @RequestParam("name")String name //  in this we can have integer datatype also
		map.addAttribute("name", name);
		map.addAttribute("id", id);
		return "info";
	}
	
	
	// this method is for viewing form
	
	@RequestMapping(path="/form-page",method = RequestMethod.GET)  // here get because we are just passing request to get form.jsp page
	public String getForm() {
		return "form";
	}
	
	
	
	// this is how we handle the form
	
	
	@RequestMapping(path="/form",method = RequestMethod.POST)  // here post because we are handling form request now
	public String formData(Employee emp,ModelMap map) { // here name should be same as that of form name attribute // here Employee is class and emp is object of it
		
		
		map.addAttribute("id", emp.getId());   // here Employee is class and emp is object of it
		map.addAttribute("name", emp.getName());
		map.addAttribute("dob", emp.getDob());
		map.addAttribute("email", emp.getEmail());
		map.addAttribute("password", emp.getPassword());
		
		return "info";// we are returning it to info.jsp page so info
	}
	
	
	// how to handle a cookie  // how to add cookie in the browser
	
	@RequestMapping(path="/add-cookie",method = RequestMethod.GET)
	public String addCookie(HttpServletResponse resp,ModelMap map) {
		
		// how to add cookie in the browser
		Cookie cookie = new Cookie("name", "sid");
		resp.addCookie(cookie);
		map.addAttribute("msg","cookie added to the browser");
		return "cookie";
	}
	
	
	// to get a cookiee
	
	@RequestMapping(path="/get-cookie",method = RequestMethod.GET)
	public String getCookie(@CookieValue(name = "name",required = false)String name,ModelMap map) {     // here @cookievalue("name") for getting a cookie
		
		// here required = false because if browser does not have the cookie then it return null instead of internal bad request
		
		
		if(name==null) {
			map.addAttribute("msg","cookie no present");
		}else {
		map.addAttribute("msg","cookie value  =  "+name);
		}
		return"cookie";
		
	}
	
	
	
	
	// how to handle a pathparam
	
	@RequestMapping(path="/path/{id}/{name}",method = RequestMethod.GET)
	public String getPathValue(@PathVariable("id")int id,@PathVariable("name")String name, ModelMap map) {    // here @PathVariable("name") is used to give name to pathparam
		
		// it will get all the values of name
		map.addAttribute("id", id);
		map.addAttribute("name", name);
		return "info";
	}
	
	
	
	// for setting session attribute
	
	@RequestMapping(path="/set-attribute",method = RequestMethod.GET)
	public String SetSessionAttribute(HttpSession session, ModelMap map) {
		
		Employee employee =  new Employee();
		employee.setId(1);
		employee.setName("nikhil");
		employee.setEmail("ladnikhil55@gmail.com");
		employee.setPassword("root");
		session.setAttribute("emp", employee);
		
		map.addAttribute("msg","session atribute added");
		return "index";
		
	}
	
	// for getting session attribute
	
	@RequestMapping(path="/get-attribute",method = RequestMethod.GET)
	public String getSessionAttribute(@SessionAttribute(name="emp",required = false)Employee employee,ModelMap map) { // here @SessionAttribute(name="emp") automativally creates object of session
		
		if(employee==null) {
			
			map.addAttribute("msg", "no attribute present");
		}else {
			
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getEmail());
			System.out.println(employee.getPassword());
			map.addAttribute("msg", "got the attribute");
		}
	
		return "index";
	}
	
	
	
	
	// for forwarding from one controller to other
	
	@RequestMapping(path="/forward",method = RequestMethod.GET)
	public String forward() {
		return "forward:add-cookie"; // here we use forward: because we have to forward controller to add-cookie controller
	}
	
	
	// for redirecting from one controller to other
	

	@RequestMapping(path="/redirect",method = RequestMethod.GET)
	public String redirect() {
		return "redirect:http://www.google.com"; // here we use redirect: because we have to forward controller to add-cookie controller
	}
	
	
	
	
	
	

}
