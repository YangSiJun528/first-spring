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

    @GetMapping(path = "/get/hello") // get 처리 방법 1
    public String getHello() {
        return "Get Hello!";
    }

    @RequestMapping(path = "/get/hi", method = RequestMethod.GET) // get 처리 방법 2
    public String getHi() {
        return "Get Hi!";
    }
    // 동적 매핑 사용 1
    @GetMapping("/path-variable/{name}") // *주소에 대문자 X
    public String pathVariable1(@PathVariable String name) {
        System.out.println("PathVariable :"+name);
        return name;
    }

    // 동적 매핑 사용 2 주소에서 받는 값과 변수 이름이 달라야 할때 사용함
    @GetMapping("/path-variable/{name}") // *주소에 대문자 X
    public String pathVariable2(@PathVariable(name = "name") String pathName) {
        System.out.println("PathVariable :"+pathName);
        return pathName;
    }

    //쿼리 파라미터 처리1 (일반적으론 비추)
    @GetMapping("/get/quer-param")
    public String queryParam1(Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();
        queryParam.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
            sb.append(key + " = " + value);
        });
        return sb.toString();
    }

    //쿼리 파라미터 처리2 (간단한 처리)
    @GetMapping("/get/quer-param2")
    public String queryParam2(@RequestParam String name, String email, int age)
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name+email+age;
    }

    //쿼리 파라미터 처리2+ (일반적인 상황에서 사용)
    @GetMapping("/get/quer-param3")
    public String queryParam3(UserRequest userRequest)
    {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }
}
