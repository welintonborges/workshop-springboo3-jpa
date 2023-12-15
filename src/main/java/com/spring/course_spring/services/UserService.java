package com.spring.course_spring.services;

import com.spring.course_spring.entities.User;
import com.spring.course_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findBayId(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
}
