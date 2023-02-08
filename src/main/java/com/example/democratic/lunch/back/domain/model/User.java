package com.example.democratic.lunch.back.domain.model;

import com.example.democratic.lunch.back.domain.dto.RegisterUserData;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "users")
@Entity(name = "User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    public User(RegisterUserData data) {
        this.name = data.name();
        this.email = data.email();
        this.password = data.password();
    }
}
