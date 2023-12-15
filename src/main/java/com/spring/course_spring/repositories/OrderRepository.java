package com.spring.course_spring.repositories;

import com.spring.course_spring.entities.Order;
import com.spring.course_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
