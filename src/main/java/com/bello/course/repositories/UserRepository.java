package com.bello.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bello.course.entities.User;

// porque interface
public interface UserRepository extends JpaRepository<User, Long> {

}
