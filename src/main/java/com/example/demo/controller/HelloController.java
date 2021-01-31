package com.example.demo.controller;

import com.example.demo.service.EmpService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    UserService userService;
    @Autowired
    EmpService empService;

    @GetMapping("/test")
    public String test(Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/test2")
    public String test2(Integer id) {
        return empService.find(id);
    }
}