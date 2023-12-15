package com.spring.course_spring.services;

import com.spring.course_spring.entities.Category;
import com.spring.course_spring.entities.Order;
import com.spring.course_spring.repositories.CategoryRepository;
import com.spring.course_spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findBayId(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
