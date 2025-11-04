package com.example.usercenter.model.request;

import lombok.Data;

@Data
public class UserRegisterRequest {
    private String userAccount;
    private String userPassword;
    private String CheckPassword;
}
