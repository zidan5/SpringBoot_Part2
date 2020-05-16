package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("main/user")
@RestController
public class UserController {

    @Autowired
    private UserServiceImplementation userImplementation;

    @GetMapping("/user/{id}")
    public User GetUserById(@PathVariable("id") int id){
        return userImplementation.findUserById(id);
    }
    @GetMapping
    public  String helloWorld(){
        return "Hello World";
    }

 }
