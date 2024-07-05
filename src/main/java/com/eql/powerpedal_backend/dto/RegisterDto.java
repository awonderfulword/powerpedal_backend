package com.eql.powerpedal_backend.dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String username;
    private String password;
    private String[] roles;
}
