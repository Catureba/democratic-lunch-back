package com.example.democratic.lunch.back.domain.controller;

import com.example.democratic.lunch.back.domain.dto.RegisterUserData;
import com.example.democratic.lunch.back.domain.dto.UserData;
import com.example.democratic.lunch.back.domain.model.User;
import com.example.democratic.lunch.back.domain.repository.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository repository;

    PasswordEncoder passwordEncoder;

    public UserController(UserRepository userRepository) {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @PostMapping
    @Transactional
    public ResponseEntity register(@RequestBody @Valid RegisterUserData data, UriComponentsBuilder uriBuilder) {
        var user = new User(data);
        String encodedPassword = this.passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repository.save(user);
        var uri = uriBuilder.path("/users/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).body(new UserData(user));
    }
}
