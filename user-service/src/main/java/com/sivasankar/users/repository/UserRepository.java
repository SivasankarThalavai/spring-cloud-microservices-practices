package com.sivasankar.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sivasankar.users.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserId(Long userId);
}