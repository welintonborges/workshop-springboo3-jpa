package com.spring.course_spring.services;

import com.spring.course_spring.entities.Order;
import com.spring.course_spring.entities.User;
import com.spring.course_spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findBayId(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
