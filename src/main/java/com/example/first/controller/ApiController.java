package com.example.first.controller;

import com.example.first.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // RestApi 처리하는 Controller
@RequestMapping("/api") //RequestMapping 지정
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "hello string boot!";
    }

}
