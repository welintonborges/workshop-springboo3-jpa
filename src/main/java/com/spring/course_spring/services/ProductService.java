package com.spring.course_spring.services;

import com.spring.course_spring.entities.Category;
import com.spring.course_spring.entities.Product;
import com.spring.course_spring.repositories.CategoryRepository;
import com.spring.course_spring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findBayId(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
