package com.example.first.controller;

import com.example.first.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "index.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setName("steve");
        user.setAddress("GSM");
        return user;
    }
}
