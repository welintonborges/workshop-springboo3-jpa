package com.spring.course_spring.repositories;

import com.spring.course_spring.entities.Category;
import com.spring.course_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
