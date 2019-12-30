package com.LoginRegistration.Api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @ResponseBody
    @RequestMapping("/hel")
    String index() {
        return "It Is Working";
    }

    @RequestMapping("/welcome")
    public String Welcome() {
        return "Welcomepage";
    }
}
