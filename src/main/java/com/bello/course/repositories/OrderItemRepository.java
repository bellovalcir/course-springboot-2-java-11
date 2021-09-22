package com.bello.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bello.course.entities.OrderItem;

// porque interface
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
