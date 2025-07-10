package com.example.demo.controllers;


import com.example.demo.models.AuthDetails;
import com.example.demo.services.UserDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthControllers {
    @Autowired
    private UserDetailsServices us;

    @PostMapping("/register")
    public String addnewEmployee(@RequestBody AuthDetails register){
        return us.add(register);
    }

//    @PostMapping("/login")
//    public String Login(@RequestBody AuthDetails login){
//        return us.authenticate(login);
//    }

    @PostMapping("/login")
    public String login(@RequestBody AuthDetails request) {
        boolean isValid = UserDetailsService.authenticate(request.getUserName(), request.getPassword());
        if (isValid) {
            return "Login successful";
        } else {
            return "Invalid credentials";
        }
    }

}
