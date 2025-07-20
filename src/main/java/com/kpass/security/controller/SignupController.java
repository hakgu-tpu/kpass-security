package com.kpass.security.controller;

import com.kpass.security.dto.SignupDTO;
import com.kpass.security.service.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SignupController {

    private final SignupService signupService;

    @PostMapping("/signup")
    public String signupProc(SignupDTO userDTO){
        signupService.signup(userDTO);
        return "ok";
    }

}
