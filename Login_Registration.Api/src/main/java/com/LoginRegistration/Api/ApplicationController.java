package com.LoginRegistration.Api;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {
    @ResponseBody
    @RequestMapping("/j")
    String index() {
        return "It Is Working";
    }
    @RequestMapping("/kopl")
    public String i(){
        return "k.html";
    }
    @RequestMapping("/k")
    public ModelAndView home()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("k");
        return modelAndView;
    }
}
