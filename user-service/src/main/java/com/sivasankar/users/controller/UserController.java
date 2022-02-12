package com.sivasankar.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sivasankar.users.entity.User;
import com.sivasankar.users.service.UserService;
import com.sivasankar.users.vo.UserResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser of UserController");
		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public UserResponse getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("Inside getUserWithDepartment of UserController");
		return userService.getUserWithDepartment(userId);
	}

}