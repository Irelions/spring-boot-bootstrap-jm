package com.example.springbootjm.controller;

import com.example.springbootjm.model.User;
import com.example.springbootjm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class RESTController {

    @Autowired
    UserService userService;

    @GetMapping("admin")
    public List<User> shoeAllUsers(){
        List<User> allUsers = userService.listUsers();
        return allUsers;
    }

    @GetMapping("login")
    public String loginPage(){
        return loginPage();
    }
}
