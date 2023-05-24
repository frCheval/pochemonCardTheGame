package com.controller;

import com.dto.UserDTO;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
