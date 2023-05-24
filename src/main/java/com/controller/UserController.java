package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
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
