package com.ru8anraj.accessingdataagain.controller;

import com.ru8anraj.accessingdataagain.entity.UserEntitry;
import com.ru8anraj.accessingdataagain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/addUser")
    public @ResponseBody
    String addUser(
            @RequestParam String name,
            @RequestParam String email
    ){
        try {
            UserEntitry user = new UserEntitry();
            user.setName(name);
            user.setEmail(email);
            userRepository.save(user);
            return "User successfully added!";
        } catch (Exception e) {
            return "Failed to added user!";
        }
    }

    @GetMapping("/getUser")
    public @ResponseBody
    Iterable<UserEntitry> getAllUser() {
        return userRepository.findAll();
    }
}
