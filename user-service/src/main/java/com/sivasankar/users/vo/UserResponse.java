package com.sivasankar.users.vo;

import com.sivasankar.users.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

	private User user;
	private Department department;
}
