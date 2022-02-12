package com.sivasankar.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sivasankar.users.entity.User;
import com.sivasankar.users.repository.UserRepository;
import com.sivasankar.users.vo.Department;
import com.sivasankar.users.vo.UserResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}

	public UserResponse getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment of UserService");
		UserResponse userResponse = new UserResponse();
		User user = userRepository.findByUserId(userId);

		Department department = restTemplate
				.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);

		userResponse.setUser(user);
		userResponse.setDepartment(department);

		return userResponse;
	}
}