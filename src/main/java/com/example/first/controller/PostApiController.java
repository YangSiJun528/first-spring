package com.example.first.controller;

import com.example.first.dto.PostRequestDto;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {
    // Post 사용법 1 (잘 안씀)
    @PostMapping()
    public void post(Map<String, Object> requestData) {
        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
    }

    // Post 사용법 2 (일반적으로 추천)
    @PostMapping()
    public void post(@RequestBody PostRequestDto postRequestDto) {
        System.out.println(postRequestDto);
    }
}
