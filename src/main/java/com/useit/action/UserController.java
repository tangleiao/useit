package com.useit.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {


	
	@RequestMapping(value = "/user-list", method = RequestMethod.GET)
	public String userList(ModelMap model) {
		System.out.println("This is user's page");
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "user/list";
	}
	
	@RequestMapping(value = "/add-user", method = RequestMethod.GET)
	public String addUser() {
		return "user/add";
	}
	
	@RequestMapping(value="/edit-user", method=RequestMethod.GET)
	public String editUser(ModelMap model) {
		
		model.addAttribute("message", "Edit-user");
		return "user/edit";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public boolean deleteUser(ModelMap map) {
		return true;
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
	
}
