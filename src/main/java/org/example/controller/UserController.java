package org.example.controller;

import org.example.modal.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @GetMapping("/home")
    public String healthCheck(){
        return "Saying Hi";
    }
}
