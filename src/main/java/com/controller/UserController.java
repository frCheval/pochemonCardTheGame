package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.UserDTO;
import com.service.UserService;

@RestController 
@RequestMapping("/user")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/{id}")
	public UserDTO getUser(@PathVariable Integer id) {
		return userService.getUserById(id);
	}
	
	@PutMapping
	public void editUser(@RequestBody UserDTO userDto) {
		userService.addUser(userDto);
	}
	
	@DeleteMapping
	public void removeUser(@RequestBody UserDTO userDto) {
		userService.deleteUser(userDto);
	}
	
	@PostMapping
	public void addUser(@RequestBody UserDTO userDto) {
		userService.addUser(userDto);
	}
	
	@PostMapping("/auth")
	public Boolean authentication(@RequestAttribute String username, @RequestAttribute String password) {
		return userService.authenticateUser(username, password);
	}
	
	@GetMapping("/all")
	public List<UserDTO> getAllUsers() {
		return userService.getAllUsers();
	}

}
