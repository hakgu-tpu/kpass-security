package com.kpass.security.service;

import com.kpass.security.dto.SignupDTO;
import com.kpass.security.entity.Role;
import com.kpass.security.entity.UserEntity;
import com.kpass.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void signup(SignupDTO userDTO){
        if (userRepository.existsByUsername(userDTO.getUsername())){
            return;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
        userEntity.setRole("ROLE_ADMIN");

        userRepository.save(userEntity);
    }
}
