package com.spring.course_spring.resources;

import com.spring.course_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User u = new User(1L, "Welinton", "welinton@gmail.com", "99999999", "1234596");

        return ResponseEntity.ok().body(u);
    }


}
