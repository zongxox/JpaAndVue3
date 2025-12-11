package com.example.demo.servicec;

import com.example.demo.entity.User;

import javax.servlet.http.HttpSession;

public interface UserService {
    //註冊
    User userSave(User user);
    //登入
    User login(String account, String password, HttpSession session);
    //修改
    User updateUserInfo(String email, String username,HttpSession session);

}
