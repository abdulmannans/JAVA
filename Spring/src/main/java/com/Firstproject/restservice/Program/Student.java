package com.Firstproject.restservice.Program;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Student {
    @RequestMapping("/student")
   String index(){
       return "student";
   }
   int ind(){
        return 1000;
   }
}
