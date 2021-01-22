package com.example.demo.domain.dao.entity;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String userName;
    private String emailAddress;
    private String password;
}
