package com.example.onboarding.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    // other fields like firstName, lastName, etc.

    // Getters and Setters
    // ...
}