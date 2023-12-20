package com.spring.course_spring.services;

import com.spring.course_spring.entities.User;
import com.spring.course_spring.repositories.UserRepository;
import com.spring.course_spring.services.exceptions.DatabaseException;
import com.spring.course_spring.services.exceptions.ResourceNotFoundException;
import com.sun.source.tree.TryTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.EmptyStackException;
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
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public void delete(Long id){
       try {
           userRepository.deleteById(id);
       }catch (EmptyStackException e) {
           throw new ResourceNotFoundException(id);
       }catch (DataIntegrityViolationException e){
           throw  new DatabaseException(e.getMessage());
       }
    }

    public User update(Long id , User obj){
        User entity = userRepository.getOne(id);
        updateData(entity, obj);
        return userRepository.save(entity);
    }
    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
