package com.bello.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bello.course.entities.Category;

// porque interface
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
