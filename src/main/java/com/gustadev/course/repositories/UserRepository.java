package com.gustadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustadev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
