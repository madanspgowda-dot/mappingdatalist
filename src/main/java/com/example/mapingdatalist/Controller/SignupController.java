package com.example.mapingdatalist.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController {
    @GetMapping("/")
    public String showsignuppage(){
        return "Signup";
    }
    @GetMapping("/login")
    public String showloginpage(){
        return "login";
    }
}
