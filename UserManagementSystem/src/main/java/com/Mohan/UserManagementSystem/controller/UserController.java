package com.Mohan.UserManagementSystem.controller;

import com.Mohan.UserManagementSystem.model.User;
import com.Mohan.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("users/{id}")
    public User getuser(@PathVariable Integer id){
        return userService.getUser(id);
    }
    @PostMapping("users")
    public String addUser(@RequestBody User user){
        return userService.adduser(user);
    }
    @PutMapping("users/{id}")
    public String updateUserInfo(@PathVariable Integer id, @RequestBody User user){
        return userService.updateUserInfo(id,user);
    }
    @DeleteMapping("users/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }


}
