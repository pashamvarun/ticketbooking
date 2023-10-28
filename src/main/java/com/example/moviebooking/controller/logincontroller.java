package com.example.moviebooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.moviebooking.model.user;

@Controller
public class logincontroller {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	 public String showLogin() {
	  return "login";
	 }
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	 public String login(@ModelAttribute(name="loginForm") user login, Model m) {
	  String username = login.getUserName();
	  String password = login.getPassword();
	  if("Admin".equals(username) && "Admin".equals(password)) {
		 return "login";
	  }
	  m.addAttribute("error", "Incorrect Username & Password");
	  return "home";
	  
	 }
	
}
