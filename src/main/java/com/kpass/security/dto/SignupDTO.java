package com.kpass.security.dto;

import com.kpass.security.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupDTO {
    private String username;
    private String password;
    private String role;
}
