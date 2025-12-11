package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.servicec.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //註冊
    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userService.userSave(user);
    }

    //登入
    @PostMapping("/login")
    public User login(@RequestBody User user, HttpSession session){
        return userService.login(user.getAccount(), user.getPassword(),session);
    }


    //登入後修改
    @PostMapping("/update")
    public User update(@RequestBody User user,HttpSession session){
        return userService.updateUserInfo(user.getEmail(),user.getUsername(),session);
    }

}
