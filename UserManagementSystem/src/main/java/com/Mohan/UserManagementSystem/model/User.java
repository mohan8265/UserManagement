package com.Mohan.UserManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Integer userId;
    private String name;
    private String userName;
    private String userAddress;
    private String userPhoneNumber;

}
