package com.example.demo.servicec.Impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.servicec.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    //註冊
    @Override
    public User userSave(User user) {
        return userRepository.save(user);
    }

    //登入
    @Override
    public User login(String account, String password, HttpSession session) {
        User user = userRepository.findByAccountAndPassword(account, password)
                .orElseThrow(() -> new RuntimeException("帳號密碼錯誤"));
        session.setAttribute("sessionUser", user);
        return user;
    }

    //登入後修改
    @Override
    public User updateUserInfo(String email, String username,HttpSession session) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            throw new RuntimeException("尚未登入");
        }
        sessionUser.setEmail(email);
        sessionUser.setUsername(username);
        return userRepository.save(sessionUser);
    }


}
