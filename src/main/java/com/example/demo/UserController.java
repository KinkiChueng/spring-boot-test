package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lasia on 2021/1/11.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping
    public Response<Map<String, Object>> get(){
        Response<Map<String, Object>> response = new Response<>();
        Map<String, Object> user = new HashMap<>();
        user.put("name", "demo");
        user.put("age", 25);
        response.setData(user);
        return  response;
    }
}