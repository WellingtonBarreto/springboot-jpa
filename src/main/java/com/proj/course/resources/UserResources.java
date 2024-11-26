package com.proj.course.resources;

import com.proj.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User>findAll(){
        User u = new User(1, "maria", "maria", "maria", "maria");
        return ResponseEntity.ok().body(u);
    };
}
