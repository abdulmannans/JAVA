package com.Firstproject.spring.Hello_world;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Hello {
    @RequestMapping("/hello")
    @ResponseBody
    String index(){
     return "Hello world";
    }
}
