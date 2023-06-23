package com.Mohan.UserManagementSystem.repository;

import com.Mohan.UserManagementSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {

    @Autowired
    private List<User> userList;

    public List<User> getAllUsers() {
        return userList;
    }
}
