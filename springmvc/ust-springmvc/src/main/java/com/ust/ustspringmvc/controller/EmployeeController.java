package com.ust.ustspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.ustspringmvc.dto.Employee;
import com.ust.ustspringmvc.service.EmployeeService;



@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	// for aotowiring service layer
	
	@Autowired
	private EmployeeService service;
	
	
	// for date
	
	

	@InitBinder                                                        // FOR DATE
	public void initBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	
	}
	
	 
	
	
	// to view login page
	
	
	
	@GetMapping("/login")  // same as that of method = RequestMethod.GET
	public String loginPage(HttpServletRequest req) {
		if(req.getSession(false)==null) {
			return "login";
		}
		return "home";
	}
	
	// to view register page
	
	@GetMapping("/register")        // we are clicking on hyperlink
	public String registerPage() {
		return "register";
	}
	
	
	
	// to work on login page
	
	@PostMapping("/login")         // same because we are using login and overiding dopost methodin login
	public String login(String email,String password,ModelMap map,HttpServletRequest request) {
		
		Employee employee = service.auth(email, password);
		if(employee==null) {
			map.addAttribute("msg", "invalid credentials");
			return "login";
		}
		// session created
		request.getSession().setAttribute("emp", employee);
		return "home";
	}
	
	
	
	
	
	// to work on register page
	
	@PostMapping("/register")    // same because we are using login and overiding dopost methodin register
	public String register(Employee employee,ModelMap map) {
		if(service.registerEmployee(employee)) {
			map.addAttribute("msg", "registered employee successfully");
			
		}else {
			map.addAttribute("msg", "invalid data");
		}
		return "login";
	}
	
	
	// forr homepage
	
	@GetMapping("/home")       // we are clicking on hyperlink
	public String homepage(HttpServletRequest req) {
		if(req.getSession(false)==null) {
			return "login";
		}
		return "home";
	}
	
	
	// for view of update page
	
	@GetMapping("/update")     // we are clicking on hyperlink
	public String updatePage() {
		
		return "update";
	}
	
	// to work on update page
	
	@PostMapping("/update")
	public String update(Employee employee,@SessionAttribute("emp")Employee emp,ModelMap map,HttpSession session,HttpServletRequest req) {     //@SessionAttribute("emp")Employee emp beacause we are  calling email here
		
		if(req.getSession(false)==null) {
			return "login";
		}
		
		
		employee.setEmail(emp.getEmail());
		if(service.updateEmployee(employee)) {
			map.addAttribute("msg", "updated the profile");
			session.setAttribute("emp", employee);
			
		}else {
			map.addAttribute("msg", "invalid data");
		}
		return "home";
	}
	
	
	
	
	// to show all employee page
	
	@GetMapping("/show-all")     // we are clicking on hyperlink
	public String showAll(ModelMap map,HttpServletRequest req) {
		
		if(req.getSession(false)==null) {
			return "login";
		}
		
		List<Employee> employees = service.getAllEmployee();
		map.addAttribute("list", employees);
		return "show-all";
	}
	
	
	
	
	
	// to delete 
	
	@GetMapping("/delete")   // we are clicking on hyperlink
	public String delete(@RequestParam("id")int id,ModelMap map,HttpServletRequest req) {                 // @RequestParam("id")int id rhis because we want to get delete id from home.jsp
		HttpSession session = req.getSession(false);
		if(req.getSession(false)!=null) {
			service.deleteEmployee(id);
			map.addAttribute("msg", "profile deleted");
			session.invalidate();
		}
		
		return "redirect:./login";
	}
	
	
	
	
	// to logout
	
	
	@GetMapping("/logout")     // we are clicking on hyperlink
	public String logout(HttpSession session,ModelMap map) {
		
		session.invalidate();
		map.addAttribute("msg", "logout successful");
		return "login";
	}
	
	

	
	
	
	

}
