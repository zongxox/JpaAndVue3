package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.servicec.Impl.UserServiceImpl;
import com.example.demo.servicec.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userService.userSave(user);
    }

}
