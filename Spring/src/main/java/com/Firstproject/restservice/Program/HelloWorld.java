package com.Firstproject.restservice.Program;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/hel")
    public String index(){
        return "Hello World";
    }
}
