package com.example.first.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @PostMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestBody String account) {
        System.out.println(userId);
        System.out.println(account);

        // 값이 없어도 200ok 나옴 (값이 없으나 값이 있었는데 지운것과 결과는 동일하기 때문)
    }
}
