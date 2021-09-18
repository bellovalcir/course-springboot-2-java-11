package com.bello.course.resources;

import org.springframework.http.ResponseEntity;

import com.bello.course.entities.User;

public class UserResource {

	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail", "99999", "12345");
		return ResponseEntity.ok().body(u);
		//.ok retorna mensagem .body retorna a mensagem dentro do body com o usuario
	}
	
}
