package com.spring.course_spring.repositories;

import com.spring.course_spring.entities.Category;
import com.spring.course_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
