package com.example.demo.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;
//要記得加上註解
@Component
public class MyAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        //如果用了session就用session,所以暫時先用system
        return Optional.of("system");
    }
}
