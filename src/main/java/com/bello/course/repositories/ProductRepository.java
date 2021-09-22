package com.bello.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bello.course.entities.Product;

// porque interface
public interface ProductRepository extends JpaRepository<Product, Long> {

}
