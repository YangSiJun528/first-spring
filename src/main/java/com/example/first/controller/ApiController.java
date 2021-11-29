package com.example.first.controller;

import com.example.first.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // RestApi 처리하는 Controller
@RequestMapping("/api") //RequestMapping 지정
public class ApiController {
    // text 반환
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }
    // Json 반환
    @PostMapping("/json")
    public User json(@RequestParam User user) {
        return user;
    }
    // ResponseEntity 반환
    @PutMapping("/put1")
    public ResponseEntity<User> put(@RequestParam User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
