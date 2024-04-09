package com.csp.cspchat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users", schema = "chat")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private boolean enabled;
}
