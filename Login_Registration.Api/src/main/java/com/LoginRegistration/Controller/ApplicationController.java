package com.LoginRegistration.Controller;

import com.LoginRegistration.Model.User;
import com.LoginRegistration.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {

    @Autowired
    private com.LoginRegistration.Services.userService userService;

    @RequestMapping("/second")
    public ModelAndView second()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("k");
        return modelAndView;
    }
    @GetMapping("/data-saved")
    public String dataSaved(@RequestParam String userName,@RequestParam String firstName,@RequestParam String lastName,@RequestParam int age,@RequestParam String password){
       User user = new User(userName,firstName,lastName,age,password);
       userService.saveUser(user);
        return "Data Saved";
    }
}
