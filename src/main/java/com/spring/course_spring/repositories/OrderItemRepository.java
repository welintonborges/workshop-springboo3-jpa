package com.spring.course_spring.repositories;

import com.spring.course_spring.entities.OrderItem;
import com.spring.course_spring.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
}
