package com.Mohan.UserManagementSystem.service;

import com.Mohan.UserManagementSystem.model.User;
import com.Mohan.UserManagementSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    public User getUser(Integer id) {
        List<User> userList = getAllUsers();

        for(User user:userList){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public String adduser(User user) {
        List<User> userList = getAllUsers();
        userList.add(user);
        return "user added";
    }

    public String updateUserInfo(Integer id, User user) {
        List<User> userList = getAllUsers();
        for(User myUser:userList){
            if(myUser.getUserId().equals(id)){
                myUser.setName(user.getName());
                myUser.setUserName(user.getUserName());
                myUser.setUserAddress(user.getUserAddress());
                myUser.setUserPhoneNumber(user.getUserPhoneNumber());

                return "user details updated";
            }
        }

        return "user with id " + id + " does not exist";
    }

    public String deleteUser(Integer id) {
        List<User> userList = getAllUsers();
        for(User user:userList){
            if(user.getUserId().equals(id)){
                userList.remove(user);
                return "user deleted";
            }
        }
        return "user with id " + id + " does not exist";
    }
}
