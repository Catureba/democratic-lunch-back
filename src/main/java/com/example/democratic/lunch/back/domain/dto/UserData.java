package com.example.democratic.lunch.back.domain.dto;

import com.example.democratic.lunch.back.domain.model.User;

public record UserData(Long id, String name, String email, String password) {
    public UserData(User user) {
        this(user.getId(), user.getName(), user.getEmail(), user.getPassword());
    }
}
