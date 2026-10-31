package com.example.springstudy.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String createMessage(String name) {
        String target = name == null || name.isBlank() ? "Spring" : name.trim();
        return "안녕하세요, " + target + "!";
    }
}
