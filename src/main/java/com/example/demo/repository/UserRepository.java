package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    //登入時查詢帳號密碼用
    Optional<User> findByAccountAndPassword(String account,String password);


}
