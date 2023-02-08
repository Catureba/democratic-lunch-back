package com.example.democratic.lunch.back.domain.repository;

import com.example.democratic.lunch.back.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
