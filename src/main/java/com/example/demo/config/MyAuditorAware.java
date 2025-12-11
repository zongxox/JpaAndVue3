package com.example.demo.config;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.util.Optional;
//要記得加上註解
@Component
public class MyAuditorAware implements AuditorAware<String> {
    @Autowired
    private HttpSession session;

    @Override
    public Optional<String> getCurrentAuditor() {
        User user = (User) session.getAttribute("sessionUser");
        if(user != null){
            return Optional.of(user.getAccount());
        }
        //如果用了session就用session,所以暫時先用system
        return Optional.of("system");
    }
}
