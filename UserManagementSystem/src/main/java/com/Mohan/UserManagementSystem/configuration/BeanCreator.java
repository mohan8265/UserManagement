package com.Mohan.UserManagementSystem.configuration;

import com.Mohan.UserManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanCreator {
    @Bean
    public List<User> getUserList(){
        List<User> userList = new ArrayList<>();
        return userList;
    }
}
