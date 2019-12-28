package com.LoginRegistration.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {
    @ResponseBody
    @RequestMapping("/home")
    public String i(){
        return "Hello home";
    }

}
