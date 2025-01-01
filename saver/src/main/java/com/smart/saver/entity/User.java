package com.smart.saver.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId; // Changed to Long for compatibility with GenerationType.IDENTITY

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(unique = true, nullable = false, length = 255)
    private String email;

    @Column(nullable = false, length = 255) // Ensure password cannot be null
    private String password; // Consider hashing before saving to DB

    @Column(columnDefinition = "TEXT") // Changed from VARCHAR(10000) to TEXT
    private String about;

    @Column(columnDefinition = "TEXT") // Changed from VARCHAR(10000) to TEXT
    private String profilePic;

    @Column(length = 15) // Added length constraint for phone number
    private String phoneNumber;

    // Information flags
    @Column(nullable = false)
    private boolean enabled = false;

    @Column(nullable = false)
    private boolean emailVerified = false;

    @Column(nullable = false)
    private boolean phoneNumberVerified = false;

    // Enum for provider
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private Provider provider = Provider.SELF; // Default to SELF

    @Column(length = 255)
    private String providerUserId;

       @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval = true)  
    private List<contact> contacts=new ArrayList<> ();

   
}
