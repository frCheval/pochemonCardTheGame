package com.controller;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/user")
public class UserController {
	
	@GetMapping
	public String getUser(Model model) {
		return "user";
	}
	
	@PutMapping
	public String editUser(Model model) {
		return "user";
	}
	
	@DeleteMapping
	public String removeUser(Model model) {
		return "user";
	}
	
	@PostMapping
	public String addUser(Model model) {
		return "user";
	}
	
	@PostMapping("/auth")
	public String authentication(Model model) {
		return "auth";
	}
	
	@GetMapping("/all")
	public String getAllUsers(Model model) {
		return "users";
	}

}
